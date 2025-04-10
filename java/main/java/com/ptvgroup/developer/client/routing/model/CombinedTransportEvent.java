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
import com.ptvgroup.developer.client.routing.model.CombinedTransportType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Issued when a combined transport is entered or exited. Requires _COMBINED_TRANSPORT_EVENTS_ to be requested.
 */
@JsonPropertyOrder({
  CombinedTransportEvent.JSON_PROPERTY_NAME,
  CombinedTransportEvent.JSON_PROPERTY_TYPE,
  CombinedTransportEvent.JSON_PROPERTY_ACCESS_TYPE,
  CombinedTransportEvent.JSON_PROPERTY_RELATED_EVENT_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CombinedTransportEvent {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CombinedTransportType type;

  public static final String JSON_PROPERTY_ACCESS_TYPE = "accessType";
  private AccessType accessType;

  public static final String JSON_PROPERTY_RELATED_EVENT_INDEX = "relatedEventIndex";
  private Integer relatedEventIndex;

  public CombinedTransportEvent() { 
  }

  public CombinedTransportEvent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the combined transport.
   * @return name
   */
  @javax.annotation.Nonnull
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


  public CombinedTransportEvent type(CombinedTransportType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CombinedTransportType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(CombinedTransportType type) {
    this.type = type;
  }


  public CombinedTransportEvent accessType(AccessType accessType) {
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


  public CombinedTransportEvent relatedEventIndex(Integer relatedEventIndex) {
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


  /**
   * Return true if this CombinedTransportEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CombinedTransportEvent combinedTransportEvent = (CombinedTransportEvent) o;
    return Objects.equals(this.name, combinedTransportEvent.name) &&
        Objects.equals(this.type, combinedTransportEvent.type) &&
        Objects.equals(this.accessType, combinedTransportEvent.accessType) &&
        Objects.equals(this.relatedEventIndex, combinedTransportEvent.relatedEventIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, accessType, relatedEventIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CombinedTransportEvent {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    relatedEventIndex: ").append(toIndentedString(relatedEventIndex)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `type` to the URL query string
    if (getType() != null) {
      joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `accessType` to the URL query string
    if (getAccessType() != null) {
      joiner.add(String.format("%saccessType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAccessType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `relatedEventIndex` to the URL query string
    if (getRelatedEventIndex() != null) {
      joiner.add(String.format("%srelatedEventIndex%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRelatedEventIndex()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

