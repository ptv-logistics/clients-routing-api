/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
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
import com.ptvgroup.developer.client.routing.model.CombinedTransport;
import com.ptvgroup.developer.client.routing.model.ManipulateRouteWaypoint;
import com.ptvgroup.developer.client.routing.model.OffRoadWaypoint;
import com.ptvgroup.developer.client.routing.model.OnRoadWaypoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Waypoint
 */
@JsonPropertyOrder({
  Waypoint.JSON_PROPERTY_NAME,
  Waypoint.JSON_PROPERTY_ON_ROAD,
  Waypoint.JSON_PROPERTY_OFF_ROAD,
  Waypoint.JSON_PROPERTY_MANIPULATE,
  Waypoint.JSON_PROPERTY_COMBINED_TRANSPORT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class Waypoint {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ON_ROAD = "onRoad";
  private OnRoadWaypoint onRoad;

  public static final String JSON_PROPERTY_OFF_ROAD = "offRoad";
  private OffRoadWaypoint offRoad;

  public static final String JSON_PROPERTY_MANIPULATE = "manipulate";
  private ManipulateRouteWaypoint manipulate;

  public static final String JSON_PROPERTY_COMBINED_TRANSPORT = "combinedTransport";
  private CombinedTransport combinedTransport;

  public Waypoint() { 
  }

  public Waypoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * An identifier to reference this waypoint in the response.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier to reference this waypoint in the response.")
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


  public Waypoint onRoad(OnRoadWaypoint onRoad) {
    this.onRoad = onRoad;
    return this;
  }

   /**
   * Get onRoad
   * @return onRoad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_ROAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OnRoadWaypoint getOnRoad() {
    return onRoad;
  }


  @JsonProperty(JSON_PROPERTY_ON_ROAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnRoad(OnRoadWaypoint onRoad) {
    this.onRoad = onRoad;
  }


  public Waypoint offRoad(OffRoadWaypoint offRoad) {
    this.offRoad = offRoad;
    return this;
  }

   /**
   * Get offRoad
   * @return offRoad
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFF_ROAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffRoadWaypoint getOffRoad() {
    return offRoad;
  }


  @JsonProperty(JSON_PROPERTY_OFF_ROAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffRoad(OffRoadWaypoint offRoad) {
    this.offRoad = offRoad;
  }


  public Waypoint manipulate(ManipulateRouteWaypoint manipulate) {
    this.manipulate = manipulate;
    return this;
  }

   /**
   * Get manipulate
   * @return manipulate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANIPULATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ManipulateRouteWaypoint getManipulate() {
    return manipulate;
  }


  @JsonProperty(JSON_PROPERTY_MANIPULATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManipulate(ManipulateRouteWaypoint manipulate) {
    this.manipulate = manipulate;
  }


  public Waypoint combinedTransport(CombinedTransport combinedTransport) {
    this.combinedTransport = combinedTransport;
    return this;
  }

   /**
   * Get combinedTransport
   * @return combinedTransport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CombinedTransport getCombinedTransport() {
    return combinedTransport;
  }


  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinedTransport(CombinedTransport combinedTransport) {
    this.combinedTransport = combinedTransport;
  }


  /**
   * Return true if this Waypoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Waypoint waypoint = (Waypoint) o;
    return Objects.equals(this.name, waypoint.name) &&
        Objects.equals(this.onRoad, waypoint.onRoad) &&
        Objects.equals(this.offRoad, waypoint.offRoad) &&
        Objects.equals(this.manipulate, waypoint.manipulate) &&
        Objects.equals(this.combinedTransport, waypoint.combinedTransport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, onRoad, offRoad, manipulate, combinedTransport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Waypoint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onRoad: ").append(toIndentedString(onRoad)).append("\n");
    sb.append("    offRoad: ").append(toIndentedString(offRoad)).append("\n");
    sb.append("    manipulate: ").append(toIndentedString(manipulate)).append("\n");
    sb.append("    combinedTransport: ").append(toIndentedString(combinedTransport)).append("\n");
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

