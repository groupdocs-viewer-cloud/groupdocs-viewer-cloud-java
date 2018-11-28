/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="DocumentInfo.java">
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

package com.groupdocs.cloud.viewer.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.groupdocs.cloud.viewer.model.AttachmentInfo;
import com.groupdocs.cloud.viewer.model.PageInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * Describes document information.
 */
@ApiModel(description = "Describes document information.")
public class DocumentInfo {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  @SerializedName("size")
  private Long size = null;

  @SerializedName("dateModified")
  private OffsetDateTime dateModified = null;

  @SerializedName("pages")
  private List<PageInfo> pages = null;

  @SerializedName("attachments")
  private List<AttachmentInfo> attachments = null;

  @SerializedName("layers")
  private List<String> layers = null;

  @SerializedName("startDate")
  private OffsetDateTime startDate = null;

  @SerializedName("endDate")
  private OffsetDateTime endDate = null;

  public DocumentInfo fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * File name.
   * @return fileName
  **/
  @ApiModelProperty(value = "File name.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public DocumentInfo extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Extension
   * @return extension
  **/
  @ApiModelProperty(value = "Extension")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public DocumentInfo fileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

   /**
   * File format.
   * @return fileFormat
  **/
  @ApiModelProperty(value = "File format.")
  public String getFileFormat() {
    return fileFormat;
  }

  public void setFileFormat(String fileFormat) {
    this.fileFormat = fileFormat;
  }

  public DocumentInfo size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * Size in bytes.
   * @return size
  **/
  @ApiModelProperty(value = "Size in bytes.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DocumentInfo dateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Modification date.
   * @return dateModified
  **/
  @ApiModelProperty(value = "Modification date.")
  public OffsetDateTime getDateModified() {
    return dateModified;
  }

  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }

  public DocumentInfo pages(List<PageInfo> pages) {
    this.pages = pages;
    return this;
  }

  public DocumentInfo addPagesItem(PageInfo pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<PageInfo>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Pages information.
   * @return pages
  **/
  @ApiModelProperty(value = "Pages information.")
  public List<PageInfo> getPages() {
    return pages;
  }

  public void setPages(List<PageInfo> pages) {
    this.pages = pages;
  }

  public DocumentInfo attachments(List<AttachmentInfo> attachments) {
    this.attachments = attachments;
    return this;
  }

  public DocumentInfo addAttachmentsItem(AttachmentInfo attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<AttachmentInfo>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * List of attachments.
   * @return attachments
  **/
  @ApiModelProperty(value = "List of attachments.")
  public List<AttachmentInfo> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentInfo> attachments) {
    this.attachments = attachments;
  }

  public DocumentInfo layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public DocumentInfo addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<String>();
    }
    this.layers.add(layersItem);
    return this;
  }

   /**
   * The list of layers contained in a CAD document.
   * @return layers
  **/
  @ApiModelProperty(value = "The list of layers contained in a CAD document.")
  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }

  public DocumentInfo startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * For MS Project documents, The date time from which the project started.
   * @return startDate
  **/
  @ApiModelProperty(value = "For MS Project documents, The date time from which the project started.")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public DocumentInfo endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * For MS Project documents, the date time when the project is to be completed.
   * @return endDate
  **/
  @ApiModelProperty(value = "For MS Project documents, the date time when the project is to be completed.")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentInfo documentInfo = (DocumentInfo) o;
    return Objects.equals(this.fileName, documentInfo.fileName) &&
        Objects.equals(this.extension, documentInfo.extension) &&
        Objects.equals(this.fileFormat, documentInfo.fileFormat) &&
        Objects.equals(this.size, documentInfo.size) &&
        Objects.equals(this.dateModified, documentInfo.dateModified) &&
        Objects.equals(this.pages, documentInfo.pages) &&
        Objects.equals(this.attachments, documentInfo.attachments) &&
        Objects.equals(this.layers, documentInfo.layers) &&
        Objects.equals(this.startDate, documentInfo.startDate) &&
        Objects.equals(this.endDate, documentInfo.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, extension, fileFormat, size, dateModified, pages, attachments, layers, startDate, endDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentInfo {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

