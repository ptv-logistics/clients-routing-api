/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Enables the calculation of break and rest times according to the selected rules.
 * Breaks and rests will be added to the **travelTime**, details can be requested through the _SCHEDULE_EVENTS_.
 * This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.
 *   * `EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY` - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.
 *   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum driving time 9 hours, maximum travel time 13 hours.
 *   * `EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY` - In contrast to `EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY`,
 *   the exception rules "Maximum driving time may be extended to 10h twice a week." and "A daily rest may be reduced to 9h three times between weekly rests."
 *   are observed in so far as the driving time limit is extended and the daily rest time is reduced.
 *   * `EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY` - Based on Directive 2002/15/EC of the European Parliament and of the Council "on the organisation of the working time of persons performing mobile road transport activities".
 *   Break time 30 min, maximum working time between breaks 6 hours, maximum travel time 9.5 hours.
 *   * `EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY` - Makes sure that the standard rules of the EU directives 2003/88/EC and 2002/15/EC that are applicable for a route within a long single day are observed.
 *   If working hours total more than 9h, a break must be 45min long. Here, a working time of at most 10h is guaranteed.
 *   * `EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS ` - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.
 *   Break time 45 min, maximum driving time between breaks 4.5 hours,
 *   daily rest time 11 hours, maximum driving time between daily rests 9 hours, maximum travel time between daily rests 13 hours,
 *   maximum driving time 56 hours, maximum travel time 144 hours.
 *   * `EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS` - When two drivers form a team, they can take turns.
 *   In contrast to `EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS`, no breaks are scheduled and the daily rest time limits are raised.
 *   * `US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY` - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).
 *   Break time 30 min, maximum driving time between breaks 8 hours, maximum driving time 11 hours, maximum travel time 14 hours.
 *   * `US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY` - Makes sure that the standard rules of the HOS regulations in 49 CFR 395 that are applicable for a route within a single day are observed.
 *   It is assumed that the short-haul exception does apply so breaks are not scheduled.
 *   * `US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS` - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).
 *   Break time 30 min, maximum driving time between breaks 8 hours,
 *   daily rest time 10 hours, maximum driving time between daily rests 11 hours, maximum travel time between daily rests 14 hours.
 * 
 * If this parameter is given both as query parameter and in the body then it must match. Otherwise an error is returned.  
 * For details see this [concept](./concepts/drivers-working-hours).
 * @export
 */
export const WorkingHoursPreset = {
    EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY: 'EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY',
    EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY: 'EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY',
    EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY: 'EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY',
    EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY: 'EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY',
    EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS: 'EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS',
    EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS: 'EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY: 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY: 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY',
    US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS: 'US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS'
} as const;
export type WorkingHoursPreset = typeof WorkingHoursPreset[keyof typeof WorkingHoursPreset];


export function WorkingHoursPresetFromJSON(json: any): WorkingHoursPreset {
    return WorkingHoursPresetFromJSONTyped(json, false);
}

export function WorkingHoursPresetFromJSONTyped(json: any, ignoreDiscriminator: boolean): WorkingHoursPreset {
    return json as WorkingHoursPreset;
}

export function WorkingHoursPresetToJSON(value?: WorkingHoursPreset | null): any {
    return value as any;
}

