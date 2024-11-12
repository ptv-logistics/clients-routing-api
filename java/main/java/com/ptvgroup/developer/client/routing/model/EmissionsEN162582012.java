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
 * Emissions according to EN16258 from 2012 (a.k.a. CEN standard).
 */
@JsonPropertyOrder({
  EmissionsEN162582012.JSON_PROPERTY_FUEL_CONSUMPTION,
  EmissionsEN162582012.JSON_PROPERTY_CO2E_TANK_TO_WHEEL,
  EmissionsEN162582012.JSON_PROPERTY_CO2E_WELL_TO_WHEEL,
  EmissionsEN162582012.JSON_PROPERTY_ENERGY_USE_TANK_TO_WHEEL,
  EmissionsEN162582012.JSON_PROPERTY_ENERGY_USE_WELL_TO_WHEEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-12T08:24:21.642779946Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EmissionsEN162582012 {
  public static final String JSON_PROPERTY_FUEL_CONSUMPTION = "fuelConsumption";
  private Double fuelConsumption;

  public static final String JSON_PROPERTY_CO2E_TANK_TO_WHEEL = "co2eTankToWheel";
  private Double co2eTankToWheel;

  public static final String JSON_PROPERTY_CO2E_WELL_TO_WHEEL = "co2eWellToWheel";
  private Double co2eWellToWheel;

  public static final String JSON_PROPERTY_ENERGY_USE_TANK_TO_WHEEL = "energyUseTankToWheel";
  private Double energyUseTankToWheel;

  public static final String JSON_PROPERTY_ENERGY_USE_WELL_TO_WHEEL = "energyUseWellToWheel";
  private Double energyUseWellToWheel;

  public EmissionsEN162582012() { 
  }

  public EmissionsEN162582012 fuelConsumption(Double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
    return this;
  }

  /**
   * The total fuel consumption [kg].
   * minimum: 0
   * @return fuelConsumption
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FUEL_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getFuelConsumption() {
    return fuelConsumption;
  }


  @JsonProperty(JSON_PROPERTY_FUEL_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFuelConsumption(Double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }


  public EmissionsEN162582012 co2eTankToWheel(Double co2eTankToWheel) {
    this.co2eTankToWheel = co2eTankToWheel;
    return this;
  }

  /**
   * The amount of emitted CO2e from tank to wheel [kg].
   * minimum: 0
   * @return co2eTankToWheel
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CO2E_TANK_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCo2eTankToWheel() {
    return co2eTankToWheel;
  }


  @JsonProperty(JSON_PROPERTY_CO2E_TANK_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCo2eTankToWheel(Double co2eTankToWheel) {
    this.co2eTankToWheel = co2eTankToWheel;
  }


  public EmissionsEN162582012 co2eWellToWheel(Double co2eWellToWheel) {
    this.co2eWellToWheel = co2eWellToWheel;
    return this;
  }

  /**
   * The amount of emitted CO2e from well to wheel [kg].
   * minimum: 0
   * @return co2eWellToWheel
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CO2E_WELL_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getCo2eWellToWheel() {
    return co2eWellToWheel;
  }


  @JsonProperty(JSON_PROPERTY_CO2E_WELL_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCo2eWellToWheel(Double co2eWellToWheel) {
    this.co2eWellToWheel = co2eWellToWheel;
  }


  public EmissionsEN162582012 energyUseTankToWheel(Double energyUseTankToWheel) {
    this.energyUseTankToWheel = energyUseTankToWheel;
    return this;
  }

  /**
   * The tank-to-wheel energy use [MJ].
   * minimum: 0
   * @return energyUseTankToWheel
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENERGY_USE_TANK_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getEnergyUseTankToWheel() {
    return energyUseTankToWheel;
  }


  @JsonProperty(JSON_PROPERTY_ENERGY_USE_TANK_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnergyUseTankToWheel(Double energyUseTankToWheel) {
    this.energyUseTankToWheel = energyUseTankToWheel;
  }


  public EmissionsEN162582012 energyUseWellToWheel(Double energyUseWellToWheel) {
    this.energyUseWellToWheel = energyUseWellToWheel;
    return this;
  }

  /**
   * The well-to-wheel energy use [MJ].
   * minimum: 0
   * @return energyUseWellToWheel
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ENERGY_USE_WELL_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getEnergyUseWellToWheel() {
    return energyUseWellToWheel;
  }


  @JsonProperty(JSON_PROPERTY_ENERGY_USE_WELL_TO_WHEEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnergyUseWellToWheel(Double energyUseWellToWheel) {
    this.energyUseWellToWheel = energyUseWellToWheel;
  }


  /**
   * Return true if this Emissions_EN16258_2012 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmissionsEN162582012 emissionsEN162582012 = (EmissionsEN162582012) o;
    return Objects.equals(this.fuelConsumption, emissionsEN162582012.fuelConsumption) &&
        Objects.equals(this.co2eTankToWheel, emissionsEN162582012.co2eTankToWheel) &&
        Objects.equals(this.co2eWellToWheel, emissionsEN162582012.co2eWellToWheel) &&
        Objects.equals(this.energyUseTankToWheel, emissionsEN162582012.energyUseTankToWheel) &&
        Objects.equals(this.energyUseWellToWheel, emissionsEN162582012.energyUseWellToWheel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fuelConsumption, co2eTankToWheel, co2eWellToWheel, energyUseTankToWheel, energyUseWellToWheel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissionsEN162582012 {\n");
    sb.append("    fuelConsumption: ").append(toIndentedString(fuelConsumption)).append("\n");
    sb.append("    co2eTankToWheel: ").append(toIndentedString(co2eTankToWheel)).append("\n");
    sb.append("    co2eWellToWheel: ").append(toIndentedString(co2eWellToWheel)).append("\n");
    sb.append("    energyUseTankToWheel: ").append(toIndentedString(energyUseTankToWheel)).append("\n");
    sb.append("    energyUseWellToWheel: ").append(toIndentedString(energyUseWellToWheel)).append("\n");
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

    // add `fuelConsumption` to the URL query string
    if (getFuelConsumption() != null) {
      joiner.add(String.format("%sfuelConsumption%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFuelConsumption()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `co2eTankToWheel` to the URL query string
    if (getCo2eTankToWheel() != null) {
      joiner.add(String.format("%sco2eTankToWheel%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCo2eTankToWheel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `co2eWellToWheel` to the URL query string
    if (getCo2eWellToWheel() != null) {
      joiner.add(String.format("%sco2eWellToWheel%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCo2eWellToWheel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `energyUseTankToWheel` to the URL query string
    if (getEnergyUseTankToWheel() != null) {
      joiner.add(String.format("%senergyUseTankToWheel%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEnergyUseTankToWheel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `energyUseWellToWheel` to the URL query string
    if (getEnergyUseWellToWheel() != null) {
      joiner.add(String.format("%senergyUseWellToWheel%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEnergyUseWellToWheel()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

