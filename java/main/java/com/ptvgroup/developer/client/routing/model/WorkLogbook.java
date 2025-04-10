/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Defines the accumulated driving, working and travel times since the last break or daily rest. For details see this [concept](./concepts/drivers-working-hours).
 */
@JsonPropertyOrder({
  WorkLogbook.JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST,
  WorkLogbook.JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WorkLogbook {
  public static final String JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED = "lastTimeTheDriverWorked";
  private OffsetDateTime lastTimeTheDriverWorked;

  public static final String JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK = "accumulatedDrivingTimeSinceLastBreak";
  private Integer accumulatedDrivingTimeSinceLastBreak = 0;

  public static final String JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK = "accumulatedWorkingTimeSinceLastBreak";
  private Integer accumulatedWorkingTimeSinceLastBreak;

  public static final String JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST = "accumulatedDrivingTimeSinceLastDailyRest";
  private Integer accumulatedDrivingTimeSinceLastDailyRest;

  public static final String JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST = "accumulatedTravelTimeSinceLastDailyRest";
  private Integer accumulatedTravelTimeSinceLastDailyRest;

  public WorkLogbook() { 
  }

  public WorkLogbook lastTimeTheDriverWorked(OffsetDateTime lastTimeTheDriverWorked) {
    this.lastTimeTheDriverWorked = lastTimeTheDriverWorked;
    return this;
  }

  /**
   * The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).    The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00.  The date must provide an offset to UTC.   See [here](./concepts/date-and-time) for more information on the relevance of date and time.
   * @return lastTimeTheDriverWorked
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastTimeTheDriverWorked() {
    return lastTimeTheDriverWorked;
  }


  @JsonProperty(JSON_PROPERTY_LAST_TIME_THE_DRIVER_WORKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastTimeTheDriverWorked(OffsetDateTime lastTimeTheDriverWorked) {
    this.lastTimeTheDriverWorked = lastTimeTheDriverWorked;
  }


  public WorkLogbook accumulatedDrivingTimeSinceLastBreak(Integer accumulatedDrivingTimeSinceLastBreak) {
    this.accumulatedDrivingTimeSinceLastBreak = accumulatedDrivingTimeSinceLastBreak;
    return this;
  }

  /**
   * Accumulated driving time since end of last break [s], this includes all time behind the wheel.   Values higher than the maximum driving time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. 
   * minimum: 0
   * @return accumulatedDrivingTimeSinceLastBreak
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAccumulatedDrivingTimeSinceLastBreak() {
    return accumulatedDrivingTimeSinceLastBreak;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedDrivingTimeSinceLastBreak(Integer accumulatedDrivingTimeSinceLastBreak) {
    this.accumulatedDrivingTimeSinceLastBreak = accumulatedDrivingTimeSinceLastBreak;
  }


  public WorkLogbook accumulatedWorkingTimeSinceLastBreak(Integer accumulatedWorkingTimeSinceLastBreak) {
    this.accumulatedWorkingTimeSinceLastBreak = accumulatedWorkingTimeSinceLastBreak;
    return this;
  }

  /**
   * Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold.     Values higher than the maximum working time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. 
   * minimum: 0
   * @return accumulatedWorkingTimeSinceLastBreak
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAccumulatedWorkingTimeSinceLastBreak() {
    return accumulatedWorkingTimeSinceLastBreak;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED_WORKING_TIME_SINCE_LAST_BREAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedWorkingTimeSinceLastBreak(Integer accumulatedWorkingTimeSinceLastBreak) {
    this.accumulatedWorkingTimeSinceLastBreak = accumulatedWorkingTimeSinceLastBreak;
  }


  public WorkLogbook accumulatedDrivingTimeSinceLastDailyRest(Integer accumulatedDrivingTimeSinceLastDailyRest) {
    this.accumulatedDrivingTimeSinceLastDailyRest = accumulatedDrivingTimeSinceLastDailyRest;
    return this;
  }

  /**
   * Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel.   Values higher than the maximum driving time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0. 
   * minimum: 0
   * @return accumulatedDrivingTimeSinceLastDailyRest
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAccumulatedDrivingTimeSinceLastDailyRest() {
    return accumulatedDrivingTimeSinceLastDailyRest;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED_DRIVING_TIME_SINCE_LAST_DAILY_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedDrivingTimeSinceLastDailyRest(Integer accumulatedDrivingTimeSinceLastDailyRest) {
    this.accumulatedDrivingTimeSinceLastDailyRest = accumulatedDrivingTimeSinceLastDailyRest;
  }


  public WorkLogbook accumulatedTravelTimeSinceLastDailyRest(Integer accumulatedTravelTimeSinceLastDailyRest) {
    this.accumulatedTravelTimeSinceLastDailyRest = accumulatedTravelTimeSinceLastDailyRest;
    return this;
  }

  /**
   * Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest.   Values higher than maximum travel time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0. 
   * minimum: 0
   * @return accumulatedTravelTimeSinceLastDailyRest
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAccumulatedTravelTimeSinceLastDailyRest() {
    return accumulatedTravelTimeSinceLastDailyRest;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED_TRAVEL_TIME_SINCE_LAST_DAILY_REST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulatedTravelTimeSinceLastDailyRest(Integer accumulatedTravelTimeSinceLastDailyRest) {
    this.accumulatedTravelTimeSinceLastDailyRest = accumulatedTravelTimeSinceLastDailyRest;
  }


  /**
   * Return true if this WorkLogbook object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkLogbook workLogbook = (WorkLogbook) o;
    return Objects.equals(this.lastTimeTheDriverWorked, workLogbook.lastTimeTheDriverWorked) &&
        Objects.equals(this.accumulatedDrivingTimeSinceLastBreak, workLogbook.accumulatedDrivingTimeSinceLastBreak) &&
        Objects.equals(this.accumulatedWorkingTimeSinceLastBreak, workLogbook.accumulatedWorkingTimeSinceLastBreak) &&
        Objects.equals(this.accumulatedDrivingTimeSinceLastDailyRest, workLogbook.accumulatedDrivingTimeSinceLastDailyRest) &&
        Objects.equals(this.accumulatedTravelTimeSinceLastDailyRest, workLogbook.accumulatedTravelTimeSinceLastDailyRest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTimeTheDriverWorked, accumulatedDrivingTimeSinceLastBreak, accumulatedWorkingTimeSinceLastBreak, accumulatedDrivingTimeSinceLastDailyRest, accumulatedTravelTimeSinceLastDailyRest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkLogbook {\n");
    sb.append("    lastTimeTheDriverWorked: ").append(toIndentedString(lastTimeTheDriverWorked)).append("\n");
    sb.append("    accumulatedDrivingTimeSinceLastBreak: ").append(toIndentedString(accumulatedDrivingTimeSinceLastBreak)).append("\n");
    sb.append("    accumulatedWorkingTimeSinceLastBreak: ").append(toIndentedString(accumulatedWorkingTimeSinceLastBreak)).append("\n");
    sb.append("    accumulatedDrivingTimeSinceLastDailyRest: ").append(toIndentedString(accumulatedDrivingTimeSinceLastDailyRest)).append("\n");
    sb.append("    accumulatedTravelTimeSinceLastDailyRest: ").append(toIndentedString(accumulatedTravelTimeSinceLastDailyRest)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `lastTimeTheDriverWorked` to the URL query string
    if (getLastTimeTheDriverWorked() != null) {
      joiner.add(String.format("%slastTimeTheDriverWorked%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLastTimeTheDriverWorked()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accumulatedDrivingTimeSinceLastBreak` to the URL query string
    if (getAccumulatedDrivingTimeSinceLastBreak() != null) {
      joiner.add(String.format("%saccumulatedDrivingTimeSinceLastBreak%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccumulatedDrivingTimeSinceLastBreak()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accumulatedWorkingTimeSinceLastBreak` to the URL query string
    if (getAccumulatedWorkingTimeSinceLastBreak() != null) {
      joiner.add(String.format("%saccumulatedWorkingTimeSinceLastBreak%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccumulatedWorkingTimeSinceLastBreak()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accumulatedDrivingTimeSinceLastDailyRest` to the URL query string
    if (getAccumulatedDrivingTimeSinceLastDailyRest() != null) {
      joiner.add(String.format("%saccumulatedDrivingTimeSinceLastDailyRest%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccumulatedDrivingTimeSinceLastDailyRest()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accumulatedTravelTimeSinceLastDailyRest` to the URL query string
    if (getAccumulatedTravelTimeSinceLastDailyRest() != null) {
      joiner.add(String.format("%saccumulatedTravelTimeSinceLastDailyRest%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccumulatedTravelTimeSinceLastDailyRest()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

