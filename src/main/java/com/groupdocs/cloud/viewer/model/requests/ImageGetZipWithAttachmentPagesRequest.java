/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImageGetZipWithAttachmentPagesRequest.java">
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
 * Request model for imageGetZipWithAttachmentPages method.
 */
public class ImageGetZipWithAttachmentPagesRequest {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("attachmentName")
  private String attachmentName = null;

  @SerializedName("format")
  private String format = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("quality")
  private Integer quality = null;

  @SerializedName("startPageNumber")
  private Integer startPageNumber = null;

  @SerializedName("countPages")
  private Integer countPages = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

  @SerializedName("renderHiddenPages")
  private Boolean renderHiddenPages = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("attachmentPassword")
  private String attachmentPassword = null;

  @SerializedName("extractText")
  private Boolean extractText = null;

  @SerializedName("defaultFontName")
  private String defaultFontName = null;

  @SerializedName("fontsFolder")
  private String fontsFolder = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("storage")
  private String storage = null;

  /**
   * The file name.
   * @return The file name.
  **/
  @ApiModelProperty(example = "fileName_example", required = true, value = "The file name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  /**
   * The attachment name.
   * @return The attachment name.
  **/
  @ApiModelProperty(example = "attachmentName_example", required = true, value = "The attachment name.")
  public String getAttachmentName() {
    return attachmentName;
  }

  public void setAttachmentName(String attachmentName) {
    this.attachmentName = attachmentName;
  }

  /**
   * The image format (jpg, png or bmp). Default value is png.
   * @return The image format (jpg, png or bmp). Default value is png.
  **/
  @ApiModelProperty(example = "format_example", value = "The image format (jpg, png or bmp). Default value is png.")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  /**
   * The image width.
   * @return The image width.
  **/
  @ApiModelProperty(example = "0", value = "The image width.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * The image height.
   * @return The image height.
  **/
  @ApiModelProperty(example = "0", value = "The image height.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * The image quality for jpg format. Default value is 90.
   * @return The image quality for jpg format. Default value is 90.
  **/
  @ApiModelProperty(example = "0", value = "The image quality for jpg format. Default value is 90.")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  /**
   * The starting document page number to render.
   * @return The starting document page number to render.
  **/
  @ApiModelProperty(example = "0", value = "The starting document page number to render.")
  public Integer getStartPageNumber() {
    return startPageNumber;
  }

  public void setStartPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
  }

  /**
   * The count of document pages to render.
   * @return The count of document pages to render.
  **/
  @ApiModelProperty(example = "0", value = "The count of document pages to render.")
  public Integer getCountPages() {
    return countPages;
  }

  public void setCountPages(Integer countPages) {
    this.countPages = countPages;
  }

  /**
   * Allows to render document comments.
   * @return Allows to render document comments.
  **/
  @ApiModelProperty(example = "false", value = "Allows to render document comments.")
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
   * The document password.
   * @return The document password.
  **/
  @ApiModelProperty(example = "password_example", value = "The document password.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * The attachment password.
   * @return The attachment password.
  **/
  @ApiModelProperty(example = "attachmentPassword_example", value = "The attachment password.")
  public String getAttachmentPassword() {
    return attachmentPassword;
  }

  public void setAttachmentPassword(String attachmentPassword) {
    this.attachmentPassword = attachmentPassword;
  }

  /**
   * When this options is set to true text contained in document will be extracted and returned along with other information.
   * @return When this options is set to true text contained in document will be extracted and returned along with other information.
  **/
  @ApiModelProperty(example = "false", value = "When this options is set to true text contained in document will be extracted and returned along with other information.")
  public Boolean getExtractText() {
    return extractText;
  }

  public void setExtractText(Boolean extractText) {
    this.extractText = extractText;
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
    
    ImageGetZipWithAttachmentPagesRequest request = (ImageGetZipWithAttachmentPagesRequest) o;
    return Objects.equals(this.fileName, request.fileName) &&
        Objects.equals(this.attachmentName, request.attachmentName) &&
        Objects.equals(this.format, request.format) &&
        Objects.equals(this.width, request.width) &&
        Objects.equals(this.height, request.height) &&
        Objects.equals(this.quality, request.quality) &&
        Objects.equals(this.startPageNumber, request.startPageNumber) &&
        Objects.equals(this.countPages, request.countPages) &&
        Objects.equals(this.renderComments, request.renderComments) &&
        Objects.equals(this.renderHiddenPages, request.renderHiddenPages) &&
        Objects.equals(this.password, request.password) &&
        Objects.equals(this.attachmentPassword, request.attachmentPassword) &&
        Objects.equals(this.extractText, request.extractText) &&
        Objects.equals(this.defaultFontName, request.defaultFontName) &&
        Objects.equals(this.fontsFolder, request.fontsFolder) &&
        Objects.equals(this.folder, request.folder) &&
        Objects.equals(this.storage, request.storage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, attachmentName, format, width, height, quality, startPageNumber, countPages, renderComments, renderHiddenPages, password, attachmentPassword, extractText, defaultFontName, fontsFolder, folder, storage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageGetZipWithAttachmentPages {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    attachmentName: ").append(toIndentedString(attachmentName)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    countPages: ").append(toIndentedString(countPages)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
    sb.append("    renderHiddenPages: ").append(toIndentedString(renderHiddenPages)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    attachmentPassword: ").append(toIndentedString(attachmentPassword)).append("\n");
    sb.append("    extractText: ").append(toIndentedString(extractText)).append("\n");
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

