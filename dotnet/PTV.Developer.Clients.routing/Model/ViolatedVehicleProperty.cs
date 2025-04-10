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
    /// ViolatedVehicleProperty
    /// </summary>
    [DataContract(Name = "ViolatedVehicleProperty")]
    public partial class ViolatedVehicleProperty : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ViolatedVehicleProperty" /> class.
        /// </summary>
        /// <param name="property">The name of the violated vehicle property.  The following values represent a vehicle property which is greater than the given **limit**: \&quot;WEIGHT\&quot;, \&quot;HEIGHT\&quot;, \&quot;LENGTH\&quot;, \&quot;AXLE_WEIGHT\&quot;, \&quot;WIDTH\&quot;, \&quot;KPRA_LENGTH\&quot;, \&quot;NUMBER_OF_AXLES\&quot;, \&quot;TOTAL_PERMITTED_WEIGHT\&quot;.  The following values represent a vehicle property for which **value** contains additional information: \&quot;LOW_EMISSION_ZONE\&quot;, \&quot;TRUCK_ROUTE\&quot;, \&quot;HAZARDOUS_MATERIALS\&quot;, \&quot;TUNNEL_RESTRICTION\&quot;, \&quot;TRAILER\&quot;.  This list can be extended at any time, clients should handle unknown values properly.  See [here](./concepts/violations) for more information..</param>
        /// <param name="limit">If the **property** represents a vehicle dimension such as _WEIGHT_ or _HEIGHT_, this value contains the limit which was exceeded by the vehicle..</param>
        /// <param name="value">If the **property** is:  * _LOW_EMISSION_ZONE_, this value contains the name of the low-emission zone, see the corresponding low-emission zone event for details on what is required to enter this zone, * _TRUCK_ROUTE_, this value contains the name of the truck route prohibited for the selected vehicle, * _HAZARDOUS_MATERIALS_, this value contains a comma-separated list of the prohibited hazardous materials. * _TUNNEL_RESTRICTION_, this value represents the allowed tunnel restriction code. * _TRAILER_, this value represents that a trailer is not allowed..</param>
        public ViolatedVehicleProperty(string property = default(string), int? limit = default(int?), string value = default(string))
        {
            this.Property = property;
            this.Limit = limit;
            this.Value = value;
        }

        /// <summary>
        /// The name of the violated vehicle property.  The following values represent a vehicle property which is greater than the given **limit**: \&quot;WEIGHT\&quot;, \&quot;HEIGHT\&quot;, \&quot;LENGTH\&quot;, \&quot;AXLE_WEIGHT\&quot;, \&quot;WIDTH\&quot;, \&quot;KPRA_LENGTH\&quot;, \&quot;NUMBER_OF_AXLES\&quot;, \&quot;TOTAL_PERMITTED_WEIGHT\&quot;.  The following values represent a vehicle property for which **value** contains additional information: \&quot;LOW_EMISSION_ZONE\&quot;, \&quot;TRUCK_ROUTE\&quot;, \&quot;HAZARDOUS_MATERIALS\&quot;, \&quot;TUNNEL_RESTRICTION\&quot;, \&quot;TRAILER\&quot;.  This list can be extended at any time, clients should handle unknown values properly.  See [here](./concepts/violations) for more information.
        /// </summary>
        /// <value>The name of the violated vehicle property.  The following values represent a vehicle property which is greater than the given **limit**: \&quot;WEIGHT\&quot;, \&quot;HEIGHT\&quot;, \&quot;LENGTH\&quot;, \&quot;AXLE_WEIGHT\&quot;, \&quot;WIDTH\&quot;, \&quot;KPRA_LENGTH\&quot;, \&quot;NUMBER_OF_AXLES\&quot;, \&quot;TOTAL_PERMITTED_WEIGHT\&quot;.  The following values represent a vehicle property for which **value** contains additional information: \&quot;LOW_EMISSION_ZONE\&quot;, \&quot;TRUCK_ROUTE\&quot;, \&quot;HAZARDOUS_MATERIALS\&quot;, \&quot;TUNNEL_RESTRICTION\&quot;, \&quot;TRAILER\&quot;.  This list can be extended at any time, clients should handle unknown values properly.  See [here](./concepts/violations) for more information.</value>
        [DataMember(Name = "property", EmitDefaultValue = true)]
        public string Property { get; set; }

        /// <summary>
        /// If the **property** represents a vehicle dimension such as _WEIGHT_ or _HEIGHT_, this value contains the limit which was exceeded by the vehicle.
        /// </summary>
        /// <value>If the **property** represents a vehicle dimension such as _WEIGHT_ or _HEIGHT_, this value contains the limit which was exceeded by the vehicle.</value>
        [DataMember(Name = "limit", EmitDefaultValue = true)]
        public int? Limit { get; set; }

        /// <summary>
        /// If the **property** is:  * _LOW_EMISSION_ZONE_, this value contains the name of the low-emission zone, see the corresponding low-emission zone event for details on what is required to enter this zone, * _TRUCK_ROUTE_, this value contains the name of the truck route prohibited for the selected vehicle, * _HAZARDOUS_MATERIALS_, this value contains a comma-separated list of the prohibited hazardous materials. * _TUNNEL_RESTRICTION_, this value represents the allowed tunnel restriction code. * _TRAILER_, this value represents that a trailer is not allowed.
        /// </summary>
        /// <value>If the **property** is:  * _LOW_EMISSION_ZONE_, this value contains the name of the low-emission zone, see the corresponding low-emission zone event for details on what is required to enter this zone, * _TRUCK_ROUTE_, this value contains the name of the truck route prohibited for the selected vehicle, * _HAZARDOUS_MATERIALS_, this value contains a comma-separated list of the prohibited hazardous materials. * _TUNNEL_RESTRICTION_, this value represents the allowed tunnel restriction code. * _TRAILER_, this value represents that a trailer is not allowed.</value>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ViolatedVehicleProperty {\n");
            sb.Append("  Property: ").Append(Property).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
