/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.33
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
import com.ptvgroup.developer.client.routing.model.CurrentType;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * Defines the charging capabilities available the a waypoint. 
 */
@JsonPropertyOrder({
  ChargingStation.JSON_PROPERTY_POWER,
  ChargingStation.JSON_PROPERTY_CURRENT_TYPE,
  ChargingStation.JSON_PROPERTY_SETUP_TIME,
  ChargingStation.JSON_PROPERTY_K_WH_PRICE,
  ChargingStation.JSON_PROPERTY_USE_SERVICE_TIME_FOR_CHARGING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T13:35:23.497749140Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ChargingStation {
  public static final String JSON_PROPERTY_POWER = "power";
  private Integer power;

  public static final String JSON_PROPERTY_CURRENT_TYPE = "currentType";
  private CurrentType currentType = CurrentType.ALTERNATING;

  public static final String JSON_PROPERTY_SETUP_TIME = "setupTime";
  private Integer setupTime = 0;

  public static final String JSON_PROPERTY_K_WH_PRICE = "kWhPrice";
  private Double kWhPrice = 0d;

  public static final String JSON_PROPERTY_USE_SERVICE_TIME_FOR_CHARGING = "useServiceTimeForCharging";
  private Boolean useServiceTimeForCharging = false;

  public ChargingStation() { 
  }

  public ChargingStation power(Integer power) {
    this.power = power;
    return this;
  }

  /**
   * The power delivered by the charging station [kW].
   * minimum: 0
   * @return power
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_POWER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getPower() {
    return power;
  }


  @JsonProperty(JSON_PROPERTY_POWER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPower(Integer power) {
    this.power = power;
  }


  public ChargingStation currentType(CurrentType currentType) {
    this.currentType = currentType;
    return this;
  }

  /**
   * Get currentType
   * @return currentType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CurrentType getCurrentType() {
    return currentType;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentType(CurrentType currentType) {
    this.currentType = currentType;
  }


  public ChargingStation setupTime(Integer setupTime) {
    this.setupTime = setupTime;
    return this;
  }

  /**
   * The time to setup the connection [s].
   * minimum: 0
   * @return setupTime
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SETUP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getSetupTime() {
    return setupTime;
  }


  @JsonProperty(JSON_PROPERTY_SETUP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSetupTime(Integer setupTime) {
    this.setupTime = setupTime;
  }


  public ChargingStation kWhPrice(Double kWhPrice) {
    this.kWhPrice = kWhPrice;
    return this;
  }

  /**
   * The price of one kWh in the currency defined in **options[currency]**.
   * minimum: 0
   * @return kWhPrice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_K_WH_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getkWhPrice() {
    return kWhPrice;
  }


  @JsonProperty(JSON_PROPERTY_K_WH_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setkWhPrice(Double kWhPrice) {
    this.kWhPrice = kWhPrice;
  }


  public ChargingStation useServiceTimeForCharging(Boolean useServiceTimeForCharging) {
    this.useServiceTimeForCharging = useServiceTimeForCharging;
    return this;
  }

  /**
   * If true, the service time can be used for charging. Will be ignored, if **serviceTime** is 0. This can have  an influence on charging optimization because the additional time needed for charging is minimized.
   * @return useServiceTimeForCharging
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USE_SERVICE_TIME_FOR_CHARGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUseServiceTimeForCharging() {
    return useServiceTimeForCharging;
  }


  @JsonProperty(JSON_PROPERTY_USE_SERVICE_TIME_FOR_CHARGING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseServiceTimeForCharging(Boolean useServiceTimeForCharging) {
    this.useServiceTimeForCharging = useServiceTimeForCharging;
  }


  /**
   * Return true if this ChargingStation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargingStation chargingStation = (ChargingStation) o;
    return Objects.equals(this.power, chargingStation.power) &&
        Objects.equals(this.currentType, chargingStation.currentType) &&
        Objects.equals(this.setupTime, chargingStation.setupTime) &&
        Objects.equals(this.kWhPrice, chargingStation.kWhPrice) &&
        Objects.equals(this.useServiceTimeForCharging, chargingStation.useServiceTimeForCharging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(power, currentType, setupTime, kWhPrice, useServiceTimeForCharging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargingStation {\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
    sb.append("    currentType: ").append(toIndentedString(currentType)).append("\n");
    sb.append("    setupTime: ").append(toIndentedString(setupTime)).append("\n");
    sb.append("    kWhPrice: ").append(toIndentedString(kWhPrice)).append("\n");
    sb.append("    useServiceTimeForCharging: ").append(toIndentedString(useServiceTimeForCharging)).append("\n");
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

    // add `power` to the URL query string
    if (getPower() != null) {
      joiner.add(String.format("%spower%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPower()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `currentType` to the URL query string
    if (getCurrentType() != null) {
      joiner.add(String.format("%scurrentType%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCurrentType()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `setupTime` to the URL query string
    if (getSetupTime() != null) {
      joiner.add(String.format("%ssetupTime%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSetupTime()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `kWhPrice` to the URL query string
    if (getkWhPrice() != null) {
      joiner.add(String.format("%skWhPrice%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getkWhPrice()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `useServiceTimeForCharging` to the URL query string
    if (getUseServiceTimeForCharging() != null) {
      joiner.add(String.format("%suseServiceTimeForCharging%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUseServiceTimeForCharging()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

