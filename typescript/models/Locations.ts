/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import type { Location } from './Location';
import {
    LocationFromJSON,
    LocationFromJSONTyped,
    LocationToJSON,
} from './Location';

/**
 * 
 * @export
 * @interface Locations
 */
export interface Locations {
    /**
     * 
     * @type {Array<Location>}
     * @memberof Locations
     */
    locations: Array<Location>;
}

/**
 * Check if a given object implements the Locations interface.
 */
export function instanceOfLocations(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "locations" in value;

    return isInstance;
}

export function LocationsFromJSON(json: any): Locations {
    return LocationsFromJSONTyped(json, false);
}

export function LocationsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Locations {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'locations': ((json['locations'] as Array<any>).map(LocationFromJSON)),
    };
}

export function LocationsToJSON(value?: Locations | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'locations': ((value.locations as Array<any>).map(LocationToJSON)),
    };
}

