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
    /// Defines EmissionCalculationMethod
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EmissionCalculationMethod
    {
        /// <summary>
        /// Enum EN16258_2012 for value: EN16258_2012
        /// </summary>
        [EnumMember(Value = "EN16258_2012")]
        EN16258_2012 = 1,

        /// <summary>
        /// Enum ISO14083_2023 for value: ISO14083_2023
        /// </summary>
        [EnumMember(Value = "ISO14083_2023")]
        ISO14083_2023 = 2,

        /// <summary>
        /// Enum FRENCH_CO2E_DECREE_2017_639 for value: FRENCH_CO2E_DECREE_2017_639
        /// </summary>
        [EnumMember(Value = "FRENCH_CO2E_DECREE_2017_639")]
        FRENCH_CO2E_DECREE_2017_639 = 3
    }

}
