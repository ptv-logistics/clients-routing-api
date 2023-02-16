/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Issued when a waypoint is reached by the route, but not for route-manipulation waypoints. Requires _WAYPOINT_EVENTS_ to be requested.
 * @export
 * @interface WaypointEvent
 */
export interface WaypointEvent {
    /**
     * The index of the waypoint in the request.
     * @type {number}
     * @memberof WaypointEvent
     */
    index: number;
    /**
     * The name of the waypoint as given in the request. This field is only present if it is not empty.
     * @type {string}
     * @memberof WaypointEvent
     */
    name?: string;
}

/**
 * Check if a given object implements the WaypointEvent interface.
 */
export function instanceOfWaypointEvent(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "index" in value;

    return isInstance;
}

export function WaypointEventFromJSON(json: any): WaypointEvent {
    return WaypointEventFromJSONTyped(json, false);
}

export function WaypointEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): WaypointEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'index': json['index'],
        'name': !exists(json, 'name') ? undefined : json['name'],
    };
}

export function WaypointEventToJSON(value?: WaypointEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'index': value.index,
        'name': value.name,
    };
}

