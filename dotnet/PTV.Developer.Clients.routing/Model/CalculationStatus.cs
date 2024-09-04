/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.31
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
    /// The current status of the calculation.  * &#x60;RUNNING&#x60; - The calculation is still running.  * &#x60;SUCCEEDED&#x60; - The calculation has completed successfully.  * &#x60;FAILED&#x60; - The calculation has completed with a failure.
    /// </summary>
    /// <value>The current status of the calculation.  * &#x60;RUNNING&#x60; - The calculation is still running.  * &#x60;SUCCEEDED&#x60; - The calculation has completed successfully.  * &#x60;FAILED&#x60; - The calculation has completed with a failure.</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum CalculationStatus
    {
        /// <summary>
        /// Enum RUNNING for value: RUNNING
        /// </summary>
        [EnumMember(Value = "RUNNING")]
        RUNNING = 1,

        /// <summary>
        /// Enum SUCCEEDED for value: SUCCEEDED
        /// </summary>
        [EnumMember(Value = "SUCCEEDED")]
        SUCCEEDED = 2,

        /// <summary>
        /// Enum FAILED for value: FAILED
        /// </summary>
        [EnumMember(Value = "FAILED")]
        FAILED = 3
    }

}
