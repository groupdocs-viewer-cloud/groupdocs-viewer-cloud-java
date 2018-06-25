/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ViewerApi.java">
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

package com.groupdocs.cloud.viewer.api;

import com.groupdocs.cloud.viewer.client.ApiCallback;
import com.groupdocs.cloud.viewer.client.ApiClient;
import com.groupdocs.cloud.viewer.client.ApiException;
import com.groupdocs.cloud.viewer.client.ApiResponse;
import com.groupdocs.cloud.viewer.client.Configuration;
import com.groupdocs.cloud.viewer.client.Pair;
import com.groupdocs.cloud.viewer.client.ProgressRequestBody;
import com.groupdocs.cloud.viewer.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.groupdocs.cloud.viewer.model.AttachmentCollection;
import com.groupdocs.cloud.viewer.model.DocumentInfo;
import com.groupdocs.cloud.viewer.model.DocumentInfoOptions;
import java.io.File;
import com.groupdocs.cloud.viewer.model.FontCollection;
import com.groupdocs.cloud.viewer.model.FormatCollection;
import com.groupdocs.cloud.viewer.model.HtmlAttachmentPageCollection;
import com.groupdocs.cloud.viewer.model.HtmlOptions;
import com.groupdocs.cloud.viewer.model.HtmlPageCollection;
import com.groupdocs.cloud.viewer.model.ImageAttachmentPageCollection;
import com.groupdocs.cloud.viewer.model.ImageOptions;
import com.groupdocs.cloud.viewer.model.ImagePageCollection;
import com.groupdocs.cloud.viewer.model.PageInfoCollection;
import com.groupdocs.cloud.viewer.model.PdfFileInfo;
import com.groupdocs.cloud.viewer.model.PdfFileOptions;
import com.groupdocs.cloud.viewer.model.TransformOptionsBase;
import com.groupdocs.cloud.viewer.model.requests.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ViewerApi {
    private ApiClient apiClient;

    public ViewerApi(String appSid, String appKey) {
        this(new Configuration(appSid, appKey));
    }

    public ViewerApi(Configuration configuration) {
        this.apiClient = new ApiClient(configuration);
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteFontsCache
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteFontsCacheCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/fonts/cache";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteFontsCacheValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = deleteFontsCacheCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes fonts cache.
     * 
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFontsCache() throws ApiException {
        deleteFontsCacheWithHttpInfo();
    }

    /**
     * Removes fonts cache.
     * 
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFontsCacheWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = deleteFontsCacheValidateBeforeCall(null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes fonts cache. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFontsCacheAsync(final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteFontsCacheValidateBeforeCall(progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getFonts
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getFontsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/fonts";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getFontsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getFontsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * List installed fonts.
     * 
     * @return FontCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FontCollection getFonts() throws ApiException {
        ApiResponse<FontCollection> resp = getFontsWithHttpInfo();
        return resp.getData();
    }

    /**
     * List installed fonts.
     * 
     * @return ApiResponse&lt;FontCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FontCollection> getFontsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getFontsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<FontCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List installed fonts. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getFontsAsync(final ApiCallback<FontCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getFontsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FontCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getSupportedFileFormats
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getSupportedFileFormatsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/formats";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getSupportedFileFormatsValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = getSupportedFileFormatsCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of supported file formats.
     * 
     * @return FormatCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FormatCollection getSupportedFileFormats() throws ApiException {
        ApiResponse<FormatCollection> resp = getSupportedFileFormatsWithHttpInfo();
        return resp.getData();
    }

    /**
     * Retrieves list of supported file formats.
     * 
     * @return ApiResponse&lt;FormatCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FormatCollection> getSupportedFileFormatsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = getSupportedFileFormatsValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<FormatCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of supported file formats. (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSupportedFileFormatsAsync(final ApiCallback<FormatCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getSupportedFileFormatsValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FormatCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreateAttachmentPagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreateAttachmentPagesCacheCall(HtmlCreateAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getHtmlOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreateAttachmentPagesCacheValidateBeforeCall(HtmlCreateAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlCreateAttachmentPagesCache(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlCreateAttachmentPagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreateAttachmentPagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates attachment cache. 
     * 
     * @param request The request model
     * @return HtmlAttachmentPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlAttachmentPageCollection htmlCreateAttachmentPagesCache(HtmlCreateAttachmentPagesCacheRequest request) throws ApiException {
        ApiResponse<HtmlAttachmentPageCollection> resp = htmlCreateAttachmentPagesCacheWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates attachment cache. 
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlAttachmentPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlAttachmentPageCollection> htmlCreateAttachmentPagesCacheWithHttpInfo(HtmlCreateAttachmentPagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreateAttachmentPagesCacheValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlAttachmentPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates attachment cache.  (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreateAttachmentPagesCacheAsync(HtmlCreateAttachmentPagesCacheRequest request, final ApiCallback<HtmlAttachmentPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreateAttachmentPagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlAttachmentPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreatePagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePagesCacheCall(HtmlCreatePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getHtmlOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreatePagesCacheValidateBeforeCall(HtmlCreatePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlCreatePagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreatePagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates document pages as HTML and saves them in cache. Pages created before will be removed from cache.
     * 
     * @param request The request model
     * @return HtmlPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlPageCollection htmlCreatePagesCache(HtmlCreatePagesCacheRequest request) throws ApiException {
        ApiResponse<HtmlPageCollection> resp = htmlCreatePagesCacheWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates document pages as HTML and saves them in cache. Pages created before will be removed from cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlPageCollection> htmlCreatePagesCacheWithHttpInfo(HtmlCreatePagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreatePagesCacheValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates document pages as HTML and saves them in cache. Pages created before will be removed from cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePagesCacheAsync(HtmlCreatePagesCacheRequest request, final ApiCallback<HtmlPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreatePagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreatePagesCacheFromContent
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePagesCacheFromContentCall(HtmlCreatePagesCacheFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/html/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.getFile() != null)
            localVarFormParams.put("File", request.getFile());
        if (request.getHtmlOptions() != null)
            localVarFormParams.put("HtmlOptions", request.getHtmlOptions());

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreatePagesCacheFromContentValidateBeforeCall(HtmlCreatePagesCacheFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling htmlCreatePagesCacheFromContent(Async)");
        }
        
        // verify the required parameter 'htmlOptions' is set
        if (request.getHtmlOptions() == null) {
            throw new ApiException("Missing the required parameter 'htmlOptions' when calling htmlCreatePagesCacheFromContent(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreatePagesCacheFromContentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates posted document pages as HTML and saves them in cache. Content with document or multipart content is expected where first part is document and second is HtmlOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return HtmlPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlPageCollection htmlCreatePagesCacheFromContent(HtmlCreatePagesCacheFromContentRequest request) throws ApiException {
        ApiResponse<HtmlPageCollection> resp = htmlCreatePagesCacheFromContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates posted document pages as HTML and saves them in cache. Content with document or multipart content is expected where first part is document and second is HtmlOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlPageCollection> htmlCreatePagesCacheFromContentWithHttpInfo(HtmlCreatePagesCacheFromContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreatePagesCacheFromContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates posted document pages as HTML and saves them in cache. Content with document or multipart content is expected where first part is document and second is HtmlOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePagesCacheFromContentAsync(HtmlCreatePagesCacheFromContentRequest request, final ApiCallback<HtmlPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreatePagesCacheFromContentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreatePagesCacheFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePagesCacheFromUrlCall(HtmlCreatePagesCacheFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getHtmlOptions();

        // create path and map variables
        String localVarPath = "/viewer/html/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreatePagesCacheFromUrlValidateBeforeCall(HtmlCreatePagesCacheFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling htmlCreatePagesCacheFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreatePagesCacheFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates pages as HTML and saves them in cache for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return HtmlPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlPageCollection htmlCreatePagesCacheFromUrl(HtmlCreatePagesCacheFromUrlRequest request) throws ApiException {
        ApiResponse<HtmlPageCollection> resp = htmlCreatePagesCacheFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates pages as HTML and saves them in cache for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlPageCollection> htmlCreatePagesCacheFromUrlWithHttpInfo(HtmlCreatePagesCacheFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreatePagesCacheFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates pages as HTML and saves them in cache for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePagesCacheFromUrlAsync(HtmlCreatePagesCacheFromUrlRequest request, final ApiCallback<HtmlPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreatePagesCacheFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreatePdfFile
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePdfFileCall(HtmlCreatePdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getPdfFileOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pdf"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreatePdfFileValidateBeforeCall(HtmlCreatePdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlCreatePdfFile(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreatePdfFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates PDF document.  Removes PDF document if it was created before.
     * 
     * @param request The request model
     * @return PdfFileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfFileInfo htmlCreatePdfFile(HtmlCreatePdfFileRequest request) throws ApiException {
        ApiResponse<PdfFileInfo> resp = htmlCreatePdfFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates PDF document.  Removes PDF document if it was created before.
     * 
     * @param request The request model
     * @return ApiResponse&lt;PdfFileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfFileInfo> htmlCreatePdfFileWithHttpInfo(HtmlCreatePdfFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreatePdfFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates PDF document.  Removes PDF document if it was created before. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePdfFileAsync(HtmlCreatePdfFileRequest request, final ApiCallback<PdfFileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreatePdfFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreatePdfFileFromContent
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePdfFileFromContentCall(HtmlCreatePdfFileFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/html/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.getFile() != null)
            localVarFormParams.put("File", request.getFile());
        if (request.getPdfFileOptions() != null)
            localVarFormParams.put("PdfFileOptions", request.getPdfFileOptions());

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreatePdfFileFromContentValidateBeforeCall(HtmlCreatePdfFileFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling htmlCreatePdfFileFromContent(Async)");
        }
        
        // verify the required parameter 'pdfFileOptions' is set
        if (request.getPdfFileOptions() == null) {
            throw new ApiException("Missing the required parameter 'pdfFileOptions' when calling htmlCreatePdfFileFromContent(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreatePdfFileFromContentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates PDF document from document passed in request body and saves it in cache. Content with document or multipart content is expected where first part is document and second is PdfFileOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return PdfFileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfFileInfo htmlCreatePdfFileFromContent(HtmlCreatePdfFileFromContentRequest request) throws ApiException {
        ApiResponse<PdfFileInfo> resp = htmlCreatePdfFileFromContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates PDF document from document passed in request body and saves it in cache. Content with document or multipart content is expected where first part is document and second is PdfFileOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;PdfFileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfFileInfo> htmlCreatePdfFileFromContentWithHttpInfo(HtmlCreatePdfFileFromContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreatePdfFileFromContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates PDF document from document passed in request body and saves it in cache. Content with document or multipart content is expected where first part is document and second is PdfFileOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePdfFileFromContentAsync(HtmlCreatePdfFileFromContentRequest request, final ApiCallback<PdfFileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreatePdfFileFromContentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlCreatePdfFileFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePdfFileFromUrlCall(HtmlCreatePdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getPdfFileOptions();

        // create path and map variables
        String localVarPath = "/viewer/html/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlCreatePdfFileFromUrlValidateBeforeCall(HtmlCreatePdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling htmlCreatePdfFileFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlCreatePdfFileFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.  Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. Expects PdfFileOptions object data in request body.
     * 
     * @param request The request model
     * @return PdfFileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfFileInfo htmlCreatePdfFileFromUrl(HtmlCreatePdfFileFromUrlRequest request) throws ApiException {
        ApiResponse<PdfFileInfo> resp = htmlCreatePdfFileFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.  Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. Expects PdfFileOptions object data in request body.
     * 
     * @param request The request model
     * @return ApiResponse&lt;PdfFileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfFileInfo> htmlCreatePdfFileFromUrlWithHttpInfo(HtmlCreatePdfFileFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlCreatePdfFileFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.  Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. Expects PdfFileOptions object data in request body. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlCreatePdfFileFromUrlAsync(HtmlCreatePdfFileFromUrlRequest request, final ApiCallback<PdfFileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlCreatePdfFileFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlDeleteAttachmentPagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlDeleteAttachmentPagesCacheCall(HtmlDeleteAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/pages/cache"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlDeleteAttachmentPagesCacheValidateBeforeCall(HtmlDeleteAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlDeleteAttachmentPagesCache(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlDeleteAttachmentPagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlDeleteAttachmentPagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes attachment cache.
     * 
     * @param request The request model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void htmlDeleteAttachmentPagesCache(HtmlDeleteAttachmentPagesCacheRequest request) throws ApiException {
        htmlDeleteAttachmentPagesCacheWithHttpInfo(request);
    }

    /**
     * Removes attachment cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> htmlDeleteAttachmentPagesCacheWithHttpInfo(HtmlDeleteAttachmentPagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlDeleteAttachmentPagesCacheValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes attachment cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlDeleteAttachmentPagesCacheAsync(HtmlDeleteAttachmentPagesCacheRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlDeleteAttachmentPagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for htmlDeletePagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlDeletePagesCacheCall(HtmlDeletePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages/cache"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlDeletePagesCacheValidateBeforeCall(HtmlDeletePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlDeletePagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlDeletePagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes document cache.
     * 
     * @param request The request model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void htmlDeletePagesCache(HtmlDeletePagesCacheRequest request) throws ApiException {
        htmlDeletePagesCacheWithHttpInfo(request);
    }

    /**
     * Removes document cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> htmlDeletePagesCacheWithHttpInfo(HtmlDeletePagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlDeletePagesCacheValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes document cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlDeletePagesCacheAsync(HtmlDeletePagesCacheRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlDeletePagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachment
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentCall(HtmlGetAttachmentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentValidateBeforeCall(HtmlGetAttachmentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachment(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetAttachment(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads attachment.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetAttachment(HtmlGetAttachmentRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetAttachmentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads attachment.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetAttachmentWithHttpInfo(HtmlGetAttachmentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads attachment. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentAsync(HtmlGetAttachmentRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachmentInfo
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentInfoCall(HtmlGetAttachmentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentInfoValidateBeforeCall(HtmlGetAttachmentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachmentInfo(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetAttachmentInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentInfoCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment information.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetAttachmentInfo(HtmlGetAttachmentInfoRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetAttachmentInfoWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment information.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetAttachmentInfoWithHttpInfo(HtmlGetAttachmentInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentInfoValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment information. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentInfoAsync(HtmlGetAttachmentInfoRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentInfoValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachmentInfoWithOptions
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentInfoWithOptionsCall(HtmlGetAttachmentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentInfoOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentInfoWithOptionsValidateBeforeCall(HtmlGetAttachmentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachmentInfoWithOptions(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetAttachmentInfoWithOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentInfoWithOptionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetAttachmentInfoWithOptions(HtmlGetAttachmentInfoWithOptionsRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetAttachmentInfoWithOptionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetAttachmentInfoWithOptionsWithHttpInfo(HtmlGetAttachmentInfoWithOptionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentInfoWithOptionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentInfoWithOptionsAsync(HtmlGetAttachmentInfoWithOptionsRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentInfoWithOptionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachmentPage
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentPageCall(HtmlGetAttachmentPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/pages/{pageNumber}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentPageValidateBeforeCall(HtmlGetAttachmentPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachmentPage(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetAttachmentPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling htmlGetAttachmentPage(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentPageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads attachment page as HTML.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetAttachmentPage(HtmlGetAttachmentPageRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetAttachmentPageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads attachment page as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetAttachmentPageWithHttpInfo(HtmlGetAttachmentPageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentPageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads attachment page as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentPageAsync(HtmlGetAttachmentPageRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentPageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachmentPageResource
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentPageResourceCall(HtmlGetAttachmentPageResourceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/pages/{pageNumber}/resources/{resourceName}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()))
            .replaceAll("\\{" + "resourceName" + "\\}", apiClient.escapeString(request.getResourceName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentPageResourceValidateBeforeCall(HtmlGetAttachmentPageResourceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachmentPageResource(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetAttachmentPageResource(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling htmlGetAttachmentPageResource(Async)");
        }
        
        // verify the required parameter 'resourceName' is set
        if (request.getResourceName() == null) {
            throw new ApiException("Missing the required parameter 'resourceName' when calling htmlGetAttachmentPageResource(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentPageResourceCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads HTML page resource (image, style, graphics or font).
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetAttachmentPageResource(HtmlGetAttachmentPageResourceRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetAttachmentPageResourceWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads HTML page resource (image, style, graphics or font).
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetAttachmentPageResourceWithHttpInfo(HtmlGetAttachmentPageResourceRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentPageResourceValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads HTML page resource (image, style, graphics or font). (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentPageResourceAsync(HtmlGetAttachmentPageResourceRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentPageResourceValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachmentPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentPagesCall(HtmlGetAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentPagesValidateBeforeCall(HtmlGetAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachmentPages(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetAttachmentPages(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment pages as HTML.
     * 
     * @param request The request model
     * @return HtmlAttachmentPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlAttachmentPageCollection htmlGetAttachmentPages(HtmlGetAttachmentPagesRequest request) throws ApiException {
        ApiResponse<HtmlAttachmentPageCollection> resp = htmlGetAttachmentPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment pages as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlAttachmentPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlAttachmentPageCollection> htmlGetAttachmentPagesWithHttpInfo(HtmlGetAttachmentPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlAttachmentPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment pages as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentPagesAsync(HtmlGetAttachmentPagesRequest request, final ApiCallback<HtmlAttachmentPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlAttachmentPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetAttachments
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentsCall(HtmlGetAttachmentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetAttachmentsValidateBeforeCall(HtmlGetAttachmentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetAttachments(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetAttachmentsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document attachments.
     * 
     * @param request The request model
     * @return AttachmentCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentCollection htmlGetAttachments(HtmlGetAttachmentsRequest request) throws ApiException {
        ApiResponse<AttachmentCollection> resp = htmlGetAttachmentsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document attachments.
     * 
     * @param request The request model
     * @return ApiResponse&lt;AttachmentCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AttachmentCollection> htmlGetAttachmentsWithHttpInfo(HtmlGetAttachmentsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetAttachmentsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AttachmentCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document attachments. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetAttachmentsAsync(HtmlGetAttachmentsRequest request, final ApiCallback<AttachmentCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetAttachmentsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AttachmentCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetDocumentInfo
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoCall(HtmlGetDocumentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetDocumentInfoValidateBeforeCall(HtmlGetDocumentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetDocumentInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetDocumentInfoCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetDocumentInfo(HtmlGetDocumentInfoRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetDocumentInfoWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetDocumentInfoWithHttpInfo(HtmlGetDocumentInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetDocumentInfoValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoAsync(HtmlGetDocumentInfoRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetDocumentInfoValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetDocumentInfoFromContent
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoFromContentCall(HtmlGetDocumentInfoFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/html/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.getFile() != null)
            localVarFormParams.put("File", request.getFile());
        if (request.getDocumentInfoOptions() != null)
            localVarFormParams.put("DocumentInfoOptions", request.getDocumentInfoOptions());

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetDocumentInfoFromContentValidateBeforeCall(HtmlGetDocumentInfoFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling htmlGetDocumentInfoFromContent(Async)");
        }
        
        // verify the required parameter 'documentInfoOptions' is set
        if (request.getDocumentInfoOptions() == null) {
            throw new ApiException("Missing the required parameter 'documentInfoOptions' when calling htmlGetDocumentInfoFromContent(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromContentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for posted document. Content with document or multipart content is expected where first part is document and second is DocumentInfoOptions. Saves file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetDocumentInfoFromContent(HtmlGetDocumentInfoFromContentRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetDocumentInfoFromContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for posted document. Content with document or multipart content is expected where first part is document and second is DocumentInfoOptions. Saves file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetDocumentInfoFromContentWithHttpInfo(HtmlGetDocumentInfoFromContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for posted document. Content with document or multipart content is expected where first part is document and second is DocumentInfoOptions. Saves file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoFromContentAsync(HtmlGetDocumentInfoFromContentRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromContentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetDocumentInfoFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoFromUrlCall(HtmlGetDocumentInfoFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/html/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetDocumentInfoFromUrlValidateBeforeCall(HtmlGetDocumentInfoFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling htmlGetDocumentInfoFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetDocumentInfoFromUrl(HtmlGetDocumentInfoFromUrlRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetDocumentInfoFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetDocumentInfoFromUrlWithHttpInfo(HtmlGetDocumentInfoFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoFromUrlAsync(HtmlGetDocumentInfoFromUrlRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetDocumentInfoFromUrlWithOptions
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoFromUrlWithOptionsCall(HtmlGetDocumentInfoFromUrlWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentInfoOptions();

        // create path and map variables
        String localVarPath = "/viewer/html/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetDocumentInfoFromUrlWithOptionsValidateBeforeCall(HtmlGetDocumentInfoFromUrlWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling htmlGetDocumentInfoFromUrlWithOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromUrlWithOptionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetDocumentInfoFromUrlWithOptions(HtmlGetDocumentInfoFromUrlWithOptionsRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetDocumentInfoFromUrlWithOptionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetDocumentInfoFromUrlWithOptionsWithHttpInfo(HtmlGetDocumentInfoFromUrlWithOptionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromUrlWithOptionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoFromUrlWithOptionsAsync(HtmlGetDocumentInfoFromUrlWithOptionsRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetDocumentInfoFromUrlWithOptionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetDocumentInfoWithOptions
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoWithOptionsCall(HtmlGetDocumentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentInfoOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetDocumentInfoWithOptionsValidateBeforeCall(HtmlGetDocumentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetDocumentInfoWithOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetDocumentInfoWithOptionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo htmlGetDocumentInfoWithOptions(HtmlGetDocumentInfoWithOptionsRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = htmlGetDocumentInfoWithOptionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> htmlGetDocumentInfoWithOptionsWithHttpInfo(HtmlGetDocumentInfoWithOptionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetDocumentInfoWithOptionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetDocumentInfoWithOptionsAsync(HtmlGetDocumentInfoWithOptionsRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetDocumentInfoWithOptionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetPage
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetPageCall(HtmlGetPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages/{pageNumber}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/html"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetPageValidateBeforeCall(HtmlGetPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling htmlGetPage(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetPageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document page as HTML.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetPage(HtmlGetPageRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetPageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document page as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetPageWithHttpInfo(HtmlGetPageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetPageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document page as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetPageAsync(HtmlGetPageRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetPageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetPageResource
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetPageResourceCall(HtmlGetPageResourceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages/{pageNumber}/resources/{resourceName}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()))
            .replaceAll("\\{" + "resourceName" + "\\}", apiClient.escapeString(request.getResourceName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetPageResourceValidateBeforeCall(HtmlGetPageResourceRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetPageResource(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling htmlGetPageResource(Async)");
        }
        
        // verify the required parameter 'resourceName' is set
        if (request.getResourceName() == null) {
            throw new ApiException("Missing the required parameter 'resourceName' when calling htmlGetPageResource(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetPageResourceCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads HTML page resource (image, style, graphics or font).
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetPageResource(HtmlGetPageResourceRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetPageResourceWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads HTML page resource (image, style, graphics or font).
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetPageResourceWithHttpInfo(HtmlGetPageResourceRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetPageResourceValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads HTML page resource (image, style, graphics or font). (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetPageResourceAsync(HtmlGetPageResourceRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetPageResourceValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetPagesCall(HtmlGetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetPagesValidateBeforeCall(HtmlGetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetPages(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document pages as HTML.
     * 
     * @param request The request model
     * @return HtmlPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlPageCollection htmlGetPages(HtmlGetPagesRequest request) throws ApiException {
        ApiResponse<HtmlPageCollection> resp = htmlGetPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document pages as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlPageCollection> htmlGetPagesWithHttpInfo(HtmlGetPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document pages as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetPagesAsync(HtmlGetPagesRequest request, final ApiCallback<HtmlPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetPagesFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetPagesFromUrlCall(HtmlGetPagesFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/html/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetPagesFromUrlValidateBeforeCall(HtmlGetPagesFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling htmlGetPagesFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetPagesFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document pages as HTML.
     * 
     * @param request The request model
     * @return HtmlPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HtmlPageCollection htmlGetPagesFromUrl(HtmlGetPagesFromUrlRequest request) throws ApiException {
        ApiResponse<HtmlPageCollection> resp = htmlGetPagesFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document pages as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;HtmlPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HtmlPageCollection> htmlGetPagesFromUrlWithHttpInfo(HtmlGetPagesFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetPagesFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document pages as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetPagesFromUrlAsync(HtmlGetPagesFromUrlRequest request, final ApiCallback<HtmlPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetPagesFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HtmlPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetPdfFile
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetPdfFileCall(HtmlGetPdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pdf"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetPdfFileValidateBeforeCall(HtmlGetPdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetPdfFile(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetPdfFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document as PDF.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetPdfFile(HtmlGetPdfFileRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetPdfFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document as PDF.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetPdfFileWithHttpInfo(HtmlGetPdfFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetPdfFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document as PDF. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetPdfFileAsync(HtmlGetPdfFileRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetPdfFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetPdfFileFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetPdfFileFromUrlCall(HtmlGetPdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/html/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetPdfFileFromUrlValidateBeforeCall(HtmlGetPdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling htmlGetPdfFileFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetPdfFileFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document at provided URL as PDF.  Document will be retrieved from the passed URL and added to Storage.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetPdfFileFromUrl(HtmlGetPdfFileFromUrlRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetPdfFileFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document at provided URL as PDF.  Document will be retrieved from the passed URL and added to Storage.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetPdfFileFromUrlWithHttpInfo(HtmlGetPdfFileFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetPdfFileFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document at provided URL as PDF.  Document will be retrieved from the passed URL and added to Storage. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetPdfFileFromUrlAsync(HtmlGetPdfFileFromUrlRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetPdfFileFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetZipWithAttachmentPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetZipWithAttachmentPagesCall(HtmlGetZipWithAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/attachments/{attachmentName}/pages/zip"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/zip"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetZipWithAttachmentPagesValidateBeforeCall(HtmlGetZipWithAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetZipWithAttachmentPages(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling htmlGetZipWithAttachmentPages(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetZipWithAttachmentPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment pages as HTML.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetZipWithAttachmentPages(HtmlGetZipWithAttachmentPagesRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetZipWithAttachmentPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment pages as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetZipWithAttachmentPagesWithHttpInfo(HtmlGetZipWithAttachmentPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetZipWithAttachmentPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment pages as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetZipWithAttachmentPagesAsync(HtmlGetZipWithAttachmentPagesRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetZipWithAttachmentPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlGetZipWithPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlGetZipWithPagesCall(HtmlGetZipWithPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages/zip"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getResourcePath() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("resourcePath", request.getResourcePath()));
        if (request.getIgnoreResourcePathInResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("ignoreResourcePathInResources", request.getIgnoreResourcePathInResources()));
        if (request.getEmbedResources() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("embedResources", request.getEmbedResources()));
        if (request.getEnableMinification() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableMinification", request.getEnableMinification()));
        if (request.getEnableResponsiveRendering() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("enableResponsiveRendering", request.getEnableResponsiveRendering()));
        if (request.getExcludeFonts() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("excludeFonts", request.getExcludeFonts()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/zip"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlGetZipWithPagesValidateBeforeCall(HtmlGetZipWithPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlGetZipWithPages(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlGetZipWithPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document pages as HTML.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File htmlGetZipWithPages(HtmlGetZipWithPagesRequest request) throws ApiException {
        ApiResponse<File> resp = htmlGetZipWithPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document pages as HTML.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> htmlGetZipWithPagesWithHttpInfo(HtmlGetZipWithPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlGetZipWithPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document pages as HTML. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlGetZipWithPagesAsync(HtmlGetZipWithPagesRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlGetZipWithPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for htmlTransformPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call htmlTransformPagesCall(HtmlTransformPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getTransformOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/html/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call htmlTransformPagesValidateBeforeCall(HtmlTransformPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling htmlTransformPages(Async)");
        }
        

        com.squareup.okhttp.Call call = htmlTransformPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotates or reorders document page(s).
     * 
     * @param request The request model
     * @return PageInfoCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageInfoCollection htmlTransformPages(HtmlTransformPagesRequest request) throws ApiException {
        ApiResponse<PageInfoCollection> resp = htmlTransformPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Rotates or reorders document page(s).
     * 
     * @param request The request model
     * @return ApiResponse&lt;PageInfoCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageInfoCollection> htmlTransformPagesWithHttpInfo(HtmlTransformPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = htmlTransformPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PageInfoCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotates or reorders document page(s). (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call htmlTransformPagesAsync(HtmlTransformPagesRequest request, final ApiCallback<PageInfoCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = htmlTransformPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageInfoCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreateAttachmentPagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreateAttachmentPagesCacheCall(ImageCreateAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getImageOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreateAttachmentPagesCacheValidateBeforeCall(ImageCreateAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageCreateAttachmentPagesCache(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageCreateAttachmentPagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreateAttachmentPagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates attachment cache.
     * 
     * @param request The request model
     * @return ImageAttachmentPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageAttachmentPageCollection imageCreateAttachmentPagesCache(ImageCreateAttachmentPagesCacheRequest request) throws ApiException {
        ApiResponse<ImageAttachmentPageCollection> resp = imageCreateAttachmentPagesCacheWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates attachment cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImageAttachmentPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageAttachmentPageCollection> imageCreateAttachmentPagesCacheWithHttpInfo(ImageCreateAttachmentPagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreateAttachmentPagesCacheValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImageAttachmentPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates attachment cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreateAttachmentPagesCacheAsync(ImageCreateAttachmentPagesCacheRequest request, final ApiCallback<ImageAttachmentPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreateAttachmentPagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageAttachmentPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreatePagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePagesCacheCall(ImageCreatePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getImageOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreatePagesCacheValidateBeforeCall(ImageCreatePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageCreatePagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreatePagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates document pages as image and saves them in cache.  Pages created before will be removed from cache.
     * 
     * @param request The request model
     * @return ImagePageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePageCollection imageCreatePagesCache(ImageCreatePagesCacheRequest request) throws ApiException {
        ApiResponse<ImagePageCollection> resp = imageCreatePagesCacheWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates document pages as image and saves them in cache.  Pages created before will be removed from cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePageCollection> imageCreatePagesCacheWithHttpInfo(ImageCreatePagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePagesCacheValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates document pages as image and saves them in cache.  Pages created before will be removed from cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePagesCacheAsync(ImageCreatePagesCacheRequest request, final ApiCallback<ImagePageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreatePagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreatePagesCacheFromContent
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePagesCacheFromContentCall(ImageCreatePagesCacheFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/image/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.getFile() != null)
            localVarFormParams.put("File", request.getFile());
        if (request.getImageOptions() != null)
            localVarFormParams.put("ImageOptions", request.getImageOptions());

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreatePagesCacheFromContentValidateBeforeCall(ImageCreatePagesCacheFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling imageCreatePagesCacheFromContent(Async)");
        }
        
        // verify the required parameter 'imageOptions' is set
        if (request.getImageOptions() == null) {
            throw new ApiException("Missing the required parameter 'imageOptions' when calling imageCreatePagesCacheFromContent(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreatePagesCacheFromContentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates posted document pages as image and saves them in cache. Content with document or multipart content is expected where first part is document and second is HtmlOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ImagePageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePageCollection imageCreatePagesCacheFromContent(ImageCreatePagesCacheFromContentRequest request) throws ApiException {
        ApiResponse<ImagePageCollection> resp = imageCreatePagesCacheFromContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates posted document pages as image and saves them in cache. Content with document or multipart content is expected where first part is document and second is HtmlOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePageCollection> imageCreatePagesCacheFromContentWithHttpInfo(ImageCreatePagesCacheFromContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePagesCacheFromContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates posted document pages as image and saves them in cache. Content with document or multipart content is expected where first part is document and second is HtmlOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePagesCacheFromContentAsync(ImageCreatePagesCacheFromContentRequest request, final ApiCallback<ImagePageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreatePagesCacheFromContentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreatePagesCacheFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePagesCacheFromUrlCall(ImageCreatePagesCacheFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getImageOptions();

        // create path and map variables
        String localVarPath = "/viewer/image/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreatePagesCacheFromUrlValidateBeforeCall(ImageCreatePagesCacheFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling imageCreatePagesCacheFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreatePagesCacheFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates pages as image and saves them in cache for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ImagePageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePageCollection imageCreatePagesCacheFromUrl(ImageCreatePagesCacheFromUrlRequest request) throws ApiException {
        ApiResponse<ImagePageCollection> resp = imageCreatePagesCacheFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates pages as image and saves them in cache for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePageCollection> imageCreatePagesCacheFromUrlWithHttpInfo(ImageCreatePagesCacheFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePagesCacheFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates pages as image and saves them in cache for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePagesCacheFromUrlAsync(ImageCreatePagesCacheFromUrlRequest request, final ApiCallback<ImagePageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreatePagesCacheFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreatePdfFile
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePdfFileCall(ImageCreatePdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getPdfFileOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pdf"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreatePdfFileValidateBeforeCall(ImageCreatePdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageCreatePdfFile(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreatePdfFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates PDF document.  Removes PDF document if it was created before.
     * 
     * @param request The request model
     * @return PdfFileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfFileInfo imageCreatePdfFile(ImageCreatePdfFileRequest request) throws ApiException {
        ApiResponse<PdfFileInfo> resp = imageCreatePdfFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates PDF document.  Removes PDF document if it was created before.
     * 
     * @param request The request model
     * @return ApiResponse&lt;PdfFileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfFileInfo> imageCreatePdfFileWithHttpInfo(ImageCreatePdfFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePdfFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates PDF document.  Removes PDF document if it was created before. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePdfFileAsync(ImageCreatePdfFileRequest request, final ApiCallback<PdfFileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreatePdfFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreatePdfFileFromContent
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePdfFileFromContentCall(ImageCreatePdfFileFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/image/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.getFile() != null)
            localVarFormParams.put("File", request.getFile());
        if (request.getPdfFileOptions() != null)
            localVarFormParams.put("PdfFileOptions", request.getPdfFileOptions());

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreatePdfFileFromContentValidateBeforeCall(ImageCreatePdfFileFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling imageCreatePdfFileFromContent(Async)");
        }
        
        // verify the required parameter 'pdfFileOptions' is set
        if (request.getPdfFileOptions() == null) {
            throw new ApiException("Missing the required parameter 'pdfFileOptions' when calling imageCreatePdfFileFromContent(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreatePdfFileFromContentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates PDF document from document passed in request body and saves it in cache. Content with document or multipart content is expected where first part is document and second is PdfFileOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return PdfFileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfFileInfo imageCreatePdfFileFromContent(ImageCreatePdfFileFromContentRequest request) throws ApiException {
        ApiResponse<PdfFileInfo> resp = imageCreatePdfFileFromContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates PDF document from document passed in request body and saves it in cache. Content with document or multipart content is expected where first part is document and second is PdfFileOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;PdfFileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfFileInfo> imageCreatePdfFileFromContentWithHttpInfo(ImageCreatePdfFileFromContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePdfFileFromContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates PDF document from document passed in request body and saves it in cache. Content with document or multipart content is expected where first part is document and second is PdfFileOptions. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePdfFileFromContentAsync(ImageCreatePdfFileFromContentRequest request, final ApiCallback<PdfFileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreatePdfFileFromContentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageCreatePdfFileFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageCreatePdfFileFromUrlCall(ImageCreatePdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getPdfFileOptions();

        // create path and map variables
        String localVarPath = "/viewer/image/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageCreatePdfFileFromUrlValidateBeforeCall(ImageCreatePdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling imageCreatePdfFileFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = imageCreatePdfFileFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.  Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. Expects PdfFileOptions object data in request body.
     * 
     * @param request The request model
     * @return PdfFileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PdfFileInfo imageCreatePdfFileFromUrl(ImageCreatePdfFileFromUrlRequest request) throws ApiException {
        ApiResponse<PdfFileInfo> resp = imageCreatePdfFileFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.  Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. Expects PdfFileOptions object data in request body.
     * 
     * @param request The request model
     * @return ApiResponse&lt;PdfFileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PdfFileInfo> imageCreatePdfFileFromUrlWithHttpInfo(ImageCreatePdfFileFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageCreatePdfFileFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creates PDF document for document at provided URL and saves it in cache.  Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. Expects PdfFileOptions object data in request body. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageCreatePdfFileFromUrlAsync(ImageCreatePdfFileFromUrlRequest request, final ApiCallback<PdfFileInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageCreatePdfFileFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PdfFileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageDeleteAttachmentPagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageDeleteAttachmentPagesCacheCall(ImageDeleteAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/pages/cache"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageDeleteAttachmentPagesCacheValidateBeforeCall(ImageDeleteAttachmentPagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageDeleteAttachmentPagesCache(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageDeleteAttachmentPagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = imageDeleteAttachmentPagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes attachment cache.
     * 
     * @param request The request model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void imageDeleteAttachmentPagesCache(ImageDeleteAttachmentPagesCacheRequest request) throws ApiException {
        imageDeleteAttachmentPagesCacheWithHttpInfo(request);
    }

    /**
     * Removes attachment cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> imageDeleteAttachmentPagesCacheWithHttpInfo(ImageDeleteAttachmentPagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageDeleteAttachmentPagesCacheValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes attachment cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageDeleteAttachmentPagesCacheAsync(ImageDeleteAttachmentPagesCacheRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageDeleteAttachmentPagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for imageDeletePagesCache
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageDeletePagesCacheCall(ImageDeletePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pages/cache"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageDeletePagesCacheValidateBeforeCall(ImageDeletePagesCacheRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageDeletePagesCache(Async)");
        }
        

        com.squareup.okhttp.Call call = imageDeletePagesCacheCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Removes document cache.
     * 
     * @param request The request model
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void imageDeletePagesCache(ImageDeletePagesCacheRequest request) throws ApiException {
        imageDeletePagesCacheWithHttpInfo(request);
    }

    /**
     * Removes document cache.
     * 
     * @param request The request model
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> imageDeletePagesCacheWithHttpInfo(ImageDeletePagesCacheRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageDeletePagesCacheValidateBeforeCall(request, null, null);
        return apiClient.execute(call);
    }

    /**
     * Removes document cache. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageDeletePagesCacheAsync(ImageDeletePagesCacheRequest request, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageDeletePagesCacheValidateBeforeCall(request, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for imageGetAttachment
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentCall(ImageGetAttachmentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetAttachmentValidateBeforeCall(ImageGetAttachmentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetAttachment(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageGetAttachment(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetAttachmentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads attachment.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetAttachment(ImageGetAttachmentRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetAttachmentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads attachment.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetAttachmentWithHttpInfo(ImageGetAttachmentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetAttachmentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads attachment. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentAsync(ImageGetAttachmentRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetAttachmentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetAttachmentInfo
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentInfoCall(ImageGetAttachmentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetAttachmentInfoValidateBeforeCall(ImageGetAttachmentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetAttachmentInfo(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageGetAttachmentInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetAttachmentInfoCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment information.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetAttachmentInfo(ImageGetAttachmentInfoRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetAttachmentInfoWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment information.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetAttachmentInfoWithHttpInfo(ImageGetAttachmentInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetAttachmentInfoValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment information. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentInfoAsync(ImageGetAttachmentInfoRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetAttachmentInfoValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetAttachmentInfoWithOptions
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentInfoWithOptionsCall(ImageGetAttachmentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentInfoOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetAttachmentInfoWithOptionsValidateBeforeCall(ImageGetAttachmentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetAttachmentInfoWithOptions(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageGetAttachmentInfoWithOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetAttachmentInfoWithOptionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetAttachmentInfoWithOptions(ImageGetAttachmentInfoWithOptionsRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetAttachmentInfoWithOptionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetAttachmentInfoWithOptionsWithHttpInfo(ImageGetAttachmentInfoWithOptionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetAttachmentInfoWithOptionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment information with specified DocumentInfoOptions. Expects DocumentInfoOptions object data in request body. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentInfoWithOptionsAsync(ImageGetAttachmentInfoWithOptionsRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetAttachmentInfoWithOptionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetAttachmentPage
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentPageCall(ImageGetAttachmentPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/pages/{pageNumber}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetAttachmentPageValidateBeforeCall(ImageGetAttachmentPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetAttachmentPage(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageGetAttachmentPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling imageGetAttachmentPage(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetAttachmentPageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads attachment page as image.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetAttachmentPage(ImageGetAttachmentPageRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetAttachmentPageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads attachment page as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetAttachmentPageWithHttpInfo(ImageGetAttachmentPageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetAttachmentPageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads attachment page as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentPageAsync(ImageGetAttachmentPageRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetAttachmentPageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetAttachmentPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentPagesCall(ImageGetAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml", "application/zip"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetAttachmentPagesValidateBeforeCall(ImageGetAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetAttachmentPages(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageGetAttachmentPages(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetAttachmentPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment pages as images.
     * 
     * @param request The request model
     * @return ImageAttachmentPageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImageAttachmentPageCollection imageGetAttachmentPages(ImageGetAttachmentPagesRequest request) throws ApiException {
        ApiResponse<ImageAttachmentPageCollection> resp = imageGetAttachmentPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment pages as images.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImageAttachmentPageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImageAttachmentPageCollection> imageGetAttachmentPagesWithHttpInfo(ImageGetAttachmentPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetAttachmentPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImageAttachmentPageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment pages as images. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentPagesAsync(ImageGetAttachmentPagesRequest request, final ApiCallback<ImageAttachmentPageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetAttachmentPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImageAttachmentPageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetAttachments
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentsCall(ImageGetAttachmentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetAttachmentsValidateBeforeCall(ImageGetAttachmentsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetAttachments(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetAttachmentsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document attachments.
     * 
     * @param request The request model
     * @return AttachmentCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttachmentCollection imageGetAttachments(ImageGetAttachmentsRequest request) throws ApiException {
        ApiResponse<AttachmentCollection> resp = imageGetAttachmentsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document attachments.
     * 
     * @param request The request model
     * @return ApiResponse&lt;AttachmentCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AttachmentCollection> imageGetAttachmentsWithHttpInfo(ImageGetAttachmentsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetAttachmentsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<AttachmentCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document attachments. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetAttachmentsAsync(ImageGetAttachmentsRequest request, final ApiCallback<AttachmentCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetAttachmentsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AttachmentCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetDocumentInfo
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoCall(ImageGetDocumentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetDocumentInfoValidateBeforeCall(ImageGetDocumentInfoRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetDocumentInfo(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetDocumentInfoCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetDocumentInfo(ImageGetDocumentInfoRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetDocumentInfoWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetDocumentInfoWithHttpInfo(ImageGetDocumentInfoRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetDocumentInfoValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoAsync(ImageGetDocumentInfoRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetDocumentInfoValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetDocumentInfoFromContent
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoFromContentCall(ImageGetDocumentInfoFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/image/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (request.getFile() != null)
            localVarFormParams.put("File", request.getFile());
        if (request.getDocumentInfoOptions() != null)
            localVarFormParams.put("DocumentInfoOptions", request.getDocumentInfoOptions());

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetDocumentInfoFromContentValidateBeforeCall(ImageGetDocumentInfoFromContentRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'file' is set
        if (request.getFile() == null) {
            throw new ApiException("Missing the required parameter 'file' when calling imageGetDocumentInfoFromContent(Async)");
        }
        
        // verify the required parameter 'documentInfoOptions' is set
        if (request.getDocumentInfoOptions() == null) {
            throw new ApiException("Missing the required parameter 'documentInfoOptions' when calling imageGetDocumentInfoFromContent(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetDocumentInfoFromContentCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for posted document. Content with document or multipart content is expected where first part is document and second is DocumentInfoOptions. Saves file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetDocumentInfoFromContent(ImageGetDocumentInfoFromContentRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetDocumentInfoFromContentWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for posted document. Content with document or multipart content is expected where first part is document and second is DocumentInfoOptions. Saves file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetDocumentInfoFromContentWithHttpInfo(ImageGetDocumentInfoFromContentRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetDocumentInfoFromContentValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for posted document. Content with document or multipart content is expected where first part is document and second is DocumentInfoOptions. Saves file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoFromContentAsync(ImageGetDocumentInfoFromContentRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetDocumentInfoFromContentValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetDocumentInfoFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoFromUrlCall(ImageGetDocumentInfoFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/image/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetDocumentInfoFromUrlValidateBeforeCall(ImageGetDocumentInfoFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling imageGetDocumentInfoFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetDocumentInfoFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetDocumentInfoFromUrl(ImageGetDocumentInfoFromUrlRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetDocumentInfoFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetDocumentInfoFromUrlWithHttpInfo(ImageGetDocumentInfoFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetDocumentInfoFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoFromUrlAsync(ImageGetDocumentInfoFromUrlRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetDocumentInfoFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetDocumentInfoFromUrlWithOptions
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoFromUrlWithOptionsCall(ImageGetDocumentInfoFromUrlWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentInfoOptions();

        // create path and map variables
        String localVarPath = "/viewer/image/info";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetDocumentInfoFromUrlWithOptionsValidateBeforeCall(ImageGetDocumentInfoFromUrlWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling imageGetDocumentInfoFromUrlWithOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetDocumentInfoFromUrlWithOptionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetDocumentInfoFromUrlWithOptions(ImageGetDocumentInfoFromUrlWithOptionsRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetDocumentInfoFromUrlWithOptionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetDocumentInfoFromUrlWithOptionsWithHttpInfo(ImageGetDocumentInfoFromUrlWithOptionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetDocumentInfoFromUrlWithOptionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information for document at provided URL. Retrieves file from specified URL and tries to detect file type when fileName parameter is not specified. Saves retrieved file in storage. Use fileName and folder parameters to specify desired file name and folder to save file. When file with specified name already exists in storage new unique file name will be used for file. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoFromUrlWithOptionsAsync(ImageGetDocumentInfoFromUrlWithOptionsRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetDocumentInfoFromUrlWithOptionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetDocumentInfoWithOptions
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoWithOptionsCall(ImageGetDocumentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getDocumentInfoOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/info"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetDocumentInfoWithOptionsValidateBeforeCall(ImageGetDocumentInfoWithOptionsRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetDocumentInfoWithOptions(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetDocumentInfoWithOptionsCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves document information with specified options. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return DocumentInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DocumentInfo imageGetDocumentInfoWithOptions(ImageGetDocumentInfoWithOptionsRequest request) throws ApiException {
        ApiResponse<DocumentInfo> resp = imageGetDocumentInfoWithOptionsWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves document information with specified options. Expects DocumentInfoOptions object data in request body.
     * 
     * @param request The request model
     * @return ApiResponse&lt;DocumentInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DocumentInfo> imageGetDocumentInfoWithOptionsWithHttpInfo(ImageGetDocumentInfoWithOptionsRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetDocumentInfoWithOptionsValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves document information with specified options. Expects DocumentInfoOptions object data in request body. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetDocumentInfoWithOptionsAsync(ImageGetDocumentInfoWithOptionsRequest request, final ApiCallback<DocumentInfo> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetDocumentInfoWithOptionsValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DocumentInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetPage
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetPageCall(ImageGetPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pages/{pageNumber}"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "pageNumber" + "\\}", apiClient.escapeString(request.getPageNumber().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "image/_*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetPageValidateBeforeCall(ImageGetPageRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetPage(Async)");
        }
        
        // verify the required parameter 'pageNumber' is set
        if (request.getPageNumber() == null) {
            throw new ApiException("Missing the required parameter 'pageNumber' when calling imageGetPage(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetPageCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document page as image.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetPage(ImageGetPageRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetPageWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document page as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetPageWithHttpInfo(ImageGetPageRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetPageValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document page as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetPageAsync(ImageGetPageRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetPageValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetPagesCall(ImageGetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetPagesValidateBeforeCall(ImageGetPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetPages(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document pages as image.
     * 
     * @param request The request model
     * @return ImagePageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePageCollection imageGetPages(ImageGetPagesRequest request) throws ApiException {
        ApiResponse<ImagePageCollection> resp = imageGetPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document pages as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePageCollection> imageGetPagesWithHttpInfo(ImageGetPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document pages as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetPagesAsync(ImageGetPagesRequest request, final ApiCallback<ImagePageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetPagesFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetPagesFromUrlCall(ImageGetPagesFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/image/pages";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetPagesFromUrlValidateBeforeCall(ImageGetPagesFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling imageGetPagesFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetPagesFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document pages as image.
     * 
     * @param request The request model
     * @return ImagePageCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ImagePageCollection imageGetPagesFromUrl(ImageGetPagesFromUrlRequest request) throws ApiException {
        ApiResponse<ImagePageCollection> resp = imageGetPagesFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document pages as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;ImagePageCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ImagePageCollection> imageGetPagesFromUrlWithHttpInfo(ImageGetPagesFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetPagesFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document pages as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetPagesFromUrlAsync(ImageGetPagesFromUrlRequest request, final ApiCallback<ImagePageCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetPagesFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ImagePageCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetPdfFile
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetPdfFileCall(ImageGetPdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pdf"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetPdfFileValidateBeforeCall(ImageGetPdfFileRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetPdfFile(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetPdfFileCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document as PDF.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetPdfFile(ImageGetPdfFileRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetPdfFileWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document as PDF.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetPdfFileWithHttpInfo(ImageGetPdfFileRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetPdfFileValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document as PDF. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetPdfFileAsync(ImageGetPdfFileRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetPdfFileValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetPdfFileFromUrl
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetPdfFileFromUrlCall(ImageGetPdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/image/pdf";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getUrl() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("url", request.getUrl()));
        if (request.getFileName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fileName", request.getFileName()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/pdf"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetPdfFileFromUrlValidateBeforeCall(ImageGetPdfFileFromUrlRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'url' is set
        if (request.getUrl() == null) {
            throw new ApiException("Missing the required parameter 'url' when calling imageGetPdfFileFromUrl(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetPdfFileFromUrlCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Downloads document at provided URL as PDF.  Document will be retrieved from the passed URL and added to Storage.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetPdfFileFromUrl(ImageGetPdfFileFromUrlRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetPdfFileFromUrlWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Downloads document at provided URL as PDF.  Document will be retrieved from the passed URL and added to Storage.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetPdfFileFromUrlWithHttpInfo(ImageGetPdfFileFromUrlRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetPdfFileFromUrlValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Downloads document at provided URL as PDF.  Document will be retrieved from the passed URL and added to Storage. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetPdfFileFromUrlAsync(ImageGetPdfFileFromUrlRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetPdfFileFromUrlValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetZipWithAttachmentPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetZipWithAttachmentPagesCall(ImageGetZipWithAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/attachments/{attachmentName}/pages/zip"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()))
            .replaceAll("\\{" + "attachmentName" + "\\}", apiClient.escapeString(request.getAttachmentName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getAttachmentPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("attachmentPassword", request.getAttachmentPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/zip"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetZipWithAttachmentPagesValidateBeforeCall(ImageGetZipWithAttachmentPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetZipWithAttachmentPages(Async)");
        }
        
        // verify the required parameter 'attachmentName' is set
        if (request.getAttachmentName() == null) {
            throw new ApiException("Missing the required parameter 'attachmentName' when calling imageGetZipWithAttachmentPages(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetZipWithAttachmentPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves attachment pages as images.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetZipWithAttachmentPages(ImageGetZipWithAttachmentPagesRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetZipWithAttachmentPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves attachment pages as images.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetZipWithAttachmentPagesWithHttpInfo(ImageGetZipWithAttachmentPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetZipWithAttachmentPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves attachment pages as images. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetZipWithAttachmentPagesAsync(ImageGetZipWithAttachmentPagesRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetZipWithAttachmentPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageGetZipWithPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageGetZipWithPagesCall(ImageGetZipWithPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pages/zip"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFormat() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("format", request.getFormat()));
        if (request.getWidth() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("width", request.getWidth()));
        if (request.getHeight() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("height", request.getHeight()));
        if (request.getQuality() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("quality", request.getQuality()));
        if (request.getStartPageNumber() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("startPageNumber", request.getStartPageNumber()));
        if (request.getCountPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("countPages", request.getCountPages()));
        if (request.getPassword() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("password", request.getPassword()));
        if (request.getExtractText() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("extractText", request.getExtractText()));
        if (request.getRenderComments() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderComments", request.getRenderComments()));
        if (request.getRenderHiddenPages() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("renderHiddenPages", request.getRenderHiddenPages()));
        if (request.getDefaultFontName() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("defaultFontName", request.getDefaultFontName()));
        if (request.getFontsFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("fontsFolder", request.getFontsFolder()));
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/zip"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/zip"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageGetZipWithPagesValidateBeforeCall(ImageGetZipWithPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageGetZipWithPages(Async)");
        }
        

        com.squareup.okhttp.Call call = imageGetZipWithPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieves list of document pages as image.
     * 
     * @param request The request model
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public File imageGetZipWithPages(ImageGetZipWithPagesRequest request) throws ApiException {
        ApiResponse<File> resp = imageGetZipWithPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Retrieves list of document pages as image.
     * 
     * @param request The request model
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<File> imageGetZipWithPagesWithHttpInfo(ImageGetZipWithPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageGetZipWithPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieves list of document pages as image. (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageGetZipWithPagesAsync(ImageGetZipWithPagesRequest request, final ApiCallback<File> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageGetZipWithPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for imageTransformPages
     * @param request The request model
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call imageTransformPagesCall(ImageTransformPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request.getTransformOptions();

        // create path and map variables
        String localVarPath = "/viewer/{fileName}/image/pages"
            .replaceAll("\\{" + "fileName" + "\\}", apiClient.escapeString(request.getFileName().toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (request.getFolder() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("folder", request.getFolder()));
        if (request.getStorage() != null)
            localVarQueryParams.addAll(apiClient.parameterToPair("storage", request.getStorage()));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json", "application/xml"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "oauth" };
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call imageTransformPagesValidateBeforeCall(ImageTransformPagesRequest request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'fileName' is set
        if (request.getFileName() == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling imageTransformPages(Async)");
        }
        

        com.squareup.okhttp.Call call = imageTransformPagesCall(request, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Rotates or reorders document page(s).
     * 
     * @param request The request model
     * @return PageInfoCollection
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PageInfoCollection imageTransformPages(ImageTransformPagesRequest request) throws ApiException {
        ApiResponse<PageInfoCollection> resp = imageTransformPagesWithHttpInfo(request);
        return resp.getData();
    }

    /**
     * Rotates or reorders document page(s).
     * 
     * @param request The request model
     * @return ApiResponse&lt;PageInfoCollection&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PageInfoCollection> imageTransformPagesWithHttpInfo(ImageTransformPagesRequest request) throws ApiException {
        com.squareup.okhttp.Call call = imageTransformPagesValidateBeforeCall(request, null, null);
        Type localVarReturnType = new TypeToken<PageInfoCollection>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Rotates or reorders document page(s). (asynchronously)
     * 
     * @param request The request model
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call imageTransformPagesAsync(ImageTransformPagesRequest request, final ApiCallback<PageInfoCollection> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = imageTransformPagesValidateBeforeCall(request, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PageInfoCollection>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

