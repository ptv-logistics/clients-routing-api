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
    /// TollSection
    /// </summary>
    [DataContract(Name = "TollSection")]
    public partial class TollSection : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets TollRoadType
        /// </summary>
        [DataMember(Name = "tollRoadType", IsRequired = true, EmitDefaultValue = true)]
        public TollRoadType TollRoadType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSection" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollSection() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSection" /> class.
        /// </summary>
        /// <param name="costs">The toll costs payable for this section. If different prices according to the payment method exist, this list contains one item for each price. The first item contains the price used to calculate the total toll costs for the route. Further items are alternative costs for the section with different payment methods or different subscriptions. (required).</param>
        /// <param name="tollRoadType">tollRoadType (required).</param>
        /// <param name="tollSystemIndex">The index in the list of toll systems this toll section belongs to..</param>
        /// <param name="countryCode">Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision. (required).</param>
        /// <param name="displayName">A name that describes this toll section. It can relate to the names of the road intersections, to the area in general or to the type of toll..</param>
        /// <param name="officialDistance">The official distance defined by the toll operator [m].  It may be different from the travel distance. Only present if the toll operator provides an official distance..</param>
        /// <param name="calculatedDistance">The calculated distance of the toll section on the current route.  It may be different from the official distance..</param>
        /// <param name="approximated">States whether the section is approximated because the start or destination waypoint is located inside a toll section and thus the exact toll price cannot be calculated. The closest toll location after the waypoint is used to approximate the toll price..</param>
        public TollSection(List<TollSectionCost> costs = default(List<TollSectionCost>), TollRoadType tollRoadType = default(TollRoadType), int? tollSystemIndex = default(int?), string countryCode = default(string), string displayName = default(string), int? officialDistance = default(int?), int? calculatedDistance = default(int?), bool? approximated = default(bool?))
        {
            // to ensure "costs" is required (not null)
            if (costs == null)
            {
                throw new ArgumentNullException("costs is a required property for TollSection and cannot be null");
            }
            this.Costs = costs;
            this.TollRoadType = tollRoadType;
            // to ensure "countryCode" is required (not null)
            if (countryCode == null)
            {
                throw new ArgumentNullException("countryCode is a required property for TollSection and cannot be null");
            }
            this.CountryCode = countryCode;
            this.TollSystemIndex = tollSystemIndex;
            this.DisplayName = displayName;
            this.OfficialDistance = officialDistance;
            this.CalculatedDistance = calculatedDistance;
            this.Approximated = approximated;
        }

        /// <summary>
        /// The toll costs payable for this section. If different prices according to the payment method exist, this list contains one item for each price. The first item contains the price used to calculate the total toll costs for the route. Further items are alternative costs for the section with different payment methods or different subscriptions.
        /// </summary>
        /// <value>The toll costs payable for this section. If different prices according to the payment method exist, this list contains one item for each price. The first item contains the price used to calculate the total toll costs for the route. Further items are alternative costs for the section with different payment methods or different subscriptions.</value>
        [DataMember(Name = "costs", IsRequired = true, EmitDefaultValue = true)]
        public List<TollSectionCost> Costs { get; set; }

        /// <summary>
        /// The index in the list of toll systems this toll section belongs to.
        /// </summary>
        /// <value>The index in the list of toll systems this toll section belongs to.</value>
        [DataMember(Name = "tollSystemIndex", EmitDefaultValue = true)]
        public int? TollSystemIndex { get; set; }

        /// <summary>
        /// Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
        /// </summary>
        /// <value>Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.</value>
        [DataMember(Name = "countryCode", IsRequired = true, EmitDefaultValue = true)]
        public string CountryCode { get; set; }

        /// <summary>
        /// A name that describes this toll section. It can relate to the names of the road intersections, to the area in general or to the type of toll.
        /// </summary>
        /// <value>A name that describes this toll section. It can relate to the names of the road intersections, to the area in general or to the type of toll.</value>
        [DataMember(Name = "displayName", EmitDefaultValue = true)]
        public string DisplayName { get; set; }

        /// <summary>
        /// The official distance defined by the toll operator [m].  It may be different from the travel distance. Only present if the toll operator provides an official distance.
        /// </summary>
        /// <value>The official distance defined by the toll operator [m].  It may be different from the travel distance. Only present if the toll operator provides an official distance.</value>
        /// <example>142</example>
        [DataMember(Name = "officialDistance", EmitDefaultValue = true)]
        public int? OfficialDistance { get; set; }

        /// <summary>
        /// The calculated distance of the toll section on the current route.  It may be different from the official distance.
        /// </summary>
        /// <value>The calculated distance of the toll section on the current route.  It may be different from the official distance.</value>
        /// <example>141</example>
        [DataMember(Name = "calculatedDistance", EmitDefaultValue = true)]
        public int? CalculatedDistance { get; set; }

        /// <summary>
        /// States whether the section is approximated because the start or destination waypoint is located inside a toll section and thus the exact toll price cannot be calculated. The closest toll location after the waypoint is used to approximate the toll price.
        /// </summary>
        /// <value>States whether the section is approximated because the start or destination waypoint is located inside a toll section and thus the exact toll price cannot be calculated. The closest toll location after the waypoint is used to approximate the toll price.</value>
        /// <example>false</example>
        [DataMember(Name = "approximated", EmitDefaultValue = true)]
        public bool? Approximated { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollSection {\n");
            sb.Append("  Costs: ").Append(Costs).Append("\n");
            sb.Append("  TollRoadType: ").Append(TollRoadType).Append("\n");
            sb.Append("  TollSystemIndex: ").Append(TollSystemIndex).Append("\n");
            sb.Append("  CountryCode: ").Append(CountryCode).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  OfficialDistance: ").Append(OfficialDistance).Append("\n");
            sb.Append("  CalculatedDistance: ").Append(CalculatedDistance).Append("\n");
            sb.Append("  Approximated: ").Append(Approximated).Append("\n");
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
            // TollSystemIndex (int?) minimum
            if (this.TollSystemIndex < (int?)0)
            {
                yield return new ValidationResult("Invalid value for TollSystemIndex, must be a value greater than or equal to 0.", new [] { "TollSystemIndex" });
            }

            // OfficialDistance (int?) minimum
            if (this.OfficialDistance < (int?)0)
            {
                yield return new ValidationResult("Invalid value for OfficialDistance, must be a value greater than or equal to 0.", new [] { "OfficialDistance" });
            }

            // CalculatedDistance (int?) minimum
            if (this.CalculatedDistance < (int?)0)
            {
                yield return new ValidationResult("Invalid value for CalculatedDistance, must be a value greater than or equal to 0.", new [] { "CalculatedDistance" });
            }

            yield break;
        }
    }

}
