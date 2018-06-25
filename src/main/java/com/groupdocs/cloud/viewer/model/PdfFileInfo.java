/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfFileInfo.java">
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
import com.groupdocs.cloud.viewer.model.ResourceUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Describes PDF file information.
 */
@ApiModel(description = "Describes PDF file information.")
public class PdfFileInfo extends ResourceUrl {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("pdfFileName")
  private String pdfFileName = null;

  public PdfFileInfo fileName(String fileName) {
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

  public PdfFileInfo folder(String folder) {
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

  public PdfFileInfo pdfFileName(String pdfFileName) {
    this.pdfFileName = pdfFileName;
    return this;
  }

   /**
   * PDF file name.
   * @return pdfFileName
  **/
  @ApiModelProperty(value = "PDF file name.")
  public String getPdfFileName() {
    return pdfFileName;
  }

  public void setPdfFileName(String pdfFileName) {
    this.pdfFileName = pdfFileName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfFileInfo pdfFileInfo = (PdfFileInfo) o;
    return Objects.equals(this.fileName, pdfFileInfo.fileName) &&
        Objects.equals(this.folder, pdfFileInfo.folder) &&
        Objects.equals(this.pdfFileName, pdfFileInfo.pdfFileName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folder, pdfFileName, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfFileInfo {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    pdfFileName: ").append(toIndentedString(pdfFileName)).append("\n");
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

