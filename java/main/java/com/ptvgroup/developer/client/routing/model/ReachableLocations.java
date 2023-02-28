/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
import com.ptvgroup.developer.client.routing.model.ReachableLocation;
import com.ptvgroup.developer.client.routing.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The results of a reachable locations calculation.
 */
@ApiModel(description = "The results of a reachable locations calculation.")
@JsonPropertyOrder({
  ReachableLocations.JSON_PROPERTY_REACHABLE,
  ReachableLocations.JSON_PROPERTY_UNREACHABLE,
  ReachableLocations.JSON_PROPERTY_WARNINGS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-28T07:47:51.246976Z[Etc/UTC]")
public class ReachableLocations {
  public static final String JSON_PROPERTY_REACHABLE = "reachable";
  private List<ReachableLocation> reachable = null;

  public static final String JSON_PROPERTY_UNREACHABLE = "unreachable";
  private List<Integer> unreachable = null;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = null;

  public ReachableLocations() { 
  }

  public ReachableLocations reachable(List<ReachableLocation> reachable) {
    this.reachable = reachable;
    return this;
  }

  public ReachableLocations addReachableItem(ReachableLocation reachableItem) {
    if (this.reachable == null) {
      this.reachable = new ArrayList<>();
    }
    this.reachable.add(reachableItem);
    return this;
  }

   /**
   * Reachable locations ordered by distance or travel time (depending on the request &#x60;horizonType&#x60;).
   * @return reachable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reachable locations ordered by distance or travel time (depending on the request `horizonType`).")
  @JsonProperty(JSON_PROPERTY_REACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReachableLocation> getReachable() {
    return reachable;
  }


  @JsonProperty(JSON_PROPERTY_REACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachable(List<ReachableLocation> reachable) {
    this.reachable = reachable;
  }


  public ReachableLocations unreachable(List<Integer> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  public ReachableLocations addUnreachableItem(Integer unreachableItem) {
    if (this.unreachable == null) {
      this.unreachable = new ArrayList<>();
    }
    this.unreachable.add(unreachableItem);
    return this;
  }

   /**
   * Indexes of the unreachable locations as given in the request locations.
   * @return unreachable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indexes of the unreachable locations as given in the request locations.")
  @JsonProperty(JSON_PROPERTY_UNREACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getUnreachable() {
    return unreachable;
  }


  @JsonProperty(JSON_PROPERTY_UNREACHABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnreachable(List<Integer> unreachable) {
    this.unreachable = unreachable;
  }


  public ReachableLocations warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ReachableLocations addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of warnings concerning the validity of the result.")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Warning> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this ReachableLocations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableLocations reachableLocations = (ReachableLocations) o;
    return Objects.equals(this.reachable, reachableLocations.reachable) &&
        Objects.equals(this.unreachable, reachableLocations.unreachable) &&
        Objects.equals(this.warnings, reachableLocations.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reachable, unreachable, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableLocations {\n");
    sb.append("    reachable: ").append(toIndentedString(reachable)).append("\n");
    sb.append("    unreachable: ").append(toIndentedString(unreachable)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

