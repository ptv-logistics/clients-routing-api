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
import type { Warning } from './Warning';
import {
    WarningFromJSON,
    WarningFromJSONTyped,
    WarningToJSON,
} from './Warning';
import type { ReachableLocation } from './ReachableLocation';
import {
    ReachableLocationFromJSON,
    ReachableLocationFromJSONTyped,
    ReachableLocationToJSON,
} from './ReachableLocation';

/**
 * The results of a reachable locations calculation.
 * @export
 * @interface ReachableLocations
 */
export interface ReachableLocations {
    /**
     * Reachable locations ordered by distance or travel time (depending on the request **horizonType**).
     * @type {Array<ReachableLocation>}
     * @memberof ReachableLocations
     */
    reachable?: Array<ReachableLocation>;
    /**
     * Indexes of the unreachable locations as given in the request locations.
     * @type {Array<number>}
     * @memberof ReachableLocations
     */
    unreachable?: Array<number>;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof ReachableLocations
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the ReachableLocations interface.
 */
export function instanceOfReachableLocations(value: object): value is ReachableLocations {
    return true;
}

export function ReachableLocationsFromJSON(json: any): ReachableLocations {
    return ReachableLocationsFromJSONTyped(json, false);
}

export function ReachableLocationsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableLocations {
    if (json == null) {
        return json;
    }
    return {
        
        'reachable': json['reachable'] == null ? undefined : ((json['reachable'] as Array<any>).map(ReachableLocationFromJSON)),
        'unreachable': json['unreachable'] == null ? undefined : json['unreachable'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function ReachableLocationsToJSON(value?: ReachableLocations | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'reachable': value['reachable'] == null ? undefined : ((value['reachable'] as Array<any>).map(ReachableLocationToJSON)),
        'unreachable': value['unreachable'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(WarningToJSON)),
    };
}

