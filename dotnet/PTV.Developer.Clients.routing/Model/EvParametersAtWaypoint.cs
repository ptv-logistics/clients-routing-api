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
    /// The ev parameters that are specific to a waypoint.  This parameter is in a preview state, the API is stable, feature changes could be introduced in future. 
    /// </summary>
    [DataContract(Name = "EvParametersAtWaypoint")]
    public partial class EvParametersAtWaypoint : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EvParametersAtWaypoint" /> class.
        /// </summary>
        /// <param name="weather">weather.</param>
        /// <param name="chargingStation">chargingStation.</param>
        /// <param name="powerConsumptionDuringService">The electricity consumed during service by electrical appliances (e.g. crane, cooling, tail lift) [kWh].  (default to 0D).</param>
        public EvParametersAtWaypoint(Weather weather = default(Weather), ChargingStation chargingStation = default(ChargingStation), double? powerConsumptionDuringService = 0D)
        {
            this.Weather = weather;
            this.ChargingStation = chargingStation;
            // use default value if no "powerConsumptionDuringService" provided
            this.PowerConsumptionDuringService = powerConsumptionDuringService ?? 0D;
        }

        /// <summary>
        /// Gets or Sets Weather
        /// </summary>
        [DataMember(Name = "weather", EmitDefaultValue = false)]
        public Weather Weather { get; set; }

        /// <summary>
        /// Gets or Sets ChargingStation
        /// </summary>
        [DataMember(Name = "chargingStation", EmitDefaultValue = false)]
        public ChargingStation ChargingStation { get; set; }

        /// <summary>
        /// The electricity consumed during service by electrical appliances (e.g. crane, cooling, tail lift) [kWh]. 
        /// </summary>
        /// <value>The electricity consumed during service by electrical appliances (e.g. crane, cooling, tail lift) [kWh]. </value>
        [DataMember(Name = "powerConsumptionDuringService", EmitDefaultValue = true)]
        public double? PowerConsumptionDuringService { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EvParametersAtWaypoint {\n");
            sb.Append("  Weather: ").Append(Weather).Append("\n");
            sb.Append("  ChargingStation: ").Append(ChargingStation).Append("\n");
            sb.Append("  PowerConsumptionDuringService: ").Append(PowerConsumptionDuringService).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            // PowerConsumptionDuringService (double?) minimum
            if (this.PowerConsumptionDuringService < (double?)0)
            {
                yield return new ValidationResult("Invalid value for PowerConsumptionDuringService, must be a value greater than or equal to 0.", new [] { "PowerConsumptionDuringService" });
            }

            yield break;
        }
    }

}
