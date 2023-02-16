/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
    /// Defines ScheduleType
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ScheduleType
    {
        /// <summary>
        /// Enum BREAK for value: BREAK
        /// </summary>
        [EnumMember(Value = "BREAK")]
        BREAK = 1,

        /// <summary>
        /// Enum DAILY_REST for value: DAILY_REST
        /// </summary>
        [EnumMember(Value = "DAILY_REST")]
        DAILY_REST = 2,

        /// <summary>
        /// Enum WAITING for value: WAITING
        /// </summary>
        [EnumMember(Value = "WAITING")]
        WAITING = 3,

        /// <summary>
        /// Enum SERVICE for value: SERVICE
        /// </summary>
        [EnumMember(Value = "SERVICE")]
        SERVICE = 4

    }

}
