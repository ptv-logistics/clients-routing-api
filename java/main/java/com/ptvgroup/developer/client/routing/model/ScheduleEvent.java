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
import com.ptvgroup.developer.client.routing.model.ScheduleType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. Requires _SCHEDULE_EVENTS_ to be requested.
 */
@ApiModel(description = "Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. Requires _SCHEDULE_EVENTS_ to be requested.")
@JsonPropertyOrder({
  ScheduleEvent.JSON_PROPERTY_DURATION,
  ScheduleEvent.JSON_PROPERTY_SCHEDULE_TYPES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T16:11:36.609539Z[Etc/UTC]")
public class ScheduleEvent {
  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_SCHEDULE_TYPES = "scheduleTypes";
  private List<ScheduleType> scheduleTypes = new ArrayList<>();

  public ScheduleEvent() { 
  }

  public ScheduleEvent duration(Integer duration) {
    this.duration = duration;
    return this;
  }

   /**
   * The duration [s].
   * minimum: 0
   * @return duration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The duration [s].")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public ScheduleEvent scheduleTypes(List<ScheduleType> scheduleTypes) {
    this.scheduleTypes = scheduleTypes;
    return this;
  }

  public ScheduleEvent addScheduleTypesItem(ScheduleType scheduleTypesItem) {
    this.scheduleTypes.add(scheduleTypesItem);
    return this;
  }

   /**
   * Tells what happens at this position of the route. 
   * @return scheduleTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tells what happens at this position of the route. ")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ScheduleType> getScheduleTypes() {
    return scheduleTypes;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setScheduleTypes(List<ScheduleType> scheduleTypes) {
    this.scheduleTypes = scheduleTypes;
  }


  /**
   * Return true if this ScheduleEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleEvent scheduleEvent = (ScheduleEvent) o;
    return Objects.equals(this.duration, scheduleEvent.duration) &&
        Objects.equals(this.scheduleTypes, scheduleEvent.scheduleTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, scheduleTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleEvent {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    scheduleTypes: ").append(toIndentedString(scheduleTypes)).append("\n");
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

