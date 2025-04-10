/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers\' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ReachableLocationsId
 */
export interface ReachableLocationsId {
    /**
     * The ID of the calculated reachable locations.
     * @type {string}
     * @memberof ReachableLocationsId
     */
    id: string;
}

/**
 * Check if a given object implements the ReachableLocationsId interface.
 */
export function instanceOfReachableLocationsId(value: object): value is ReachableLocationsId {
    if (!('id' in value) || value['id'] === undefined) return false;
    return true;
}

export function ReachableLocationsIdFromJSON(json: any): ReachableLocationsId {
    return ReachableLocationsIdFromJSONTyped(json, false);
}

export function ReachableLocationsIdFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableLocationsId {
    if (json == null) {
        return json;
    }
    return {
        
        'id': json['id'],
    };
}

export function ReachableLocationsIdToJSON(value?: ReachableLocationsId | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'id': value['id'],
    };
}

