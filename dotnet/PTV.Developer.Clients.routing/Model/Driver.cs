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
    /// Driver
    /// </summary>
    [DataContract(Name = "Driver")]
    public partial class Driver : IValidatableObject
    {

        /// <summary>
        /// Gets or Sets WorkingHoursPreset
        /// </summary>
        [DataMember(Name = "workingHoursPreset", IsRequired = true, EmitDefaultValue = true)]
        public WorkingHoursPreset WorkingHoursPreset { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Driver" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Driver() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Driver" /> class.
        /// </summary>
        /// <param name="workingHoursPreset">workingHoursPreset (required).</param>
        public Driver(WorkingHoursPreset workingHoursPreset = default(WorkingHoursPreset))
        {
            this.WorkingHoursPreset = workingHoursPreset;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Driver {\n");
            sb.Append("  WorkingHoursPreset: ").Append(WorkingHoursPreset).Append("\n");
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
            yield break;
        }
    }

}
