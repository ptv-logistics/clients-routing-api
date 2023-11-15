/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Contains the distance and travel time from the input waypoint or route to a reached location or vice versa (depending on the request drivingDirection).
 * @export
 * @interface ReachableLocation
 */
export interface ReachableLocation {
    /**
     * The distance from the input waypoint to this location or vice versa.
     * @type {number}
     * @memberof ReachableLocation
     */
    distance?: number;
    /**
     * The travel time from the input waypoint to this location or vice versa.
     * @type {number}
     * @memberof ReachableLocation
     */
    travelTime?: number;
    /**
     * The index of the reached input location.
     * @type {number}
     * @memberof ReachableLocation
     */
    index?: number;
}

/**
 * Check if a given object implements the ReachableLocation interface.
 */
export function instanceOfReachableLocation(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function ReachableLocationFromJSON(json: any): ReachableLocation {
    return ReachableLocationFromJSONTyped(json, false);
}

export function ReachableLocationFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableLocation {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'distance': !exists(json, 'distance') ? undefined : json['distance'],
        'travelTime': !exists(json, 'travelTime') ? undefined : json['travelTime'],
        'index': !exists(json, 'index') ? undefined : json['index'],
    };
}

export function ReachableLocationToJSON(value?: ReachableLocation | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'distance': value.distance,
        'travelTime': value.travelTime,
        'index': value.index,
    };
}

