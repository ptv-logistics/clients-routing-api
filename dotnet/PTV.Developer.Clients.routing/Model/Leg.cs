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
    /// Leg
    /// </summary>
    [DataContract(Name = "Leg")]
    public partial class Leg : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Leg" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Leg() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Leg" /> class.
        /// </summary>
        /// <param name="distance">The distance of the leg [m]. (required).</param>
        /// <param name="travelTime">The travel time for the leg [s]. (required).</param>
        /// <param name="trafficDelay">The total delay due to live traffic on this leg [s].  This value contains the sum of all traffic events on this leg and will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information..</param>
        /// <param name="violated">If there is no valid connection between the waypoints of this leg but the resulting leg can be calculated by using actually prohibited roads, the route is marked as violated. (required).</param>
        /// <param name="tollCosts">tollCosts.</param>
        /// <param name="polyline">The polyline of the leg in the format specified by **options[polylineFormat]**..</param>
        /// <param name="evReport">evReport.</param>
        public Leg(int? distance = default(int?), int? travelTime = default(int?), int? trafficDelay = default(int?), bool? violated = default(bool?), TollCosts tollCosts = default(TollCosts), string polyline = default(string), EvReportLeg evReport = default(EvReportLeg))
        {
            // to ensure "distance" is required (not null)
            if (distance == null)
            {
                throw new ArgumentNullException("distance is a required property for Leg and cannot be null");
            }
            this.Distance = distance;
            // to ensure "travelTime" is required (not null)
            if (travelTime == null)
            {
                throw new ArgumentNullException("travelTime is a required property for Leg and cannot be null");
            }
            this.TravelTime = travelTime;
            // to ensure "violated" is required (not null)
            if (violated == null)
            {
                throw new ArgumentNullException("violated is a required property for Leg and cannot be null");
            }
            this.Violated = violated;
            this.TrafficDelay = trafficDelay;
            this.TollCosts = tollCosts;
            this.Polyline = polyline;
            this.EvReport = evReport;
        }

        /// <summary>
        /// The distance of the leg [m].
        /// </summary>
        /// <value>The distance of the leg [m].</value>
        /// <example>1422</example>
        [DataMember(Name = "distance", IsRequired = true, EmitDefaultValue = true)]
        public int? Distance { get; set; }

        /// <summary>
        /// The travel time for the leg [s].
        /// </summary>
        /// <value>The travel time for the leg [s].</value>
        /// <example>56</example>
        [DataMember(Name = "travelTime", IsRequired = true, EmitDefaultValue = true)]
        public int? TravelTime { get; set; }

        /// <summary>
        /// The total delay due to live traffic on this leg [s].  This value contains the sum of all traffic events on this leg and will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information.
        /// </summary>
        /// <value>The total delay due to live traffic on this leg [s].  This value contains the sum of all traffic events on this leg and will be non-zero only if **options[trafficMode]&#x3D;REALISTIC**. See [here](./concepts/traffic-modes) for more information.</value>
        /// <example>0</example>
        [DataMember(Name = "trafficDelay", EmitDefaultValue = true)]
        public int? TrafficDelay { get; set; }

        /// <summary>
        /// If there is no valid connection between the waypoints of this leg but the resulting leg can be calculated by using actually prohibited roads, the route is marked as violated.
        /// </summary>
        /// <value>If there is no valid connection between the waypoints of this leg but the resulting leg can be calculated by using actually prohibited roads, the route is marked as violated.</value>
        /// <example>false</example>
        [DataMember(Name = "violated", IsRequired = true, EmitDefaultValue = true)]
        public bool? Violated { get; set; }

        /// <summary>
        /// Gets or Sets TollCosts
        /// </summary>
        [DataMember(Name = "tollCosts", EmitDefaultValue = false)]
        public TollCosts TollCosts { get; set; }

        /// <summary>
        /// The polyline of the leg in the format specified by **options[polylineFormat]**.
        /// </summary>
        /// <value>The polyline of the leg in the format specified by **options[polylineFormat]**.</value>
        [DataMember(Name = "polyline", EmitDefaultValue = true)]
        public string Polyline { get; set; }

        /// <summary>
        /// Gets or Sets EvReport
        /// </summary>
        [DataMember(Name = "evReport", EmitDefaultValue = false)]
        public EvReportLeg EvReport { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Leg {\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
            sb.Append("  TravelTime: ").Append(TravelTime).Append("\n");
            sb.Append("  TrafficDelay: ").Append(TrafficDelay).Append("\n");
            sb.Append("  Violated: ").Append(Violated).Append("\n");
            sb.Append("  TollCosts: ").Append(TollCosts).Append("\n");
            sb.Append("  Polyline: ").Append(Polyline).Append("\n");
            sb.Append("  EvReport: ").Append(EvReport).Append("\n");
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
            // Distance (int?) minimum
            if (this.Distance < (int?)0)
            {
                yield return new ValidationResult("Invalid value for Distance, must be a value greater than or equal to 0.", new [] { "Distance" });
            }

            // TravelTime (int?) minimum
            if (this.TravelTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for TravelTime, must be a value greater than or equal to 0.", new [] { "TravelTime" });
            }

            // TrafficDelay (int?) minimum
            if (this.TrafficDelay < (int?)0)
            {
                yield return new ValidationResult("Invalid value for TrafficDelay, must be a value greater than or equal to 0.", new [] { "TrafficDelay" });
            }

            yield break;
        }
    }

}
