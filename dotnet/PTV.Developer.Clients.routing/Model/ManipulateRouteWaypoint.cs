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
    /// A _manipulate-route waypoint_ will not actually be reached but it influences the route course, so that the route passes an area defined by the given radius. This waypoint will not appear as a waypoint event in the response and may not be used as start and destination.
    /// </summary>
    [DataContract(Name = "ManipulateRouteWaypoint")]
    public partial class ManipulateRouteWaypoint : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ManipulateRouteWaypoint" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ManipulateRouteWaypoint() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ManipulateRouteWaypoint" /> class.
        /// </summary>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        /// <param name="radius">The radius [m] at which the waypoint has to be passed. (required).</param>
        public ManipulateRouteWaypoint(double? latitude = default(double?), double? longitude = default(double?), int? radius = default(int?))
        {
            // to ensure "latitude" is required (not null)
            if (latitude == null)
            {
                throw new ArgumentNullException("latitude is a required property for ManipulateRouteWaypoint and cannot be null");
            }
            this.Latitude = latitude;
            // to ensure "longitude" is required (not null)
            if (longitude == null)
            {
                throw new ArgumentNullException("longitude is a required property for ManipulateRouteWaypoint and cannot be null");
            }
            this.Longitude = longitude;
            // to ensure "radius" is required (not null)
            if (radius == null)
            {
                throw new ArgumentNullException("radius is a required property for ManipulateRouteWaypoint and cannot be null");
            }
            this.Radius = radius;
        }

        /// <summary>
        /// The latitude value in degrees (WGS84/EPSG:4326) from south to north.
        /// </summary>
        /// <value>The latitude value in degrees (WGS84/EPSG:4326) from south to north.</value>
        /// <example>49.480301</example>
        [DataMember(Name = "latitude", IsRequired = true, EmitDefaultValue = true)]
        public double? Latitude { get; set; }

        /// <summary>
        /// The longitude value in degrees (WGS84/EPSG:4326) from west to east.
        /// </summary>
        /// <value>The longitude value in degrees (WGS84/EPSG:4326) from west to east.</value>
        /// <example>6.110667</example>
        [DataMember(Name = "longitude", IsRequired = true, EmitDefaultValue = true)]
        public double? Longitude { get; set; }

        /// <summary>
        /// The radius [m] at which the waypoint has to be passed.
        /// </summary>
        /// <value>The radius [m] at which the waypoint has to be passed.</value>
        [DataMember(Name = "radius", IsRequired = true, EmitDefaultValue = true)]
        public int? Radius { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ManipulateRouteWaypoint {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
            sb.Append("  Radius: ").Append(Radius).Append("\n");
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
            // Latitude (double?) maximum
            if (this.Latitude > (double?)90)
            {
                yield return new ValidationResult("Invalid value for Latitude, must be a value less than or equal to 90.", new [] { "Latitude" });
            }

            // Latitude (double?) minimum
            if (this.Latitude < (double?)-90)
            {
                yield return new ValidationResult("Invalid value for Latitude, must be a value greater than or equal to -90.", new [] { "Latitude" });
            }

            // Longitude (double?) maximum
            if (this.Longitude > (double?)180)
            {
                yield return new ValidationResult("Invalid value for Longitude, must be a value less than or equal to 180.", new [] { "Longitude" });
            }

            // Longitude (double?) minimum
            if (this.Longitude < (double?)-180)
            {
                yield return new ValidationResult("Invalid value for Longitude, must be a value greater than or equal to -180.", new [] { "Longitude" });
            }

            // Radius (int?) minimum
            if (this.Radius < (int?)1)
            {
                yield return new ValidationResult("Invalid value for Radius, must be a value greater than or equal to 1.", new [] { "Radius" });
            }

            yield break;
        }
    }

}
