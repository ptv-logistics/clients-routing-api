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
 * The engine type of the vehicle. When changing the engine type further parameters must be specified to define a valid vehicle and to obtain proper results. For a hybrid or an electric vehicle **electricityType** and **averageElectricityConsumption** must be specified, for a hybrid vehicle additionally the **hybridRatio**.  This and all dependent parameters cannot be used with a model of an electric vehicle, because all applicable  parameters are automatically provided by the model. Please refer to the [concept](./concepts/model-based-ev-consumption-calculation) to see specifically which  parameters are not compatible and automatically set from the vehicle model.  Relevant for &#x60;toll&#x60;, &#x60;emissions&#x60;. 
 */
public enum EngineType {
  
  COMBUSTION("COMBUSTION"),
  
  ELECTRIC("ELECTRIC"),
  
  HYBRID("HYBRID");

  private String value;

  EngineType(String value) {
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
  public static EngineType fromValue(String value) {
    for (EngineType b : EngineType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
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

