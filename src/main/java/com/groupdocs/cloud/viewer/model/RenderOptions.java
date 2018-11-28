/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RenderOptions.java">
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
import com.groupdocs.cloud.viewer.model.CadOptions;
import com.groupdocs.cloud.viewer.model.CellsOptions;
import com.groupdocs.cloud.viewer.model.EmailOptions;
import com.groupdocs.cloud.viewer.model.OutlookOptions;
import com.groupdocs.cloud.viewer.model.PdfOptions;
import com.groupdocs.cloud.viewer.model.ProjectOptions;
import com.groupdocs.cloud.viewer.model.RenderOptionsBase;
import com.groupdocs.cloud.viewer.model.SlidesOptions;
import com.groupdocs.cloud.viewer.model.Watermark;
import com.groupdocs.cloud.viewer.model.WordsOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Base render options.
 */
@ApiModel(description = "Base render options.")
public class RenderOptions extends RenderOptionsBase {
  @SerializedName("startPageNumber")
  private Integer startPageNumber = null;

  @SerializedName("countPages")
  private Integer countPages = null;

  public RenderOptions startPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
    return this;
  }

   /**
   * Allows to specify document page number as starting page to render. 
   * @return startPageNumber
  **/
  @ApiModelProperty(value = "Allows to specify document page number as starting page to render. ")
  public Integer getStartPageNumber() {
    return startPageNumber;
  }

  public void setStartPageNumber(Integer startPageNumber) {
    this.startPageNumber = startPageNumber;
  }

  public RenderOptions countPages(Integer countPages) {
    this.countPages = countPages;
    return this;
  }

   /**
   * Allows to specify count of document pages to render.
   * @return countPages
  **/
  @ApiModelProperty(value = "Allows to specify count of document pages to render.")
  public Integer getCountPages() {
    return countPages;
  }

  public void setCountPages(Integer countPages) {
    this.countPages = countPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderOptions renderOptions = (RenderOptions) o;
    return Objects.equals(this.startPageNumber, renderOptions.startPageNumber) &&
        Objects.equals(this.countPages, renderOptions.countPages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startPageNumber, countPages, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    startPageNumber: ").append(toIndentedString(startPageNumber)).append("\n");
    sb.append("    countPages: ").append(toIndentedString(countPages)).append("\n");
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

