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
 * The position of the vehicle if the vehicle position is not at a waypoint but somewhere on the route.
 * This parameter is mutually exclusive with **waypoint**.
 * @export
 * @interface PositionOnRoute
 */
export interface PositionOnRoute {
    /**
     * The latitude value in degrees (WGS84/EPSG:4326) from south to north.
     * @type {number}
     * @memberof PositionOnRoute
     */
    latitude: number | null;
    /**
     * The longitude value in degrees (WGS84/EPSG:4326) from west to east.
     * @type {number}
     * @memberof PositionOnRoute
     */
    longitude: number | null;
    /**
     * The name of the next waypoint on the route.
     * @type {string}
     * @memberof PositionOnRoute
     */
    nextWaypointName: string | null;
    /**
     * The current heading of the vehicle [deg]. It denotes the driving direction,
     * North represents 0 degrees, East represents 90 degrees, South represents 180 degrees, West represents 270 degrees.
     * 
     * If specified and if the heading of the vehicle is not in the direction of the route near the given **position**,
     * it is assumed that the vehicle has left the route so that a new route will be calculated. This new route will then be 
     * calculated from the road closest to the position matching the vehicle heading. For more information see
     * this [concept](./concepts/estimated-time-arrival).
     * @type {number}
     * @memberof PositionOnRoute
     */
    heading?: number | null;
    /**
     * Denotes the tolerance between **heading** and the direction of a road, i.e. roads with a direction of **heading**±**headingTolerance** are taken into account. Applies only if **heading** is specified.
     * @type {number}
     * @memberof PositionOnRoute
     */
    headingTolerance?: number;
}

/**
 * Check if a given object implements the PositionOnRoute interface.
 */
export function instanceOfPositionOnRoute(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "latitude" in value;
    isInstance = isInstance && "longitude" in value;
    isInstance = isInstance && "nextWaypointName" in value;

    return isInstance;
}

export function PositionOnRouteFromJSON(json: any): PositionOnRoute {
    return PositionOnRouteFromJSONTyped(json, false);
}

export function PositionOnRouteFromJSONTyped(json: any, ignoreDiscriminator: boolean): PositionOnRoute {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'latitude': json['latitude'],
        'longitude': json['longitude'],
        'nextWaypointName': json['nextWaypointName'],
        'heading': !exists(json, 'heading') ? undefined : json['heading'],
        'headingTolerance': !exists(json, 'headingTolerance') ? undefined : json['headingTolerance'],
    };
}

export function PositionOnRouteToJSON(value?: PositionOnRoute | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'latitude': value.latitude,
        'longitude': value.longitude,
        'nextWaypointName': value.nextWaypointName,
        'heading': value.heading,
        'headingTolerance': value.headingTolerance,
    };
}

