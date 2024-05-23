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
 * Issued periodically to report electricity consumption and battery status.
 * Requires _EV_STATUS_EVENTS_ or _EV_STATUS_EVENTS_POLYLINE_ to be requested.
 * @export
 * @interface EvStatusEvent
 */
export interface EvStatusEvent {
    /**
     * The remaining state of charge at the location of this event [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero.
     * @type {number}
     * @memberof EvStatusEvent
     */
    batteryStateOfCharge: number;
    /**
     * The electricity consumption since the previous event containing **evStatus** [kWh].
     * @type {number}
     * @memberof EvStatusEvent
     */
    electricityConsumption: number;
    /**
     * The route polyline snippet since the previous event containing **evStatus** in the format specified by **options[polylineFormat]**.
     * Requires _EV_STATUS_EVENTS_POLYLINE_ to be requested.
     * @type {string}
     * @memberof EvStatusEvent
     */
    polyline?: string;
}

/**
 * Check if a given object implements the EvStatusEvent interface.
 */
export function instanceOfEvStatusEvent(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "batteryStateOfCharge" in value;
    isInstance = isInstance && "electricityConsumption" in value;

    return isInstance;
}

export function EvStatusEventFromJSON(json: any): EvStatusEvent {
    return EvStatusEventFromJSONTyped(json, false);
}

export function EvStatusEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): EvStatusEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'batteryStateOfCharge': json['batteryStateOfCharge'],
        'electricityConsumption': json['electricityConsumption'],
        'polyline': !exists(json, 'polyline') ? undefined : json['polyline'],
    };
}

export function EvStatusEventToJSON(value?: EvStatusEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'batteryStateOfCharge': value.batteryStateOfCharge,
        'electricityConsumption': value.electricityConsumption,
        'polyline': value.polyline,
    };
}

