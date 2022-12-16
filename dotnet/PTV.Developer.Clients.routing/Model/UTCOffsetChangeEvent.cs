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
    /// Issued when the offset to UTC changes, mostly when traveling into a different time zone. Requires _UTC_OFFSET_CHANGE_EVENTS_ to be requested.    Changing the UTC offset does not necessarily mean to change the time zone. Vice-versa changing the time zone does not necessarily mean to change the UTC offset. There are some special cases to consider.  *  The UTC offset may change even within a time zone when the route takes place exactly when the daylight-saving time changes.  *  The UTC offset may not change when changing the time zone. In Canada, for example, there are regions which do not use DST   so that the neighboring time zone has the same UTC offset in summer.
    /// </summary>
    [DataContract(Name = "UTCOffsetChangeEvent")]
    public partial class UTCOffsetChangeEvent : IEquatable<UTCOffsetChangeEvent>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UTCOffsetChangeEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UTCOffsetChangeEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UTCOffsetChangeEvent" /> class.
        /// </summary>
        /// <param name="utcOffset">The new UTC offset [min]. (required).</param>
        public UTCOffsetChangeEvent(int utcOffset = default(int))
        {
            this.UtcOffset = utcOffset;
        }

        /// <summary>
        /// The new UTC offset [min].
        /// </summary>
        /// <value>The new UTC offset [min].</value>
        [DataMember(Name = "utcOffset", IsRequired = true, EmitDefaultValue = false)]
        public int UtcOffset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UTCOffsetChangeEvent {\n");
            sb.Append("  UtcOffset: ").Append(UtcOffset).Append("\n");
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
            return this.Equals(input as UTCOffsetChangeEvent);
        }

        /// <summary>
        /// Returns true if UTCOffsetChangeEvent instances are equal
        /// </summary>
        /// <param name="input">Instance of UTCOffsetChangeEvent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UTCOffsetChangeEvent input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UtcOffset == input.UtcOffset ||
                    this.UtcOffset.Equals(input.UtcOffset)
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
                hashCode = (hashCode * 59) + this.UtcOffset.GetHashCode();
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
            // UtcOffset (int) maximum
            if (this.UtcOffset > (int)840)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for UtcOffset, must be a value less than or equal to 840.", new [] { "UtcOffset" });
            }

            // UtcOffset (int) minimum
            if (this.UtcOffset < (int)-720)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for UtcOffset, must be a value greater than or equal to -720.", new [] { "UtcOffset" });
            }

            yield break;
        }
    }

}
