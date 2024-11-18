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
    /// Issued when a road subject to toll is entered or exited. Requires _TOLL_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "TollEvent")]
    public partial class TollEvent : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets AccessType
        /// </summary>
        [DataMember(Name = "accessType", IsRequired = true, EmitDefaultValue = true)]
        public AccessType AccessType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollEvent" /> class.
        /// </summary>
        /// <param name="sectionIndex">The index of the corresponding toll section.  The section indexes of a pair of ENTER and EXIT events define the range of sections between the two events..</param>
        /// <param name="displayName">The display name of the toll event. Only present if a name is available. For example, this name can be a toll location name defined by the toll operator. In some cases the display names of the toll event and the toll section can differ. In case the toll section has been approximated, the display name of the affected toll event contains the hint \&quot;(approximated)\&quot;..</param>
        /// <param name="accessType">accessType (required).</param>
        /// <param name="relatedEventIndex">For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise..</param>
        public TollEvent(int? sectionIndex = default(int?), string displayName = default(string), AccessType accessType = default(AccessType), int? relatedEventIndex = default(int?))
        {
            this.AccessType = accessType;
            this.SectionIndex = sectionIndex;
            this.DisplayName = displayName;
            this.RelatedEventIndex = relatedEventIndex;
        }

        /// <summary>
        /// The index of the corresponding toll section.  The section indexes of a pair of ENTER and EXIT events define the range of sections between the two events.
        /// </summary>
        /// <value>The index of the corresponding toll section.  The section indexes of a pair of ENTER and EXIT events define the range of sections between the two events.</value>
        [DataMember(Name = "sectionIndex", EmitDefaultValue = true)]
        public int? SectionIndex { get; set; }

        /// <summary>
        /// The display name of the toll event. Only present if a name is available. For example, this name can be a toll location name defined by the toll operator. In some cases the display names of the toll event and the toll section can differ. In case the toll section has been approximated, the display name of the affected toll event contains the hint \&quot;(approximated)\&quot;.
        /// </summary>
        /// <value>The display name of the toll event. Only present if a name is available. For example, this name can be a toll location name defined by the toll operator. In some cases the display names of the toll event and the toll section can differ. In case the toll section has been approximated, the display name of the affected toll event contains the hint \&quot;(approximated)\&quot;.</value>
        [DataMember(Name = "displayName", EmitDefaultValue = true)]
        public string DisplayName { get; set; }

        /// <summary>
        /// For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
        /// </summary>
        /// <value>For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.</value>
        [DataMember(Name = "relatedEventIndex", EmitDefaultValue = true)]
        public int? RelatedEventIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollEvent {\n");
            sb.Append("  SectionIndex: ").Append(SectionIndex).Append("\n");
            sb.Append("  DisplayName: ").Append(DisplayName).Append("\n");
            sb.Append("  AccessType: ").Append(AccessType).Append("\n");
            sb.Append("  RelatedEventIndex: ").Append(RelatedEventIndex).Append("\n");
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
            // SectionIndex (int?) minimum
            if (this.SectionIndex < (int?)0)
            {
                yield return new ValidationResult("Invalid value for SectionIndex, must be a value greater than or equal to 0.", new [] { "SectionIndex" });
            }

            // RelatedEventIndex (int?) minimum
            if (this.RelatedEventIndex < (int?)0)
            {
                yield return new ValidationResult("Invalid value for RelatedEventIndex, must be a value greater than or equal to 0.", new [] { "RelatedEventIndex" });
            }

            yield break;
        }
    }

}
