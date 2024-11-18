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
import com.ptvgroup.developer.client.routing.model.HazardousMaterials;
import com.ptvgroup.developer.client.routing.model.TruckRoutes;
import com.ptvgroup.developer.client.routing.model.TunnelRestrictionCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * The vehicle parameters that change at a waypoint. A vehicle parameter specified at a waypoint overrides the setting from the **profile** and **vehicle**. It is valid until the end of the route unless it is changed again at a subsequent waypoint. 
 */
@JsonPropertyOrder({
  VehicleParametersAtWaypoint.JSON_PROPERTY_AVERAGE_FUEL_CONSUMPTION,
  VehicleParametersAtWaypoint.JSON_PROPERTY_AVERAGE_ELECTRICITY_CONSUMPTION,
  VehicleParametersAtWaypoint.JSON_PROPERTY_LOAD_WEIGHT,
  VehicleParametersAtWaypoint.JSON_PROPERTY_AXLE_WEIGHT,
  VehicleParametersAtWaypoint.JSON_PROPERTY_HEIGHT,
  VehicleParametersAtWaypoint.JSON_PROPERTY_LENGTH,
  VehicleParametersAtWaypoint.JSON_PROPERTY_WIDTH,
  VehicleParametersAtWaypoint.JSON_PROPERTY_HAZARDOUS_MATERIALS,
  VehicleParametersAtWaypoint.JSON_PROPERTY_TUNNEL_RESTRICTION_CODE,
  VehicleParametersAtWaypoint.JSON_PROPERTY_TRUCK_ROUTES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T13:35:23.497749140Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class VehicleParametersAtWaypoint {
  public static final String JSON_PROPERTY_AVERAGE_FUEL_CONSUMPTION = "averageFuelConsumption";
  private Double averageFuelConsumption;

  public static final String JSON_PROPERTY_AVERAGE_ELECTRICITY_CONSUMPTION = "averageElectricityConsumption";
  private Double averageElectricityConsumption;

  public static final String JSON_PROPERTY_LOAD_WEIGHT = "loadWeight";
  private Integer loadWeight;

  public static final String JSON_PROPERTY_AXLE_WEIGHT = "axleWeight";
  private Integer axleWeight;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_LENGTH = "length";
  private Integer length;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HAZARDOUS_MATERIALS = "hazardousMaterials";
  private List<HazardousMaterials> hazardousMaterials = new ArrayList<>();

  public static final String JSON_PROPERTY_TUNNEL_RESTRICTION_CODE = "tunnelRestrictionCode";
  private TunnelRestrictionCode tunnelRestrictionCode;

  public static final String JSON_PROPERTY_TRUCK_ROUTES = "truckRoutes";
  private List<TruckRoutes> truckRoutes = new ArrayList<>();

  public VehicleParametersAtWaypoint() { 
  }

  public VehicleParametersAtWaypoint averageFuelConsumption(Double averageFuelConsumption) {
    this.averageFuelConsumption = averageFuelConsumption;
    return this;
  }

  /**
   * The average fuel consumption of the vehicle. Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.  Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for &#x60;emissions&#x60;. 
   * minimum: 0
   * @return averageFuelConsumption
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_FUEL_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAverageFuelConsumption() {
    return averageFuelConsumption;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_FUEL_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageFuelConsumption(Double averageFuelConsumption) {
    this.averageFuelConsumption = averageFuelConsumption;
  }


  public VehicleParametersAtWaypoint averageElectricityConsumption(Double averageElectricityConsumption) {
    this.averageElectricityConsumption = averageElectricityConsumption;
    return this;
  }

  /**
   * The average electricity consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh/100km].  This field is not used, if a model of an electric vehicle is used. In this case the average electricity  consumption from the model based consumption calculation is used for the emissions calculation.  Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for &#x60;emissions&#x60;. 
   * minimum: 0
   * @return averageElectricityConsumption
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVERAGE_ELECTRICITY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getAverageElectricityConsumption() {
    return averageElectricityConsumption;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_ELECTRICITY_CONSUMPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAverageElectricityConsumption(Double averageElectricityConsumption) {
    this.averageElectricityConsumption = averageElectricityConsumption;
  }


  public VehicleParametersAtWaypoint loadWeight(Integer loadWeight) {
    this.loadWeight = loadWeight;
    return this;
  }

  /**
   * The weight of the vehicle&#39;s load [kg].  Relevant for &#x60;routing&#x60;, &#x60;emissions&#x60;, &#x60;range calculation&#x60;. 
   * minimum: 0
   * @return loadWeight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOAD_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLoadWeight() {
    return loadWeight;
  }


  @JsonProperty(JSON_PROPERTY_LOAD_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoadWeight(Integer loadWeight) {
    this.loadWeight = loadWeight;
  }


  public VehicleParametersAtWaypoint axleWeight(Integer axleWeight) {
    this.axleWeight = axleWeight;
    return this;
  }

  /**
   * The maximum distributed weight that may be supported by an axle of the vehicle [kg].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
   * minimum: 1
   * @return axleWeight
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AXLE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getAxleWeight() {
    return axleWeight;
  }


  @JsonProperty(JSON_PROPERTY_AXLE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAxleWeight(Integer axleWeight) {
    this.axleWeight = axleWeight;
  }


  public VehicleParametersAtWaypoint height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The height of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
   * minimum: 1
   * @return height
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public VehicleParametersAtWaypoint length(Integer length) {
    this.length = length;
    return this;
  }

  /**
   * The length of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
   * minimum: 1
   * @return length
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getLength() {
    return length;
  }


  @JsonProperty(JSON_PROPERTY_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLength(Integer length) {
    this.length = length;
  }


  public VehicleParametersAtWaypoint width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * The width of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
   * minimum: 1
   * @return width
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public VehicleParametersAtWaypoint hazardousMaterials(List<HazardousMaterials> hazardousMaterials) {
    this.hazardousMaterials = hazardousMaterials;
    return this;
  }

  public VehicleParametersAtWaypoint addHazardousMaterialsItem(HazardousMaterials hazardousMaterialsItem) {
    if (this.hazardousMaterials == null) {
      this.hazardousMaterials = new ArrayList<>();
    }
    this.hazardousMaterials.add(hazardousMaterialsItem);
    return this;
  }

  /**
   * The list of hazardous materials the vehicle has loaded. Use a list with only the _NONE_ value to specify that no hazardous material is loaded from that waypoint on. An empty list means that the hazardous materials don&#39;t change at the waypoint. If _NONE_ is specified along with other hazardous materials it is ignored.  Relevant for &#x60;routing&#x60;. 
   * @return hazardousMaterials
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAZARDOUS_MATERIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HazardousMaterials> getHazardousMaterials() {
    return hazardousMaterials;
  }


  @JsonProperty(JSON_PROPERTY_HAZARDOUS_MATERIALS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHazardousMaterials(List<HazardousMaterials> hazardousMaterials) {
    this.hazardousMaterials = hazardousMaterials;
  }


  public VehicleParametersAtWaypoint tunnelRestrictionCode(TunnelRestrictionCode tunnelRestrictionCode) {
    this.tunnelRestrictionCode = tunnelRestrictionCode;
    return this;
  }

  /**
   * Get tunnelRestrictionCode
   * @return tunnelRestrictionCode
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TUNNEL_RESTRICTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TunnelRestrictionCode getTunnelRestrictionCode() {
    return tunnelRestrictionCode;
  }


  @JsonProperty(JSON_PROPERTY_TUNNEL_RESTRICTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTunnelRestrictionCode(TunnelRestrictionCode tunnelRestrictionCode) {
    this.tunnelRestrictionCode = tunnelRestrictionCode;
  }


  public VehicleParametersAtWaypoint truckRoutes(List<TruckRoutes> truckRoutes) {
    this.truckRoutes = truckRoutes;
    return this;
  }

  public VehicleParametersAtWaypoint addTruckRoutesItem(TruckRoutes truckRoutesItem) {
    if (this.truckRoutes == null) {
      this.truckRoutes = new ArrayList<>();
    }
    this.truckRoutes.add(truckRoutesItem);
    return this;
  }

  /**
   * The list of truck routes the vehicle has to follow. This parameter will be ignored for non-truck profiles such as EUR_CAR, EUR_VAN, USA_1_PICKUP or AUS_LCV_LIGHT_COMMERCIAL.  * &#x60;DE_LKWUEBERLSTVAUSNV&#x60;  Preferred routes for long trucks in Germany, also known as Lang-LKW.  * &#x60;NL_LZV&#x60;  Preferred routes for long trucks in the Netherlands, also known as LZV (Langere en Zwaardere Vrachtautocombinatie).  * &#x60;NZ_HPMV&#x60;  The network for High Productivity Motor Vehicles (HPMV) carrying the maximum loads available under a permit (New Zealand Transport Agency).  * &#x60;SE_BK_1&#x60;  Public roads and bridges that support up to 64 t total permitted weight (Swedish Transport Administration).  * &#x60;SE_BK_2&#x60;  Public roads and bridges that support up to 51.4 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_3&#x60;  Public roads and bridges that support up to 37.5 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_4&#x60;  Public roads and bridges that support up to 74 t total permitted weight (draft summer 2018, Swedish Transport Administration).  * &#x60;US_STAA&#x60;  Routes that belong to the highway network as defined by the Surface Transportation Assistance Act in the US.  * &#x60;US_TD&#x60;  Part of a state-designated highway network for trucks in the US.  * &#x60;AU_B_DOUBLE&#x60;  B-Double routes as defined in Australia.  * &#x60;AU_B_DOUBLE_HML&#x60;  Routes for B-Double vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_B_TRIPLE&#x60;  B-Triple routes as defined in Australia.  * &#x60;AU_B_TRIPLE_HML&#x60;  Routes for B-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE&#x60;  Routes for AB-Triple vehicle combinations operating (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE_HML&#x60;  Routes for AB-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;NONE&#x60;  Use a list with only the _NONE_ value for the truck routes  at a waypoint to specify that no truck route must be used from that waypoint on. An empty list of truck routes  at a waypoint means that the truck routes don&#39;t change at the waypoint. If _NONE_ is specified along with other  truck routes it is ignored.  Relevant for &#x60;routing&#x60;. Cannot be used with **options[routingMode]&#x3D;MONETARY**. 
   * @return truckRoutes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRUCK_ROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TruckRoutes> getTruckRoutes() {
    return truckRoutes;
  }


  @JsonProperty(JSON_PROPERTY_TRUCK_ROUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTruckRoutes(List<TruckRoutes> truckRoutes) {
    this.truckRoutes = truckRoutes;
  }


  /**
   * Return true if this VehicleParametersAtWaypoint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VehicleParametersAtWaypoint vehicleParametersAtWaypoint = (VehicleParametersAtWaypoint) o;
    return Objects.equals(this.averageFuelConsumption, vehicleParametersAtWaypoint.averageFuelConsumption) &&
        Objects.equals(this.averageElectricityConsumption, vehicleParametersAtWaypoint.averageElectricityConsumption) &&
        Objects.equals(this.loadWeight, vehicleParametersAtWaypoint.loadWeight) &&
        Objects.equals(this.axleWeight, vehicleParametersAtWaypoint.axleWeight) &&
        Objects.equals(this.height, vehicleParametersAtWaypoint.height) &&
        Objects.equals(this.length, vehicleParametersAtWaypoint.length) &&
        Objects.equals(this.width, vehicleParametersAtWaypoint.width) &&
        Objects.equals(this.hazardousMaterials, vehicleParametersAtWaypoint.hazardousMaterials) &&
        Objects.equals(this.tunnelRestrictionCode, vehicleParametersAtWaypoint.tunnelRestrictionCode) &&
        Objects.equals(this.truckRoutes, vehicleParametersAtWaypoint.truckRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageFuelConsumption, averageElectricityConsumption, loadWeight, axleWeight, height, length, width, hazardousMaterials, tunnelRestrictionCode, truckRoutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VehicleParametersAtWaypoint {\n");
    sb.append("    averageFuelConsumption: ").append(toIndentedString(averageFuelConsumption)).append("\n");
    sb.append("    averageElectricityConsumption: ").append(toIndentedString(averageElectricityConsumption)).append("\n");
    sb.append("    loadWeight: ").append(toIndentedString(loadWeight)).append("\n");
    sb.append("    axleWeight: ").append(toIndentedString(axleWeight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    hazardousMaterials: ").append(toIndentedString(hazardousMaterials)).append("\n");
    sb.append("    tunnelRestrictionCode: ").append(toIndentedString(tunnelRestrictionCode)).append("\n");
    sb.append("    truckRoutes: ").append(toIndentedString(truckRoutes)).append("\n");
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

    // add `averageFuelConsumption` to the URL query string
    if (getAverageFuelConsumption() != null) {
      joiner.add(String.format("%saverageFuelConsumption%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAverageFuelConsumption()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `averageElectricityConsumption` to the URL query string
    if (getAverageElectricityConsumption() != null) {
      joiner.add(String.format("%saverageElectricityConsumption%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAverageElectricityConsumption()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `loadWeight` to the URL query string
    if (getLoadWeight() != null) {
      joiner.add(String.format("%sloadWeight%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLoadWeight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `axleWeight` to the URL query string
    if (getAxleWeight() != null) {
      joiner.add(String.format("%saxleWeight%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAxleWeight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `height` to the URL query string
    if (getHeight() != null) {
      joiner.add(String.format("%sheight%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHeight()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `length` to the URL query string
    if (getLength() != null) {
      joiner.add(String.format("%slength%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLength()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `width` to the URL query string
    if (getWidth() != null) {
      joiner.add(String.format("%swidth%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getWidth()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `hazardousMaterials` to the URL query string
    if (getHazardousMaterials() != null) {
      for (int i = 0; i < getHazardousMaterials().size(); i++) {
        if (getHazardousMaterials().get(i) != null) {
          joiner.add(String.format("%shazardousMaterials%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getHazardousMaterials().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `tunnelRestrictionCode` to the URL query string
    if (getTunnelRestrictionCode() != null) {
      joiner.add(String.format("%stunnelRestrictionCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTunnelRestrictionCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `truckRoutes` to the URL query string
    if (getTruckRoutes() != null) {
      for (int i = 0; i < getTruckRoutes().size(); i++) {
        if (getTruckRoutes().get(i) != null) {
          joiner.add(String.format("%struckRoutes%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getTruckRoutes().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    return joiner.toString();
  }
}

