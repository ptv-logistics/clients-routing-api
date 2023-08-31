/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { ScheduleType } from './ScheduleType';
import {
    ScheduleTypeFromJSON,
    ScheduleTypeFromJSONTyped,
    ScheduleTypeToJSON,
} from './ScheduleType';

/**
 * Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. Requires _SCHEDULE_EVENTS_ to be requested.
 * @export
 * @interface ScheduleEvent
 */
export interface ScheduleEvent {
    /**
     * The duration [s].
     * @type {number}
     * @memberof ScheduleEvent
     */
    duration: number;
    /**
     * Tells what happens at this position of the route.
     * @type {Array<ScheduleType>}
     * @memberof ScheduleEvent
     */
    scheduleTypes: Array<ScheduleType>;
}

/**
 * Check if a given object implements the ScheduleEvent interface.
 */
export function instanceOfScheduleEvent(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "duration" in value;
    isInstance = isInstance && "scheduleTypes" in value;

    return isInstance;
}

export function ScheduleEventFromJSON(json: any): ScheduleEvent {
    return ScheduleEventFromJSONTyped(json, false);
}

export function ScheduleEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): ScheduleEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'duration': json['duration'],
        'scheduleTypes': ((json['scheduleTypes'] as Array<any>).map(ScheduleTypeFromJSON)),
    };
}

export function ScheduleEventToJSON(value?: ScheduleEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'duration': value.duration,
        'scheduleTypes': ((value.scheduleTypes as Array<any>).map(ScheduleTypeToJSON)),
    };
}

