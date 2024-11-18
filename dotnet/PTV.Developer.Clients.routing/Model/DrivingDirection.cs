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
    /// Specifies the driving direction, i.e. from start to destination or from destination to start..  * &#x60;OUTBOUND&#x60; - Indicates an outbound routing from start to destination, i.e. the area which can be reached from the location within the given horizon. Use this value to calculate which can be covered e.g. by an emergency service such as a fire department.  * &#x60;INBOUND&#x60; - Indicates an inbound routing from destination to start, i.e. from where the location can be reached within the given horizon. Use this value to calculate the catchment area, e.g. of a school or a hospital.
    /// </summary>
    /// <value>Specifies the driving direction, i.e. from start to destination or from destination to start..  * &#x60;OUTBOUND&#x60; - Indicates an outbound routing from start to destination, i.e. the area which can be reached from the location within the given horizon. Use this value to calculate which can be covered e.g. by an emergency service such as a fire department.  * &#x60;INBOUND&#x60; - Indicates an inbound routing from destination to start, i.e. from where the location can be reached within the given horizon. Use this value to calculate the catchment area, e.g. of a school or a hospital.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum DrivingDirection
    {
        /// <summary>
        /// Enum OUTBOUND for value: OUTBOUND
        /// </summary>
        [EnumMember(Value = "OUTBOUND")]
        OUTBOUND = 1,

        /// <summary>
        /// Enum INBOUND for value: INBOUND
        /// </summary>
        [EnumMember(Value = "INBOUND")]
        INBOUND = 2
    }

}
