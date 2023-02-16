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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.CalculationStatus;
import com.ptvgroup.developer.client.routing.model.ErrorResponse;
import com.ptvgroup.developer.client.routing.model.ReachableLocations;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ReachableLocationsResponse
 */
@JsonPropertyOrder({
  ReachableLocationsResponse.JSON_PROPERTY_STATUS,
  ReachableLocationsResponse.JSON_PROPERTY_REACHABLE_LOCATIONS,
  ReachableLocationsResponse.JSON_PROPERTY_ERROR
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-16T08:31:15.017608Z[Etc/UTC]")
public class ReachableLocationsResponse {
  public static final String JSON_PROPERTY_STATUS = "status";
  private CalculationStatus status;

  public static final String JSON_PROPERTY_REACHABLE_LOCATIONS = "reachableLocations";
  private ReachableLocations reachableLocations;

  public static final String JSON_PROPERTY_ERROR = "error";
  private ErrorResponse error;

  public ReachableLocationsResponse() { 
  }

  public ReachableLocationsResponse status(CalculationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CalculationStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(CalculationStatus status) {
    this.status = status;
  }


  public ReachableLocationsResponse reachableLocations(ReachableLocations reachableLocations) {
    this.reachableLocations = reachableLocations;
    return this;
  }

   /**
   * Get reachableLocations
   * @return reachableLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REACHABLE_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReachableLocations getReachableLocations() {
    return reachableLocations;
  }


  @JsonProperty(JSON_PROPERTY_REACHABLE_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReachableLocations(ReachableLocations reachableLocations) {
    this.reachableLocations = reachableLocations;
  }


  public ReachableLocationsResponse error(ErrorResponse error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ErrorResponse getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(ErrorResponse error) {
    this.error = error;
  }


  /**
   * Return true if this ReachableLocationsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReachableLocationsResponse reachableLocationsResponse = (ReachableLocationsResponse) o;
    return Objects.equals(this.status, reachableLocationsResponse.status) &&
        Objects.equals(this.reachableLocations, reachableLocationsResponse.reachableLocations) &&
        Objects.equals(this.error, reachableLocationsResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reachableLocations, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReachableLocationsResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reachableLocations: ").append(toIndentedString(reachableLocations)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

