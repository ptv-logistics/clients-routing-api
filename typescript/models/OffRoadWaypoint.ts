/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    RoadAccess,
    RoadAccessFromJSON,
    RoadAccessFromJSONTyped,
    RoadAccessToJSON,
} from './RoadAccess';
import {
    TimeInterval,
    TimeIntervalFromJSON,
    TimeIntervalFromJSONTyped,
    TimeIntervalToJSON,
} from './TimeInterval';
import {
    VehicleParametersAtWaypoint,
    VehicleParametersAtWaypointFromJSON,
    VehicleParametersAtWaypointFromJSONTyped,
    VehicleParametersAtWaypointToJSON,
} from './VehicleParametersAtWaypoint';

/**
 * An _off-road waypoint_ will be part of the route.
 * The air-line connection between given and matched coordinates is included in the route polyline, distance and duration.
 * Use this waypoint type to recalculate a route planned by the Route Optimization API.
 * @export
 * @interface OffRoadWaypoint
 */
export interface OffRoadWaypoint {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof OffRoadWaypoint
     */
    latitude: number;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof OffRoadWaypoint
     */
    longitude: number;
    /**
     * 
     * @type {RoadAccess}
     * @memberof OffRoadWaypoint
     */
    roadAcess?: RoadAccess;
    /**
     * Specifies that this waypoint will be reached at the side of street on which it is located.
     * This is useful to prevent the driver from crossing the street to actually reach the location represented by this waypoint.
     * @type {boolean}
     * @memberof OffRoadWaypoint
     */
    matchSideOfStreet?: boolean;
    /**
     * The service time [s] that is required at this waypoint, e.g. for pickup or delivery.
     * @type {number}
     * @memberof OffRoadWaypoint
     */
    serviceTime?: number;
    /**
     * The opening intervals at this waypoint, each specified by two points in time - the beginning and the end of the interval.
     * Leaving this parameter empty means that the waypoint is always open. Service can only start within one of the opening intervals.
     * @type {Array<TimeInterval>}
     * @memberof OffRoadWaypoint
     */
    openingIntervals?: Array<TimeInterval>;
    /**
     * 
     * @type {VehicleParametersAtWaypoint}
     * @memberof OffRoadWaypoint
     */
    vehicleParameters?: VehicleParametersAtWaypoint;
}

export function OffRoadWaypointFromJSON(json: any): OffRoadWaypoint {
    return OffRoadWaypointFromJSONTyped(json, false);
}

export function OffRoadWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): OffRoadWaypoint {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'roadAcess': !exists(json, 'roadAcess') ? undefined : RoadAccessFromJSON(json['roadAcess']),
        'matchSideOfStreet': !exists(json, 'matchSideOfStreet') ? undefined : json['matchSideOfStreet'],
        'serviceTime': !exists(json, 'serviceTime') ? undefined : json['serviceTime'],
        'openingIntervals': !exists(json, 'openingIntervals') ? undefined : ((json['openingIntervals'] as Array<any>).map(TimeIntervalFromJSON)),
        'vehicleParameters': !exists(json, 'vehicleParameters') ? undefined : VehicleParametersAtWaypointFromJSON(json['vehicleParameters']),
    };
}

export function OffRoadWaypointToJSON(value?: OffRoadWaypoint | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
        'roadAcess': RoadAccessToJSON(value.roadAcess),
        'matchSideOfStreet': value.matchSideOfStreet,
        'serviceTime': value.serviceTime,
        'openingIntervals': value.openingIntervals === undefined ? undefined : ((value.openingIntervals as Array<any>).map(TimeIntervalToJSON)),
        'vehicleParameters': VehicleParametersAtWaypointToJSON(value.vehicleParameters),
    };
}

