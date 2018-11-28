/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="PdfOptions.java">
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
 * The PDF documents rendering options.
 */
@ApiModel(description = "The PDF documents rendering options.")
public class PdfOptions {
  @SerializedName("enablePreciseRendering")
  private Boolean enablePreciseRendering = null;

  @SerializedName("enableInitialContentOrdering")
  private Boolean enableInitialContentOrdering = null;

  @SerializedName("renderLayersSeparately")
  private Boolean renderLayersSeparately = null;

  @SerializedName("imageQuality")
  private String imageQuality = null;

  public PdfOptions enablePreciseRendering(Boolean enablePreciseRendering) {
    this.enablePreciseRendering = enablePreciseRendering;
    return this;
  }

   /**
   * Indicates whether the PDF document is rendered in a precise mode or not. It is recommended to enable this option when rendering documents with complex content e.g. documents which contains hieroglyphs or any kind o glyphs which should be rendered separately from each other.
   * @return enablePreciseRendering
  **/
  @ApiModelProperty(value = "Indicates whether the PDF document is rendered in a precise mode or not. It is recommended to enable this option when rendering documents with complex content e.g. documents which contains hieroglyphs or any kind o glyphs which should be rendered separately from each other.")
  public Boolean isisEnablePreciseRendering() {
    return enablePreciseRendering;
  }

  public void setEnablePreciseRendering(Boolean enablePreciseRendering) {
    this.enablePreciseRendering = enablePreciseRendering;
  }

  public PdfOptions enableInitialContentOrdering(Boolean enableInitialContentOrdering) {
    this.enableInitialContentOrdering = enableInitialContentOrdering;
    return this;
  }

   /**
   * When this option is enabled content (graphics and text) will be added to HTML document accordingly Z-order in original PDF document. When this option is disabled content (graphics and text) will be added to a single layer.
   * @return enableInitialContentOrdering
  **/
  @ApiModelProperty(value = "When this option is enabled content (graphics and text) will be added to HTML document accordingly Z-order in original PDF document. When this option is disabled content (graphics and text) will be added to a single layer.")
  public Boolean isisEnableInitialContentOrdering() {
    return enableInitialContentOrdering;
  }

  public void setEnableInitialContentOrdering(Boolean enableInitialContentOrdering) {
    this.enableInitialContentOrdering = enableInitialContentOrdering;
  }

  public PdfOptions renderLayersSeparately(Boolean renderLayersSeparately) {
    this.renderLayersSeparately = renderLayersSeparately;
    return this;
  }

   /**
   * When this option is enabled layers will be separated from each other in the HTML document.
   * @return renderLayersSeparately
  **/
  @ApiModelProperty(value = "When this option is enabled layers will be separated from each other in the HTML document.")
  public Boolean isisRenderLayersSeparately() {
    return renderLayersSeparately;
  }

  public void setRenderLayersSeparately(Boolean renderLayersSeparately) {
    this.renderLayersSeparately = renderLayersSeparately;
  }

  public PdfOptions imageQuality(String imageQuality) {
    this.imageQuality = imageQuality;
    return this;
  }

   /**
   * Specifies output image quality for image resources when rendering as HTML. The default value is Low. Supported values {Low|Medium|High}: 1. Low - satisfying image quality and smallest image size. 2. Medium - better image quality and larger image size. 3. High - best image quality with largest image size.
   * @return imageQuality
  **/
  @ApiModelProperty(value = "Specifies output image quality for image resources when rendering as HTML. The default value is Low. Supported values {Low|Medium|High}: 1. Low - satisfying image quality and smallest image size. 2. Medium - better image quality and larger image size. 3. High - best image quality with largest image size.")
  public String getImageQuality() {
    return imageQuality;
  }

  public void setImageQuality(String imageQuality) {
    this.imageQuality = imageQuality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfOptions pdfOptions = (PdfOptions) o;
    return Objects.equals(this.enablePreciseRendering, pdfOptions.enablePreciseRendering) &&
        Objects.equals(this.enableInitialContentOrdering, pdfOptions.enableInitialContentOrdering) &&
        Objects.equals(this.renderLayersSeparately, pdfOptions.renderLayersSeparately) &&
        Objects.equals(this.imageQuality, pdfOptions.imageQuality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enablePreciseRendering, enableInitialContentOrdering, renderLayersSeparately, imageQuality);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfOptions {\n");
    
    sb.append("    enablePreciseRendering: ").append(toIndentedString(enablePreciseRendering)).append("\n");
    sb.append("    enableInitialContentOrdering: ").append(toIndentedString(enableInitialContentOrdering)).append("\n");
    sb.append("    renderLayersSeparately: ").append(toIndentedString(renderLayersSeparately)).append("\n");
    sb.append("    imageQuality: ").append(toIndentedString(imageQuality)).append("\n");
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

