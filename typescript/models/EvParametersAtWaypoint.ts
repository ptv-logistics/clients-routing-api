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
import type { Weather } from './Weather';
import {
    WeatherFromJSON,
    WeatherFromJSONTyped,
    WeatherToJSON,
} from './Weather';
import type { ChargingStation } from './ChargingStation';
import {
    ChargingStationFromJSON,
    ChargingStationFromJSONTyped,
    ChargingStationToJSON,
} from './ChargingStation';

/**
 * The ev parameters that are specific to a waypoint.
 * 
 * This parameter is in a preview state, the API is stable, feature changes could be introduced in future.
 * 
 * @export
 * @interface EvParametersAtWaypoint
 */
export interface EvParametersAtWaypoint {
    /**
     * 
     * @type {Weather}
     * @memberof EvParametersAtWaypoint
     */
    weather?: Weather;
    /**
     * 
     * @type {ChargingStation}
     * @memberof EvParametersAtWaypoint
     */
    chargingStation?: ChargingStation;
    /**
     * The electricity consumed during service by electrical appliances (e.g. crane, cooling, tail lift) [kWh].
     * 
     * @type {number}
     * @memberof EvParametersAtWaypoint
     */
    powerConsumptionDuringService?: number;
}

/**
 * Check if a given object implements the EvParametersAtWaypoint interface.
 */
export function instanceOfEvParametersAtWaypoint(value: object): value is EvParametersAtWaypoint {
    return true;
}

export function EvParametersAtWaypointFromJSON(json: any): EvParametersAtWaypoint {
    return EvParametersAtWaypointFromJSONTyped(json, false);
}

export function EvParametersAtWaypointFromJSONTyped(json: any, ignoreDiscriminator: boolean): EvParametersAtWaypoint {
    if (json == null) {
        return json;
    }
    return {
        
        'weather': json['weather'] == null ? undefined : WeatherFromJSON(json['weather']),
        'chargingStation': json['chargingStation'] == null ? undefined : ChargingStationFromJSON(json['chargingStation']),
        'powerConsumptionDuringService': json['powerConsumptionDuringService'] == null ? undefined : json['powerConsumptionDuringService'],
    };
}

export function EvParametersAtWaypointToJSON(value?: EvParametersAtWaypoint | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'weather': WeatherToJSON(value['weather']),
        'chargingStation': ChargingStationToJSON(value['chargingStation']),
        'powerConsumptionDuringService': value['powerConsumptionDuringService'],
    };
}

