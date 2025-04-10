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
    /// Enables the calculation of break and rest times according to the selected rules. Breaks and rests will be added to the **travelTime**, details can be requested through the _SCHEDULE_EVENTS_. For single day presets no schedule events of type _DAILY_REST_ will be returned. Only _VIOLATION_EVENTS_ will be returned when the maximum working time or maximum driving time is exceeded. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY&#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum driving time 9 hours, maximum travel time 13 hours.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY&#x60; - In contrast to &#x60;EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY&#x60;,   the exception rules \&quot;Maximum driving time may be extended to 10h twice a week.\&quot; and \&quot;A daily rest may be reduced to 9h three times between weekly rests.\&quot;   are observed in so far as the driving time limit is extended and the daily rest time is reduced.   * &#x60;EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY&#x60; - Based on Directive 2002/15/EC of the European Parliament and of the Council \&quot;on the organisation of the working time of persons performing mobile road transport activities\&quot;.   Break time 30 min, maximum working time between breaks 6 hours, maximum travel time 9.5 hours.   * &#x60;EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY&#x60; - Makes sure that the standard rules of the EU directives 2003/88/EC and 2002/15/EC that are applicable for a route within a long single day are observed.   If working hours total more than 9h, a break must be 45min long. Here, a working time of at most 10h is guaranteed.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS &#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours,   daily rest time 11 hours, maximum driving time between daily rests 9 hours, maximum travel time between daily rests 13 hours,   maximum driving time 56 hours, maximum travel time 144 hours.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS&#x60; - When two drivers form a team, they can take turns.   In contrast to &#x60;EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS&#x60;, no breaks are scheduled and the daily rest time limits are raised.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours, maximum driving time 11 hours, maximum travel time 14 hours.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY&#x60; - Makes sure that the standard rules of the HOS regulations in 49 CFR 395 that are applicable for a route within a single day are observed.   It is assumed that the short-haul exception does apply so breaks are not scheduled.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours,   daily rest time 10 hours, maximum driving time between daily rests 11 hours, maximum travel time between daily rests 14 hours.  If this parameter is given both as query parameter and in the body then it must match. Otherwise an error is returned.   For details see this [concept](./concepts/drivers-working-hours).
    /// </summary>
    /// <value>Enables the calculation of break and rest times according to the selected rules. Breaks and rests will be added to the **travelTime**, details can be requested through the _SCHEDULE_EVENTS_. For single day presets no schedule events of type _DAILY_REST_ will be returned. Only _VIOLATION_EVENTS_ will be returned when the maximum working time or maximum driving time is exceeded. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY&#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum driving time 9 hours, maximum travel time 13 hours.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY&#x60; - In contrast to &#x60;EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY&#x60;,   the exception rules \&quot;Maximum driving time may be extended to 10h twice a week.\&quot; and \&quot;A daily rest may be reduced to 9h three times between weekly rests.\&quot;   are observed in so far as the driving time limit is extended and the daily rest time is reduced.   * &#x60;EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY&#x60; - Based on Directive 2002/15/EC of the European Parliament and of the Council \&quot;on the organisation of the working time of persons performing mobile road transport activities\&quot;.   Break time 30 min, maximum working time between breaks 6 hours, maximum travel time 9.5 hours.   * &#x60;EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY&#x60; - Makes sure that the standard rules of the EU directives 2003/88/EC and 2002/15/EC that are applicable for a route within a long single day are observed.   If working hours total more than 9h, a break must be 45min long. Here, a working time of at most 10h is guaranteed.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS &#x60; - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours,   daily rest time 11 hours, maximum driving time between daily rests 9 hours, maximum travel time between daily rests 13 hours,   maximum driving time 56 hours, maximum travel time 144 hours.   * &#x60;EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS&#x60; - When two drivers form a team, they can take turns.   In contrast to &#x60;EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS&#x60;, no breaks are scheduled and the daily rest time limits are raised.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours, maximum driving time 11 hours, maximum travel time 14 hours.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY&#x60; - Makes sure that the standard rules of the HOS regulations in 49 CFR 395 that are applicable for a route within a single day are observed.   It is assumed that the short-haul exception does apply so breaks are not scheduled.   * &#x60;US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS&#x60; - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours,   daily rest time 10 hours, maximum driving time between daily rests 11 hours, maximum travel time between daily rests 14 hours.  If this parameter is given both as query parameter and in the body then it must match. Otherwise an error is returned.   For details see this [concept](./concepts/drivers-working-hours).</value>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum WorkingHoursPreset
    {
        /// <summary>
        /// Enum EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY for value: EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY")]
        EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY = 1,

        /// <summary>
        /// Enum EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY for value: EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY")]
        EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY = 2,

        /// <summary>
        /// Enum EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY for value: EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY")]
        EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY = 3,

        /// <summary>
        /// Enum EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY for value: EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY")]
        EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY = 4,

        /// <summary>
        /// Enum EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS for value: EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS
        /// </summary>
        [EnumMember(Value = "EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS")]
        EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS = 5,

        /// <summary>
        /// Enum EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS for value: EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS
        /// </summary>
        [EnumMember(Value = "EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS")]
        EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS = 6,

        /// <summary>
        /// Enum US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY for value: US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY")]
        US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY = 7,

        /// <summary>
        /// Enum US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY for value: US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY
        /// </summary>
        [EnumMember(Value = "US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY")]
        US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY = 8,

        /// <summary>
        /// Enum US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS for value: US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS
        /// </summary>
        [EnumMember(Value = "US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS")]
        US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS = 9
    }

}
