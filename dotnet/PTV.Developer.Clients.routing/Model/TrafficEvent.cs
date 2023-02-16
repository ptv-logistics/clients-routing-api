/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
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
    /// Issued when the route passes a road for which live traffic data contain an incident such as a traffic jam. Requires _TRAFFIC_EVENTS_ to be requested.
    /// </summary>
    [DataContract(Name = "TrafficEvent")]
    public partial class TrafficEvent : IEquatable<TrafficEvent>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets AccessType
        /// </summary>
        [DataMember(Name = "accessType", IsRequired = true, EmitDefaultValue = true)]
        public AccessType AccessType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="TrafficEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TrafficEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TrafficEvent" /> class.
        /// </summary>
        /// <param name="delay">The delay due to this incident [s]. (required).</param>
        /// <param name="description">The description of the incident in the language specified by the parameter **options[language]**. .</param>
        /// <param name="language">The language of the description, if the given language is not supported for this incident. Not present otherwise..</param>
        /// <param name="accessType">accessType (required).</param>
        /// <param name="relatedEventIndex">For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise..</param>
        /// <param name="polyline">The polyline of the traffic event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _TRAFFIC_EVENTS_POLYLINE_ to be requested..</param>
        public TrafficEvent(int delay = default(int), string description = default(string), string language = default(string), AccessType accessType = default(AccessType), int relatedEventIndex = default(int), string polyline = default(string))
        {
            this.Delay = delay;
            this.AccessType = accessType;
            this.Description = description;
            this.Language = language;
            this.RelatedEventIndex = relatedEventIndex;
            this.Polyline = polyline;
        }

        /// <summary>
        /// The delay due to this incident [s].
        /// </summary>
        /// <value>The delay due to this incident [s].</value>
        [DataMember(Name = "delay", IsRequired = true, EmitDefaultValue = true)]
        public int Delay { get; set; }

        /// <summary>
        /// The description of the incident in the language specified by the parameter **options[language]**. 
        /// </summary>
        /// <value>The description of the incident in the language specified by the parameter **options[language]**. </value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// The language of the description, if the given language is not supported for this incident. Not present otherwise.
        /// </summary>
        /// <value>The language of the description, if the given language is not supported for this incident. Not present otherwise.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.
        /// </summary>
        /// <value>For **accessType** _ENTER_ this index points to the corresponding event with **accessType** _EXIT_ and vice-versa. Not present otherwise.</value>
        [DataMember(Name = "relatedEventIndex", EmitDefaultValue = false)]
        public int RelatedEventIndex { get; set; }

        /// <summary>
        /// The polyline of the traffic event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _TRAFFIC_EVENTS_POLYLINE_ to be requested.
        /// </summary>
        /// <value>The polyline of the traffic event in the format specified by **options[polylineFormat]**. Only present for **accessType** _ENTER_. Requires _TRAFFIC_EVENTS_POLYLINE_ to be requested.</value>
        [DataMember(Name = "polyline", EmitDefaultValue = false)]
        public string Polyline { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TrafficEvent {\n");
            sb.Append("  Delay: ").Append(Delay).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  AccessType: ").Append(AccessType).Append("\n");
            sb.Append("  RelatedEventIndex: ").Append(RelatedEventIndex).Append("\n");
            sb.Append("  Polyline: ").Append(Polyline).Append("\n");
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
            return this.Equals(input as TrafficEvent);
        }

        /// <summary>
        /// Returns true if TrafficEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of TrafficEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TrafficEvent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Delay == input.Delay ||
                    this.Delay.Equals(input.Delay)
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.AccessType == input.AccessType ||
                    this.AccessType.Equals(input.AccessType)
                ) && 
                (
                    this.RelatedEventIndex == input.RelatedEventIndex ||
                    this.RelatedEventIndex.Equals(input.RelatedEventIndex)
                ) && 
                (
                    this.Polyline == input.Polyline ||
                    (this.Polyline != null &&
                    this.Polyline.Equals(input.Polyline))
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
                hashCode = (hashCode * 59) + this.Delay.GetHashCode();
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AccessType.GetHashCode();
                hashCode = (hashCode * 59) + this.RelatedEventIndex.GetHashCode();
                if (this.Polyline != null)
                {
                    hashCode = (hashCode * 59) + this.Polyline.GetHashCode();
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
            // Language (string) pattern
            Regex regexLanguage = new Regex(@"[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*", RegexOptions.CultureInvariant);
            if (false == regexLanguage.Match(this.Language).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, must match a pattern of " + regexLanguage, new [] { "Language" });
            }

            // RelatedEventIndex (int) minimum
            if (this.RelatedEventIndex < (int)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelatedEventIndex, must be a value greater than or equal to 0.", new [] { "RelatedEventIndex" });
            }

            yield break;
        }
    }

}
