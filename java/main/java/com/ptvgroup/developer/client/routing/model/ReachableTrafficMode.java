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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines how to consider traffic in a reachable areas or a reachable locations calculation.  * &#x60;REALISTIC&#x60; - Uses the most realistic **travelTime** and **distance** for the selected vehicle and the  given **referenceTime** (or the current time if none **referenceTime** is specified).  Takes into account the live traffic situation such as traffic jams or road works  as well as the typical traffic situation at the time of day and the day of week of travel such as the rush-hour  on Monday morning or light traffic on Saturday evening.  * &#x60;AVERAGE&#x60; - Uses the average **travelTime** and **distance** for the selected vehicle.  If **referenceTime** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rush-hour  on Monday morning or light traffic on Saturday evening.  If no **referenceTime** is specified the typical traffic situation will not be considered, and **travelTime** and **distance** are an average independent of when to travel.  See [here](./concepts/traffic-modes) for more information. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.
 */
public enum ReachableTrafficMode {
  
  REALISTIC("REALISTIC"),
  
  AVERAGE("AVERAGE");

  private String value;

  ReachableTrafficMode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReachableTrafficMode fromValue(String value) {
    for (ReachableTrafficMode b : ReachableTrafficMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    if (prefix == null) {
      prefix = "";
    }

    return String.format("%s=%s", prefix, this.toString());
  }

}

