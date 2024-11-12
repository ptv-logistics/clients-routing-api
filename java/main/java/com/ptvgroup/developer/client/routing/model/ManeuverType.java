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
 * Describes the type of maneuver to execute.     * &#x60;START&#x60; - Departure at an on-road waypoint.     * &#x60;START_LEFT&#x60; - Departure at an off-road waypoint to begin the route heading left.     * &#x60;START_RIGHT&#x60; - Departure at an off-road waypoint to begin the route heading right.     * &#x60;ARRIVE&#x60; - Arrival at an on-road waypoint.     * &#x60;ARRIVE_LEFT&#x60; - Arrival at an off-road waypoint if the waypoint is on the left.     * &#x60;ARRIVE_RIGHT&#x60; - Arrival at an off-road waypoint if the waypoint is on the right.     * &#x60;CONTINUE&#x60; - Follow the current road, usually when the road type changes although the road goes straight.     * &#x60;KEEP_STRAIGHT&#x60; - Stay on the straight lane, usually in fork-shaped intersections with more than two spikes.     * &#x60;KEEP_LEFT&#x60; - Keep left or to take the left lane, usually in Y-shaped intersections.     * &#x60;KEEP_RIGHT&#x60; - Keep right or to take the right lane, usually  in Y-shaped intersections.     * &#x60;TURN_HALF_LEFT&#x60; - Turn half left at a crossing where at least one additional trailing road exists,  usually at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_LEFT&#x60; - Turn left at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_SHARP_LEFT&#x60; - Turn sharp left at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_HALF_RIGHT&#x60; - Turn half right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_RIGHT&#x60; - Turn right at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;TURN_SHARP_RIGHT&#x60; - Turn sharp right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * &#x60;MAKE_U_TURN&#x60; - Make a U-turn, either at the same road or at structurally separated roads. The **relativeDirection**   indicates whether to turn left or right.     * &#x60;TAKE_ROUNDABOUT_LEFT&#x60; - Enter a roundabout to the left and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * &#x60;TAKE_ROUNDABOUT_RIGHT&#x60; - Enter a roundabout to the right and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * &#x60;TAKE_COMBINED_TRANSPORT&#x60; - Take boat (ferry) or rail (train or rail shuttle) connection.  * &#x60;ENTER&#x60; - Enter a highway/freeway/major road straight.     * &#x60;ENTER_LEFT&#x60; - Enter a highway/freeway/major road to the left.     * &#x60;ENTER_RIGHT&#x60; - Enter a highway/freeway/major road to the right.     * &#x60;EXIT&#x60; - Leave a highway/freeway/major road straight.     * &#x60;EXIT_LEFT&#x60; - Leave a highway/freeway/major road to the left.     * &#x60;EXIT_RIGHT&#x60; - Leave a highway/freeway/major road to the right.     * &#x60;CHANGE&#x60; - Change straight to another highway/freeway at an interchange.     * &#x60;CHANGE_LEFT&#x60; - Change to the left to another highway/freeway at an interchange.     * &#x60;CHANGE_RIGHT&#x60; - Change to the right to another highway/freeway at an interchange.
 */
public enum ManeuverType {
  
  START("START"),
  
  START_LEFT("START_LEFT"),
  
  START_RIGHT("START_RIGHT"),
  
  ARRIVE("ARRIVE"),
  
  ARRIVE_LEFT("ARRIVE_LEFT"),
  
  ARRIVE_RIGHT("ARRIVE_RIGHT"),
  
  CONTINUE("CONTINUE"),
  
  KEEP_STRAIGHT("KEEP_STRAIGHT"),
  
  KEEP_LEFT("KEEP_LEFT"),
  
  KEEP_RIGHT("KEEP_RIGHT"),
  
  TURN_HALF_LEFT("TURN_HALF_LEFT"),
  
  TURN_LEFT("TURN_LEFT"),
  
  TURN_SHARP_LEFT("TURN_SHARP_LEFT"),
  
  TURN_HALF_RIGHT("TURN_HALF_RIGHT"),
  
  TURN_RIGHT("TURN_RIGHT"),
  
  TURN_SHARP_RIGHT("TURN_SHARP_RIGHT"),
  
  MAKE_U_TURN("MAKE_U_TURN"),
  
  TAKE_ROUNDABOUT_LEFT("TAKE_ROUNDABOUT_LEFT"),
  
  TAKE_ROUNDABOUT_RIGHT("TAKE_ROUNDABOUT_RIGHT"),
  
  TAKE_COMBINED_TRANSPORT("TAKE_COMBINED_TRANSPORT"),
  
  ENTER("ENTER"),
  
  ENTER_LEFT("ENTER_LEFT"),
  
  ENTER_RIGHT("ENTER_RIGHT"),
  
  EXIT("EXIT"),
  
  EXIT_LEFT("EXIT_LEFT"),
  
  EXIT_RIGHT("EXIT_RIGHT"),
  
  CHANGE("CHANGE"),
  
  CHANGE_LEFT("CHANGE_LEFT"),
  
  CHANGE_RIGHT("CHANGE_RIGHT");

  private String value;

  ManeuverType(String value) {
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
  public static ManeuverType fromValue(String value) {
    for (ManeuverType b : ManeuverType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

