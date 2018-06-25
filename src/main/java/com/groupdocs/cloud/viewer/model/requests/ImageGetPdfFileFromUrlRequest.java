/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageGetPdfFileFromUrlRequest.java">
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

package com.groupdocs.cloud.viewer.model.requests;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.viewer.model.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.File;

/**
 * Request model for imageGetPdfFileFromUrl method.
 */
public class ImageGetPdfFileFromUrlRequest {
  @SerializedName("url")
  private String url = null;

  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

  @SerializedName("renderHiddenPages")
  private Boolean renderHiddenPages = null;

  @SerializedName("defaultFontName")
  private String defaultFontName = null;

  @SerializedName("fontsFolder")
  private String fontsFolder = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("storage")
  private String storage = null;

  /**
   * The URL to retrieve document.
   * @return The URL to retrieve document.
  **/
  @ApiModelProperty(example = "url_example", required = true, value = "The URL to retrieve document.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * The file name.
   * @return The file name.
  **/
  @ApiModelProperty(example = "fileName_example", value = "The file name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * The document password. Not required if PDF document was created before.
   * @return The document password. Not required if PDF document was created before.
  **/
  @ApiModelProperty(example = "password_example", value = "The document password. Not required if PDF document was created before.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Allows to render document comments. Not required if PDF document was created before.
   * @return Allows to render document comments. Not required if PDF document was created before.
  **/
  @ApiModelProperty(example = "false", value = "Allows to render document comments. Not required if PDF document was created before.")
  public Boolean getRenderComments() {
    return renderComments;
  }

  public void setRenderComments(Boolean renderComments) {
    this.renderComments = renderComments;
  }

  /**
   * Enables rendering of document hidden pages, sheets or slides.
   * @return Enables rendering of document hidden pages, sheets or slides.
  **/
  @ApiModelProperty(example = "false", value = "Enables rendering of document hidden pages, sheets or slides.")
  public Boolean getRenderHiddenPages() {
    return renderHiddenPages;
  }

  public void setRenderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
  }

  /**
   * The name of the default font.
   * @return The name of the default font.
  **/
  @ApiModelProperty(example = "defaultFontName_example", value = "The name of the default font.")
  public String getDefaultFontName() {
    return defaultFontName;
  }

  public void setDefaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
  }

  /**
   * The folder with custom fonts in storage.
   * @return The folder with custom fonts in storage.
  **/
  @ApiModelProperty(example = "fontsFolder_example", value = "The folder with custom fonts in storage.")
  public String getFontsFolder() {
    return fontsFolder;
  }

  public void setFontsFolder(String fontsFolder) {
    this.fontsFolder = fontsFolder;
  }

  /**
   * The folder which contains specified file in storage.
   * @return The folder which contains specified file in storage.
  **/
  @ApiModelProperty(example = "folder_example", value = "The folder which contains specified file in storage.")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  /**
   * The file storage which have to be used.
   * @return The file storage which have to be used.
  **/
  @ApiModelProperty(example = "storage_example", value = "The file storage which have to be used.")
  public String getStorage() {
    return storage;
  }

  public void setStorage(String storage) {
    this.storage = storage;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    
    ImageGetPdfFileFromUrlRequest request = (ImageGetPdfFileFromUrlRequest) o;
    return Objects.equals(this.url, request.url) &&
        Objects.equals(this.fileName, request.fileName) &&
        Objects.equals(this.password, request.password) &&
        Objects.equals(this.renderComments, request.renderComments) &&
        Objects.equals(this.renderHiddenPages, request.renderHiddenPages) &&
        Objects.equals(this.defaultFontName, request.defaultFontName) &&
        Objects.equals(this.fontsFolder, request.fontsFolder) &&
        Objects.equals(this.folder, request.folder) &&
        Objects.equals(this.storage, request.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, fileName, password, renderComments, renderHiddenPages, defaultFontName, fontsFolder, folder, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageGetPdfFileFromUrl {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
    sb.append("    renderHiddenPages: ").append(toIndentedString(renderHiddenPages)).append("\n");
    sb.append("    defaultFontName: ").append(toIndentedString(defaultFontName)).append("\n");
    sb.append("    fontsFolder: ").append(toIndentedString(fontsFolder)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

