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
import com.ptvgroup.developer.client.routing.model.BorderEvent;
import com.ptvgroup.developer.client.routing.model.ChargeEvent;
import com.ptvgroup.developer.client.routing.model.CombinedTransportEvent;
import com.ptvgroup.developer.client.routing.model.DeliveryOnlyEvent;
import com.ptvgroup.developer.client.routing.model.EvStatusEvent;
import com.ptvgroup.developer.client.routing.model.LowEmissionZoneEvent;
import com.ptvgroup.developer.client.routing.model.ManeuverEvent;
import com.ptvgroup.developer.client.routing.model.ScheduleEvent;
import com.ptvgroup.developer.client.routing.model.TollEvent;
import com.ptvgroup.developer.client.routing.model.TrafficEvent;
import com.ptvgroup.developer.client.routing.model.UTCOffsetChangeEvent;
import com.ptvgroup.developer.client.routing.model.ViolationEvent;
import com.ptvgroup.developer.client.routing.model.WaypointEvent;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Event
 */
@JsonPropertyOrder({
  Event.JSON_PROPERTY_LATITUDE,
  Event.JSON_PROPERTY_LONGITUDE,
  Event.JSON_PROPERTY_STARTS_AT,
  Event.JSON_PROPERTY_DISTANCE_FROM_START,
  Event.JSON_PROPERTY_TRAVEL_TIME_FROM_START,
  Event.JSON_PROPERTY_COUNTRY_CODE,
  Event.JSON_PROPERTY_UTC_OFFSET,
  Event.JSON_PROPERTY_TOLL,
  Event.JSON_PROPERTY_MANEUVER,
  Event.JSON_PROPERTY_BORDER,
  Event.JSON_PROPERTY_VIOLATION,
  Event.JSON_PROPERTY_WAYPOINT,
  Event.JSON_PROPERTY_UTC_OFFSET_CHANGE,
  Event.JSON_PROPERTY_SCHEDULE,
  Event.JSON_PROPERTY_COMBINED_TRANSPORT,
  Event.JSON_PROPERTY_TRAFFIC,
  Event.JSON_PROPERTY_LOW_EMISSION_ZONE,
  Event.JSON_PROPERTY_DELIVERY_ONLY,
  Event.JSON_PROPERTY_EV_STATUS,
  Event.JSON_PROPERTY_CHARGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class Event {
  public static final String JSON_PROPERTY_LATITUDE = "latitude";
  private Double latitude;

  public static final String JSON_PROPERTY_LONGITUDE = "longitude";
  private Double longitude;

  public static final String JSON_PROPERTY_STARTS_AT = "startsAt";
  private OffsetDateTime startsAt;

  public static final String JSON_PROPERTY_DISTANCE_FROM_START = "distanceFromStart";
  private Integer distanceFromStart;

  public static final String JSON_PROPERTY_TRAVEL_TIME_FROM_START = "travelTimeFromStart";
  private Integer travelTimeFromStart;

  public static final String JSON_PROPERTY_COUNTRY_CODE = "countryCode";
  private String countryCode;

  public static final String JSON_PROPERTY_UTC_OFFSET = "utcOffset";
  private Integer utcOffset;

  public static final String JSON_PROPERTY_TOLL = "toll";
  private TollEvent toll;

  public static final String JSON_PROPERTY_MANEUVER = "maneuver";
  private ManeuverEvent maneuver;

  public static final String JSON_PROPERTY_BORDER = "border";
  private BorderEvent border;

  public static final String JSON_PROPERTY_VIOLATION = "violation";
  private ViolationEvent violation;

  public static final String JSON_PROPERTY_WAYPOINT = "waypoint";
  private WaypointEvent waypoint;

  public static final String JSON_PROPERTY_UTC_OFFSET_CHANGE = "utcOffsetChange";
  private UTCOffsetChangeEvent utcOffsetChange;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private ScheduleEvent schedule;

  public static final String JSON_PROPERTY_COMBINED_TRANSPORT = "combinedTransport";
  private CombinedTransportEvent combinedTransport;

  public static final String JSON_PROPERTY_TRAFFIC = "traffic";
  private TrafficEvent traffic;

  public static final String JSON_PROPERTY_LOW_EMISSION_ZONE = "lowEmissionZone";
  private LowEmissionZoneEvent lowEmissionZone;

  public static final String JSON_PROPERTY_DELIVERY_ONLY = "deliveryOnly";
  private DeliveryOnlyEvent deliveryOnly;

  public static final String JSON_PROPERTY_EV_STATUS = "evStatus";
  private EvStatusEvent evStatus;

  public static final String JSON_PROPERTY_CHARGE = "charge";
  private ChargeEvent charge;

  public Event() { 
  }

  public Event latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

  /**
   * The latitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from south to north.
   * minimum: -90
   * maximum: 90
   * @return latitude
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLatitude() {
    return latitude;
  }


  @JsonProperty(JSON_PROPERTY_LATITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }


  public Event longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * The longitude of the position where the event takes place in degrees (WGS84/EPSG:4326) from west to east.
   * minimum: -180
   * maximum: 180
   * @return longitude
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getLongitude() {
    return longitude;
  }


  @JsonProperty(JSON_PROPERTY_LONGITUDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }


  public Event startsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * The time at which the event starts formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Will not be present for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
   * @return startsAt
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartsAt() {
    return startsAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTS_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartsAt(OffsetDateTime startsAt) {
    this.startsAt = startsAt;
  }


  public Event distanceFromStart(Integer distanceFromStart) {
    this.distanceFromStart = distanceFromStart;
    return this;
  }

  /**
   * The distance from the start to this event [m].
   * minimum: 0
   * @return distanceFromStart
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getDistanceFromStart() {
    return distanceFromStart;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistanceFromStart(Integer distanceFromStart) {
    this.distanceFromStart = distanceFromStart;
  }


  public Event travelTimeFromStart(Integer travelTimeFromStart) {
    this.travelTimeFromStart = travelTimeFromStart;
    return this;
  }

  /**
   * The travel time from the start to this event [s].
   * minimum: 0
   * @return travelTimeFromStart
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getTravelTimeFromStart() {
    return travelTimeFromStart;
  }


  @JsonProperty(JSON_PROPERTY_TRAVEL_TIME_FROM_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTravelTimeFromStart(Integer travelTimeFromStart) {
    this.travelTimeFromStart = travelTimeFromStart;
  }


  public Event countryCode(String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
   * @return countryCode
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCountryCode() {
    return countryCode;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public Event utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * The offset to UTC [min]. Will not contain daylight-saving time for **trafficMode** _AVERAGE_ when neither **startTime** nor **arrivalTime** is specified.
   * minimum: -720
   * maximum: 840
   * @return utcOffset
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getUtcOffset() {
    return utcOffset;
  }


  @JsonProperty(JSON_PROPERTY_UTC_OFFSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUtcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
  }


  public Event toll(TollEvent toll) {
    this.toll = toll;
    return this;
  }

  /**
   * Get toll
   * @return toll
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOLL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TollEvent getToll() {
    return toll;
  }


  @JsonProperty(JSON_PROPERTY_TOLL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToll(TollEvent toll) {
    this.toll = toll;
  }


  public Event maneuver(ManeuverEvent maneuver) {
    this.maneuver = maneuver;
    return this;
  }

  /**
   * Get maneuver
   * @return maneuver
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MANEUVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ManeuverEvent getManeuver() {
    return maneuver;
  }


  @JsonProperty(JSON_PROPERTY_MANEUVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManeuver(ManeuverEvent maneuver) {
    this.maneuver = maneuver;
  }


  public Event border(BorderEvent border) {
    this.border = border;
    return this;
  }

  /**
   * Get border
   * @return border
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public BorderEvent getBorder() {
    return border;
  }


  @JsonProperty(JSON_PROPERTY_BORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBorder(BorderEvent border) {
    this.border = border;
  }


  public Event violation(ViolationEvent violation) {
    this.violation = violation;
    return this;
  }

  /**
   * Get violation
   * @return violation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIOLATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ViolationEvent getViolation() {
    return violation;
  }


  @JsonProperty(JSON_PROPERTY_VIOLATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setViolation(ViolationEvent violation) {
    this.violation = violation;
  }


  public Event waypoint(WaypointEvent waypoint) {
    this.waypoint = waypoint;
    return this;
  }

  /**
   * Get waypoint
   * @return waypoint
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WAYPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WaypointEvent getWaypoint() {
    return waypoint;
  }


  @JsonProperty(JSON_PROPERTY_WAYPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWaypoint(WaypointEvent waypoint) {
    this.waypoint = waypoint;
  }


  public Event utcOffsetChange(UTCOffsetChangeEvent utcOffsetChange) {
    this.utcOffsetChange = utcOffsetChange;
    return this;
  }

  /**
   * Get utcOffsetChange
   * @return utcOffsetChange
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UTC_OFFSET_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UTCOffsetChangeEvent getUtcOffsetChange() {
    return utcOffsetChange;
  }


  @JsonProperty(JSON_PROPERTY_UTC_OFFSET_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUtcOffsetChange(UTCOffsetChangeEvent utcOffsetChange) {
    this.utcOffsetChange = utcOffsetChange;
  }


  public Event schedule(ScheduleEvent schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScheduleEvent getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(ScheduleEvent schedule) {
    this.schedule = schedule;
  }


  public Event combinedTransport(CombinedTransportEvent combinedTransport) {
    this.combinedTransport = combinedTransport;
    return this;
  }

  /**
   * Get combinedTransport
   * @return combinedTransport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CombinedTransportEvent getCombinedTransport() {
    return combinedTransport;
  }


  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinedTransport(CombinedTransportEvent combinedTransport) {
    this.combinedTransport = combinedTransport;
  }


  public Event traffic(TrafficEvent traffic) {
    this.traffic = traffic;
    return this;
  }

  /**
   * Get traffic
   * @return traffic
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TrafficEvent getTraffic() {
    return traffic;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTraffic(TrafficEvent traffic) {
    this.traffic = traffic;
  }


  public Event lowEmissionZone(LowEmissionZoneEvent lowEmissionZone) {
    this.lowEmissionZone = lowEmissionZone;
    return this;
  }

  /**
   * Get lowEmissionZone
   * @return lowEmissionZone
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOW_EMISSION_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LowEmissionZoneEvent getLowEmissionZone() {
    return lowEmissionZone;
  }


  @JsonProperty(JSON_PROPERTY_LOW_EMISSION_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowEmissionZone(LowEmissionZoneEvent lowEmissionZone) {
    this.lowEmissionZone = lowEmissionZone;
  }


  public Event deliveryOnly(DeliveryOnlyEvent deliveryOnly) {
    this.deliveryOnly = deliveryOnly;
    return this;
  }

  /**
   * Get deliveryOnly
   * @return deliveryOnly
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELIVERY_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DeliveryOnlyEvent getDeliveryOnly() {
    return deliveryOnly;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryOnly(DeliveryOnlyEvent deliveryOnly) {
    this.deliveryOnly = deliveryOnly;
  }


  public Event evStatus(EvStatusEvent evStatus) {
    this.evStatus = evStatus;
    return this;
  }

  /**
   * Get evStatus
   * @return evStatus
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EV_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EvStatusEvent getEvStatus() {
    return evStatus;
  }


  @JsonProperty(JSON_PROPERTY_EV_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvStatus(EvStatusEvent evStatus) {
    this.evStatus = evStatus;
  }


  public Event charge(ChargeEvent charge) {
    this.charge = charge;
    return this;
  }

  /**
   * Get charge
   * @return charge
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ChargeEvent getCharge() {
    return charge;
  }


  @JsonProperty(JSON_PROPERTY_CHARGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCharge(ChargeEvent charge) {
    this.charge = charge;
  }


  /**
   * Return true if this Event object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Event event = (Event) o;
    return Objects.equals(this.latitude, event.latitude) &&
        Objects.equals(this.longitude, event.longitude) &&
        Objects.equals(this.startsAt, event.startsAt) &&
        Objects.equals(this.distanceFromStart, event.distanceFromStart) &&
        Objects.equals(this.travelTimeFromStart, event.travelTimeFromStart) &&
        Objects.equals(this.countryCode, event.countryCode) &&
        Objects.equals(this.utcOffset, event.utcOffset) &&
        Objects.equals(this.toll, event.toll) &&
        Objects.equals(this.maneuver, event.maneuver) &&
        Objects.equals(this.border, event.border) &&
        Objects.equals(this.violation, event.violation) &&
        Objects.equals(this.waypoint, event.waypoint) &&
        Objects.equals(this.utcOffsetChange, event.utcOffsetChange) &&
        Objects.equals(this.schedule, event.schedule) &&
        Objects.equals(this.combinedTransport, event.combinedTransport) &&
        Objects.equals(this.traffic, event.traffic) &&
        Objects.equals(this.lowEmissionZone, event.lowEmissionZone) &&
        Objects.equals(this.deliveryOnly, event.deliveryOnly) &&
        Objects.equals(this.evStatus, event.evStatus) &&
        Objects.equals(this.charge, event.charge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude, startsAt, distanceFromStart, travelTimeFromStart, countryCode, utcOffset, toll, maneuver, border, violation, waypoint, utcOffsetChange, schedule, combinedTransport, traffic, lowEmissionZone, deliveryOnly, evStatus, charge);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    distanceFromStart: ").append(toIndentedString(distanceFromStart)).append("\n");
    sb.append("    travelTimeFromStart: ").append(toIndentedString(travelTimeFromStart)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    toll: ").append(toIndentedString(toll)).append("\n");
    sb.append("    maneuver: ").append(toIndentedString(maneuver)).append("\n");
    sb.append("    border: ").append(toIndentedString(border)).append("\n");
    sb.append("    violation: ").append(toIndentedString(violation)).append("\n");
    sb.append("    waypoint: ").append(toIndentedString(waypoint)).append("\n");
    sb.append("    utcOffsetChange: ").append(toIndentedString(utcOffsetChange)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    combinedTransport: ").append(toIndentedString(combinedTransport)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
    sb.append("    lowEmissionZone: ").append(toIndentedString(lowEmissionZone)).append("\n");
    sb.append("    deliveryOnly: ").append(toIndentedString(deliveryOnly)).append("\n");
    sb.append("    evStatus: ").append(toIndentedString(evStatus)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
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

    // add `latitude` to the URL query string
    if (getLatitude() != null) {
      joiner.add(String.format("%slatitude%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLatitude()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `longitude` to the URL query string
    if (getLongitude() != null) {
      joiner.add(String.format("%slongitude%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLongitude()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `startsAt` to the URL query string
    if (getStartsAt() != null) {
      joiner.add(String.format("%sstartsAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStartsAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `distanceFromStart` to the URL query string
    if (getDistanceFromStart() != null) {
      joiner.add(String.format("%sdistanceFromStart%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDistanceFromStart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `travelTimeFromStart` to the URL query string
    if (getTravelTimeFromStart() != null) {
      joiner.add(String.format("%stravelTimeFromStart%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTravelTimeFromStart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `countryCode` to the URL query string
    if (getCountryCode() != null) {
      joiner.add(String.format("%scountryCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCountryCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `utcOffset` to the URL query string
    if (getUtcOffset() != null) {
      joiner.add(String.format("%sutcOffset%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUtcOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `toll` to the URL query string
    if (getToll() != null) {
      joiner.add(getToll().toUrlQueryString(prefix + "toll" + suffix));
    }

    // add `maneuver` to the URL query string
    if (getManeuver() != null) {
      joiner.add(getManeuver().toUrlQueryString(prefix + "maneuver" + suffix));
    }

    // add `border` to the URL query string
    if (getBorder() != null) {
      joiner.add(getBorder().toUrlQueryString(prefix + "border" + suffix));
    }

    // add `violation` to the URL query string
    if (getViolation() != null) {
      joiner.add(getViolation().toUrlQueryString(prefix + "violation" + suffix));
    }

    // add `waypoint` to the URL query string
    if (getWaypoint() != null) {
      joiner.add(getWaypoint().toUrlQueryString(prefix + "waypoint" + suffix));
    }

    // add `utcOffsetChange` to the URL query string
    if (getUtcOffsetChange() != null) {
      joiner.add(getUtcOffsetChange().toUrlQueryString(prefix + "utcOffsetChange" + suffix));
    }

    // add `schedule` to the URL query string
    if (getSchedule() != null) {
      joiner.add(getSchedule().toUrlQueryString(prefix + "schedule" + suffix));
    }

    // add `combinedTransport` to the URL query string
    if (getCombinedTransport() != null) {
      joiner.add(getCombinedTransport().toUrlQueryString(prefix + "combinedTransport" + suffix));
    }

    // add `traffic` to the URL query string
    if (getTraffic() != null) {
      joiner.add(getTraffic().toUrlQueryString(prefix + "traffic" + suffix));
    }

    // add `lowEmissionZone` to the URL query string
    if (getLowEmissionZone() != null) {
      joiner.add(getLowEmissionZone().toUrlQueryString(prefix + "lowEmissionZone" + suffix));
    }

    // add `deliveryOnly` to the URL query string
    if (getDeliveryOnly() != null) {
      joiner.add(getDeliveryOnly().toUrlQueryString(prefix + "deliveryOnly" + suffix));
    }

    // add `evStatus` to the URL query string
    if (getEvStatus() != null) {
      joiner.add(getEvStatus().toUrlQueryString(prefix + "evStatus" + suffix));
    }

    // add `charge` to the URL query string
    if (getCharge() != null) {
      joiner.add(getCharge().toUrlQueryString(prefix + "charge" + suffix));
    }

    return joiner.toString();
  }
}

