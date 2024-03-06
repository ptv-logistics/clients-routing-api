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
import com.ptvgroup.developer.client.routing.model.ScheduleViolationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RemainingWaypoint
 */
@JsonPropertyOrder({
  RemainingWaypoint.JSON_PROPERTY_NAME,
  RemainingWaypoint.JSON_PROPERTY_ESTIMATED_TIME_OF_ARRIVAL,
  RemainingWaypoint.JSON_PROPERTY_DISTANCE,
  RemainingWaypoint.JSON_PROPERTY_TRAVEL_TIME,
  RemainingWaypoint.JSON_PROPERTY_TRAFFIC_DELAY,
  RemainingWaypoint.JSON_PROPERTY_WAITING_TIME,
  RemainingWaypoint.JSON_PROPERTY_SCHEDULE_VIOLATIONS,
  RemainingWaypoint.JSON_PROPERTY_VIOLATED
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class RemainingWaypoint {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ESTIMATED_TIME_OF_ARRIVAL = "estimatedTimeOfArrival";
  private OffsetDateTime estimatedTimeOfArrival;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_TRAVEL_TIME = "travelTime";
  private Integer travelTime;

  public static final String JSON_PROPERTY_TRAFFIC_DELAY = "trafficDelay";
  private Integer trafficDelay;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Integer waitingTime;

  public static final String JSON_PROPERTY_SCHEDULE_VIOLATIONS = "scheduleViolations";
  private List<ScheduleViolationType> scheduleViolations = new ArrayList<>();

  public static final String JSON_PROPERTY_VIOLATED = "violated";
  private Boolean violated;

  public RemainingWaypoint() { 
  }

  public RemainingWaypoint name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this waypoint.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of this waypoint.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public RemainingWaypoint estimatedTimeOfArrival(OffsetDateTime estimatedTimeOfArrival) {
    this.estimatedTimeOfArrival = estimatedTimeOfArrival;
    return this;
  }

   /**
   * The estimated time of arrival at this waypoint formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Does not include service, break, rest and waiting at this waypoint.
   * @return estimatedTimeOfArrival
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The estimated time of arrival at this waypoint formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Does not include service, break, rest and waiting at this waypoint.")
  @JsonProperty(JSON_PROPERTY_ESTIMATED_TIME_OF_ARRIVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getEstimatedTimeOfArrival() {
    return estimatedTimeOfArrival;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATED_TIME_OF_ARRIVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEstimatedTimeOfArrival(OffsetDateTime estimatedTimeOfArrival) {
    this.estimatedTimeOfArrival = estimatedTimeOfArrival;
  }


  public RemainingWaypoint distance(Integer distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance from the current position to this waypoint [m].
   * minimum: 0
   * @return distance
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The distance from the current position to this waypoint [m].")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistance(Integer distance) {
    this.distance = distance;
  }


  public RemainingWaypoint travelTime(Integer travelTime) {
    this.travelTime = travelTime;
    return this;
  }

   /**
   * The travel time from the current position to this waypoint [s]. Does not include service, break, rest and waiting at this waypoint.
   * minimum: 0
   * @return travelTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The travel time from the current position to this waypoint [s]. Does not include service, break, rest and waiting at this waypoint.")
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTravelTime() {
    return travelTime;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }


  public RemainingWaypoint trafficDelay(Integer trafficDelay) {
    this.trafficDelay = trafficDelay;
    return this;
  }

   /**
   * The delay due to live traffic from the current position to this waypoint [s].
   * minimum: 0
   * @return trafficDelay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The delay due to live traffic from the current position to this waypoint [s].")
  @JsonProperty(JSON_PROPERTY_TRAFFIC_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getTrafficDelay() {
    return trafficDelay;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTrafficDelay(Integer trafficDelay) {
    this.trafficDelay = trafficDelay;
  }


  public RemainingWaypoint waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

   /**
   * The waiting time at this waypoint [s].
   * minimum: 0
   * @return waitingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The waiting time at this waypoint [s].")
  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getWaitingTime() {
    return waitingTime;
  }


  @JsonProperty(JSON_PROPERTY_WAITING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWaitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
  }


  public RemainingWaypoint scheduleViolations(List<ScheduleViolationType> scheduleViolations) {
    this.scheduleViolations = scheduleViolations;
    return this;
  }

  public RemainingWaypoint addScheduleViolationsItem(ScheduleViolationType scheduleViolationsItem) {
    this.scheduleViolations.add(scheduleViolationsItem);
    return this;
  }

   /**
   * Contains the list of violated schedule restrictions at this waypoint.
   * @return scheduleViolations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Contains the list of violated schedule restrictions at this waypoint.")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ScheduleViolationType> getScheduleViolations() {
    return scheduleViolations;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_VIOLATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduleViolations(List<ScheduleViolationType> scheduleViolations) {
    this.scheduleViolations = scheduleViolations;
  }


  public RemainingWaypoint violated(Boolean violated) {
    this.violated = violated;
    return this;
  }

   /**
   * If there is no valid route for the given vehicle between the vehicle position and this waypoint, but the resulting route can be calculated using roads actually prohibited, the route is marked as violated.
   * @return violated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "If there is no valid route for the given vehicle between the vehicle position and this waypoint, but the resulting route can be calculated using roads actually prohibited, the route is marked as violated.")
  @JsonProperty(JSON_PROPERTY_VIOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getViolated() {
    return violated;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setViolated(Boolean violated) {
    this.violated = violated;
  }


  /**
   * Return true if this RemainingWaypoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemainingWaypoint remainingWaypoint = (RemainingWaypoint) o;
    return Objects.equals(this.name, remainingWaypoint.name) &&
        Objects.equals(this.estimatedTimeOfArrival, remainingWaypoint.estimatedTimeOfArrival) &&
        Objects.equals(this.distance, remainingWaypoint.distance) &&
        Objects.equals(this.travelTime, remainingWaypoint.travelTime) &&
        Objects.equals(this.trafficDelay, remainingWaypoint.trafficDelay) &&
        Objects.equals(this.waitingTime, remainingWaypoint.waitingTime) &&
        Objects.equals(this.scheduleViolations, remainingWaypoint.scheduleViolations) &&
        Objects.equals(this.violated, remainingWaypoint.violated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, estimatedTimeOfArrival, distance, travelTime, trafficDelay, waitingTime, scheduleViolations, violated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemainingWaypoint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    estimatedTimeOfArrival: ").append(toIndentedString(estimatedTimeOfArrival)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    trafficDelay: ").append(toIndentedString(trafficDelay)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    scheduleViolations: ").append(toIndentedString(scheduleViolations)).append("\n");
    sb.append("    violated: ").append(toIndentedString(violated)).append("\n");
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

