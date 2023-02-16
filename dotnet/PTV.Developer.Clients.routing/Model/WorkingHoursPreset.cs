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
    /// Enables the calculation of break and rest times according to the selected rules. Breaks and rests will be added to the **travelTime**, details can be requested through the _SCHEDULE_EVENTS_. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY&#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum driving time 9 hours, maximum travel time 13 hours.   * &#x60;EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY&#x60; - Based on Directive 2002/15/EC of the European Parliament and of the Council \&quot;on the organisation of the working time of persons performing mobile road transport activities\&quot;.   Break time 30 min, maximum working time between breaks 6 hours, maximum travel time 9.5 hours.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS &#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours,   daily rest time 11 hours, maximum driving time between daily rests 9 hours, maximum travel time between daily rests 13 hours,   maximum driving time 56 hours, maximum travel time 144 hours.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours, maximum driving time 11 hours, maximum travel time 14 hours.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours,   daily rest time 10 hours, maximum driving time between daily rests 11 hours, maximum travel time between daily rests 14 hours.  For details see this [concept](./concepts/drivers-working-hours).
    /// </summary>
    /// <value>Enables the calculation of break and rest times according to the selected rules. Breaks and rests will be added to the **travelTime**, details can be requested through the _SCHEDULE_EVENTS_. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY&#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum driving time 9 hours, maximum travel time 13 hours.   * &#x60;EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY&#x60; - Based on Directive 2002/15/EC of the European Parliament and of the Council \&quot;on the organisation of the working time of persons performing mobile road transport activities\&quot;.   Break time 30 min, maximum working time between breaks 6 hours, maximum travel time 9.5 hours.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS &#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours,   daily rest time 11 hours, maximum driving time between daily rests 9 hours, maximum travel time between daily rests 13 hours,   maximum driving time 56 hours, maximum travel time 144 hours.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours, maximum driving time 11 hours, maximum travel time 14 hours.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours,   daily rest time 10 hours, maximum driving time between daily rests 11 hours, maximum travel time between daily rests 14 hours.  For details see this [concept](./concepts/drivers-working-hours).</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum WorkingHoursPreset
    {
        /// <summary>
        /// Enum EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY for value: EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY")]
        EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY = 1,

        /// <summary>
        /// Enum EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY for value: EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY")]
        EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY = 2,

        /// <summary>
        /// Enum EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS for value: EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS
        /// </summary>
        [EnumMember(Value = "EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS")]
        EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS = 3,

        /// <summary>
        /// Enum US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY for value: US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY")]
        US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY = 4,

        /// <summary>
        /// Enum US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS for value: US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS
        /// </summary>
        [EnumMember(Value = "US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS")]
        US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS = 5

    }

}
