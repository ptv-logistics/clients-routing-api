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
    /// TollSystem
    /// </summary>
    [DataContract(Name = "TollSystem")]
    public partial class TollSystem : IEquatable<TollSystem>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSystem" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollSystem() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSystem" /> class.
        /// </summary>
        /// <param name="name">The name of the toll system. (required).</param>
        /// <param name="operatorName">The name of the toll operator..</param>
        /// <param name="tariffVersion">The tariff version that has been used..</param>
        /// <param name="tariffVersionValidFrom">The starting date of the tariff version validity formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339)..</param>
        public TollSystem(string name = default(string), string operatorName = default(string), string tariffVersion = default(string), DateTimeOffset tariffVersionValidFrom = default(DateTimeOffset))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for TollSystem and cannot be null");
            }
            this.Name = name;
            this.OperatorName = operatorName;
            this.TariffVersion = tariffVersion;
            this.TariffVersionValidFrom = tariffVersionValidFrom;
        }

        /// <summary>
        /// The name of the toll system.
        /// </summary>
        /// <value>The name of the toll system.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The name of the toll operator.
        /// </summary>
        /// <value>The name of the toll operator.</value>
        [DataMember(Name = "operatorName", EmitDefaultValue = false)]
        public string OperatorName { get; set; }

        /// <summary>
        /// The tariff version that has been used.
        /// </summary>
        /// <value>The tariff version that has been used.</value>
        [DataMember(Name = "tariffVersion", EmitDefaultValue = false)]
        public string TariffVersion { get; set; }

        /// <summary>
        /// The starting date of the tariff version validity formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).
        /// </summary>
        /// <value>The starting date of the tariff version validity formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).</value>
        [DataMember(Name = "tariffVersionValidFrom", EmitDefaultValue = false)]
        public DateTimeOffset TariffVersionValidFrom { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollSystem {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  OperatorName: ").Append(OperatorName).Append("\n");
            sb.Append("  TariffVersion: ").Append(TariffVersion).Append("\n");
            sb.Append("  TariffVersionValidFrom: ").Append(TariffVersionValidFrom).Append("\n");
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
            return this.Equals(input as TollSystem);
        }

        /// <summary>
        /// Returns true if TollSystem instances are equal
        /// </summary>
        /// <param name="input">Instance of TollSystem to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(TollSystem input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.OperatorName == input.OperatorName ||
                    (this.OperatorName != null &&
                    this.OperatorName.Equals(input.OperatorName))
                ) && 
                (
                    this.TariffVersion == input.TariffVersion ||
                    (this.TariffVersion != null &&
                    this.TariffVersion.Equals(input.TariffVersion))
                ) && 
                (
                    this.TariffVersionValidFrom == input.TariffVersionValidFrom ||
                    (this.TariffVersionValidFrom != null &&
                    this.TariffVersionValidFrom.Equals(input.TariffVersionValidFrom))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.OperatorName != null)
                {
                    hashCode = (hashCode * 59) + this.OperatorName.GetHashCode();
                }
                if (this.TariffVersion != null)
                {
                    hashCode = (hashCode * 59) + this.TariffVersion.GetHashCode();
                }
                if (this.TariffVersionValidFrom != null)
                {
                    hashCode = (hashCode * 59) + this.TariffVersionValidFrom.GetHashCode();
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
