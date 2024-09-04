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
    /// The consumption summary for the specified vehicle model including the weather used for consumption calculation. Only present if both _EV_REPORT_ and _LEGS_ is requested. 
    /// </summary>
    [DataContract(Name = "EvReportLeg")]
    public partial class EvReportLeg : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EvReportLeg" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EvReportLeg() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EvReportLeg" /> class.
        /// </summary>
        /// <param name="electricityConsumption">The electricity consumption since the start of the leg [kWh]. (required).</param>
        /// <param name="batteryStateOfCharge">The remaining state of charge at the end of the leg [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero. (required).</param>
        /// <param name="weatherAtStart">weatherAtStart (required).</param>
        /// <param name="weatherAtEnd">weatherAtEnd (required).</param>
        public EvReportLeg(double? electricityConsumption = default(double?), double? batteryStateOfCharge = default(double?), WeatherResponse weatherAtStart = default(WeatherResponse), WeatherResponse weatherAtEnd = default(WeatherResponse))
        {
            // to ensure "electricityConsumption" is required (not null)
            if (electricityConsumption == null)
            {
                throw new ArgumentNullException("electricityConsumption is a required property for EvReportLeg and cannot be null");
            }
            this.ElectricityConsumption = electricityConsumption;
            // to ensure "batteryStateOfCharge" is required (not null)
            if (batteryStateOfCharge == null)
            {
                throw new ArgumentNullException("batteryStateOfCharge is a required property for EvReportLeg and cannot be null");
            }
            this.BatteryStateOfCharge = batteryStateOfCharge;
            // to ensure "weatherAtStart" is required (not null)
            if (weatherAtStart == null)
            {
                throw new ArgumentNullException("weatherAtStart is a required property for EvReportLeg and cannot be null");
            }
            this.WeatherAtStart = weatherAtStart;
            // to ensure "weatherAtEnd" is required (not null)
            if (weatherAtEnd == null)
            {
                throw new ArgumentNullException("weatherAtEnd is a required property for EvReportLeg and cannot be null");
            }
            this.WeatherAtEnd = weatherAtEnd;
        }

        /// <summary>
        /// The electricity consumption since the start of the leg [kWh].
        /// </summary>
        /// <value>The electricity consumption since the start of the leg [kWh].</value>
        [DataMember(Name = "electricityConsumption", IsRequired = true, EmitDefaultValue = true)]
        public double? ElectricityConsumption { get; set; }

        /// <summary>
        /// The remaining state of charge at the end of the leg [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero.
        /// </summary>
        /// <value>The remaining state of charge at the end of the leg [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero.</value>
        /// <example>58</example>
        [DataMember(Name = "batteryStateOfCharge", IsRequired = true, EmitDefaultValue = true)]
        public double? BatteryStateOfCharge { get; set; }

        /// <summary>
        /// Gets or Sets WeatherAtStart
        /// </summary>
        [DataMember(Name = "weatherAtStart", IsRequired = true, EmitDefaultValue = true)]
        public WeatherResponse WeatherAtStart { get; set; }

        /// <summary>
        /// Gets or Sets WeatherAtEnd
        /// </summary>
        [DataMember(Name = "weatherAtEnd", IsRequired = true, EmitDefaultValue = true)]
        public WeatherResponse WeatherAtEnd { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EvReportLeg {\n");
            sb.Append("  ElectricityConsumption: ").Append(ElectricityConsumption).Append("\n");
            sb.Append("  BatteryStateOfCharge: ").Append(BatteryStateOfCharge).Append("\n");
            sb.Append("  WeatherAtStart: ").Append(WeatherAtStart).Append("\n");
            sb.Append("  WeatherAtEnd: ").Append(WeatherAtEnd).Append("\n");
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
            // BatteryStateOfCharge (double?) maximum
            if (this.BatteryStateOfCharge > (double?)100)
            {
                yield return new ValidationResult("Invalid value for BatteryStateOfCharge, must be a value less than or equal to 100.", new [] { "BatteryStateOfCharge" });
            }

            yield break;
        }
    }

}
