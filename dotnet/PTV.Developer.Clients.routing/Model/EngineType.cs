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
    /// The engine type of the vehicle. When changing the engine type further parameters must be specified to define a valid vehicle and to obtain proper results. For a hybrid or an electric vehicle **electricityType** and **averageElectricityConsumption** must be specified, for a hybrid vehicle additionally the **hybridRatio**.  Relevant for &#x60;toll&#x60;, &#x60;emissions&#x60;. 
    /// </summary>
    /// <value>The engine type of the vehicle. When changing the engine type further parameters must be specified to define a valid vehicle and to obtain proper results. For a hybrid or an electric vehicle **electricityType** and **averageElectricityConsumption** must be specified, for a hybrid vehicle additionally the **hybridRatio**.  Relevant for &#x60;toll&#x60;, &#x60;emissions&#x60;. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EngineType
    {
        /// <summary>
        /// Enum COMBUSTION for value: COMBUSTION
        /// </summary>
        [EnumMember(Value = "COMBUSTION")]
        COMBUSTION = 1,

        /// <summary>
        /// Enum ELECTRIC for value: ELECTRIC
        /// </summary>
        [EnumMember(Value = "ELECTRIC")]
        ELECTRIC = 2,

        /// <summary>
        /// Enum HYBRID for value: HYBRID
        /// </summary>
        [EnumMember(Value = "HYBRID")]
        HYBRID = 3

    }

}
