/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.22
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
import com.ptvgroup.developer.client.routing.model.DriverBody;
import com.ptvgroup.developer.client.routing.model.Waypoint;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RouteRequest
 */
@JsonPropertyOrder({
  RouteRequest.JSON_PROPERTY_WAYPOINTS,
  RouteRequest.JSON_PROPERTY_ROUTE_ID,
  RouteRequest.JSON_PROPERTY_DRIVER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-15T14:25:12.435885Z[Etc/UTC]")
public class RouteRequest {
  public static final String JSON_PROPERTY_WAYPOINTS = "waypoints";
  private List<Waypoint> waypoints = null;

  public static final String JSON_PROPERTY_ROUTE_ID = "routeId";
  private UUID routeId;

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private DriverBody driver;

  public RouteRequest() { 
  }

  public RouteRequest waypoints(List<Waypoint> waypoints) {
    this.waypoints = waypoints;
    return this;
  }

  public RouteRequest addWaypointsItem(Waypoint waypointsItem) {
    if (this.waypoints == null) {
      this.waypoints = new ArrayList<>();
    }
    this.waypoints.add(waypointsItem);
    return this;
  }

   /**
   * The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.  Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place.
   * @return waypoints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.  Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place.")
  @JsonProperty(JSON_PROPERTY_WAYPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Waypoint> getWaypoints() {
    return waypoints;
  }


  @JsonProperty(JSON_PROPERTY_WAYPOINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaypoints(List<Waypoint> waypoints) {
    this.waypoints = waypoints;
  }


  public RouteRequest routeId(UUID routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered. See [here](./concepts/waypoints) for more information.
   * @return routeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered. See [here](./concepts/waypoints) for more information.")
  @JsonProperty(JSON_PROPERTY_ROUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getRouteId() {
    return routeId;
  }


  @JsonProperty(JSON_PROPERTY_ROUTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRouteId(UUID routeId) {
    this.routeId = routeId;
  }


  public RouteRequest driver(DriverBody driver) {
    this.driver = driver;
    return this;
  }

   /**
   * Get driver
   * @return driver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DriverBody getDriver() {
    return driver;
  }


  @JsonProperty(JSON_PROPERTY_DRIVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDriver(DriverBody driver) {
    this.driver = driver;
  }


  /**
   * Return true if this RouteRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteRequest routeRequest = (RouteRequest) o;
    return Objects.equals(this.waypoints, routeRequest.waypoints) &&
        Objects.equals(this.routeId, routeRequest.routeId) &&
        Objects.equals(this.driver, routeRequest.driver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waypoints, routeId, driver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteRequest {\n");
    sb.append("    waypoints: ").append(toIndentedString(waypoints)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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

