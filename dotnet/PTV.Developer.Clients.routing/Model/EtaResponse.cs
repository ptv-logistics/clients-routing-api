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
    /// The response of an ETA calculation.
    /// </summary>
    [DataContract(Name = "EtaResponse")]
    public partial class EtaResponse : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EtaResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EtaResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EtaResponse" /> class.
        /// </summary>
        /// <param name="remainingWaypoints">The ETA and the remaining distance and travel time to the waypoints not yet reached by the route. (required).</param>
        /// <param name="routeId">If the route has been recalculated, this is the ID of the new route. That will happen when it is likely that the vehicle has left the route, so the vehicle position is too far away from the route, or when the estimated time of arrival at the last waypoint is delayed in a way that another route may result in arriving earlier..</param>
        /// <param name="warnings">A list of warnings concerning the validity of the result..</param>
        public EtaResponse(List<RemainingWaypoint> remainingWaypoints = default(List<RemainingWaypoint>), Guid routeId = default(Guid), List<Warning> warnings = default(List<Warning>))
        {
            // to ensure "remainingWaypoints" is required (not null)
            if (remainingWaypoints == null)
            {
                throw new ArgumentNullException("remainingWaypoints is a required property for EtaResponse and cannot be null");
            }
            this.RemainingWaypoints = remainingWaypoints;
            this.RouteId = routeId;
            this.Warnings = warnings;
        }

        /// <summary>
        /// The ETA and the remaining distance and travel time to the waypoints not yet reached by the route.
        /// </summary>
        /// <value>The ETA and the remaining distance and travel time to the waypoints not yet reached by the route.</value>
        [DataMember(Name = "remainingWaypoints", IsRequired = true, EmitDefaultValue = true)]
        public List<RemainingWaypoint> RemainingWaypoints { get; set; }

        /// <summary>
        /// If the route has been recalculated, this is the ID of the new route. That will happen when it is likely that the vehicle has left the route, so the vehicle position is too far away from the route, or when the estimated time of arrival at the last waypoint is delayed in a way that another route may result in arriving earlier.
        /// </summary>
        /// <value>If the route has been recalculated, this is the ID of the new route. That will happen when it is likely that the vehicle has left the route, so the vehicle position is too far away from the route, or when the estimated time of arrival at the last waypoint is delayed in a way that another route may result in arriving earlier.</value>
        [DataMember(Name = "routeId", EmitDefaultValue = false)]
        public Guid RouteId { get; set; }

        /// <summary>
        /// A list of warnings concerning the validity of the result.
        /// </summary>
        /// <value>A list of warnings concerning the validity of the result.</value>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<Warning> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EtaResponse {\n");
            sb.Append("  RemainingWaypoints: ").Append(RemainingWaypoints).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
