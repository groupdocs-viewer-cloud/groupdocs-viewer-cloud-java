/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CellsOptions.java">
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
 * The Spreadsheet documents rendering options.
 */
@ApiModel(description = "The Spreadsheet documents rendering options.")
public class CellsOptions {
  @SerializedName("renderGridLines")
  private Boolean renderGridLines = null;

  @SerializedName("paginateSheets")
  private Boolean paginateSheets = null;

  @SerializedName("countRowsPerPage")
  private Integer countRowsPerPage = null;

  @SerializedName("ignoreEmptyRows")
  private Boolean ignoreEmptyRows = null;

  @SerializedName("encoding")
  private String encoding = null;

  @SerializedName("internalHyperlinkPrefix")
  private String internalHyperlinkPrefix = null;

  @SerializedName("textOverflowMode")
  private String textOverflowMode = null;

  @SerializedName("renderHiddenRows")
  private Boolean renderHiddenRows = null;

  @SerializedName("renderHiddenColumns")
  private Boolean renderHiddenColumns = null;

  @SerializedName("renderPrintAreaOnly")
  private Boolean renderPrintAreaOnly = null;

  public CellsOptions renderGridLines(Boolean renderGridLines) {
    this.renderGridLines = renderGridLines;
    return this;
  }

   /**
   * Indicates whether to render grid lines.
   * @return renderGridLines
  **/
  @ApiModelProperty(required = true, value = "Indicates whether to render grid lines.")
  public Boolean isRenderGridLines() {
    return renderGridLines;
  }

  public void setRenderGridLines(Boolean renderGridLines) {
    this.renderGridLines = renderGridLines;
  }

  public CellsOptions paginateSheets(Boolean paginateSheets) {
    this.paginateSheets = paginateSheets;
    return this;
  }

   /**
   * Allows to enable worksheets pagination. By default one worksheet is rendered into one page.
   * @return paginateSheets
  **/
  @ApiModelProperty(required = true, value = "Allows to enable worksheets pagination. By default one worksheet is rendered into one page.")
  public Boolean isPaginateSheets() {
    return paginateSheets;
  }

  public void setPaginateSheets(Boolean paginateSheets) {
    this.paginateSheets = paginateSheets;
  }

  public CellsOptions countRowsPerPage(Integer countRowsPerPage) {
    this.countRowsPerPage = countRowsPerPage;
    return this;
  }

   /**
   * The number of rows rendered into one page when PaginateSheets &#x3D; true. Default value is 50.
   * @return countRowsPerPage
  **/
  @ApiModelProperty(required = true, value = "The number of rows rendered into one page when PaginateSheets = true. Default value is 50.")
  public Integer getCountRowsPerPage() {
    return countRowsPerPage;
  }

  public void setCountRowsPerPage(Integer countRowsPerPage) {
    this.countRowsPerPage = countRowsPerPage;
  }

  public CellsOptions ignoreEmptyRows(Boolean ignoreEmptyRows) {
    this.ignoreEmptyRows = ignoreEmptyRows;
    return this;
  }

   /**
   * Indicates whether empty rows should be ignored.
   * @return ignoreEmptyRows
  **/
  @ApiModelProperty(required = true, value = "Indicates whether empty rows should be ignored.")
  public Boolean isIgnoreEmptyRows() {
    return ignoreEmptyRows;
  }

  public void setIgnoreEmptyRows(Boolean ignoreEmptyRows) {
    this.ignoreEmptyRows = ignoreEmptyRows;
  }

  public CellsOptions encoding(String encoding) {
    this.encoding = encoding;
    return this;
  }

   /**
   * The text (*.csv) document encoding.
   * @return encoding
  **/
  @ApiModelProperty(value = "The text (*.csv) document encoding.")
  public String getEncoding() {
    return encoding;
  }

  public void setEncoding(String encoding) {
    this.encoding = encoding;
  }

  public CellsOptions internalHyperlinkPrefix(String internalHyperlinkPrefix) {
    this.internalHyperlinkPrefix = internalHyperlinkPrefix;
    return this;
  }

   /**
   * Prefix for hyper-link that references worksheet inside the same document. For rendering document as HTML only.
   * @return internalHyperlinkPrefix
  **/
  @ApiModelProperty(value = "Prefix for hyper-link that references worksheet inside the same document. For rendering document as HTML only.")
  public String getInternalHyperlinkPrefix() {
    return internalHyperlinkPrefix;
  }

  public void setInternalHyperlinkPrefix(String internalHyperlinkPrefix) {
    this.internalHyperlinkPrefix = internalHyperlinkPrefix;
  }

  public CellsOptions textOverflowMode(String textOverflowMode) {
    this.textOverflowMode = textOverflowMode;
    return this;
  }

