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
    /// Issued when the battery should be charged at a waypoint.  Requires _EV_CHARGE_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "ChargeEvent")]
    public partial class ChargeEvent : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ChargeEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ChargeEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ChargeEvent" /> class.
        /// </summary>
        /// <param name="chargingTime">The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it. (required).</param>
        /// <param name="electricityCharged">The amount of electricity charged [kWh]. (required).</param>
        /// <param name="percentageCharged">The percentage of battery charged [%]. (required).</param>
        /// <param name="cost">cost (required).</param>
        public ChargeEvent(int? chargingTime = default(int?), double? electricityCharged = default(double?), int? percentageCharged = default(int?), ElectricityPrice cost = default(ElectricityPrice))
        {
            // to ensure "chargingTime" is required (not null)
            if (chargingTime == null)
            {
                throw new ArgumentNullException("chargingTime is a required property for ChargeEvent and cannot be null");
            }
            this.ChargingTime = chargingTime;
            // to ensure "electricityCharged" is required (not null)
            if (electricityCharged == null)
            {
                throw new ArgumentNullException("electricityCharged is a required property for ChargeEvent and cannot be null");
            }
            this.ElectricityCharged = electricityCharged;
            // to ensure "percentageCharged" is required (not null)
            if (percentageCharged == null)
            {
                throw new ArgumentNullException("percentageCharged is a required property for ChargeEvent and cannot be null");
            }
            this.PercentageCharged = percentageCharged;
            // to ensure "cost" is required (not null)
            if (cost == null)
            {
                throw new ArgumentNullException("cost is a required property for ChargeEvent and cannot be null");
            }
            this.Cost = cost;
        }

        /// <summary>
        /// The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it.
        /// </summary>
        /// <value>The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it.</value>
        [DataMember(Name = "chargingTime", IsRequired = true, EmitDefaultValue = true)]
        public int? ChargingTime { get; set; }

        /// <summary>
        /// The amount of electricity charged [kWh].
        /// </summary>
        /// <value>The amount of electricity charged [kWh].</value>
        [DataMember(Name = "electricityCharged", IsRequired = true, EmitDefaultValue = true)]
        public double? ElectricityCharged { get; set; }

        /// <summary>
        /// The percentage of battery charged [%].
        /// </summary>
        /// <value>The percentage of battery charged [%].</value>
        [DataMember(Name = "percentageCharged", IsRequired = true, EmitDefaultValue = true)]
        public int? PercentageCharged { get; set; }

        /// <summary>
        /// Gets or Sets Cost
        /// </summary>
        [DataMember(Name = "cost", IsRequired = true, EmitDefaultValue = true)]
        public ElectricityPrice Cost { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ChargeEvent {\n");
            sb.Append("  ChargingTime: ").Append(ChargingTime).Append("\n");
            sb.Append("  ElectricityCharged: ").Append(ElectricityCharged).Append("\n");
            sb.Append("  PercentageCharged: ").Append(PercentageCharged).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
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
            // ChargingTime (int?) minimum
            if (this.ChargingTime < (int?)1)
            {
                yield return new ValidationResult("Invalid value for ChargingTime, must be a value greater than or equal to 1.", new [] { "ChargingTime" });
            }

            // ElectricityCharged (double?) minimum
            if (this.ElectricityCharged < (double?)0)
            {
                yield return new ValidationResult("Invalid value for ElectricityCharged, must be a value greater than 0.", new [] { "ElectricityCharged" });
            }

            // PercentageCharged (int?) minimum
            if (this.PercentageCharged < (int?)1)
            {
                yield return new ValidationResult("Invalid value for PercentageCharged, must be a value greater than or equal to 1.", new [] { "PercentageCharged" });
            }

            yield break;
        }
    }

}
