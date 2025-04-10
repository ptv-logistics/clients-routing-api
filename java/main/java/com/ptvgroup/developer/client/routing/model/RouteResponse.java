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
import com.ptvgroup.developer.client.routing.model.AlternativeRoute;
import com.ptvgroup.developer.client.routing.model.Emissions;
import com.ptvgroup.developer.client.routing.model.EvReport;
import com.ptvgroup.developer.client.routing.model.Event;
import com.ptvgroup.developer.client.routing.model.Leg;
import com.ptvgroup.developer.client.routing.model.MonetaryCosts;
import com.ptvgroup.developer.client.routing.model.ScheduleReport;
import com.ptvgroup.developer.client.routing.model.Toll;
import com.ptvgroup.developer.client.routing.model.Warning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * RouteResponse
 */
@JsonPropertyOrder({
  RouteResponse.JSON_PROPERTY_DISTANCE,
  RouteResponse.JSON_PROPERTY_TRAVEL_TIME,
  RouteResponse.JSON_PROPERTY_TRAFFIC_DELAY,
  RouteResponse.JSON_PROPERTY_VIOLATED,
  RouteResponse.JSON_PROPERTY_ROUTE_ID,
  RouteResponse.JSON_PROPERTY_LEGS,
  RouteResponse.JSON_PROPERTY_TOLL,
  RouteResponse.JSON_PROPERTY_POLYLINE,
  RouteResponse.JSON_PROPERTY_EVENTS,
  RouteResponse.JSON_PROPERTY_EMISSIONS,
  RouteResponse.JSON_PROPERTY_ALTERNATIVE_ROUTES,
  RouteResponse.JSON_PROPERTY_SCHEDULE_REPORT,
  RouteResponse.JSON_PROPERTY_EV_REPORT,
  RouteResponse.JSON_PROPERTY_GUIDED_NAVIGATION,
  RouteResponse.JSON_PROPERTY_MONETARY_COSTS,
  RouteResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class RouteResponse {
  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Integer distance;

  public static final String JSON_PROPERTY_TRAVEL_TIME = "travelTime";
  private Integer travelTime;

  public static final String JSON_PROPERTY_TRAFFIC_DELAY = "trafficDelay";
  private Integer trafficDelay;

  public static final String JSON_PROPERTY_VIOLATED = "violated";
  private Boolean violated;

  public static final String JSON_PROPERTY_ROUTE_ID = "routeId";
  private UUID routeId;

  public static final String JSON_PROPERTY_LEGS = "legs";
  private List<Leg> legs = new ArrayList<>();

  public static final String JSON_PROPERTY_TOLL = "toll";
  private Toll toll;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<Event> events = new ArrayList<>();

  public static final String JSON_PROPERTY_EMISSIONS = "emissions";
  private Emissions emissions;

  public static final String JSON_PROPERTY_ALTERNATIVE_ROUTES = "alternativeRoutes";
  private List<AlternativeRoute> alternativeRoutes = new ArrayList<>();

  public static final String JSON_PROPERTY_SCHEDULE_REPORT = "scheduleReport";
  private ScheduleReport scheduleReport;

  public static final String JSON_PROPERTY_EV_REPORT = "evReport";
  private EvReport evReport;

  public static final String JSON_PROPERTY_GUIDED_NAVIGATION = "guidedNavigation";
  private String guidedNavigation;

  public static final String JSON_PROPERTY_MONETARY_COSTS = "monetaryCosts";
  private MonetaryCosts monetaryCosts;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<Warning> warnings = new ArrayList<>();

  public RouteResponse() { 
  }

  public RouteResponse distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The distance of the route [m].
   * minimum: 0
   * @return distance
   */
  @javax.annotation.Nonnull
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


  public RouteResponse travelTime(Integer travelTime) {
    this.travelTime = travelTime;
    return this;
  }

  /**
   * The travel time for the route [s].
   * minimum: 0
   * @return travelTime
   */
  @javax.annotation.Nonnull
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


  public RouteResponse trafficDelay(Integer trafficDelay) {
    this.trafficDelay = trafficDelay;
    return this;
  }

  /**
   * The total delay due to live traffic on the route [s].  This value contains the sum of all traffic events on the route and will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information.
   * minimum: 0
   * @return trafficDelay
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTrafficDelay() {
    return trafficDelay;
  }


  @JsonProperty(JSON_PROPERTY_TRAFFIC_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrafficDelay(Integer trafficDelay) {
    this.trafficDelay = trafficDelay;
  }


  public RouteResponse violated(Boolean violated) {
    this.violated = violated;
    return this;
  }

  /**
   * If there is no valid route but the resulting route can be calculated by using actually prohibited roads, the route is marked as violated. When requesting _VIOLATION_EVENTS_ there is a corresponding violation event containing the position, time and the vehicle property in question. See [here](./concepts/violations) for more information.
   * @return violated
   */
  @javax.annotation.Nonnull
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


  public RouteResponse routeId(UUID routeId) {
    this.routeId = routeId;
    return this;
  }

  /**
   * The ID of the calculated route. It is valid for 12 hours.
   * @return routeId
   */
  @javax.annotation.Nullable
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


  public RouteResponse legs(List<Leg> legs) {
    this.legs = legs;
    return this;
  }

  public RouteResponse addLegsItem(Leg legsItem) {
    if (this.legs == null) {
      this.legs = new ArrayList<>();
    }
    this.legs.add(legsItem);
    return this;
  }

  /**
   * The legs of the route.
   * @return legs
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Leg> getLegs() {
    return legs;
  }


  @JsonProperty(JSON_PROPERTY_LEGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegs(List<Leg> legs) {
    this.legs = legs;
  }


  public RouteResponse toll(Toll toll) {
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
  public Toll getToll() {
    return toll;
  }


  @JsonProperty(JSON_PROPERTY_TOLL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToll(Toll toll) {
    this.toll = toll;
  }


  public RouteResponse polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

  /**
   * The polyline of the route in the format specified by **options[polylineFormat]**.
   * @return polyline
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPolyline() {
    return polyline;
  }


  @JsonProperty(JSON_PROPERTY_POLYLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }


  public RouteResponse events(List<Event> events) {
    this.events = events;
    return this;
  }

  public RouteResponse addEventsItem(Event eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Detailed information on maneuvers, border crossings and other events along the route in chronological order.
   * @return events
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Event> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(List<Event> events) {
    this.events = events;
  }


  public RouteResponse emissions(Emissions emissions) {
    this.emissions = emissions;
    return this;
  }

  /**
   * Get emissions
   * @return emissions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Emissions getEmissions() {
    return emissions;
  }


  @JsonProperty(JSON_PROPERTY_EMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmissions(Emissions emissions) {
    this.emissions = emissions;
  }


  public RouteResponse alternativeRoutes(List<AlternativeRoute> alternativeRoutes) {
    this.alternativeRoutes = alternativeRoutes;
    return this;
  }

  public RouteResponse addAlternativeRoutesItem(AlternativeRoute alternativeRoutesItem) {
    if (this.alternativeRoutes == null) {
      this.alternativeRoutes = new ArrayList<>();
    }
    this.alternativeRoutes.add(alternativeRoutesItem);
    return this;
  }

  /**
   * Detailed information on alternative routes. Requires _ALTERNATIVE_ROUTES_ to be requested. The array may be empty when no alternative routes are found.
   * @return alternativeRoutes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_ROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlternativeRoute> getAlternativeRoutes() {
    return alternativeRoutes;
  }


  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_ROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternativeRoutes(List<AlternativeRoute> alternativeRoutes) {
    this.alternativeRoutes = alternativeRoutes;
  }


  public RouteResponse scheduleReport(ScheduleReport scheduleReport) {
    this.scheduleReport = scheduleReport;
    return this;
  }

  /**
   * Get scheduleReport
   * @return scheduleReport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ScheduleReport getScheduleReport() {
    return scheduleReport;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleReport(ScheduleReport scheduleReport) {
    this.scheduleReport = scheduleReport;
  }


  public RouteResponse evReport(EvReport evReport) {
    this.evReport = evReport;
    return this;
  }

  /**
   * Get evReport
   * @return evReport
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EV_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EvReport getEvReport() {
    return evReport;
  }


  @JsonProperty(JSON_PROPERTY_EV_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvReport(EvReport evReport) {
    this.evReport = evReport;
  }


  public RouteResponse guidedNavigation(String guidedNavigation) {
    this.guidedNavigation = guidedNavigation;
    return this;
  }

  /**
   * A base64 encoded representation of the route that can be used for the [PTV Navigator](https://www.myptv.com/en/logistics-software/ptv-navigator). The base64 binary has to be decoded and saved as a text file with the extension .bcr. Requires _GUIDED_NAVIGATION_ to be requested.
   * @return guidedNavigation
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GUIDED_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getGuidedNavigation() {
    return guidedNavigation;
  }


  @JsonProperty(JSON_PROPERTY_GUIDED_NAVIGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuidedNavigation(String guidedNavigation) {
    this.guidedNavigation = guidedNavigation;
  }


  public RouteResponse monetaryCosts(MonetaryCosts monetaryCosts) {
    this.monetaryCosts = monetaryCosts;
    return this;
  }

  /**
   * Get monetaryCosts
   * @return monetaryCosts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONETARY_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonetaryCosts getMonetaryCosts() {
    return monetaryCosts;
  }


  @JsonProperty(JSON_PROPERTY_MONETARY_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonetaryCosts(MonetaryCosts monetaryCosts) {
    this.monetaryCosts = monetaryCosts;
  }


  public RouteResponse warnings(List<Warning> warnings) {
    this.warnings = warnings;
    return this;
  }

  public RouteResponse addWarningsItem(Warning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * A list of warnings concerning the validity of the result.
   * @return warnings
   */
  @javax.annotation.Nullable
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
   * Return true if this RouteResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteResponse routeResponse = (RouteResponse) o;
    return Objects.equals(this.distance, routeResponse.distance) &&
        Objects.equals(this.travelTime, routeResponse.travelTime) &&
        Objects.equals(this.trafficDelay, routeResponse.trafficDelay) &&
        Objects.equals(this.violated, routeResponse.violated) &&
        Objects.equals(this.routeId, routeResponse.routeId) &&
        Objects.equals(this.legs, routeResponse.legs) &&
        Objects.equals(this.toll, routeResponse.toll) &&
        Objects.equals(this.polyline, routeResponse.polyline) &&
        Objects.equals(this.events, routeResponse.events) &&
        Objects.equals(this.emissions, routeResponse.emissions) &&
        Objects.equals(this.alternativeRoutes, routeResponse.alternativeRoutes) &&
        Objects.equals(this.scheduleReport, routeResponse.scheduleReport) &&
        Objects.equals(this.evReport, routeResponse.evReport) &&
        Objects.equals(this.guidedNavigation, routeResponse.guidedNavigation) &&
        Objects.equals(this.monetaryCosts, routeResponse.monetaryCosts) &&
        Objects.equals(this.warnings, routeResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distance, travelTime, trafficDelay, violated, routeId, legs, toll, polyline, events, emissions, alternativeRoutes, scheduleReport, evReport, guidedNavigation, monetaryCosts, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteResponse {\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    travelTime: ").append(toIndentedString(travelTime)).append("\n");
    sb.append("    trafficDelay: ").append(toIndentedString(trafficDelay)).append("\n");
    sb.append("    violated: ").append(toIndentedString(violated)).append("\n");
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    legs: ").append(toIndentedString(legs)).append("\n");
    sb.append("    toll: ").append(toIndentedString(toll)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    emissions: ").append(toIndentedString(emissions)).append("\n");
    sb.append("    alternativeRoutes: ").append(toIndentedString(alternativeRoutes)).append("\n");
    sb.append("    scheduleReport: ").append(toIndentedString(scheduleReport)).append("\n");
    sb.append("    evReport: ").append(toIndentedString(evReport)).append("\n");
    sb.append("    guidedNavigation: ").append(toIndentedString(guidedNavigation)).append("\n");
    sb.append("    monetaryCosts: ").append(toIndentedString(monetaryCosts)).append("\n");
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

    // add `distance` to the URL query string
    if (getDistance() != null) {
      joiner.add(String.format("%sdistance%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDistance()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `travelTime` to the URL query string
    if (getTravelTime() != null) {
      joiner.add(String.format("%stravelTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTravelTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `trafficDelay` to the URL query string
    if (getTrafficDelay() != null) {
      joiner.add(String.format("%strafficDelay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTrafficDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `violated` to the URL query string
    if (getViolated() != null) {
      joiner.add(String.format("%sviolated%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getViolated()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `routeId` to the URL query string
    if (getRouteId() != null) {
      joiner.add(String.format("%srouteId%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRouteId()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `legs` to the URL query string
    if (getLegs() != null) {
      for (int i = 0; i < getLegs().size(); i++) {
        if (getLegs().get(i) != null) {
          joiner.add(getLegs().get(i).toUrlQueryString(String.format("%slegs%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `toll` to the URL query string
    if (getToll() != null) {
      joiner.add(getToll().toUrlQueryString(prefix + "toll" + suffix));
    }

    // add `polyline` to the URL query string
    if (getPolyline() != null) {
      joiner.add(String.format("%spolyline%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPolyline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `events` to the URL query string
    if (getEvents() != null) {
      for (int i = 0; i < getEvents().size(); i++) {
        if (getEvents().get(i) != null) {
          joiner.add(getEvents().get(i).toUrlQueryString(String.format("%sevents%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `emissions` to the URL query string
    if (getEmissions() != null) {
      joiner.add(getEmissions().toUrlQueryString(prefix + "emissions" + suffix));
    }

    // add `alternativeRoutes` to the URL query string
    if (getAlternativeRoutes() != null) {
      for (int i = 0; i < getAlternativeRoutes().size(); i++) {
        if (getAlternativeRoutes().get(i) != null) {
          joiner.add(getAlternativeRoutes().get(i).toUrlQueryString(String.format("%salternativeRoutes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `scheduleReport` to the URL query string
    if (getScheduleReport() != null) {
      joiner.add(getScheduleReport().toUrlQueryString(prefix + "scheduleReport" + suffix));
    }

    // add `evReport` to the URL query string
    if (getEvReport() != null) {
      joiner.add(getEvReport().toUrlQueryString(prefix + "evReport" + suffix));
    }

    // add `guidedNavigation` to the URL query string
    if (getGuidedNavigation() != null) {
      joiner.add(String.format("%sguidedNavigation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getGuidedNavigation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `monetaryCosts` to the URL query string
    if (getMonetaryCosts() != null) {
      joiner.add(getMonetaryCosts().toUrlQueryString(prefix + "monetaryCosts" + suffix));
    }

    // add `warnings` to the URL query string
    if (getWarnings() != null) {
      for (int i = 0; i < getWarnings().size(); i++) {
        if (getWarnings().get(i) != null) {
          joiner.add(getWarnings().get(i).toUrlQueryString(String.format("%swarnings%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}