   /**
   * Text overflow mode applied when the text is too big to fit into the cell. Supported values {Overlay|OverlayIfNextIsEmpty|HideText|AutoFitColumn}: 1. Overlay - overlay next cells even they are not empty. 2. OverlayIfNextIsEmpty - overlay next cells only if they are not empty (default). 3. HideText - hide overflow text. 4. AutoFitColumn - expand cell width to fit overflowed text.
   * @return textOverflowMode
  **/
  @ApiModelProperty(value = "Text overflow mode applied when the text is too big to fit into the cell. Supported values {Overlay|OverlayIfNextIsEmpty|HideText|AutoFitColumn}: 1. Overlay - overlay next cells even they are not empty. 2. OverlayIfNextIsEmpty - overlay next cells only if they are not empty (default). 3. HideText - hide overflow text. 4. AutoFitColumn - expand cell width to fit overflowed text.")
  public String getTextOverflowMode() {
    return textOverflowMode;
  }

  public void setTextOverflowMode(String textOverflowMode) {
    this.textOverflowMode = textOverflowMode;
  }

  public CellsOptions renderHiddenRows(Boolean renderHiddenRows) {
    this.renderHiddenRows = renderHiddenRows;
    return this;
  }

   /**
   * Enables rendering of hidden rows.
   * @return renderHiddenRows
  **/
  @ApiModelProperty(required = true, value = "Enables rendering of hidden rows.")
  public Boolean isRenderHiddenRows() {
    return renderHiddenRows;
  }

  public void setRenderHiddenRows(Boolean renderHiddenRows) {
    this.renderHiddenRows = renderHiddenRows;
  }

  public CellsOptions renderHiddenColumns(Boolean renderHiddenColumns) {
    this.renderHiddenColumns = renderHiddenColumns;
    return this;
  }

   /**
   * Enables rendering of hidden columns.
   * @return renderHiddenColumns
  **/
  @ApiModelProperty(required = true, value = "Enables rendering of hidden columns.")
  public Boolean isRenderHiddenColumns() {
    return renderHiddenColumns;
  }

  public void setRenderHiddenColumns(Boolean renderHiddenColumns) {
    this.renderHiddenColumns = renderHiddenColumns;
  }

  public CellsOptions renderPrintAreaOnly(Boolean renderPrintAreaOnly) {
    this.renderPrintAreaOnly = renderPrintAreaOnly;
    return this;
  }

   /**
   * Enables rendering worksheet(s) sections which is defined as print area. Renders each print area in a worksheet as a separate page.
   * @return renderPrintAreaOnly
  **/
  @ApiModelProperty(required = true, value = "Enables rendering worksheet(s) sections which is defined as print area. Renders each print area in a worksheet as a separate page.")
  public Boolean isRenderPrintAreaOnly() {
    return renderPrintAreaOnly;
  }

  public void setRenderPrintAreaOnly(Boolean renderPrintAreaOnly) {
    this.renderPrintAreaOnly = renderPrintAreaOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CellsOptions cellsOptions = (CellsOptions) o;
    return Objects.equals(this.renderGridLines, cellsOptions.renderGridLines) &&
        Objects.equals(this.paginateSheets, cellsOptions.paginateSheets) &&
        Objects.equals(this.countRowsPerPage, cellsOptions.countRowsPerPage) &&
        Objects.equals(this.ignoreEmptyRows, cellsOptions.ignoreEmptyRows) &&
        Objects.equals(this.encoding, cellsOptions.encoding) &&
        Objects.equals(this.internalHyperlinkPrefix, cellsOptions.internalHyperlinkPrefix) &&
        Objects.equals(this.textOverflowMode, cellsOptions.textOverflowMode) &&
        Objects.equals(this.renderHiddenRows, cellsOptions.renderHiddenRows) &&
        Objects.equals(this.renderHiddenColumns, cellsOptions.renderHiddenColumns) &&
        Objects.equals(this.renderPrintAreaOnly, cellsOptions.renderPrintAreaOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(renderGridLines, paginateSheets, countRowsPerPage, ignoreEmptyRows, encoding, internalHyperlinkPrefix, textOverflowMode, renderHiddenRows, renderHiddenColumns, renderPrintAreaOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CellsOptions {\n");
    
    sb.append("    renderGridLines: ").append(toIndentedString(renderGridLines)).append("\n");
    sb.append("    paginateSheets: ").append(toIndentedString(paginateSheets)).append("\n");
    sb.append("    countRowsPerPage: ").append(toIndentedString(countRowsPerPage)).append("\n");
    sb.append("    ignoreEmptyRows: ").append(toIndentedString(ignoreEmptyRows)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
    sb.append("    internalHyperlinkPrefix: ").append(toIndentedString(internalHyperlinkPrefix)).append("\n");
    sb.append("    textOverflowMode: ").append(toIndentedString(textOverflowMode)).append("\n");
    sb.append("    renderHiddenRows: ").append(toIndentedString(renderHiddenRows)).append("\n");
    sb.append("    renderHiddenColumns: ").append(toIndentedString(renderHiddenColumns)).append("\n");
    sb.append("    renderPrintAreaOnly: ").append(toIndentedString(renderPrintAreaOnly)).append("\n");
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

