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
    /// Name and number of the road ahead.
    /// </summary>
    [DataContract(Name = "RoadAhead")]
    public partial class RoadAhead : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RoadAhead" /> class.
        /// </summary>
        /// <param name="name">The name of the road. It does not depend on the selected language, instead it is presented as it can be found on local signs..</param>
        /// <param name="number">The number of the road which may consist of several numbers separated by \&quot;/\&quot;..</param>
        public RoadAhead(string name = default(string), string number = default(string))
        {
            this.Name = name;
            this.Number = number;
        }

        /// <summary>
        /// The name of the road. It does not depend on the selected language, instead it is presented as it can be found on local signs.
        /// </summary>
        /// <value>The name of the road. It does not depend on the selected language, instead it is presented as it can be found on local signs.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The number of the road which may consist of several numbers separated by \&quot;/\&quot;.
        /// </summary>
        /// <value>The number of the road which may consist of several numbers separated by \&quot;/\&quot;.</value>
        [DataMember(Name = "number", EmitDefaultValue = false)]
        public string Number { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RoadAhead {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
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
