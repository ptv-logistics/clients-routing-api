/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
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
    /// The particle reduction class (Partikelminderungsklasse) according to &#39;Anlage XIV zu &amp;sect; 48 StVZO&#39; (German law). This value is present for compatibility reasons and does not influence any of the results.  Supported for **engineType** _COMBUSTION_ and _HYBRID_. 
    /// </summary>
    /// <value>The particle reduction class (Partikelminderungsklasse) according to &#39;Anlage XIV zu &amp;sect; 48 StVZO&#39; (German law). This value is present for compatibility reasons and does not influence any of the results.  Supported for **engineType** _COMBUSTION_ and _HYBRID_. </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum ParticleReductionClass
    {
        /// <summary>
        /// Enum PMK_0 for value: PMK_0
        /// </summary>
        [EnumMember(Value = "PMK_0")]
        PMK_0 = 1,

        /// <summary>
        /// Enum PMK_1 for value: PMK_1
        /// </summary>
        [EnumMember(Value = "PMK_1")]
        PMK_1 = 2,

        /// <summary>
        /// Enum PMK_2 for value: PMK_2
        /// </summary>
        [EnumMember(Value = "PMK_2")]
        PMK_2 = 3,

        /// <summary>
        /// Enum PMK_3 for value: PMK_3
        /// </summary>
        [EnumMember(Value = "PMK_3")]
        PMK_3 = 4,

        /// <summary>
        /// Enum PMK_4 for value: PMK_4
        /// </summary>
        [EnumMember(Value = "PMK_4")]
        PMK_4 = 5,

        /// <summary>
        /// Enum NONE for value: NONE
        /// </summary>
        [EnumMember(Value = "NONE")]
        NONE = 6
    }

}
