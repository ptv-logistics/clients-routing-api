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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.Iso14083EmissionFactorsVersion;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * EmissionOptions
 */
@JsonPropertyOrder({
  EmissionOptions.JSON_PROPERTY_CALCULATION_METHODS,
  EmissionOptions.JSON_PROPERTY_DEFAULT_CONSUMPTION,
  EmissionOptions.JSON_PROPERTY_ISO14083_EMISSION_FACTORS_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class EmissionOptions {
  public static final String JSON_PROPERTY_CALCULATION_METHODS = "calculationMethods";
  private String calculationMethods;

  public static final String JSON_PROPERTY_DEFAULT_CONSUMPTION = "defaultConsumption";
  private Boolean defaultConsumption = false;

  public static final String JSON_PROPERTY_ISO14083_EMISSION_FACTORS_VERSION = "iso14083EmissionFactorsVersion";
  private Iso14083EmissionFactorsVersion iso14083EmissionFactorsVersion = Iso14083EmissionFactorsVersion.INITIAL;

  public EmissionOptions() { 
  }

  public EmissionOptions calculationMethods(String calculationMethods) {
    this.calculationMethods = calculationMethods;
    return this;
  }

  /**
   * Comma-separated list of the calculation method to be returned.  Available values are provided by type &#x60;EmissionCalculationMethod&#x60;:  * &#x60;EN16258_2012&#x60;     Emissions according to EN16258 from 2012 (a.k.a. CEN).  * &#x60;ISO14083_2023&#x60;     Emissions according to ISO 14083:2023 (a.k.a. ISO).      Only supported for [European and American profiles](../data-api/concepts/profiles).     If **defaultConsumption** is true, only supported for [European profiles](../data-api/concepts/profiles).  * &#x60;FRENCH_CO2E_DECREE_2017_639&#x60;     Emissions according to the French CO2E decree from 2017.
   * @return calculationMethods
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CALCULATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCalculationMethods() {
    return calculationMethods;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATION_METHODS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCalculationMethods(String calculationMethods) {
    this.calculationMethods = calculationMethods;
  }


  public EmissionOptions defaultConsumption(Boolean defaultConsumption) {
    this.defaultConsumption = defaultConsumption;
    return this;
  }

  /**
   * If true, the fuel or electricity consumption is automatically calculated through HBEFA 4.2.  Otherwise, the **averageFuelConsumption** or **averageElectricityConsumption** specified calculating the route represented by **routeId** will be considered. Will be ignored for calculation method _FRENCH_CO2E_DECREE_2017_639_.
   * @return defaultConsumption
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDefaultConsumption() {
    return defaultConsumption;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultConsumption(Boolean defaultConsumption) {
    this.defaultConsumption = defaultConsumption;
  }


  public EmissionOptions iso14083EmissionFactorsVersion(Iso14083EmissionFactorsVersion iso14083EmissionFactorsVersion) {
    this.iso14083EmissionFactorsVersion = iso14083EmissionFactorsVersion;
    return this;
  }

  /**
   * Get iso14083EmissionFactorsVersion
   * @return iso14083EmissionFactorsVersion
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ISO14083_EMISSION_FACTORS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Iso14083EmissionFactorsVersion getIso14083EmissionFactorsVersion() {
    return iso14083EmissionFactorsVersion;
  }


  @JsonProperty(JSON_PROPERTY_ISO14083_EMISSION_FACTORS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIso14083EmissionFactorsVersion(Iso14083EmissionFactorsVersion iso14083EmissionFactorsVersion) {
    this.iso14083EmissionFactorsVersion = iso14083EmissionFactorsVersion;
  }


  /**
   * Return true if this EmissionOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmissionOptions emissionOptions = (EmissionOptions) o;
    return Objects.equals(this.calculationMethods, emissionOptions.calculationMethods) &&
        Objects.equals(this.defaultConsumption, emissionOptions.defaultConsumption) &&
        Objects.equals(this.iso14083EmissionFactorsVersion, emissionOptions.iso14083EmissionFactorsVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculationMethods, defaultConsumption, iso14083EmissionFactorsVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissionOptions {\n");
    sb.append("    calculationMethods: ").append(toIndentedString(calculationMethods)).append("\n");
    sb.append("    defaultConsumption: ").append(toIndentedString(defaultConsumption)).append("\n");
    sb.append("    iso14083EmissionFactorsVersion: ").append(toIndentedString(iso14083EmissionFactorsVersion)).append("\n");
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

    // add `calculationMethods` to the URL query string
    if (getCalculationMethods() != null) {
      joiner.add(String.format("%scalculationMethods%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCalculationMethods()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `defaultConsumption` to the URL query string
    if (getDefaultConsumption() != null) {
      joiner.add(String.format("%sdefaultConsumption%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDefaultConsumption()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `iso14083EmissionFactorsVersion` to the URL query string
    if (getIso14083EmissionFactorsVersion() != null) {
      joiner.add(String.format("%siso14083EmissionFactorsVersion%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIso14083EmissionFactorsVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

