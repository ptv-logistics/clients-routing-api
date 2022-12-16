/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Name and number of the road ahead.
 */
@ApiModel(description = "Name and number of the road ahead.")
@JsonPropertyOrder({
  RoadAhead.JSON_PROPERTY_NAME,
  RoadAhead.JSON_PROPERTY_NUMBER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T16:11:36.609539Z[Etc/UTC]")
public class RoadAhead {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private String number;

  public RoadAhead() { 
  }

  public RoadAhead name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the road. It does not depend on the selected language, instead it is presented as it can be found on local signs.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the road. It does not depend on the selected language, instead it is presented as it can be found on local signs.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public RoadAhead number(String number) {
    this.number = number;
    return this;
  }

   /**
   * The number of the road which may consist of several numbers separated by \&quot;/\&quot;.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of the road which may consist of several numbers separated by \"/\".")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(String number) {
    this.number = number;
  }


  /**
   * Return true if this RoadAhead object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoadAhead roadAhead = (RoadAhead) o;
    return Objects.equals(this.name, roadAhead.name) &&
        Objects.equals(this.number, roadAhead.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoadAhead {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

