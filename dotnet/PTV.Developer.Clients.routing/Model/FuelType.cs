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
    /// The fuel type of the vehicle. The fuel types _CNG_GASOLINE_ and _LNG_GASOLINE_ are used for dual-fuel vehicles, therefore the **dualFuelRatio** has to be specified. These fuel types cannot be used with hybrid vehicles.  Supported for **engineType** _COMBUSTION_ and _HYBRID_. Relevant for &#x60;emissions&#x60;. 
    /// </summary>
    /// <value>The fuel type of the vehicle. The fuel types _CNG_GASOLINE_ and _LNG_GASOLINE_ are used for dual-fuel vehicles, therefore the **dualFuelRatio** has to be specified. These fuel types cannot be used with hybrid vehicles.  Supported for **engineType** _COMBUSTION_ and _HYBRID_. Relevant for &#x60;emissions&#x60;. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum FuelType
    {
        /// <summary>
        /// Enum GASOLINE for value: GASOLINE
        /// </summary>
        [EnumMember(Value = "GASOLINE")]
        GASOLINE = 1,

        /// <summary>
        /// Enum DIESEL for value: DIESEL
        /// </summary>
        [EnumMember(Value = "DIESEL")]
        DIESEL = 2,

        /// <summary>
        /// Enum COMPRESSED_NATURAL_GAS for value: COMPRESSED_NATURAL_GAS
        /// </summary>
        [EnumMember(Value = "COMPRESSED_NATURAL_GAS")]
        COMPRESSED_NATURAL_GAS = 3,

        /// <summary>
        /// Enum LIQUEFIED_PETROLEUM_GAS for value: LIQUEFIED_PETROLEUM_GAS
        /// </summary>
        [EnumMember(Value = "LIQUEFIED_PETROLEUM_GAS")]
        LIQUEFIED_PETROLEUM_GAS = 4,

        /// <summary>
        /// Enum LIQUEFIED_NATURAL_GAS for value: LIQUEFIED_NATURAL_GAS
        /// </summary>
        [EnumMember(Value = "LIQUEFIED_NATURAL_GAS")]
        LIQUEFIED_NATURAL_GAS = 5,

        /// <summary>
        /// Enum CNG_GASOLINE for value: CNG_GASOLINE
        /// </summary>
        [EnumMember(Value = "CNG_GASOLINE")]
        CNG_GASOLINE = 6,

        /// <summary>
        /// Enum LPG_GASOLINE for value: LPG_GASOLINE
        /// </summary>
        [EnumMember(Value = "LPG_GASOLINE")]
        LPG_GASOLINE = 7,

        /// <summary>
        /// Enum ETHANOL for value: ETHANOL
        /// </summary>
        [EnumMember(Value = "ETHANOL")]
        ETHANOL = 8,

        /// <summary>
        /// Enum NONE for value: NONE
        /// </summary>
        [EnumMember(Value = "NONE")]
        NONE = 9
    }

}
