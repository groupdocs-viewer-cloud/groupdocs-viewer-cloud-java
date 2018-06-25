/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="OAuth.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.viewer.client.auth;

import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.client.JSON;
import com.groupdocs.cloud.viewer.client.Pair;
import com.squareup.okhttp.*;
import com.squareup.okhttp.OkHttpClient;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Map;
import java.util.List;


public class OAuth implements Authentication {
  static final int MILLIS_PER_SECOND = 1000;

  private volatile String accessToken;
  private volatile String refreshToken;
  private volatile Long expirationTimeMillis;

  private OkHttpClient httpClient;
  private JSON json;

  private String tokenUrl;
  private String appSid;
  private String appKey;

  public String getAccessToken() {
    return accessToken;
  }

  public synchronized void setAccessToken(String accessToken, String refreshToken, Long expiresIn) {
    this.accessToken = accessToken;
    this.refreshToken = refreshToken;
    this.expirationTimeMillis = System.currentTimeMillis() + expiresIn * MILLIS_PER_SECOND;
  }

  public OAuth(String tokenUrl, String appSid, String appKey) {
    this.tokenUrl = tokenUrl;
    this.appSid = appSid;
    this.appKey = appKey;

    this.httpClient = new OkHttpClient();
    this.json = new JSON();
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
    // If the request already have an authorization, do nothing
    if (headerParams.containsKey("Authorization")) {
        return;
    }

    if(accessToken == null) {
      requestAccessToken();
    } else {
      boolean acessTokenExpired = expirationTimeMillis != null 
        && System.currentTimeMillis() >= expirationTimeMillis;

      if(acessTokenExpired) {
        refreshAccessToken();
      }
    }

    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }

  private synchronized void requestAccessToken() throws ApiException {
    String url = this.tokenUrl + "/oauth2/token";

    final Request.Builder reqBuilder = new Request.Builder().url(url);
    reqBuilder.header("Accept", "application/json");
    reqBuilder.header("Content-Type", "application/x-www-form-urlencoded");
    
    FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
    formBuilder.add("grant_type", "client_credentials");
    formBuilder.add("client_id", this.appSid);
    formBuilder.add("client_secret", this.appKey);
    RequestBody reqBody = formBuilder.build();
    
    Request request = reqBuilder.method("POST", reqBody).build();
    
    Call call = httpClient.newCall(request);
    
    try {
        Response response = call.execute();
        OAuthResponse data = handleResponse(response);
        setAccessToken(data.getAccessToken(), data.getRefreshToken(), data.getExpiresIn());
    } catch (IOException e) {
        throw new ApiException(e);
    }
  }

  private synchronized void refreshAccessToken() throws ApiException {
    String url = this.tokenUrl + "/oauth2/token";

    final Request.Builder reqBuilder = new Request.Builder().url(url);
    reqBuilder.header("Accept", "application/json");
    reqBuilder.header("Content-Type", "application/x-www-form-urlencoded");
    
    FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
    formBuilder.add("grant_type", "refresh_token");
    formBuilder.add("refresh_token", this.refreshToken);
    RequestBody reqBody = formBuilder.build();
    
    Request request = reqBuilder.method("POST", reqBody).build();
    
    Call call = httpClient.newCall(request);
    
    try {
        Response response = call.execute();
        OAuthResponse data = handleResponse(response);
        setAccessToken(data.getAccessToken(), data.getRefreshToken(), data.getExpiresIn());
    } catch (IOException e) {
        throw new ApiException(e);
    }
  }
    
  private OAuthResponse handleResponse(Response response) throws ApiException {
      if (response.isSuccessful()) {
          if (response.code() == 204) {
              // the status code is 204 (No Content)
              if (response.body() != null) {
                  try {
                      response.body().close();
                  } catch (IOException e) {
                      throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                  }
              }
              return null;
          } else {
              return deserialize(response);
          }
      } else {
          String respBody = null;
          if (response.body() != null) {
              try {
                  respBody = response.body().string();
              } catch (IOException e) {
                  throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
              }
          }
          throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
      }
  }

  private OAuthResponse deserialize(Response response) throws ApiException {
      if (response == null) {
          return null;
      }
      
      String respBody;
      try {
          if (response.body() != null)
              respBody = response.body().string();
          else
              respBody = null;
      } catch (IOException e) {
          throw new ApiException(e);
      }

      if (respBody == null || "".equals(respBody)) {
          return null;
      }
     
      return json.deserialize(respBody, OAuthResponse.class);
  }

  private class OAuthResponse {
    @SerializedName("access_token")
    private String accessToken = null;

    @SerializedName("token_type")
    private String tokenType = null;

    @SerializedName("expires_in")
    private Long expiresIn = null;

    @SerializedName("refresh_token")
    private String refreshToken = null;

    @SerializedName("client_id")
    private String clientId = null;

    @SerializedName("clientRefreshTokenLifeTimeInMinutes")
    private String clientRefreshTokenLifeTimeInMinutes = null;

    @SerializedName(".issued")
    private String issued = null;

    @SerializedName(".expires")
    private String expires = null;

    public OAuthResponse accessToken(String accessToken) {
      this.accessToken = accessToken;
      return this;
    }

     /**
     * Get accessToken
     * @return accessToken
    **/
    @ApiModelProperty(value = "")
    public String getAccessToken() {
      return accessToken;
    }

    public void setAccessToken(String accessToken) {
      this.accessToken = accessToken;
    }

    public OAuthResponse tokenType(String tokenType) {
      this.tokenType = tokenType;
      return this;
    }

    @ApiModelProperty(value = "")
    public String getTokenType() {
      return tokenType;
    }

    public void setTokenType(String tokenType) {
      this.tokenType = tokenType;
    }

    public OAuthResponse expiresIn(Long expiresIn) {
      this.expiresIn = expiresIn;
      return this;
    }

    @ApiModelProperty(value = "")
    public Long getExpiresIn() {
      return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
      this.expiresIn = expiresIn;
    }

    public OAuthResponse refreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
      return this;
    }

    @ApiModelProperty(value = "")
    public String getRefreshToken() {
      return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
      this.refreshToken = refreshToken;
    }

    public OAuthResponse clientId(String clientId) {
      this.clientId = clientId;
      return this;
    }

    @ApiModelProperty(value = "")
    public String getClientId() {
      return clientId;
    }

    public void setClientId(String clientId) {
      this.clientId = clientId;
    }

    public OAuthResponse clientRefreshTokenLifeTimeInMinutes(String clientRefreshTokenLifeTimeInMinutes) {
      this.clientRefreshTokenLifeTimeInMinutes = clientRefreshTokenLifeTimeInMinutes;
      return this;
    }

    @ApiModelProperty(value = "")
    public String getClientRefreshTokenLifeTimeInMinutes() {
      return clientRefreshTokenLifeTimeInMinutes;
    }

    public void setClientRefreshTokenLifeTimeInMinutes(String clientRefreshTokenLifeTimeInMinutes) {
      this.clientRefreshTokenLifeTimeInMinutes = clientRefreshTokenLifeTimeInMinutes;
    }

    public OAuthResponse issued(String issued) {
      this.issued = issued;
      return this;
    }

    @ApiModelProperty(value = "")
    public String getIssued() {
      return issued;
    }

    public void setIssued(String issued) {
      this.issued = issued;
    }

    public OAuthResponse expires(String expires) {
      this.expires = expires;
      return this;
    }

    @ApiModelProperty(value = "")
    public String getExpires() {
      return expires;
    }

    public void setExpires(String expires) {
      this.expires = expires;
    }
  }
}
