/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { ScheduleType } from './ScheduleType';
import {
    ScheduleTypeFromJSON,
    ScheduleTypeFromJSONTyped,
    ScheduleTypeToJSON,
} from './ScheduleType';

/**
 * Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. If **useServiceTimeForRecreation** is true, each _SERVICE_ is reported along with another type depending on whether or not the service time is actually used for recreation. Times on a combined transport are always _WAITING_ unless used for recreation. Requires _SCHEDULE_EVENTS_ to be requested, POST only.
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
     * 
     * @type {Array<ScheduleType>}
     * @memberof ScheduleEvent
     */
    scheduleTypes: Array<ScheduleType>;
}

/**
 * Check if a given object implements the ScheduleEvent interface.
 */
export function instanceOfScheduleEvent(value: object): value is ScheduleEvent {
    if (!('duration' in value) || value['duration'] === undefined) return false;
    if (!('scheduleTypes' in value) || value['scheduleTypes'] === undefined) return false;
    return true;
}

export function ScheduleEventFromJSON(json: any): ScheduleEvent {
    return ScheduleEventFromJSONTyped(json, false);
}

export function ScheduleEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): ScheduleEvent {
    if (json == null) {
        return json;
    }
    return {
        
        'duration': json['duration'],
        'scheduleTypes': ((json['scheduleTypes'] as Array<any>).map(ScheduleTypeFromJSON)),
    };
}

export function ScheduleEventToJSON(value?: ScheduleEvent | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'duration': value['duration'],
        'scheduleTypes': ((value['scheduleTypes'] as Array<any>).map(ScheduleTypeToJSON)),
    };
}

