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

import { exists, mapValues } from '../runtime';
/**
 * Defines the accumulated driving, working and travel times since the last break or daily rest. For details see this [concept](./concepts/drivers-working-hours).
 * @export
 * @interface WorkLogbook
 */
export interface WorkLogbook {
    /**
     * The last time the driver worked formatted according to [RFC 3339](https://tools.ietf.org/html/rfc3339).  
     * 
     * The date must not be before 1970-01-01T00:00:00+00:00 nor after 2037-12-31T23:59:59+00:00. 
     * The date must provide an offset to UTC.  
     * See [here](./concepts/date-and-time) for more information on the relevance of date and time.
     * @type {Date}
     * @memberof WorkLogbook
     */
    lastTimeTheDriverWorked: Date | null;
    /**
     * Accumulated driving time since end of last break [s], this includes all time behind the wheel.  
     * Values higher than the maximum driving time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset.
     * 
     * @type {number}
     * @memberof WorkLogbook
     */
    accumulatedDrivingTimeSinceLastBreak?: number;
    /**
     * Accumulated working time since end of last break [s], this includes driving time, service time at depot and customers, and idle time if lower than working time threshold.    
     * Values higher than the maximum working time between breaks of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.
     * 
     * @type {number}
     * @memberof WorkLogbook
     */
    accumulatedWorkingTimeSinceLastBreak?: number | null;
    /**
     * Accumulated driving time since end of last daily rest [s], this includes all time behind the wheel.  
     * Values higher than the maximum driving time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by preset. May not be smaller than **accumulatedDrivingTimeSinceLastBreak** if the value is specified. If no other value is specified, the default value is 0.
     * 
     * @type {number}
     * @memberof WorkLogbook
     */
    accumulatedDrivingTimeSinceLastDailyRest?: number | null;
    /**
     * Accumulated travel time since end of last daily rest [s], this includes all time since the last daily rest.  
     * Values higher than maximum travel time between daily rests of the **workingHoursPreset** are capped and effectively equal to the value given by the preset. May not be smaller than **accumulatedWorkingTimeSinceLastBreak** or **accumulatedDrivingTimeSinceLastDailyRest** if the values are specified. If no other value is specified, the default value is 0.
     * 
     * @type {number}
     * @memberof WorkLogbook
     */
    accumulatedTravelTimeSinceLastDailyRest?: number | null;
}

/**
 * Check if a given object implements the WorkLogbook interface.
 */
export function instanceOfWorkLogbook(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "lastTimeTheDriverWorked" in value;

    return isInstance;
}

export function WorkLogbookFromJSON(json: any): WorkLogbook {
    return WorkLogbookFromJSONTyped(json, false);
}

export function WorkLogbookFromJSONTyped(json: any, ignoreDiscriminator: boolean): WorkLogbook {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'lastTimeTheDriverWorked': (json['lastTimeTheDriverWorked'] === null ? null : new Date(json['lastTimeTheDriverWorked'])),
        'accumulatedDrivingTimeSinceLastBreak': !exists(json, 'accumulatedDrivingTimeSinceLastBreak') ? undefined : json['accumulatedDrivingTimeSinceLastBreak'],
        'accumulatedWorkingTimeSinceLastBreak': !exists(json, 'accumulatedWorkingTimeSinceLastBreak') ? undefined : json['accumulatedWorkingTimeSinceLastBreak'],
        'accumulatedDrivingTimeSinceLastDailyRest': !exists(json, 'accumulatedDrivingTimeSinceLastDailyRest') ? undefined : json['accumulatedDrivingTimeSinceLastDailyRest'],
        'accumulatedTravelTimeSinceLastDailyRest': !exists(json, 'accumulatedTravelTimeSinceLastDailyRest') ? undefined : json['accumulatedTravelTimeSinceLastDailyRest'],
    };
}

export function WorkLogbookToJSON(value?: WorkLogbook | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'lastTimeTheDriverWorked': (value.lastTimeTheDriverWorked === null ? null : value.lastTimeTheDriverWorked.toISOString()),
        'accumulatedDrivingTimeSinceLastBreak': value.accumulatedDrivingTimeSinceLastBreak,
        'accumulatedWorkingTimeSinceLastBreak': value.accumulatedWorkingTimeSinceLastBreak,
        'accumulatedDrivingTimeSinceLastDailyRest': value.accumulatedDrivingTimeSinceLastDailyRest,
        'accumulatedTravelTimeSinceLastDailyRest': value.accumulatedTravelTimeSinceLastDailyRest,
    };
}

