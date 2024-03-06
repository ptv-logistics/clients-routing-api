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
/**
 * Emissions according to EN16258 from 2012 (a.k.a. CEN standard).
 * @export
 * @interface EmissionsEN162582012
 */
export interface EmissionsEN162582012 {
    /**
     * The total fuel consumption [kg].
     * @type {number}
     * @memberof EmissionsEN162582012
     */
    fuelConsumption: number;
    /**
     * The amount of emitted CO2e from tank to wheel [kg].
     * @type {number}
     * @memberof EmissionsEN162582012
     */
    co2eTankToWheel: number;
    /**
     * The amount of emitted CO2e from well to wheel [kg].
     * @type {number}
     * @memberof EmissionsEN162582012
     */
    co2eWellToWheel: number;
    /**
     * The tank-to-wheel energy use [MJ].
     * @type {number}
     * @memberof EmissionsEN162582012
     */
    energyUseTankToWheel: number;
    /**
     * The well-to-wheel energy use [MJ].
     * @type {number}
     * @memberof EmissionsEN162582012
     */
    energyUseWellToWheel: number;
}

/**
 * Check if a given object implements the EmissionsEN162582012 interface.
 */
export function instanceOfEmissionsEN162582012(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "fuelConsumption" in value;
    isInstance = isInstance && "co2eTankToWheel" in value;
    isInstance = isInstance && "co2eWellToWheel" in value;
    isInstance = isInstance && "energyUseTankToWheel" in value;
    isInstance = isInstance && "energyUseWellToWheel" in value;

    return isInstance;
}

export function EmissionsEN162582012FromJSON(json: any): EmissionsEN162582012 {
    return EmissionsEN162582012FromJSONTyped(json, false);
}

export function EmissionsEN162582012FromJSONTyped(json: any, ignoreDiscriminator: boolean): EmissionsEN162582012 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'fuelConsumption': json['fuelConsumption'],
        'co2eTankToWheel': json['co2eTankToWheel'],
        'co2eWellToWheel': json['co2eWellToWheel'],
        'energyUseTankToWheel': json['energyUseTankToWheel'],
        'energyUseWellToWheel': json['energyUseWellToWheel'],
    };
}

export function EmissionsEN162582012ToJSON(value?: EmissionsEN162582012 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'fuelConsumption': value.fuelConsumption,
        'co2eTankToWheel': value.co2eTankToWheel,
        'co2eWellToWheel': value.co2eWellToWheel,
        'energyUseTankToWheel': value.energyUseTankToWheel,
        'energyUseWellToWheel': value.energyUseWellToWheel,
    };
}

