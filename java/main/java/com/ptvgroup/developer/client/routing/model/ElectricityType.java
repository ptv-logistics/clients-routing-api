/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The electricity type of the vehicle.  Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for &#x60;emissions&#x60;. 
 */
public enum ElectricityType {
  
  BATTERY("BATTERY"),
  
  HYDROGEN_FUEL_CELL("HYDROGEN_FUEL_CELL"),
  
  NONE("NONE");

  private String value;

  ElectricityType(String value) {
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
  public static ElectricityType fromValue(String value) {
    for (ElectricityType b : ElectricityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }
}

