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
    /// Provides an overview of the times of the schedule of this route including break and rest times. The sum of all times is equal to the **travelTime** of the route.         If **useServiceTimeForRecreation** is true, waiting, break and rest times which take place during service will not be reported here. If that does not match your needs, please evaluate the corresponding **scheduleEvent**s.  Requires _SCHEDULE_REPORT_ to be requested, POST only.
    /// </summary>
    [DataContract(Name = "ScheduleReport")]
    public partial class ScheduleReport : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScheduleReport" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ScheduleReport() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScheduleReport" /> class.
        /// </summary>
        /// <param name="startTime">The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified..</param>
        /// <param name="endTime">The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified..</param>
        /// <param name="drivingTime">The total driving time of the route [s]. Time which is not service, waiting, break or rest is considered as driving. (required).</param>
        /// <param name="serviceTime">The total service time of the route [s], equal to the sum of **schedule** events of type _SERVICE_. (required).</param>
        /// <param name="waitingTime">The total waiting time of the route [s], equal to the sum of **schedule** events of type _WAITING_ which are not _SERVICE_ at the same time. (required).</param>
        /// <param name="breakTime">The total break time of the route [s], equal to the sum of **schedule** events of type _BREAK_ which are not _SERVICE_ at the same time. (required).</param>
        /// <param name="restTime">The total rest time of the route [s], equal to the sum of **schedule** events of type _DAILY_REST_ which are not _SERVICE_ at the same time. (required).</param>
        public ScheduleReport(DateTimeOffset? startTime = default(DateTimeOffset?), DateTimeOffset? endTime = default(DateTimeOffset?), int? drivingTime = default(int?), int? serviceTime = default(int?), int? waitingTime = default(int?), int? breakTime = default(int?), int? restTime = default(int?))
        {
            // to ensure "drivingTime" is required (not null)
            if (drivingTime == null)
            {
                throw new ArgumentNullException("drivingTime is a required property for ScheduleReport and cannot be null");
            }
            this.DrivingTime = drivingTime;
            // to ensure "serviceTime" is required (not null)
            if (serviceTime == null)
            {
                throw new ArgumentNullException("serviceTime is a required property for ScheduleReport and cannot be null");
            }
            this.ServiceTime = serviceTime;
            // to ensure "waitingTime" is required (not null)
            if (waitingTime == null)
            {
                throw new ArgumentNullException("waitingTime is a required property for ScheduleReport and cannot be null");
            }
            this.WaitingTime = waitingTime;
            // to ensure "breakTime" is required (not null)
            if (breakTime == null)
            {
                throw new ArgumentNullException("breakTime is a required property for ScheduleReport and cannot be null");
            }
            this.BreakTime = breakTime;
            // to ensure "restTime" is required (not null)
            if (restTime == null)
            {
                throw new ArgumentNullException("restTime is a required property for ScheduleReport and cannot be null");
            }
            this.RestTime = restTime;
            this.StartTime = startTime;
            this.EndTime = endTime;
        }

        /// <summary>
        /// The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
        /// </summary>
        /// <value>The start time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.</value>
        [DataMember(Name = "startTime", EmitDefaultValue = true)]
        public DateTimeOffset? StartTime { get; set; }

        /// <summary>
        /// The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.
        /// </summary>
        /// <value>The end time of the route formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339). Only present with **options[trafficMode]** _REALISTIC_ or when **options[startTime]** is specified.</value>
        [DataMember(Name = "endTime", EmitDefaultValue = true)]
        public DateTimeOffset? EndTime { get; set; }

        /// <summary>
        /// The total driving time of the route [s]. Time which is not service, waiting, break or rest is considered as driving.
        /// </summary>
        /// <value>The total driving time of the route [s]. Time which is not service, waiting, break or rest is considered as driving.</value>
        [DataMember(Name = "drivingTime", IsRequired = true, EmitDefaultValue = true)]
        public int? DrivingTime { get; set; }

        /// <summary>
        /// The total service time of the route [s], equal to the sum of **schedule** events of type _SERVICE_.
        /// </summary>
        /// <value>The total service time of the route [s], equal to the sum of **schedule** events of type _SERVICE_.</value>
        [DataMember(Name = "serviceTime", IsRequired = true, EmitDefaultValue = true)]
        public int? ServiceTime { get; set; }

        /// <summary>
        /// The total waiting time of the route [s], equal to the sum of **schedule** events of type _WAITING_ which are not _SERVICE_ at the same time.
        /// </summary>
        /// <value>The total waiting time of the route [s], equal to the sum of **schedule** events of type _WAITING_ which are not _SERVICE_ at the same time.</value>
        [DataMember(Name = "waitingTime", IsRequired = true, EmitDefaultValue = true)]
        public int? WaitingTime { get; set; }

        /// <summary>
        /// The total break time of the route [s], equal to the sum of **schedule** events of type _BREAK_ which are not _SERVICE_ at the same time.
        /// </summary>
        /// <value>The total break time of the route [s], equal to the sum of **schedule** events of type _BREAK_ which are not _SERVICE_ at the same time.</value>
        [DataMember(Name = "breakTime", IsRequired = true, EmitDefaultValue = true)]
        public int? BreakTime { get; set; }

        /// <summary>
        /// The total rest time of the route [s], equal to the sum of **schedule** events of type _DAILY_REST_ which are not _SERVICE_ at the same time.
        /// </summary>
        /// <value>The total rest time of the route [s], equal to the sum of **schedule** events of type _DAILY_REST_ which are not _SERVICE_ at the same time.</value>
        [DataMember(Name = "restTime", IsRequired = true, EmitDefaultValue = true)]
        public int? RestTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScheduleReport {\n");
            sb.Append("  StartTime: ").Append(StartTime).Append("\n");
            sb.Append("  EndTime: ").Append(EndTime).Append("\n");
            sb.Append("  DrivingTime: ").Append(DrivingTime).Append("\n");
            sb.Append("  ServiceTime: ").Append(ServiceTime).Append("\n");
            sb.Append("  WaitingTime: ").Append(WaitingTime).Append("\n");
            sb.Append("  BreakTime: ").Append(BreakTime).Append("\n");
            sb.Append("  RestTime: ").Append(RestTime).Append("\n");
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
            // DrivingTime (int?) minimum
            if (this.DrivingTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for DrivingTime, must be a value greater than or equal to 0.", new [] { "DrivingTime" });
            }

            // ServiceTime (int?) minimum
            if (this.ServiceTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for ServiceTime, must be a value greater than or equal to 0.", new [] { "ServiceTime" });
            }

            // WaitingTime (int?) minimum
            if (this.WaitingTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for WaitingTime, must be a value greater than or equal to 0.", new [] { "WaitingTime" });
            }

            // BreakTime (int?) minimum
            if (this.BreakTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for BreakTime, must be a value greater than or equal to 0.", new [] { "BreakTime" });
            }

            // RestTime (int?) minimum
            if (this.RestTime < (int?)0)
            {
                yield return new ValidationResult("Invalid value for RestTime, must be a value greater than or equal to 0.", new [] { "RestTime" });
            }

            yield break;
        }
    }

}
