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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Provides an overview of the times of the schedule of this route including break and rest times. Requires _SCHELDULE_REPORT_ to be requested.
 */
@ApiModel(description = "Provides an overview of the times of the schedule of this route including break and rest times. Requires _SCHELDULE_REPORT_ to be requested.")
@JsonPropertyOrder({
  ScheduleReport.JSON_PROPERTY_START_TIME,
  ScheduleReport.JSON_PROPERTY_END_TIME,
  ScheduleReport.JSON_PROPERTY_DRIVING_TIME,
  ScheduleReport.JSON_PROPERTY_SERVICE_TIME,
  ScheduleReport.JSON_PROPERTY_WAITING_TIME,
  ScheduleReport.JSON_PROPERTY_BREAK_TIME,
  ScheduleReport.JSON_PROPERTY_REST_TIME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-15T14:25:12.435885Z[Etc/UTC]")
public class ScheduleReport {
  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private OffsetDateTime endTime;

  public static final String JSON_PROPERTY_DRIVING_TIME = "drivingTime";
  private Integer drivingTime;

  public static final String JSON_PROPERTY_SERVICE_TIME = "serviceTime";
  private Integer serviceTime;

  public static final String JSON_PROPERTY_WAITING_TIME = "waitingTime";
  private Integer waitingTime;

  public static final String JSON_PROPERTY_BREAK_TIME = "breakTime";
  private Integer breakTime;

  public static final String JSON_PROPERTY_REST_TIME = "restTime";
  private Integer restTime;

  public ScheduleReport() { 
  }

  public ScheduleReport startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public ScheduleReport endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public ScheduleReport drivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
    return this;
  }

   /**
   * The total driving time of the route [s].
   * minimum: 0
   * @return drivingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total driving time of the route [s].")
  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDrivingTime() {
    return drivingTime;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDrivingTime(Integer drivingTime) {
    this.drivingTime = drivingTime;
  }


  public ScheduleReport serviceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

   /**
   * The total service time of the route [s].
   * minimum: 0
   * @return serviceTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total service time of the route [s].")
  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getServiceTime() {
    return serviceTime;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }


  public ScheduleReport waitingTime(Integer waitingTime) {
    this.waitingTime = waitingTime;
    return this;
  }

   /**
   * The total waiting time of the route [s].
   * minimum: 0
   * @return waitingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total waiting time of the route [s].")
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


  public ScheduleReport breakTime(Integer breakTime) {
    this.breakTime = breakTime;
    return this;
  }

   /**
   * The total break time of the route [s].
   * minimum: 0
   * @return breakTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total break time of the route [s].")
  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getBreakTime() {
    return breakTime;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBreakTime(Integer breakTime) {
    this.breakTime = breakTime;
  }


  public ScheduleReport restTime(Integer restTime) {
    this.restTime = restTime;
    return this;
  }

   /**
   * The total rest time of the route [s].
   * minimum: 0
   * @return restTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The total rest time of the route [s].")
  @JsonProperty(JSON_PROPERTY_REST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRestTime() {
    return restTime;
  }


  @JsonProperty(JSON_PROPERTY_REST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRestTime(Integer restTime) {
    this.restTime = restTime;
  }


  /**
   * Return true if this ScheduleReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleReport scheduleReport = (ScheduleReport) o;
    return Objects.equals(this.startTime, scheduleReport.startTime) &&
        Objects.equals(this.endTime, scheduleReport.endTime) &&
        Objects.equals(this.drivingTime, scheduleReport.drivingTime) &&
        Objects.equals(this.serviceTime, scheduleReport.serviceTime) &&
        Objects.equals(this.waitingTime, scheduleReport.waitingTime) &&
        Objects.equals(this.breakTime, scheduleReport.breakTime) &&
        Objects.equals(this.restTime, scheduleReport.restTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, drivingTime, serviceTime, waitingTime, breakTime, restTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleReport {\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    drivingTime: ").append(toIndentedString(drivingTime)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    waitingTime: ").append(toIndentedString(waitingTime)).append("\n");
    sb.append("    breakTime: ").append(toIndentedString(breakTime)).append("\n");
    sb.append("    restTime: ").append(toIndentedString(restTime)).append("\n");
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

