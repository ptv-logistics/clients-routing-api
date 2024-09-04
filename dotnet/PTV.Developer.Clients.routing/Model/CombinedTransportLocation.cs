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
    /// Represents the start or destination location of a combined transport, e.g. the port.
    /// </summary>
    [DataContract(Name = "CombinedTransportLocation")]
    public partial class CombinedTransportLocation : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinedTransportLocation" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CombinedTransportLocation() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CombinedTransportLocation" /> class.
        /// </summary>
        /// <param name="latitude">The latitude value in degrees (WGS84/EPSG:4326) from south to north. (required).</param>
        /// <param name="longitude">The longitude value in degrees (WGS84/EPSG:4326) from west to east. (required).</param>
        public CombinedTransportLocation(double? latitude = default(double?), double? longitude = default(double?))
        {
            // to ensure "latitude" is required (not null)
            if (latitude == null)
            {
                throw new ArgumentNullException("latitude is a required property for CombinedTransportLocation and cannot be null");
            }
            this.Latitude = latitude;
            // to ensure "longitude" is required (not null)
            if (longitude == null)
            {
                throw new ArgumentNullException("longitude is a required property for CombinedTransportLocation and cannot be null");
            }
            this.Longitude = longitude;
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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CombinedTransportLocation {\n");
            sb.Append("  Latitude: ").Append(Latitude).Append("\n");
            sb.Append("  Longitude: ").Append(Longitude).Append("\n");
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

            yield break;
        }
    }

}
