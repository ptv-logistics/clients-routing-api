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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EtcSubscriptionTypes
 */
public enum EtcSubscriptionTypes {
  
  AT_GOBOX("AT_GOBOX"),
  
  BE_TELETOL("BE_TELETOL"),
  
  BE_VIAPASS("BE_VIAPASS"),
  
  CH_LSVA("CH_LSVA"),
  
  DE_QUICKBOX("DE_QUICKBOX"),
  
  DE_TOLLCOLLECT("DE_TOLLCOLLECT"),
  
  DE_WARNOWTUNNEL_RFID("DE_WARNOWTUNNEL_RFID"),
  
  DK_BROPAS_BUSINESS("DK_BROPAS_BUSINESS"),
  
  IT_TELEPASS("IT_TELEPASS"),
  
  NL_TELECARD("NL_TELECARD"),
  
  NL_TTAG("NL_TTAG"),
  
  NO_AUTOPASS("NO_AUTOPASS"),
  
  PT_VIA_VERDE("PT_VIA_VERDE"),
  
  US_APASS("US_APASS"),
  
  US_BREEZEBY("US_BREEZEBY"),
  
  US_DOWNBEACH_EXPRESSPASS("US_DOWNBEACH_EXPRESSPASS"),
  
  US_EPASS("US_EPASS"),
  
  US_EXPRESSACCOUNT("US_EXPRESSACCOUNT"),
  
  US_EXPRESSCARD("US_EXPRESSCARD"),
  
  US_EXPRESSPASS("US_EXPRESSPASS"),
  
  US_EXPRESSTOLL("US_EXPRESSTOLL"),
  
  US_EZPASS("US_EZPASS"),
  
  US_EZTAG("US_EZTAG"),
  
  US_FASTRAK("US_FASTRAK"),
  
  US_GEAUXPASS("US_GEAUXPASS"),
  
  US_GOODTOGO("US_GOODTOGO"),
  
  US_GOPASS("US_GOPASS"),
  
  US_IPASS("US_IPASS"),
  
  US_KTAG("US_KTAG"),
  
  US_LEEWAY("US_LEEWAY"),
  
  US_MACKINACBRIDGE_MACPASS("US_MACKINACBRIDGE_MACPASS"),
  
  US_MARYLAND_EZPASS("US_MARYLAND_EZPASS"),
  
  US_MASSACHUSETTS_EZPASS("US_MASSACHUSETTS_EZPASS"),
  
  US_NC_QUICKPASS("US_NC_QUICKPASS"),
  
  US_NEWHAMPSHIRE_EZPASS("US_NEWHAMPSHIRE_EZPASS"),
  
  US_NEWJERSEY_EZPASS("US_NEWJERSEY_EZPASS"),
  
  US_NEWYORK_EZPASS("US_NEWYORK_EZPASS"),
  
  US_NEXPRESS("US_NEXPRESS"),
  
  US_OHIO_EZPASS("US_OHIO_EZPASS"),
  
  US_PALPASS("US_PALPASS"),
  
  US_PIKEPASS("US_PIKEPASS"),
  
  US_RIVERLINK("US_RIVERLINK"),
  
  US_RIVERLINK_NOTRANSPONDER("US_RIVERLINK_NOTRANSPONDER"),
  
  US_SEAWAYTRANSITCARD("US_SEAWAYTRANSITCARD"),
  
  US_SUNPASS("US_SUNPASS"),
  
  US_TOLLTAG("US_TOLLTAG"),
  
  US_TXTAG("US_TXTAG"),
  
  US_VIRGINIA_EZPASS("US_VIRGINIA_EZPASS"),
  
  US_WESTVIRGINIA_EZPASS("US_WESTVIRGINIA_EZPASS"),
  
  US_PEACHPASS("US_PEACHPASS"),
  
  US_NEXUS("US_NEXUS"),
  
  US_DELAWARE_EZPASS("US_DELAWARE_EZPASS"),
  
  US_GROSSEILETOLLBRIDGE_PASSTAG("US_GROSSEILETOLLBRIDGE_PASSTAG"),
  
  US_EZPASS_PAYBYPLATE("US_EZPASS_PAYBYPLATE");

  private String value;

  EtcSubscriptionTypes(String value) {
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
  public static EtcSubscriptionTypes fromValue(String value) {
    for (EtcSubscriptionTypes b : EtcSubscriptionTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

