/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="RenderOptionsBase.java">
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
import com.groupdocs.cloud.viewer.model.PdfOptions;
import com.groupdocs.cloud.viewer.model.ProjectOptions;
import com.groupdocs.cloud.viewer.model.SlidesOptions;
import com.groupdocs.cloud.viewer.model.Watermark;
import com.groupdocs.cloud.viewer.model.WordsOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Base render options.
 */
@ApiModel(description = "Base render options.")
public class RenderOptionsBase {
  @SerializedName("password")
  private String password = null;

  @SerializedName("attachmentPassword")
  private String attachmentPassword = null;

  @SerializedName("extractText")
  private Boolean extractText = null;

  @SerializedName("renderComments")
  private Boolean renderComments = null;

  @SerializedName("renderHiddenPages")
  private Boolean renderHiddenPages = null;

  @SerializedName("transforms")
  private List<String> transforms = null;

  @SerializedName("defaultFontName")
  private String defaultFontName = null;

  @SerializedName("watermark")
  private Watermark watermark = null;

  @SerializedName("cellsOptions")
  private CellsOptions cellsOptions = null;

  @SerializedName("cadOptions")
  private CadOptions cadOptions = null;

  @SerializedName("emailOptions")
  private EmailOptions emailOptions = null;

  @SerializedName("wordsOptions")
  private WordsOptions wordsOptions = null;

  @SerializedName("pdfOptions")
  private PdfOptions pdfOptions = null;

  @SerializedName("slidesOptions")
  private SlidesOptions slidesOptions = null;

  @SerializedName("projectOptions")
  private ProjectOptions projectOptions = null;

  public RenderOptionsBase password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Allows to specify document password in case when document is password-protected.
   * @return password
  **/
  @ApiModelProperty(value = "Allows to specify document password in case when document is password-protected.")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public RenderOptionsBase attachmentPassword(String attachmentPassword) {
    this.attachmentPassword = attachmentPassword;
    return this;
  }

   /**
   * Allows to specify attachment password in case when attachment is password-protected.
   * @return attachmentPassword
  **/
  @ApiModelProperty(value = "Allows to specify attachment password in case when attachment is password-protected.")
  public String getAttachmentPassword() {
    return attachmentPassword;
  }

  public void setAttachmentPassword(String attachmentPassword) {
    this.attachmentPassword = attachmentPassword;
  }

  public RenderOptionsBase extractText(Boolean extractText) {
    this.extractText = extractText;
    return this;
  }

   /**
   * Enables document text extraction. For rendering document as image only.
   * @return extractText
  **/
  @ApiModelProperty(required = true, value = "Enables document text extraction. For rendering document as image only.")
  public Boolean isExtractText() {
    return extractText;
  }

  public void setExtractText(Boolean extractText) {
    this.extractText = extractText;
  }

  public RenderOptionsBase renderComments(Boolean renderComments) {
    this.renderComments = renderComments;
    return this;
  }

   /**
   * Enables document comments rendering.
   * @return renderComments
  **/
  @ApiModelProperty(required = true, value = "Enables document comments rendering.")
  public Boolean isRenderComments() {
    return renderComments;
  }

  public void setRenderComments(Boolean renderComments) {
    this.renderComments = renderComments;
  }

