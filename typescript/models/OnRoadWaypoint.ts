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
import type { TimeInterval } from './TimeInterval';
import {
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';
import type { VehicleParametersAtWaypoint } from './VehicleParametersAtWaypoint';
import {
    VehicleParametersAtWaypointFromJSON,
    VehicleParametersAtWaypointFromJSONTyped,
    VehicleParametersAtWaypointToJSON,
} from './VehicleParametersAtWaypoint';

/**
 * An _on-road waypoint_ will be matched to the nearest possible road.
 * The air-line connection between given and matched coordinates is not included in the route polyline, distance and duration.
 * @export
 * @interface OnRoadWaypoint
 */
export interface OnRoadWaypoint {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof OnRoadWaypoint
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof OnRoadWaypoint
     */
    longitude: number;
    /**
     * Specifies that this waypoint will be reached at the side of street on which it is located.
     * This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint.
     * @type {boolean}
     * @memberof OnRoadWaypoint
     */
    matchSideOfStreet?: boolean;
    /**
     * The service time [s] that is required at this waypoint, e.g. for pickup or delivery.
     * @type {number}
     * @memberof OnRoadWaypoint
     */
    serviceTime?: number;
    /**
     * The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval.
     * Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals.
     * @type {Array<TimeInterval>}
     * @memberof OnRoadWaypoint
     */
    openingIntervals?: Array<TimeInterval>;
    /**
     * 
     * @type {VehicleParametersAtWaypoint}
     * @memberof OnRoadWaypoint
     */
    vehicleParameters?: VehicleParametersAtWaypoint;
}

/**
 * Check if a given object implements the OnRoadWaypoint interface.
 */
export function instanceOfOnRoadWaypoint(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "latitude" in value;
    isInstance = isInstance && "longitude" in value;

    return isInstance;
}

export function OnRoadWaypointFromJSON(json: any): OnRoadWaypoint {
    return OnRoadWaypointFromJSONTyped(json, false);
}

export function OnRoadWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): OnRoadWaypoint {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'matchSideOfStreet': !exists(json, 'matchSideOfStreet') ? undefined : json['matchSideOfStreet'],
        'serviceTime': !exists(json, 'serviceTime') ? undefined : json['serviceTime'],
        'openingIntervals': !exists(json, 'openingIntervals') ? undefined : ((json['openingIntervals'] as Array<any>).map(TimeIntervalFromJSON)),
        'vehicleParameters': !exists(json, 'vehicleParameters') ? undefined : VehicleParametersAtWaypointFromJSON(json['vehicleParameters']),
    };
}

export function OnRoadWaypointToJSON(value?: OnRoadWaypoint | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
        'matchSideOfStreet': value.matchSideOfStreet,
        'serviceTime': value.serviceTime,
        'openingIntervals': value.openingIntervals === undefined ? undefined : ((value.openingIntervals as Array<any>).map(TimeIntervalToJSON)),
        'vehicleParameters': VehicleParametersAtWaypointToJSON(value.vehicleParameters),
    };
}

