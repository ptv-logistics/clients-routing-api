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
import com.ptvgroup.developer.client.routing.model.DrivingDirection;
import com.ptvgroup.developer.client.routing.model.ReachableTrafficMode;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * ReachableOptions
 */
@JsonPropertyOrder({
  ReachableOptions.JSON_PROPERTY_DRIVING_DIRECTION,
  ReachableOptions.JSON_PROPERTY_REFERENCE_TIME,
  ReachableOptions.JSON_PROPERTY_TRAFFIC_MODE,
  ReachableOptions.JSON_PROPERTY_ALLOWED_COUNTRIES,
  ReachableOptions.JSON_PROPERTY_PROHIBITED_COUNTRIES,
  ReachableOptions.JSON_PROPERTY_BLOCK_INTERSECTING_ROADS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReachableOptions {
  public static final String JSON_PROPERTY_DRIVING_DIRECTION = "drivingDirection";
  private DrivingDirection drivingDirection = DrivingDirection.OUTBOUND;

  public static final String JSON_PROPERTY_REFERENCE_TIME = "referenceTime";
  private OffsetDateTime referenceTime;

  public static final String JSON_PROPERTY_TRAFFIC_MODE = "trafficMode";
  private ReachableTrafficMode trafficMode = ReachableTrafficMode.AVERAGE;

  public static final String JSON_PROPERTY_ALLOWED_COUNTRIES = "allowedCountries";
  private String allowedCountries;

  public static final String JSON_PROPERTY_PROHIBITED_COUNTRIES = "prohibitedCountries";
  private String prohibitedCountries;

  public static final String JSON_PROPERTY_BLOCK_INTERSECTING_ROADS = "blockIntersectingRoads";
  private String blockIntersectingRoads;

  public ReachableOptions() { 
  }

  public ReachableOptions drivingDirection(DrivingDirection drivingDirection) {
    this.drivingDirection = drivingDirection;
    return this;
  }

  /**
   * Get drivingDirection
   * @return drivingDirection
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DRIVING_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DrivingDirection getDrivingDirection() {
    return drivingDirection;
  }


  @JsonProperty(JSON_PROPERTY_DRIVING_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDrivingDirection(DrivingDirection drivingDirection) {
    this.drivingDirection = drivingDirection;
  }


  public ReachableOptions referenceTime(OffsetDateTime referenceTime) {
    this.referenceTime = referenceTime;
    return this;
  }

  /**
   * Defines the start time for **drivingDirection** _OUTBOUND_ or the arrival time for **drivingDirection** _INBOUND_ formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). If none of them is specified the current time will be used.  If the date-time string does not include an explicit offset to UTC, the time will be interpreted as the local time of the waypoint. The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. The response will contain the offset to UTC specified in the request or that of the waypoint. For best results it should not be more than one month in the past nor more than six months in the future. See [here](./concepts/date-and-time) for more information on the relevance of date and time.
   * @return referenceTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getReferenceTime() {
    return referenceTime;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceTime(OffsetDateTime referenceTime) {
    this.referenceTime = referenceTime;
  }


  public ReachableOptions trafficMode(ReachableTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
    return this;
  }

  /**
   * Get trafficMode
   * @return trafficMode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ReachableTrafficMode getTrafficMode() {
    return trafficMode;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficMode(ReachableTrafficMode trafficMode) {
    this.trafficMode = trafficMode;
  }


  public ReachableOptions allowedCountries(String allowedCountries) {
    this.allowedCountries = allowedCountries;
    return this;
  }

  /**
   * Comma-separated list of countries the route is allowed to pass. By default, all countries are allowed. If this parameter is present, only these countries are allowed to be passed, i.e. drive only in these countries. This parameter is mutually exclusive with **prohibitedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return allowedCountries
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAllowedCountries() {
    return allowedCountries;
  }


  @JsonProperty(JSON_PROPERTY_ALLOWED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowedCountries(String allowedCountries) {
    this.allowedCountries = allowedCountries;
  }


  public ReachableOptions prohibitedCountries(String prohibitedCountries) {
    this.prohibitedCountries = prohibitedCountries;
    return this;
  }

  /**
   * Comma-separated list of countries the route must not pass. By default, all countries are allowed. If this parameter is present, all but the given countries are allowed to be passed, i.e. do not drive in these countries. This parameter is mutually exclusive with **allowedCountries**. Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return prohibitedCountries
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProhibitedCountries() {
    return prohibitedCountries;
  }


  @JsonProperty(JSON_PROPERTY_PROHIBITED_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProhibitedCountries(String prohibitedCountries) {
    this.prohibitedCountries = prohibitedCountries;
  }


  public ReachableOptions blockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = blockIntersectingRoads;
    return this;
  }

  /**
   * Pipe-separated list of polylines.   Roads and combined transports that intersect the given polylines will be considered as blocked. Each list element is a polyline. Each point is a coordinate of latitude and longitude. Coordinates and points are separated by a comma. Format: &#x60;&lt;poly1_lat1&gt;,&lt;poly1_lon1&gt;,...,&lt;poly1_latN&gt;,&lt;poly1_lonN&gt;|&lt;poly2_lat1&gt;,&lt;poly2_lon1&gt;,...,&lt;poly2_latN&gt;,&lt;poly2_lonN&gt;|...&#x60;   Notes: * Be aware of the URL length restrictions. * If there is no other route connecting two waypoints the will be reported as violated and correspondingly violation events with type **BLOCKED_ROAD_BY_INTERSECTION** will be reported if violation events are requested. * Requests will be rejected if at least one provided polyline   * does not consist of an even number of coordinates,   * consists of less than two points,   * contains invalid coordinates or   * intersects more than 5000 road segments. 
   * @return blockIntersectingRoads
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBlockIntersectingRoads() {
    return blockIntersectingRoads;
  }


  @JsonProperty(JSON_PROPERTY_BLOCK_INTERSECTING_ROADS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBlockIntersectingRoads(String blockIntersectingRoads) {
    this.blockIntersectingRoads = blockIntersectingRoads;
  }


  /**
   * Return true if this ReachableOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableOptions reachableOptions = (ReachableOptions) o;
    return Objects.equals(this.drivingDirection, reachableOptions.drivingDirection) &&
        Objects.equals(this.referenceTime, reachableOptions.referenceTime) &&
        Objects.equals(this.trafficMode, reachableOptions.trafficMode) &&
        Objects.equals(this.allowedCountries, reachableOptions.allowedCountries) &&
        Objects.equals(this.prohibitedCountries, reachableOptions.prohibitedCountries) &&
        Objects.equals(this.blockIntersectingRoads, reachableOptions.blockIntersectingRoads);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivingDirection, referenceTime, trafficMode, allowedCountries, prohibitedCountries, blockIntersectingRoads);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableOptions {\n");
    sb.append("    drivingDirection: ").append(toIndentedString(drivingDirection)).append("\n");
    sb.append("    referenceTime: ").append(toIndentedString(referenceTime)).append("\n");
    sb.append("    trafficMode: ").append(toIndentedString(trafficMode)).append("\n");
    sb.append("    allowedCountries: ").append(toIndentedString(allowedCountries)).append("\n");
    sb.append("    prohibitedCountries: ").append(toIndentedString(prohibitedCountries)).append("\n");
    sb.append("    blockIntersectingRoads: ").append(toIndentedString(blockIntersectingRoads)).append("\n");
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

    // add `drivingDirection` to the URL query string
    if (getDrivingDirection() != null) {
      joiner.add(String.format("%sdrivingDirection%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDrivingDirection()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `referenceTime` to the URL query string
    if (getReferenceTime() != null) {
      joiner.add(String.format("%sreferenceTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReferenceTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trafficMode` to the URL query string
    if (getTrafficMode() != null) {
      joiner.add(String.format("%strafficMode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTrafficMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `allowedCountries` to the URL query string
    if (getAllowedCountries() != null) {
      joiner.add(String.format("%sallowedCountries%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAllowedCountries()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `prohibitedCountries` to the URL query string
    if (getProhibitedCountries() != null) {
      joiner.add(String.format("%sprohibitedCountries%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getProhibitedCountries()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `blockIntersectingRoads` to the URL query string
    if (getBlockIntersectingRoads() != null) {
      joiner.add(String.format("%sblockIntersectingRoads%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getBlockIntersectingRoads()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

