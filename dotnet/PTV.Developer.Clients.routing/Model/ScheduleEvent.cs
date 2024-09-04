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
    /// Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. If **useServiceTimeForRecreation** is true, each _SERVICE_ is reported along with another type depending on whether or not the service time is actually used for recreation. Times on a combined transport are always _WAITING_ unless used for recreation. Requires _SCHEDULE_EVENTS_ to be requested, POST only.
    /// </summary>
    [DataContract(Name = "ScheduleEvent")]
    public partial class ScheduleEvent : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScheduleEvent" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ScheduleEvent() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScheduleEvent" /> class.
        /// </summary>
        /// <param name="duration">The duration [s]. (required).</param>
        /// <param name="scheduleTypes">Tells what happens at this position of the route.  (required).</param>
        public ScheduleEvent(int? duration = default(int?), List<ScheduleType> scheduleTypes = default(List<ScheduleType>))
        {
            // to ensure "duration" is required (not null)
            if (duration == null)
            {
                throw new ArgumentNullException("duration is a required property for ScheduleEvent and cannot be null");
            }
            this.Duration = duration;
            // to ensure "scheduleTypes" is required (not null)
            if (scheduleTypes == null)
            {
                throw new ArgumentNullException("scheduleTypes is a required property for ScheduleEvent and cannot be null");
            }
            this.ScheduleTypes = scheduleTypes;
        }

        /// <summary>
        /// The duration [s].
        /// </summary>
        /// <value>The duration [s].</value>
        [DataMember(Name = "duration", IsRequired = true, EmitDefaultValue = true)]
        public int? Duration { get; set; }

        /// <summary>
        /// Tells what happens at this position of the route. 
        /// </summary>
        /// <value>Tells what happens at this position of the route. </value>
        [DataMember(Name = "scheduleTypes", IsRequired = true, EmitDefaultValue = true)]
        public List<ScheduleType> ScheduleTypes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScheduleEvent {\n");
            sb.Append("  Duration: ").Append(Duration).Append("\n");
            sb.Append("  ScheduleTypes: ").Append(ScheduleTypes).Append("\n");
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
            // Duration (int?) minimum
            if (this.Duration < (int?)0)
            {
                yield return new ValidationResult("Invalid value for Duration, must be a value greater than or equal to 0.", new [] { "Duration" });
            }

            yield break;
        }
    }

}
