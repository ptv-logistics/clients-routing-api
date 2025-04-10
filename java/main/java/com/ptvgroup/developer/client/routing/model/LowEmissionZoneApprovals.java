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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets LowEmissionZoneApprovals
 */
public enum LowEmissionZoneApprovals {
  
  NONE("NONE"),
  
  AT_EURO_1("AT_EURO_1"),
  
  AT_EURO_2("AT_EURO_2"),
  
  AT_EURO_3("AT_EURO_3"),
  
  AT_EURO_4("AT_EURO_4"),
  
  AT_EURO_5("AT_EURO_5"),
  
  AT_EURO_6("AT_EURO_6"),
  
  DE_GREEN("DE_GREEN"),
  
  DE_YELLOW("DE_YELLOW"),
  
  DE_RED("DE_RED"),
  
  DK_AUTHORIZED("DK_AUTHORIZED"),
  
  ES_CAT_B("ES_CAT_B"),
  
  ES_CAT_C("ES_CAT_C"),
  
  ES_CAT_ECO("ES_CAT_ECO"),
  
  ES_CAT_ZERO("ES_CAT_ZERO"),
  
  FR_CRITAIR_0("FR_CRITAIR_0"),
  
  FR_CRITAIR_1("FR_CRITAIR_1"),
  
  FR_CRITAIR_2("FR_CRITAIR_2"),
  
  FR_CRITAIR_3("FR_CRITAIR_3"),
  
  FR_CRITAIR_4("FR_CRITAIR_4"),
  
  FR_CRITAIR_5("FR_CRITAIR_5");

  private String value;

  LowEmissionZoneApprovals(String value) {
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
  public static LowEmissionZoneApprovals fromValue(String value) {
    for (LowEmissionZoneApprovals b : LowEmissionZoneApprovals.values()) {
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

