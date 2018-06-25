/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AttachmentCollection.java">
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
import com.groupdocs.cloud.viewer.model.Attachment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes attachments.
 */
@ApiModel(description = "Describes attachments.")
public class AttachmentCollection {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  public AttachmentCollection fileName(String fileName) {
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

  public AttachmentCollection folder(String folder) {
    this.folder = folder;
    return this;
  }

   /**
   * File folder.
   * @return folder
  **/
  @ApiModelProperty(value = "File folder.")
  public String getFolder() {
    return folder;
  }

  public void setFolder(String folder) {
    this.folder = folder;
  }

  public AttachmentCollection attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public AttachmentCollection addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Attachments list.
   * @return attachments
  **/
  @ApiModelProperty(value = "Attachments list.")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentCollection attachmentCollection = (AttachmentCollection) o;
    return Objects.equals(this.fileName, attachmentCollection.fileName) &&
        Objects.equals(this.folder, attachmentCollection.folder) &&
        Objects.equals(this.attachments, attachmentCollection.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folder, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentCollection {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

