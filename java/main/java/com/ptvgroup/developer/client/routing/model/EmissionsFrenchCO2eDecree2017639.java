/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.22
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Emissions according to the French CO2E decree from 2017.
 */
@ApiModel(description = "Emissions according to the French CO2E decree from 2017.")
@JsonPropertyOrder({
  EmissionsFrenchCO2eDecree2017639.JSON_PROPERTY_CO2E_WELL_TO_WHEEL,
  EmissionsFrenchCO2eDecree2017639.JSON_PROPERTY_CO2E_TANK_TO_WHEEL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-11-15T14:25:12.435885Z[Etc/UTC]")
public class EmissionsFrenchCO2eDecree2017639 {
  public static final String JSON_PROPERTY_CO2E_WELL_TO_WHEEL = "co2eWellToWheel";
  private Double co2eWellToWheel;

  public static final String JSON_PROPERTY_CO2E_TANK_TO_WHEEL = "co2eTankToWheel";
  private Double co2eTankToWheel;

  public EmissionsFrenchCO2eDecree2017639() { 
  }

  public EmissionsFrenchCO2eDecree2017639 co2eWellToWheel(Double co2eWellToWheel) {
    this.co2eWellToWheel = co2eWellToWheel;
    return this;
  }

   /**
   * The amount of emitted CO2e from well to wheel [kg].
   * minimum: 0
   * @return co2eWellToWheel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of emitted CO2e from well to wheel [kg].")
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


  public EmissionsFrenchCO2eDecree2017639 co2eTankToWheel(Double co2eTankToWheel) {
    this.co2eTankToWheel = co2eTankToWheel;
    return this;
  }

   /**
   * The amount of emitted CO2e from tank to wheel [kg].
   * minimum: 0
   * @return co2eTankToWheel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The amount of emitted CO2e from tank to wheel [kg].")
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


  /**
   * Return true if this Emissions_French_CO2e_Decree_2017_639 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmissionsFrenchCO2eDecree2017639 emissionsFrenchCO2eDecree2017639 = (EmissionsFrenchCO2eDecree2017639) o;
    return Objects.equals(this.co2eWellToWheel, emissionsFrenchCO2eDecree2017639.co2eWellToWheel) &&
        Objects.equals(this.co2eTankToWheel, emissionsFrenchCO2eDecree2017639.co2eTankToWheel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(co2eWellToWheel, co2eTankToWheel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissionsFrenchCO2eDecree2017639 {\n");
    sb.append("    co2eWellToWheel: ").append(toIndentedString(co2eWellToWheel)).append("\n");
    sb.append("    co2eTankToWheel: ").append(toIndentedString(co2eTankToWheel)).append("\n");
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

