/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
    /// Defines the format for polylines in the response.    * &#x60;GEO_JSON&#x60; - Polylines are returned in the [GeoJSON](https://en.wikipedia.org/wiki/GeoJSON).    * &#x60;GOOGLE_ENCODED_POLYLINE&#x60; - Polylines are returned in [Google&#39;s Encoded Polyline](https://developers.google.com/maps/documentation/utilities/polylinealgorithm) format.  
    /// </summary>
    /// <value>Defines the format for polylines in the response.    * &#x60;GEO_JSON&#x60; - Polylines are returned in the [GeoJSON](https://en.wikipedia.org/wiki/GeoJSON).    * &#x60;GOOGLE_ENCODED_POLYLINE&#x60; - Polylines are returned in [Google&#39;s Encoded Polyline](https://developers.google.com/maps/documentation/utilities/polylinealgorithm) format.  </value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum PolylineFormat
    {
        /// <summary>
        /// Enum GEO_JSON for value: GEO_JSON
        /// </summary>
        [EnumMember(Value = "GEO_JSON")]
        GEO_JSON = 1,

        /// <summary>
        /// Enum GOOGLE_ENCODED_POLYLINE for value: GOOGLE_ENCODED_POLYLINE
        /// </summary>
        [EnumMember(Value = "GOOGLE_ENCODED_POLYLINE")]
        GOOGLE_ENCODED_POLYLINE = 2

    }

}
