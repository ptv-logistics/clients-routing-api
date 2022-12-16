/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
 * Specifies the driving direction, i.e. from start to destination or from destination to start..  * &#x60;OUTBOUND&#x60; - Indicates an outbound routing from start to destination, i.e. the area which can be reached from the location within the given horizon. Use this value to calculate which can be covered e.g. by an emergency service such as a fire department.  * &#x60;INBOUND&#x60; - Indicates an inbound routing from destination to start, i.e. from where the location can be reached within the given horizon. Use this value to calculate the catchment area, e.g. of a school or a hospital.
 */
public enum DrivingDirection {
  
  OUTBOUND("OUTBOUND"),
  
  INBOUND("INBOUND");

  private String value;

  DrivingDirection(String value) {
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
  public static DrivingDirection fromValue(String value) {
    for (DrivingDirection b : DrivingDirection.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

