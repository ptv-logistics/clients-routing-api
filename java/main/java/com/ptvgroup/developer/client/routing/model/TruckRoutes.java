/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TruckRoutes
 */
public enum TruckRoutes {
  
  DE_LKWUEBERLSTVAUSNV("DE_LKWUEBERLSTVAUSNV"),
  
  NL_LZV("NL_LZV"),
  
  NZ_HPMV("NZ_HPMV"),
  
  SE_BK_1("SE_BK_1"),
  
  SE_BK_2("SE_BK_2"),
  
  SE_BK_3("SE_BK_3"),
  
  SE_BK_4("SE_BK_4"),
  
  US_STAA("US_STAA"),
  
  US_TD("US_TD"),
  
  AU_B_DOUBLE("AU_B_DOUBLE"),
  
  AU_B_DOUBLE_HML("AU_B_DOUBLE_HML"),
  
  AU_B_TRIPLE("AU_B_TRIPLE"),
  
  AU_B_TRIPLE_HML("AU_B_TRIPLE_HML"),
  
  AU_AB_TRIPLE("AU_AB_TRIPLE"),
  
  AU_AB_TRIPLE_HML("AU_AB_TRIPLE_HML"),
  
  NONE("NONE");

  private String value;

  TruckRoutes(String value) {
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
  public static TruckRoutes fromValue(String value) {
    for (TruckRoutes b : TruckRoutes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

