/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="CadOptions.java">
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
import com.groupdocs.cloud.viewer.model.Tile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The CAD documents rendering options.
 */
@ApiModel(description = "The CAD documents rendering options.")
public class CadOptions {
  @SerializedName("scaleFactor")
  private Double scaleFactor = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("renderLayouts")
  private Boolean renderLayouts = null;

  @SerializedName("layoutName")
  private String layoutName = null;

  @SerializedName("layers")
  private List<String> layers = null;

  @SerializedName("tiles")
  private List<Tile> tiles = null;

  public CadOptions scaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
    return this;
  }

   /**
   * The scale factor affects the size of an output document.        
   * @return scaleFactor
  **/
  @ApiModelProperty(required = true, value = "The scale factor affects the size of an output document.        ")
  public Double getScaleFactor() {
    return scaleFactor;
  }

  public void setScaleFactor(Double scaleFactor) {
    this.scaleFactor = scaleFactor;
  }

  public CadOptions width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width of the render result in pixels.        
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width of the render result in pixels.        ")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public CadOptions height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height of the render result in pixels.        
   * @return height
  **/
  @ApiModelProperty(required = true, value = "The height of the render result in pixels.        ")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public CadOptions renderLayouts(Boolean renderLayouts) {
    this.renderLayouts = renderLayouts;
    return this;
  }

   /**
   * Indicates whether layouts from CAD document should be rendered.
   * @return renderLayouts
  **/
  @ApiModelProperty(required = true, value = "Indicates whether layouts from CAD document should be rendered.")
  public Boolean isRenderLayouts() {
    return renderLayouts;
  }

  public void setRenderLayouts(Boolean renderLayouts) {
    this.renderLayouts = renderLayouts;
  }

  public CadOptions layoutName(String layoutName) {
    this.layoutName = layoutName;
    return this;
  }

   /**
   * The name of the specific layout to render.
   * @return layoutName
  **/
  @ApiModelProperty(value = "The name of the specific layout to render.")
  public String getLayoutName() {
    return layoutName;
  }

  public void setLayoutName(String layoutName) {
    this.layoutName = layoutName;
  }

  public CadOptions layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public CadOptions addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<String>();
    }
    this.layers.add(layersItem);
    return this;
  }

   /**
   * The list of document layers to render. By default all layers will be rendered. Layer names are case sensitive.
   * @return layers
  **/
  @ApiModelProperty(value = "The list of document layers to render. By default all layers will be rendered. Layer names are case sensitive.")
  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }

  public CadOptions tiles(List<Tile> tiles) {
    this.tiles = tiles;
    return this;
  }

  public CadOptions addTilesItem(Tile tilesItem) {
    if (this.tiles == null) {
      this.tiles = new ArrayList<Tile>();
    }
    this.tiles.add(tilesItem);
    return this;
  }

   /**
   * The coordinates of the drawing regions, that should be rendered. Please note, that this option works only for DWG format. When the list is empty, then whole drawing is rendered. When the list contains at least one tile, then ScaleFactor, Width, Height, RenderLayouts and LayoutName properties are ignored. 
   * @return tiles
  **/
  @ApiModelProperty(value = "The coordinates of the drawing regions, that should be rendered. Please note, that this option works only for DWG format. When the list is empty, then whole drawing is rendered. When the list contains at least one tile, then ScaleFactor, Width, Height, RenderLayouts and LayoutName properties are ignored. ")
  public List<Tile> getTiles() {
    return tiles;
  }

  public void setTiles(List<Tile> tiles) {
    this.tiles = tiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadOptions cadOptions = (CadOptions) o;
    return Objects.equals(this.scaleFactor, cadOptions.scaleFactor) &&
        Objects.equals(this.width, cadOptions.width) &&
        Objects.equals(this.height, cadOptions.height) &&
        Objects.equals(this.renderLayouts, cadOptions.renderLayouts) &&
        Objects.equals(this.layoutName, cadOptions.layoutName) &&
        Objects.equals(this.layers, cadOptions.layers) &&
        Objects.equals(this.tiles, cadOptions.tiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaleFactor, width, height, renderLayouts, layoutName, layers, tiles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadOptions {\n");
    
    sb.append("    scaleFactor: ").append(toIndentedString(scaleFactor)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    renderLayouts: ").append(toIndentedString(renderLayouts)).append("\n");
    sb.append("    layoutName: ").append(toIndentedString(layoutName)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    tiles: ").append(toIndentedString(tiles)).append("\n");
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

