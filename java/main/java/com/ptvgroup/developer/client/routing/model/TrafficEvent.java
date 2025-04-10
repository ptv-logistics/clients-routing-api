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
import com.ptvgroup.developer.client.routing.model.AccessType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Issued when the route passes a road for which live traffic data contain an incident such as a traffic jam. Requires _TRAFFIC_EVENTS_ to be requested.
 */
@JsonPropertyOrder({
  TrafficEvent.JSON_PROPERTY_DELAY,
  TrafficEvent.JSON_PROPERTY_DESCRIPTION,
  TrafficEvent.JSON_PROPERTY_LANGUAGE,
  TrafficEvent.JSON_PROPERTY_ACCESS_TYPE,
  TrafficEvent.JSON_PROPERTY_RELATED_EVENT_INDEX,
  TrafficEvent.JSON_PROPERTY_POLYLINE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TrafficEvent {
  public static final String JSON_PROPERTY_DELAY = "delay";
  private Integer delay;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_RELATED_EVENT_INDEX = "relatedEventIndex";
  private Integer relatedEventIndex;

  public static final String JSON_PROPERTY_POLYLINE = "polyline";
  private String polyline;

  public TrafficEvent() { 
  }

  public TrafficEvent delay(Integer delay) {
    this.delay = delay;
    return this;
  }

  /**
   * The delay due to this incident [s].
   * @return delay
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getDelay() {
    return delay;
  }


  @JsonProperty(JSON_PROPERTY_DELAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelay(Integer delay) {
    this.delay = delay;
  }


  public TrafficEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the incident in the language specified by the parameter **options[language]**. 
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TrafficEvent language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The language of the description, if the given language is not supported for this incident. Not present otherwise.
   * @return language
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public TrafficEvent accessType(AccessType accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AccessType getAccessType() {
    return accessType;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessType(AccessType accessType) {
    this.accessType = accessType;
  }


  public TrafficEvent relatedEventIndex(Integer relatedEventIndex) {
    this.relatedEventIndex = relatedEventIndex;
    return this;
  }

  /**
   * For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
   * minimum: 0
   * @return relatedEventIndex
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATED_EVENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRelatedEventIndex() {
    return relatedEventIndex;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_EVENT_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedEventIndex(Integer relatedEventIndex) {
    this.relatedEventIndex = relatedEventIndex;
  }


  public TrafficEvent polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

  /**
   * The polyline of the traffic event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _TRAFFIC_EVENTS_POLYLINE_ to be requested.
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


  /**
   * Return true if this TrafficEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficEvent trafficEvent = (TrafficEvent) o;
    return Objects.equals(this.delay, trafficEvent.delay) &&
        Objects.equals(this.description, trafficEvent.description) &&
        Objects.equals(this.language, trafficEvent.language) &&
        Objects.equals(this.accessType, trafficEvent.accessType) &&
        Objects.equals(this.relatedEventIndex, trafficEvent.relatedEventIndex) &&
        Objects.equals(this.polyline, trafficEvent.polyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delay, description, language, accessType, relatedEventIndex, polyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficEvent {\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    relatedEventIndex: ").append(toIndentedString(relatedEventIndex)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
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

    // add `delay` to the URL query string
    if (getDelay() != null) {
      joiner.add(String.format("%sdelay%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDelay()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDescription()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `language` to the URL query string
    if (getLanguage() != null) {
      joiner.add(String.format("%slanguage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLanguage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accessType` to the URL query string
    if (getAccessType() != null) {
      joiner.add(String.format("%saccessType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccessType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `relatedEventIndex` to the URL query string
    if (getRelatedEventIndex() != null) {
      joiner.add(String.format("%srelatedEventIndex%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRelatedEventIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `polyline` to the URL query string
    if (getPolyline() != null) {
      joiner.add(String.format("%spolyline%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPolyline()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