  public RenderOptionsBase renderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
    return this;
  }

   /**
   * Enables rendering of document hidden pages, sheets or slides.
   * @return renderHiddenPages
  **/
  @ApiModelProperty(required = true, value = "Enables rendering of document hidden pages, sheets or slides.")
  public Boolean isRenderHiddenPages() {
    return renderHiddenPages;
  }

  public void setRenderHiddenPages(Boolean renderHiddenPages) {
    this.renderHiddenPages = renderHiddenPages;
  }

  public RenderOptionsBase transforms(List<String> transforms) {
    this.transforms = transforms;
    return this;
  }

  public RenderOptionsBase addTransformsItem(String transformsItem) {
    if (this.transforms == null) {
      this.transforms = new ArrayList<String>();
    }
    this.transforms.add(transformsItem);
    return this;
  }

   /**
   * Transforms to apply. Available transforms [\&quot;Rotate\&quot;,\&quot;Reorder\&quot;,\&quot;AddPrintAction\&quot;]. 1. Rotate - pages will be rotated on angle if angle was set before. 2. Reorder - for rendering document as PDF only. Pages will be ordered according to rearrangements made before. 3. AddPrintAction - for rendering document as PDF only. An JavaScript action will be added which opens print dialog when PDF document is opened.   
   * @return transforms
  **/
  @ApiModelProperty(value = "Transforms to apply. Available transforms [\"Rotate\",\"Reorder\",\"AddPrintAction\"]. 1. Rotate - pages will be rotated on angle if angle was set before. 2. Reorder - for rendering document as PDF only. Pages will be ordered according to rearrangements made before. 3. AddPrintAction - for rendering document as PDF only. An JavaScript action will be added which opens print dialog when PDF document is opened.   ")
  public List<String> getTransforms() {
    return transforms;
  }

  public void setTransforms(List<String> transforms) {
    this.transforms = transforms;
  }

  public RenderOptionsBase defaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
    return this;
  }

   /**
   * The name of the default font. Default font name may be specified in following cases: - You want to generally specify the default font to fall back on, if particular font   in the document cannot be found during rendering. - Your document uses fonts, that contain non-English characters and you want to make sure   any missing font is replaced with one that has the same character set available.
   * @return defaultFontName
  **/
  @ApiModelProperty(value = "The name of the default font. Default font name may be specified in following cases: - You want to generally specify the default font to fall back on, if particular font   in the document cannot be found during rendering. - Your document uses fonts, that contain non-English characters and you want to make sure   any missing font is replaced with one that has the same character set available.")
  public String getDefaultFontName() {
    return defaultFontName;
  }

  public void setDefaultFontName(String defaultFontName) {
    this.defaultFontName = defaultFontName;
  }

  public RenderOptionsBase watermark(Watermark watermark) {
    this.watermark = watermark;
    return this;
  }

   /**
   * Allows to specify watermark.
   * @return watermark
  **/
  @ApiModelProperty(value = "Allows to specify watermark.")
  public Watermark getWatermark() {
    return watermark;
  }

  public void setWatermark(Watermark watermark) {
    this.watermark = watermark;
  }

  public RenderOptionsBase cellsOptions(CellsOptions cellsOptions) {
    this.cellsOptions = cellsOptions;
    return this;
  }

   /**
   * The Spreadsheet documents rendering options.
   * @return cellsOptions
  **/
  @ApiModelProperty(value = "The Spreadsheet documents rendering options.")
  public CellsOptions getCellsOptions() {
    return cellsOptions;
  }

  public void setCellsOptions(CellsOptions cellsOptions) {
    this.cellsOptions = cellsOptions;
  }

  public RenderOptionsBase cadOptions(CadOptions cadOptions) {
    this.cadOptions = cadOptions;
    return this;
  }

   /**
   * The CAD documents rendering options.
   * @return cadOptions
  **/
  @ApiModelProperty(value = "The CAD documents rendering options.")
  public CadOptions getCadOptions() {
    return cadOptions;
  }

  public void setCadOptions(CadOptions cadOptions) {
    this.cadOptions = cadOptions;
  }

  public RenderOptionsBase emailOptions(EmailOptions emailOptions) {
    this.emailOptions = emailOptions;
    return this;
  }

   /**
   * The Email documents rendering options.
   * @return emailOptions
  **/
  @ApiModelProperty(value = "The Email documents rendering options.")
  public EmailOptions getEmailOptions() {
    return emailOptions;
  }

  public void setEmailOptions(EmailOptions emailOptions) {
    this.emailOptions = emailOptions;
  }

  public RenderOptionsBase wordsOptions(WordsOptions wordsOptions) {
    this.wordsOptions = wordsOptions;
    return this;
  }

   /**
   * The Text documents rendering options.
   * @return wordsOptions
  **/
  @ApiModelProperty(value = "The Text documents rendering options.")
  public WordsOptions getWordsOptions() {
    return wordsOptions;
  }

  public void setWordsOptions(WordsOptions wordsOptions) {
    this.wordsOptions = wordsOptions;
  }

  public RenderOptionsBase pdfOptions(PdfOptions pdfOptions) {
    this.pdfOptions = pdfOptions;
    return this;
  }

   /**
   * The PDF documents rendering options.
   * @return pdfOptions
  **/
  @ApiModelProperty(value = "The PDF documents rendering options.")
  public PdfOptions getPdfOptions() {
    return pdfOptions;
  }

  public void setPdfOptions(PdfOptions pdfOptions) {
    this.pdfOptions = pdfOptions;
  }

  public RenderOptionsBase slidesOptions(SlidesOptions slidesOptions) {
    this.slidesOptions = slidesOptions;
    return this;
  }

   /**
   * The Presentation documents rendering options.
   * @return slidesOptions
  **/
  @ApiModelProperty(value = "The Presentation documents rendering options.")
  public SlidesOptions getSlidesOptions() {
    return slidesOptions;
  }

  public void setSlidesOptions(SlidesOptions slidesOptions) {
    this.slidesOptions = slidesOptions;
  }

  public RenderOptionsBase projectOptions(ProjectOptions projectOptions) {
    this.projectOptions = projectOptions;
    return this;
  }

   /**
   * The Microsoft Project documents rendering options.
   * @return projectOptions
  **/
  @ApiModelProperty(value = "The Microsoft Project documents rendering options.")
  public ProjectOptions getProjectOptions() {
    return projectOptions;
  }

  public void setProjectOptions(ProjectOptions projectOptions) {
    this.projectOptions = projectOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RenderOptionsBase renderOptionsBase = (RenderOptionsBase) o;
    return Objects.equals(this.password, renderOptionsBase.password) &&
        Objects.equals(this.attachmentPassword, renderOptionsBase.attachmentPassword) &&
        Objects.equals(this.extractText, renderOptionsBase.extractText) &&
        Objects.equals(this.renderComments, renderOptionsBase.renderComments) &&
        Objects.equals(this.renderHiddenPages, renderOptionsBase.renderHiddenPages) &&
        Objects.equals(this.transforms, renderOptionsBase.transforms) &&
        Objects.equals(this.defaultFontName, renderOptionsBase.defaultFontName) &&
        Objects.equals(this.watermark, renderOptionsBase.watermark) &&
        Objects.equals(this.cellsOptions, renderOptionsBase.cellsOptions) &&
        Objects.equals(this.cadOptions, renderOptionsBase.cadOptions) &&
        Objects.equals(this.emailOptions, renderOptionsBase.emailOptions) &&
        Objects.equals(this.wordsOptions, renderOptionsBase.wordsOptions) &&
        Objects.equals(this.pdfOptions, renderOptionsBase.pdfOptions) &&
        Objects.equals(this.slidesOptions, renderOptionsBase.slidesOptions) &&
        Objects.equals(this.projectOptions, renderOptionsBase.projectOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, attachmentPassword, extractText, renderComments, renderHiddenPages, transforms, defaultFontName, watermark, cellsOptions, cadOptions, emailOptions, wordsOptions, pdfOptions, slidesOptions, projectOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RenderOptionsBase {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    attachmentPassword: ").append(toIndentedString(attachmentPassword)).append("\n");
    sb.append("    extractText: ").append(toIndentedString(extractText)).append("\n");
    sb.append("    renderComments: ").append(toIndentedString(renderComments)).append("\n");
    sb.append("    renderHiddenPages: ").append(toIndentedString(renderHiddenPages)).append("\n");
    sb.append("    transforms: ").append(toIndentedString(transforms)).append("\n");
    sb.append("    defaultFontName: ").append(toIndentedString(defaultFontName)).append("\n");
    sb.append("    watermark: ").append(toIndentedString(watermark)).append("\n");
    sb.append("    cellsOptions: ").append(toIndentedString(cellsOptions)).append("\n");
    sb.append("    cadOptions: ").append(toIndentedString(cadOptions)).append("\n");
    sb.append("    emailOptions: ").append(toIndentedString(emailOptions)).append("\n");
    sb.append("    wordsOptions: ").append(toIndentedString(wordsOptions)).append("\n");
    sb.append("    pdfOptions: ").append(toIndentedString(pdfOptions)).append("\n");
    sb.append("    slidesOptions: ").append(toIndentedString(slidesOptions)).append("\n");
    sb.append("    projectOptions: ").append(toIndentedString(projectOptions)).append("\n");
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

