/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Issued when the offset to UTC changes, mostly when traveling into a different time zone. Requires _UTC_OFFSET_CHANGE_EVENTS_ to be requested.    Changing the UTC offset does not necessarily mean to change the time zone. Vice-versa changing the time zone does not necessarily mean to change the UTC offset. There are some special cases to consider.  *  The UTC offset may change even within a time zone when the route takes place exactly when the daylight-saving time changes.  *  The UTC offset may not change when changing the time zone. In Canada, for example, there are regions which do not use DST   so that the neighboring time zone has the same UTC offset in summer.
 */
@JsonPropertyOrder({
  UTCOffsetChangeEvent.JSON_PROPERTY_UTC_OFFSET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T08:24:21.642779946Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UTCOffsetChangeEvent {
  public static final String JSON_PROPERTY_UTC_OFFSET = "utcOffset";
  private Integer utcOffset;

  public UTCOffsetChangeEvent() { 
  }

  public UTCOffsetChangeEvent utcOffset(Integer utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

  /**
   * The new UTC offset [min].
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


  /**
   * Return true if this UTCOffsetChangeEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UTCOffsetChangeEvent utCOffsetChangeEvent = (UTCOffsetChangeEvent) o;
    return Objects.equals(this.utcOffset, utCOffsetChangeEvent.utcOffset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(utcOffset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UTCOffsetChangeEvent {\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
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

    // add `utcOffset` to the URL query string
    if (getUtcOffset() != null) {
      joiner.add(String.format("%sutcOffset%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUtcOffset()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

