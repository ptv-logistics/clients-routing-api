/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routing.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routing.Model
{
    /// <summary>
    /// Defines Results
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Results
    {
        /// <summary>
        /// Enum ROUTE_ID for value: ROUTE_ID
        /// </summary>
        [EnumMember(Value = "ROUTE_ID")]
        ROUTE_ID = 1,

        /// <summary>
        /// Enum LEGS for value: LEGS
        /// </summary>
        [EnumMember(Value = "LEGS")]
        LEGS = 2,

        /// <summary>
        /// Enum LEGS_POLYLINE for value: LEGS_POLYLINE
        /// </summary>
        [EnumMember(Value = "LEGS_POLYLINE")]
        LEGS_POLYLINE = 3,

        /// <summary>
        /// Enum TOLL_COSTS for value: TOLL_COSTS
        /// </summary>
        [EnumMember(Value = "TOLL_COSTS")]
        TOLL_COSTS = 4,

        /// <summary>
        /// Enum TOLL_SECTIONS for value: TOLL_SECTIONS
        /// </summary>
        [EnumMember(Value = "TOLL_SECTIONS")]
        TOLL_SECTIONS = 5,

        /// <summary>
        /// Enum TOLL_SYSTEMS for value: TOLL_SYSTEMS
        /// </summary>
        [EnumMember(Value = "TOLL_SYSTEMS")]
        TOLL_SYSTEMS = 6,

        /// <summary>
        /// Enum TOLL_EVENTS for value: TOLL_EVENTS
        /// </summary>
        [EnumMember(Value = "TOLL_EVENTS")]
        TOLL_EVENTS = 7,

        /// <summary>
        /// Enum POLYLINE for value: POLYLINE
        /// </summary>
        [EnumMember(Value = "POLYLINE")]
        POLYLINE = 8,

        /// <summary>
        /// Enum MANEUVER_EVENTS for value: MANEUVER_EVENTS
        /// </summary>
        [EnumMember(Value = "MANEUVER_EVENTS")]
        MANEUVER_EVENTS = 9,

        /// <summary>
        /// Enum BORDER_EVENTS for value: BORDER_EVENTS
        /// </summary>
        [EnumMember(Value = "BORDER_EVENTS")]
        BORDER_EVENTS = 10,

        /// <summary>
        /// Enum VIOLATION_EVENTS for value: VIOLATION_EVENTS
        /// </summary>
        [EnumMember(Value = "VIOLATION_EVENTS")]
        VIOLATION_EVENTS = 11,

        /// <summary>
        /// Enum VIOLATION_EVENTS_POLYLINE for value: VIOLATION_EVENTS_POLYLINE
        /// </summary>
        [EnumMember(Value = "VIOLATION_EVENTS_POLYLINE")]
        VIOLATION_EVENTS_POLYLINE = 12,

        /// <summary>
        /// Enum WAYPOINT_EVENTS for value: WAYPOINT_EVENTS
        /// </summary>
        [EnumMember(Value = "WAYPOINT_EVENTS")]
        WAYPOINT_EVENTS = 13,

        /// <summary>
        /// Enum UTC_OFFSET_CHANGE_EVENTS for value: UTC_OFFSET_CHANGE_EVENTS
        /// </summary>
        [EnumMember(Value = "UTC_OFFSET_CHANGE_EVENTS")]
        UTC_OFFSET_CHANGE_EVENTS = 14,

        /// <summary>
        /// Enum COMBINED_TRANSPORT_EVENTS for value: COMBINED_TRANSPORT_EVENTS
        /// </summary>
        [EnumMember(Value = "COMBINED_TRANSPORT_EVENTS")]
        COMBINED_TRANSPORT_EVENTS = 15,

        /// <summary>
        /// Enum TRAFFIC_EVENTS for value: TRAFFIC_EVENTS
        /// </summary>
        [EnumMember(Value = "TRAFFIC_EVENTS")]
        TRAFFIC_EVENTS = 16,

        /// <summary>
        /// Enum TRAFFIC_EVENTS_POLYLINE for value: TRAFFIC_EVENTS_POLYLINE
        /// </summary>
        [EnumMember(Value = "TRAFFIC_EVENTS_POLYLINE")]
        TRAFFIC_EVENTS_POLYLINE = 17,

        /// <summary>
        /// Enum LOW_EMISSION_ZONE_EVENTS for value: LOW_EMISSION_ZONE_EVENTS
        /// </summary>
        [EnumMember(Value = "LOW_EMISSION_ZONE_EVENTS")]
        LOW_EMISSION_ZONE_EVENTS = 18,

        /// <summary>
        /// Enum DELIVERY_ONLY_EVENTS for value: DELIVERY_ONLY_EVENTS
        /// </summary>
        [EnumMember(Value = "DELIVERY_ONLY_EVENTS")]
        DELIVERY_ONLY_EVENTS = 19,

        /// <summary>
        /// Enum DELIVERY_ONLY_EVENTS_POLYLINE for value: DELIVERY_ONLY_EVENTS_POLYLINE
        /// </summary>
        [EnumMember(Value = "DELIVERY_ONLY_EVENTS_POLYLINE")]
        DELIVERY_ONLY_EVENTS_POLYLINE = 20,

        /// <summary>
        /// Enum SCHEDULE_EVENTS for value: SCHEDULE_EVENTS
        /// </summary>
        [EnumMember(Value = "SCHEDULE_EVENTS")]
        SCHEDULE_EVENTS = 21,

        /// <summary>
        /// Enum SCHEDULE_EVENTS_WITH_DRIVING for value: SCHEDULE_EVENTS_WITH_DRIVING
        /// </summary>
        [EnumMember(Value = "SCHEDULE_EVENTS_WITH_DRIVING")]
        SCHEDULE_EVENTS_WITH_DRIVING = 22,

        /// <summary>
        /// Enum EMISSIONS_EN16258_2012 for value: EMISSIONS_EN16258_2012
        /// </summary>
        [EnumMember(Value = "EMISSIONS_EN16258_2012")]
        EMISSIONS_EN16258_2012 = 23,

        /// <summary>
        /// Enum EMISSIONS_EN16258_2012_HBEFA for value: EMISSIONS_EN16258_2012_HBEFA
        /// </summary>
        [EnumMember(Value = "EMISSIONS_EN16258_2012_HBEFA")]
        EMISSIONS_EN16258_2012_HBEFA = 24,

        /// <summary>
        /// Enum EMISSIONS_ISO14083_2022 for value: EMISSIONS_ISO14083_2022
        /// </summary>
        [EnumMember(Value = "EMISSIONS_ISO14083_2022")]
        EMISSIONS_ISO14083_2022 = 25,

        /// <summary>
        /// Enum EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION for value: EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION
        /// </summary>
        [EnumMember(Value = "EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION")]
        EMISSIONS_ISO14083_2022_DEFAULT_CONSUMPTION = 26,

        /// <summary>
        /// Enum EMISSIONS_ISO14083_2023 for value: EMISSIONS_ISO14083_2023
        /// </summary>
        [EnumMember(Value = "EMISSIONS_ISO14083_2023")]
        EMISSIONS_ISO14083_2023 = 27,

        /// <summary>
        /// Enum EMISSIONS_ISO14083_2023_DEFAULT_CONSUMPTION for value: EMISSIONS_ISO14083_2023_DEFAULT_CONSUMPTION
        /// </summary>
        [EnumMember(Value = "EMISSIONS_ISO14083_2023_DEFAULT_CONSUMPTION")]
        EMISSIONS_ISO14083_2023_DEFAULT_CONSUMPTION = 28,

        /// <summary>
        /// Enum EMISSIONS_FRENCH_CO2E_DECREE_2017_639 for value: EMISSIONS_FRENCH_CO2E_DECREE_2017_639
        /// </summary>
        [EnumMember(Value = "EMISSIONS_FRENCH_CO2E_DECREE_2017_639")]
        EMISSIONS_FRENCH_CO2E_DECREE_2017_639 = 29,

        /// <summary>
        /// Enum ALTERNATIVE_ROUTES for value: ALTERNATIVE_ROUTES
        /// </summary>
        [EnumMember(Value = "ALTERNATIVE_ROUTES")]
        ALTERNATIVE_ROUTES = 30,

        /// <summary>
        /// Enum SCHEDULE_REPORT for value: SCHEDULE_REPORT
        /// </summary>
        [EnumMember(Value = "SCHEDULE_REPORT")]
        SCHEDULE_REPORT = 31,

        /// <summary>
        /// Enum GUIDED_NAVIGATION for value: GUIDED_NAVIGATION
        /// </summary>
        [EnumMember(Value = "GUIDED_NAVIGATION")]
        GUIDED_NAVIGATION = 32,

        /// <summary>
        /// Enum MONETARY_COSTS for value: MONETARY_COSTS
        /// </summary>
        [EnumMember(Value = "MONETARY_COSTS")]
        MONETARY_COSTS = 33,

        /// <summary>
        /// Enum EV_REPORT for value: EV_REPORT
        /// </summary>
        [EnumMember(Value = "EV_REPORT")]
        EV_REPORT = 34,

        /// <summary>
        /// Enum EV_STATUS_EVENTS for value: EV_STATUS_EVENTS
        /// </summary>
        [EnumMember(Value = "EV_STATUS_EVENTS")]
        EV_STATUS_EVENTS = 35,

        /// <summary>
        /// Enum EV_STATUS_EVENTS_POLYLINE for value: EV_STATUS_EVENTS_POLYLINE
        /// </summary>
        [EnumMember(Value = "EV_STATUS_EVENTS_POLYLINE")]
        EV_STATUS_EVENTS_POLYLINE = 36,

        /// <summary>
        /// Enum EV_CHARGE_EVENTS for value: EV_CHARGE_EVENTS
        /// </summary>
        [EnumMember(Value = "EV_CHARGE_EVENTS")]
        EV_CHARGE_EVENTS = 37
    }

}
