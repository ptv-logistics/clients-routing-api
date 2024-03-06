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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.ElectricityPrice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * The consumption and charging summary for the specified vehicle model. Only present if _EV_REPORT_ is requested. 
 */
@ApiModel(description = "The consumption and charging summary for the specified vehicle model. Only present if _EV_REPORT_ is requested. ")
@JsonPropertyOrder({
  EvReport.JSON_PROPERTY_ELECTRICITY_CONSUMPTION,
  EvReport.JSON_PROPERTY_BATTERY_STATE_OF_CHARGE,
  EvReport.JSON_PROPERTY_CHARGING_TIME,
  EvReport.JSON_PROPERTY_ELECTRICITY_CHARGED,
  EvReport.JSON_PROPERTY_PERCENTAGE_CHARGED,
  EvReport.JSON_PROPERTY_COST
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-06T15:46:58.406580Z[Etc/UTC]")
public class EvReport {
  public static final String JSON_PROPERTY_ELECTRICITY_CONSUMPTION = "electricityConsumption";
  private Double electricityConsumption;

  public static final String JSON_PROPERTY_BATTERY_STATE_OF_CHARGE = "batteryStateOfCharge";
  private Double batteryStateOfCharge;

  public static final String JSON_PROPERTY_CHARGING_TIME = "chargingTime";
  private Integer chargingTime;

  public static final String JSON_PROPERTY_ELECTRICITY_CHARGED = "electricityCharged";
  private Double electricityCharged;

  public static final String JSON_PROPERTY_PERCENTAGE_CHARGED = "percentageCharged";
  private Integer percentageCharged;

  public static final String JSON_PROPERTY_COST = "cost";
  private ElectricityPrice cost;

  public EvReport() { 
  }

  public EvReport electricityConsumption(Double electricityConsumption) {
    this.electricityConsumption = electricityConsumption;
    return this;
  }

   /**
   * The electricity consumption since the start of the route [kWh].
   * @return electricityConsumption
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The electricity consumption since the start of the route [kWh].")
  @JsonProperty(JSON_PROPERTY_ELECTRICITY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getElectricityConsumption() {
    return electricityConsumption;
  }


  @JsonProperty(JSON_PROPERTY_ELECTRICITY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElectricityConsumption(Double electricityConsumption) {
    this.electricityConsumption = electricityConsumption;
  }


  public EvReport batteryStateOfCharge(Double batteryStateOfCharge) {
    this.batteryStateOfCharge = batteryStateOfCharge;
    return this;
  }

   /**
   * The remaining battery capacity at the end of the route [%].
   * maximum: 100
   * @return batteryStateOfCharge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "58", required = true, value = "The remaining battery capacity at the end of the route [%].")
  @JsonProperty(JSON_PROPERTY_BATTERY_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getBatteryStateOfCharge() {
    return batteryStateOfCharge;
  }


  @JsonProperty(JSON_PROPERTY_BATTERY_STATE_OF_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBatteryStateOfCharge(Double batteryStateOfCharge) {
    this.batteryStateOfCharge = batteryStateOfCharge;
  }


  public EvReport chargingTime(Integer chargingTime) {
    this.chargingTime = chargingTime;
    return this;
  }

   /**
   * The time spent for charging the battery [s].
   * minimum: 0
   * @return chargingTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The time spent for charging the battery [s].")
  @JsonProperty(JSON_PROPERTY_CHARGING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getChargingTime() {
    return chargingTime;
  }


  @JsonProperty(JSON_PROPERTY_CHARGING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChargingTime(Integer chargingTime) {
    this.chargingTime = chargingTime;
  }


  public EvReport electricityCharged(Double electricityCharged) {
    this.electricityCharged = electricityCharged;
    return this;
  }

   /**
   * The amount of electricity charged along the route [kWh].
   * minimum: 0
   * @return electricityCharged
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of electricity charged along the route [kWh].")
  @JsonProperty(JSON_PROPERTY_ELECTRICITY_CHARGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getElectricityCharged() {
    return electricityCharged;
  }


  @JsonProperty(JSON_PROPERTY_ELECTRICITY_CHARGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setElectricityCharged(Double electricityCharged) {
    this.electricityCharged = electricityCharged;
  }


  public EvReport percentageCharged(Integer percentageCharged) {
    this.percentageCharged = percentageCharged;
    return this;
  }

   /**
   * The percentage of battery charged along the route [%].
   * minimum: 0
   * @return percentageCharged
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The percentage of battery charged along the route [%].")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE_CHARGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPercentageCharged() {
    return percentageCharged;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE_CHARGED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentageCharged(Integer percentageCharged) {
    this.percentageCharged = percentageCharged;
  }


  public EvReport cost(ElectricityPrice cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ElectricityPrice getCost() {
    return cost;
  }


  @JsonProperty(JSON_PROPERTY_COST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCost(ElectricityPrice cost) {
    this.cost = cost;
  }


  /**
   * Return true if this EvReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvReport evReport = (EvReport) o;
    return Objects.equals(this.electricityConsumption, evReport.electricityConsumption) &&
        Objects.equals(this.batteryStateOfCharge, evReport.batteryStateOfCharge) &&
        Objects.equals(this.chargingTime, evReport.chargingTime) &&
        Objects.equals(this.electricityCharged, evReport.electricityCharged) &&
        Objects.equals(this.percentageCharged, evReport.percentageCharged) &&
        Objects.equals(this.cost, evReport.cost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(electricityConsumption, batteryStateOfCharge, chargingTime, electricityCharged, percentageCharged, cost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvReport {\n");
    sb.append("    electricityConsumption: ").append(toIndentedString(electricityConsumption)).append("\n");
    sb.append("    batteryStateOfCharge: ").append(toIndentedString(batteryStateOfCharge)).append("\n");
    sb.append("    chargingTime: ").append(toIndentedString(chargingTime)).append("\n");
    sb.append("    electricityCharged: ").append(toIndentedString(electricityCharged)).append("\n");
    sb.append("    percentageCharged: ").append(toIndentedString(percentageCharged)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
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

}

