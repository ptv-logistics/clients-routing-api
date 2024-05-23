/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
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
    /// Defines the version of the emission factors to use for emission calculation based on ISO 14083. Will be ignored for other calculation methods.
    /// </summary>
    /// <value>Defines the version of the emission factors to use for emission calculation based on ISO 14083. Will be ignored for other calculation methods.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum Iso14083EmissionFactorsVersion
    {
        /// <summary>
        /// Enum INITIAL for value: INITIAL
        /// </summary>
        [EnumMember(Value = "INITIAL")]
        INITIAL = 1,

        /// <summary>
        /// Enum VERSION_2 for value: VERSION_2
        /// </summary>
        [EnumMember(Value = "VERSION_2")]
        VERSION_2 = 2,

        /// <summary>
        /// Enum LATEST for value: LATEST
        /// </summary>
        [EnumMember(Value = "LATEST")]
        LATEST = 3
    }

}
