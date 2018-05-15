/*
 * LH Public API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Coordinate;
import java.io.IOException;

/**
 * Physical location of an airport. This data section is optional and therefore not always present.
 */
@ApiModel(description = "Physical location of an airport. This data section is optional and therefore not always present.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-15T18:51:54.877+02:00")
public class AirportPosition {
  @SerializedName("Coordinate")
  private Coordinate coordinate = null;

  public AirportPosition coordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
    return this;
  }

   /**
   * Get coordinate
   * @return coordinate
  **/
  @ApiModelProperty(value = "")
  public Coordinate getCoordinate() {
    return coordinate;
  }

  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirportPosition airportPosition = (AirportPosition) o;
    return Objects.equals(this.coordinate, airportPosition.coordinate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coordinate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportPosition {\n");
    
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
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

