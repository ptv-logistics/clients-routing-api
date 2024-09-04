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
import type { RemainingWaypoint } from './RemainingWaypoint';
import {
    RemainingWaypointFromJSON,
    RemainingWaypointFromJSONTyped,
    RemainingWaypointToJSON,
} from './RemainingWaypoint';

/**
 * The response of an ETA calculation.
 * @export
 * @interface EtaResponse
 */
export interface EtaResponse {
    /**
     * The ETA and the remaining distance and travel time to the waypoints not yet reached by the route.
     * @type {Array<RemainingWaypoint>}
     * @memberof EtaResponse
     */
    remainingWaypoints: Array<RemainingWaypoint>;
    /**
     * If the route has been recalculated, this is the ID of the new route.
     * That will happen when it is likely that the vehicle has left the route, so the vehicle position is too far away from the route,
     * or when the estimated time of arrival at the last waypoint is delayed in a way that another route may result in arriving earlier.
     * @type {string}
     * @memberof EtaResponse
     */
    routeId?: string;
    /**
     * A list of warnings concerning the validity of the result.
     * @type {Array<Warning>}
     * @memberof EtaResponse
     */
    warnings?: Array<Warning>;
}

/**
 * Check if a given object implements the EtaResponse interface.
 */
export function instanceOfEtaResponse(value: object): value is EtaResponse {
    if (!('remainingWaypoints' in value) || value['remainingWaypoints'] === undefined) return false;
    return true;
}

export function EtaResponseFromJSON(json: any): EtaResponse {
    return EtaResponseFromJSONTyped(json, false);
}

export function EtaResponseFromJSONTyped(json: any, ignoreDiscriminator: boolean): EtaResponse {
    if (json == null) {
        return json;
    }
    return {
        
        'remainingWaypoints': ((json['remainingWaypoints'] as Array<any>).map(RemainingWaypointFromJSON)),
        'routeId': json['routeId'] == null ? undefined : json['routeId'],
        'warnings': json['warnings'] == null ? undefined : ((json['warnings'] as Array<any>).map(WarningFromJSON)),
    };
}

export function EtaResponseToJSON(value?: EtaResponse | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'remainingWaypoints': ((value['remainingWaypoints'] as Array<any>).map(RemainingWaypointToJSON)),
        'routeId': value['routeId'],
        'warnings': value['warnings'] == null ? undefined : ((value['warnings'] as Array<any>).map(WarningToJSON)),
    };
}

