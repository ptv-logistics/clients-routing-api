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
/**
 * Use these coordinates for matching to the nearest road.
 * This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,
 * e.g. garage exit at a different road.
 * @export
 * @interface RoadAccess
 */
export interface RoadAccess {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof RoadAccess
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof RoadAccess
     */
    longitude: number;
}

/**
 * Check if a given object implements the RoadAccess interface.
 */
export function instanceOfRoadAccess(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "latitude" in value;
    isInstance = isInstance && "longitude" in value;

    return isInstance;
}

export function RoadAccessFromJSON(json: any): RoadAccess {
    return RoadAccessFromJSONTyped(json, false);
}

export function RoadAccessFromJSONTyped(json: any, ignoreDiscriminator: boolean): RoadAccess {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
    };
}

export function RoadAccessToJSON(value?: RoadAccess | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
    };
}

