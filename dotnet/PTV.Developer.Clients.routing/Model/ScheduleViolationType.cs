/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.33
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
    /// Defines ScheduleViolationType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ScheduleViolationType
    {
        /// <summary>
        /// Enum OPENING_INTERVAL for value: OPENING_INTERVAL
        /// </summary>
        [EnumMember(Value = "OPENING_INTERVAL")]
        OPENING_INTERVAL = 1,

        /// <summary>
        /// Enum MAXIMUM_TRAVEL_TIME for value: MAXIMUM_TRAVEL_TIME
        /// </summary>
        [EnumMember(Value = "MAXIMUM_TRAVEL_TIME")]
        MAXIMUM_TRAVEL_TIME = 2,

        /// <summary>
        /// Enum MAXIMUM_DRIVING_TIME for value: MAXIMUM_DRIVING_TIME
        /// </summary>
        [EnumMember(Value = "MAXIMUM_DRIVING_TIME")]
        MAXIMUM_DRIVING_TIME = 3
    }

}
