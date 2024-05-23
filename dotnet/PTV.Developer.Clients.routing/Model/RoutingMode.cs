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
    /// Specifies which objective function should be used for the route calculation.   * _FAST_ is the default which returns a route considering a tradeoff between distance an travel time. All vehicle-specific restrictions are properly considered and violated only, if no other route can be found. * _SHORT_ returns a route which is probably shorter but accepting longer travel times. The resulting route is still sensible and can be driven with the given vehicle, but it may disregard restrictions like driving through residential areas. * _MONETARY_ assigns monetary costs to each road segment according the provided cost parameters and the vehicles properties like its consumption. Furthermore, toll costs are integrated as well. See [here](./concepts/monetary-costs) for more information.
    /// </summary>
    /// <value>Specifies which objective function should be used for the route calculation.   * _FAST_ is the default which returns a route considering a tradeoff between distance an travel time. All vehicle-specific restrictions are properly considered and violated only, if no other route can be found. * _SHORT_ returns a route which is probably shorter but accepting longer travel times. The resulting route is still sensible and can be driven with the given vehicle, but it may disregard restrictions like driving through residential areas. * _MONETARY_ assigns monetary costs to each road segment according the provided cost parameters and the vehicles properties like its consumption. Furthermore, toll costs are integrated as well. See [here](./concepts/monetary-costs) for more information.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum RoutingMode
    {
        /// <summary>
        /// Enum FAST for value: FAST
        /// </summary>
        [EnumMember(Value = "FAST")]
        FAST = 1,

        /// <summary>
        /// Enum SHORT for value: SHORT
        /// </summary>
        [EnumMember(Value = "SHORT")]
        SHORT = 2,

        /// <summary>
        /// Enum MONETARY for value: MONETARY
        /// </summary>
        [EnumMember(Value = "MONETARY")]
        MONETARY = 3
    }

}
