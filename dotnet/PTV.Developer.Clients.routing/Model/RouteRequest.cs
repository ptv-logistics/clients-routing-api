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
    /// RouteRequest
    /// </summary>
    [DataContract(Name = "RouteRequest")]
    public partial class RouteRequest : IEquatable<RouteRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RouteRequest" /> class.
        /// </summary>
        /// <param name="waypoints">The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.  Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place..</param>
        /// <param name="routeId">Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered. See [here](./Concepts/Waypoints.htm) for more information..</param>
        public RouteRequest(List<Waypoint> waypoints = default(List<Waypoint>), Guid routeId = default(Guid))
        {
            this.Waypoints = waypoints;
            this.RouteId = routeId;
        }

        /// <summary>
        /// The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.  Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place.
        /// </summary>
        /// <value>The list of waypoints the route will be calculated for. At least two waypoints are necessary, a maximum number may apply according to your subscription. The first waypoint is the start and the last is the destination of the route. Additional intermediate waypoints are possible.  Each waypoint must either have latitude and longitude or one of the representations combinedTransport, address or place.</value>
        [DataMember(Name = "waypoints", EmitDefaultValue = false)]
        public List<Waypoint> Waypoints { get; set; }

        /// <summary>
        /// Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered. See [here](./Concepts/Waypoints.htm) for more information.
        /// </summary>
        /// <value>Instead of the list of waypoints, a **routeId** from a previously calculated route or a matched track can be entered. See [here](./Concepts/Waypoints.htm) for more information.</value>
        [DataMember(Name = "routeId", EmitDefaultValue = false)]
        public Guid RouteId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RouteRequest {\n");
            sb.Append("  Waypoints: ").Append(Waypoints).Append("\n");
            sb.Append("  RouteId: ").Append(RouteId).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as RouteRequest);
        }

        /// <summary>
        /// Returns true if RouteRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of RouteRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RouteRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Waypoints == input.Waypoints ||
                    this.Waypoints != null &&
                    input.Waypoints != null &&
                    this.Waypoints.SequenceEqual(input.Waypoints)
                ) && 
                (
                    this.RouteId == input.RouteId ||
                    (this.RouteId != null &&
                    this.RouteId.Equals(input.RouteId))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Waypoints != null)
                {
                    hashCode = (hashCode * 59) + this.Waypoints.GetHashCode();
                }
                if (this.RouteId != null)
                {
                    hashCode = (hashCode * 59) + this.RouteId.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
