/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="AttachmentInfo.java">
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes attachment information
 */
@ApiModel(description = "Describes attachment information")
public class AttachmentInfo {
  @SerializedName("name")
  private String name = null;

  @SerializedName("extension")
  private String extension = null;

  @SerializedName("fileFormat")
  private String fileFormat = null;

  public AttachmentInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Attachment name.
   * @return name
  **/
  @ApiModelProperty(value = "Attachment name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentInfo extension(String extension) {
    this.extension = extension;
    return this;
  }

   /**
   * Attachment extension.
   * @return extension
  **/
  @ApiModelProperty(value = "Attachment extension.")
  public String getExtension() {
    return extension;
  }

  public void setExtension(String extension) {
    this.extension = extension;
  }

  public AttachmentInfo fileFormat(String fileFormat) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentInfo attachmentInfo = (AttachmentInfo) o;
    return Objects.equals(this.name, attachmentInfo.name) &&
        Objects.equals(this.extension, attachmentInfo.extension) &&
        Objects.equals(this.fileFormat, attachmentInfo.fileFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, extension, fileFormat);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentInfo {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
    sb.append("    fileFormat: ").append(toIndentedString(fileFormat)).append("\n");
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

