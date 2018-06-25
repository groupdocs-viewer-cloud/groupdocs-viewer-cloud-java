/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="ImagePageCollection.java">
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
import com.groupdocs.cloud.viewer.model.ImagePage;
import com.groupdocs.cloud.viewer.model.ResourceUrl;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Describes image pages.
 */
@ApiModel(description = "Describes image pages.")
public class ImagePageCollection extends ResourceUrl {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("folder")
  private String folder = null;

  @SerializedName("pages")
  private List<ImagePage> pages = null;

  public ImagePageCollection fileName(String fileName) {
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

  public ImagePageCollection folder(String folder) {
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

  public ImagePageCollection pages(List<ImagePage> pages) {
    this.pages = pages;
    return this;
  }

  public ImagePageCollection addPagesItem(ImagePage pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<ImagePage>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Images list.
   * @return pages
  **/
  @ApiModelProperty(value = "Images list.")
  public List<ImagePage> getPages() {
    return pages;
  }

  public void setPages(List<ImagePage> pages) {
    this.pages = pages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagePageCollection imagePageCollection = (ImagePageCollection) o;
    return Objects.equals(this.fileName, imagePageCollection.fileName) &&
        Objects.equals(this.folder, imagePageCollection.folder) &&
        Objects.equals(this.pages, imagePageCollection.pages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, folder, pages, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagePageCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    folder: ").append(toIndentedString(folder)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

