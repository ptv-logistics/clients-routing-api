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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.CombinedTransportType;
import com.ptvgroup.developer.client.routing.model.ManeuverType;
import com.ptvgroup.developer.client.routing.model.RoadAhead;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Issued when the driver has to perform a maneuver, e.g. to turn or to enter a roundabout. Requires _MANEUVER_EVENTS_ to be requested.
 */
@ApiModel(description = "Issued when the driver has to perform a maneuver, e.g. to turn or to enter a roundabout. Requires _MANEUVER_EVENTS_ to be requested.")
@JsonPropertyOrder({
  ManeuverEvent.JSON_PROPERTY_TYPE,
  ManeuverEvent.JSON_PROPERTY_RELATIVE_DIRECTION,
  ManeuverEvent.JSON_PROPERTY_ABSOLUTE_DIRECTION,
  ManeuverEvent.JSON_PROPERTY_DESCRIPTION,
  ManeuverEvent.JSON_PROPERTY_ROAD_AHEAD,
  ManeuverEvent.JSON_PROPERTY_DIRECTION_SIGN_TEXT,
  ManeuverEvent.JSON_PROPERTY_EXIT_NUMBER,
  ManeuverEvent.JSON_PROPERTY_EXIT_NAME,
  ManeuverEvent.JSON_PROPERTY_ROUNDABOUT_EXIT,
  ManeuverEvent.JSON_PROPERTY_COMBINED_TRANSPORT_NAME,
  ManeuverEvent.JSON_PROPERTY_COMBINED_TRANSPORT_TYPE,
  ManeuverEvent.JSON_PROPERTY_CROSSING_ROAD_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-16T16:11:36.609539Z[Etc/UTC]")
public class ManeuverEvent {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ManeuverType type;

  public static final String JSON_PROPERTY_RELATIVE_DIRECTION = "relativeDirection";
  private Integer relativeDirection;

  public static final String JSON_PROPERTY_ABSOLUTE_DIRECTION = "absoluteDirection";
  private Integer absoluteDirection;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ROAD_AHEAD = "roadAhead";
  private RoadAhead roadAhead;

  public static final String JSON_PROPERTY_DIRECTION_SIGN_TEXT = "directionSignText";
  private String directionSignText;

  public static final String JSON_PROPERTY_EXIT_NUMBER = "exitNumber";
  private String exitNumber;

  public static final String JSON_PROPERTY_EXIT_NAME = "exitName";
  private String exitName;

  public static final String JSON_PROPERTY_ROUNDABOUT_EXIT = "roundaboutExit";
  private Integer roundaboutExit;

  public static final String JSON_PROPERTY_COMBINED_TRANSPORT_NAME = "combinedTransportName";
  private String combinedTransportName;

  public static final String JSON_PROPERTY_COMBINED_TRANSPORT_TYPE = "combinedTransportType";
  private CombinedTransportType combinedTransportType;

  public static final String JSON_PROPERTY_CROSSING_ROAD_NAME = "crossingRoadName";
  private String crossingRoadName;

  public ManeuverEvent() { 
  }

  public ManeuverEvent type(ManeuverType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ManeuverType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(ManeuverType type) {
    this.type = type;
  }


  public ManeuverEvent relativeDirection(Integer relativeDirection) {
    this.relativeDirection = relativeDirection;
    return this;
  }

   /**
   * The direction of the outgoing road relative to continuing in the same direction as the incoming road (clockwise).
   * minimum: -180
   * maximum: 180
   * @return relativeDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The direction of the outgoing road relative to continuing in the same direction as the incoming road (clockwise).")
  @JsonProperty(JSON_PROPERTY_RELATIVE_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelativeDirection() {
    return relativeDirection;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeDirection(Integer relativeDirection) {
    this.relativeDirection = relativeDirection;
  }


  public ManeuverEvent absoluteDirection(Integer absoluteDirection) {
    this.absoluteDirection = absoluteDirection;
    return this;
  }

   /**
   * The absolute direction of the outgoing road (clockwise). North represents 0 degrees.
   * minimum: 0
   * maximum: 360
   * @return absoluteDirection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The absolute direction of the outgoing road (clockwise). North represents 0 degrees.")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAbsoluteDirection() {
    return absoluteDirection;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsoluteDirection(Integer absoluteDirection) {
    this.absoluteDirection = absoluteDirection;
  }


  public ManeuverEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A descriptive text for the current maneuver. The language can be specified by the parameter **options[language]**. A warning with **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ and the actual language is returned when the requested language is not available. Geographical names such as town and road names are always given in the local language.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A descriptive text for the current maneuver. The language can be specified by the parameter **options[language]**. A warning with **warningCode** _ROUTING_MANEUVERS_IN_DIFFERENT_LANGUAGE_ and the actual language is returned when the requested language is not available. Geographical names such as town and road names are always given in the local language.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public ManeuverEvent roadAhead(RoadAhead roadAhead) {
    this.roadAhead = roadAhead;
    return this;
  }

   /**
   * Get roadAhead
   * @return roadAhead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROAD_AHEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoadAhead getRoadAhead() {
    return roadAhead;
  }


  @JsonProperty(JSON_PROPERTY_ROAD_AHEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoadAhead(RoadAhead roadAhead) {
    this.roadAhead = roadAhead;
  }


  public ManeuverEvent directionSignText(String directionSignText) {
    this.directionSignText = directionSignText;
    return this;
  }

   /**
   * The city names and road numbers on a signpost at the current location to follow for the current maneuver. Empty if no signpost is present or the data is not available.
   * @return directionSignText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The city names and road numbers on a signpost at the current location to follow for the current maneuver. Empty if no signpost is present or the data is not available.")
  @JsonProperty(JSON_PROPERTY_DIRECTION_SIGN_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDirectionSignText() {
    return directionSignText;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION_SIGN_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirectionSignText(String directionSignText) {
    this.directionSignText = directionSignText;
  }


  public ManeuverEvent exitNumber(String exitNumber) {
    this.exitNumber = exitNumber;
    return this;
  }

   /**
   * The number of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit number.
   * @return exitNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit number.")
  @JsonProperty(JSON_PROPERTY_EXIT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExitNumber() {
    return exitNumber;
  }


  @JsonProperty(JSON_PROPERTY_EXIT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExitNumber(String exitNumber) {
    this.exitNumber = exitNumber;
  }


  public ManeuverEvent exitName(String exitName) {
    this.exitName = exitName;
    return this;
  }

   /**
   * The name of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit name.
   * @return exitName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of an exit or interchange of a highway or a freeway-like road. Only present if the maneuver type is _CHANGE_ or _EXIT_. Empty if the data does not contain an exit name.")
  @JsonProperty(JSON_PROPERTY_EXIT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExitName() {
    return exitName;
  }


  @JsonProperty(JSON_PROPERTY_EXIT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExitName(String exitName) {
    this.exitName = exitName;
  }


  public ManeuverEvent roundaboutExit(Integer roundaboutExit) {
    this.roundaboutExit = roundaboutExit;
    return this;
  }

   /**
   * The exit number at a roundabout. Only drivable roads are counted. Only present if the maneuver type is _TAKE\\_ROUNDABOUT_.
   * minimum: 0
   * @return roundaboutExit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The exit number at a roundabout. Only drivable roads are counted. Only present if the maneuver type is _TAKE\\_ROUNDABOUT_.")
  @JsonProperty(JSON_PROPERTY_ROUNDABOUT_EXIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRoundaboutExit() {
    return roundaboutExit;
  }


  @JsonProperty(JSON_PROPERTY_ROUNDABOUT_EXIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoundaboutExit(Integer roundaboutExit) {
    this.roundaboutExit = roundaboutExit;
  }


  public ManeuverEvent combinedTransportName(String combinedTransportName) {
    this.combinedTransportName = combinedTransportName;
    return this;
  }

   /**
   * The name of the combined transport to take a the current location. Only present if the maneuver type is _TAKE\\_COMBINED\\_TRANSPORT_.
   * @return combinedTransportName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the combined transport to take a the current location. Only present if the maneuver type is _TAKE\\_COMBINED\\_TRANSPORT_.")
  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCombinedTransportName() {
    return combinedTransportName;
  }


  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinedTransportName(String combinedTransportName) {
    this.combinedTransportName = combinedTransportName;
  }


  public ManeuverEvent combinedTransportType(CombinedTransportType combinedTransportType) {
    this.combinedTransportType = combinedTransportType;
    return this;
  }

   /**
   * Get combinedTransportType
   * @return combinedTransportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CombinedTransportType getCombinedTransportType() {
    return combinedTransportType;
  }


  @JsonProperty(JSON_PROPERTY_COMBINED_TRANSPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCombinedTransportType(CombinedTransportType combinedTransportType) {
    this.combinedTransportType = combinedTransportType;
  }


  public ManeuverEvent crossingRoadName(String crossingRoadName) {
    this.crossingRoadName = crossingRoadName;
    return this;
  }

   /**
   * The name of the crossing road at which a U-turn has to be made. Only present if the maneuver type is _MAKE\\_U\\_TURN_ and if the U-turn takes place at a crossing.
   * @return crossingRoadName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the crossing road at which a U-turn has to be made. Only present if the maneuver type is _MAKE\\_U\\_TURN_ and if the U-turn takes place at a crossing.")
  @JsonProperty(JSON_PROPERTY_CROSSING_ROAD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCrossingRoadName() {
    return crossingRoadName;
  }


  @JsonProperty(JSON_PROPERTY_CROSSING_ROAD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCrossingRoadName(String crossingRoadName) {
    this.crossingRoadName = crossingRoadName;
  }


  /**
   * Return true if this ManeuverEvent object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManeuverEvent maneuverEvent = (ManeuverEvent) o;
    return Objects.equals(this.type, maneuverEvent.type) &&
        Objects.equals(this.relativeDirection, maneuverEvent.relativeDirection) &&
        Objects.equals(this.absoluteDirection, maneuverEvent.absoluteDirection) &&
        Objects.equals(this.description, maneuverEvent.description) &&
        Objects.equals(this.roadAhead, maneuverEvent.roadAhead) &&
        Objects.equals(this.directionSignText, maneuverEvent.directionSignText) &&
        Objects.equals(this.exitNumber, maneuverEvent.exitNumber) &&
        Objects.equals(this.exitName, maneuverEvent.exitName) &&
        Objects.equals(this.roundaboutExit, maneuverEvent.roundaboutExit) &&
        Objects.equals(this.combinedTransportName, maneuverEvent.combinedTransportName) &&
        Objects.equals(this.combinedTransportType, maneuverEvent.combinedTransportType) &&
        Objects.equals(this.crossingRoadName, maneuverEvent.crossingRoadName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, relativeDirection, absoluteDirection, description, roadAhead, directionSignText, exitNumber, exitName, roundaboutExit, combinedTransportName, combinedTransportType, crossingRoadName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManeuverEvent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    relativeDirection: ").append(toIndentedString(relativeDirection)).append("\n");
    sb.append("    absoluteDirection: ").append(toIndentedString(absoluteDirection)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    roadAhead: ").append(toIndentedString(roadAhead)).append("\n");
    sb.append("    directionSignText: ").append(toIndentedString(directionSignText)).append("\n");
    sb.append("    exitNumber: ").append(toIndentedString(exitNumber)).append("\n");
    sb.append("    exitName: ").append(toIndentedString(exitName)).append("\n");
    sb.append("    roundaboutExit: ").append(toIndentedString(roundaboutExit)).append("\n");
    sb.append("    combinedTransportName: ").append(toIndentedString(combinedTransportName)).append("\n");
    sb.append("    combinedTransportType: ").append(toIndentedString(combinedTransportType)).append("\n");
    sb.append("    crossingRoadName: ").append(toIndentedString(crossingRoadName)).append("\n");
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

