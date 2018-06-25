/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="HtmlOptions.java">
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
import com.groupdocs.cloud.viewer.model.RenderOptions;
import com.groupdocs.cloud.viewer.model.SlidesOptions;
import com.groupdocs.cloud.viewer.model.Watermark;
import com.groupdocs.cloud.viewer.model.WordsOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.List;

/**
 * Provides options for rendering document pages as HTML.
 */
@ApiModel(description = "Provides options for rendering document pages as HTML.")
public class HtmlOptions extends RenderOptions {
  @SerializedName("resourcePath")
  private String resourcePath = null;

  @SerializedName("ignoreResourcePathInResources")
  private Boolean ignoreResourcePathInResources = null;

  @SerializedName("embedResources")
  private Boolean embedResources = null;

  @SerializedName("enableMinification")
  private Boolean enableMinification = null;

  @SerializedName("enableResponsiveRendering")
  private Boolean enableResponsiveRendering = null;

  @SerializedName("excludeFonts")
  private Boolean excludeFonts = null;

  public HtmlOptions resourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
    return this;
  }

   /**
   * Allows to specify HTML resources (styles, images and fonts) path. For example when resource path is http://example.com/api/pages/{page-number}/resources/{resource-name} the {page-number} and {resource-name} templates will be replaced with page number and resource name accordingly. Ignored when EmbedResources option is set to true.
   * @return resourcePath
  **/
  @ApiModelProperty(value = "Allows to specify HTML resources (styles, images and fonts) path. For example when resource path is http://example.com/api/pages/{page-number}/resources/{resource-name} the {page-number} and {resource-name} templates will be replaced with page number and resource name accordingly. Ignored when EmbedResources option is set to true.")
  public String getResourcePath() {
    return resourcePath;
  }

  public void setResourcePath(String resourcePath) {
    this.resourcePath = resourcePath;
  }

  public HtmlOptions ignoreResourcePathInResources(Boolean ignoreResourcePathInResources) {
    this.ignoreResourcePathInResources = ignoreResourcePathInResources;
    return this;
  }

   /**
   * Allows to ignore ResourcePath when processing *.css files.  When this options is enabled ResourcePath won&#39;t be added to resource references in *.css file.
   * @return ignoreResourcePathInResources
  **/
  @ApiModelProperty(value = "Allows to ignore ResourcePath when processing *.css files.  When this options is enabled ResourcePath won't be added to resource references in *.css file.")
  public Boolean isIgnoreResourcePathInResources() {
    return ignoreResourcePathInResources;
  }

  public void setIgnoreResourcePathInResources(Boolean ignoreResourcePathInResources) {
    this.ignoreResourcePathInResources = ignoreResourcePathInResources;
  }

  public HtmlOptions embedResources(Boolean embedResources) {
    this.embedResources = embedResources;
    return this;
  }

   /**
   * Controls output HTML document resources (styles, images and fonts) saving. When this options set to true all resources will be embedded into HTML document and ResourcePath option value will be ignored.
   * @return embedResources
  **/
  @ApiModelProperty(value = "Controls output HTML document resources (styles, images and fonts) saving. When this options set to true all resources will be embedded into HTML document and ResourcePath option value will be ignored.")
  public Boolean isEmbedResources() {
    return embedResources;
  }

  public void setEmbedResources(Boolean embedResources) {
    this.embedResources = embedResources;
  }

  public HtmlOptions enableMinification(Boolean enableMinification) {
    this.enableMinification = enableMinification;
    return this;
  }

   /**
   * Enables content (HTML, CSS and SVG) minification.
   * @return enableMinification
  **/
  @ApiModelProperty(value = "Enables content (HTML, CSS and SVG) minification.")
  public Boolean isEnableMinification() {
    return enableMinification;
  }

  public void setEnableMinification(Boolean enableMinification) {
    this.enableMinification = enableMinification;
  }

  public HtmlOptions enableResponsiveRendering(Boolean enableResponsiveRendering) {
    this.enableResponsiveRendering = enableResponsiveRendering;
    return this;
  }

   /**
   * Indicates whether rendering will provide responsive web pages, that look well on different device types.
   * @return enableResponsiveRendering
  **/
  @ApiModelProperty(value = "Indicates whether rendering will provide responsive web pages, that look well on different device types.")
  public Boolean isEnableResponsiveRendering() {
    return enableResponsiveRendering;
  }

  public void setEnableResponsiveRendering(Boolean enableResponsiveRendering) {
    this.enableResponsiveRendering = enableResponsiveRendering;
  }

  public HtmlOptions excludeFonts(Boolean excludeFonts) {
    this.excludeFonts = excludeFonts;
    return this;
  }

   /**
   * Prevents adding fonts to the output HTML document.  
   * @return excludeFonts
  **/
  @ApiModelProperty(value = "Prevents adding fonts to the output HTML document.  ")
  public Boolean isExcludeFonts() {
    return excludeFonts;
  }

  public void setExcludeFonts(Boolean excludeFonts) {
    this.excludeFonts = excludeFonts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HtmlOptions htmlOptions = (HtmlOptions) o;
    return Objects.equals(this.resourcePath, htmlOptions.resourcePath) &&
        Objects.equals(this.ignoreResourcePathInResources, htmlOptions.ignoreResourcePathInResources) &&
        Objects.equals(this.embedResources, htmlOptions.embedResources) &&
        Objects.equals(this.enableMinification, htmlOptions.enableMinification) &&
        Objects.equals(this.enableResponsiveRendering, htmlOptions.enableResponsiveRendering) &&
        Objects.equals(this.excludeFonts, htmlOptions.excludeFonts) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcePath, ignoreResourcePathInResources, embedResources, enableMinification, enableResponsiveRendering, excludeFonts, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HtmlOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    resourcePath: ").append(toIndentedString(resourcePath)).append("\n");
    sb.append("    ignoreResourcePathInResources: ").append(toIndentedString(ignoreResourcePathInResources)).append("\n");
    sb.append("    embedResources: ").append(toIndentedString(embedResources)).append("\n");
    sb.append("    enableMinification: ").append(toIndentedString(enableMinification)).append("\n");
    sb.append("    enableResponsiveRendering: ").append(toIndentedString(enableResponsiveRendering)).append("\n");
    sb.append("    excludeFonts: ").append(toIndentedString(excludeFonts)).append("\n");
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

