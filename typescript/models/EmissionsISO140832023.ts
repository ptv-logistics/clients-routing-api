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
 * Emissions according to ISO 14083:2023 (a.k.a. ISO standard).
 * @export
 * @interface EmissionsISO140832023
 */
export interface EmissionsISO140832023 {
    /**
     * The total conventional fuel consumption [kg].
     * @type {number}
     * @memberof EmissionsISO140832023
     */
    fuelConsumption: number;
    /**
     * The total electric power consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh].
     * @type {number}
     * @memberof EmissionsISO140832023
     */
    electricityConsumption: number;
    /**
     * The amount of emitted CO2e from tank to wheel [kg].
     * @type {number}
     * @memberof EmissionsISO140832023
     */
    co2eTankToWheel: number;
    /**
     * The amount of emitted CO2e from well to wheel [kg].
     * @type {number}
     * @memberof EmissionsISO140832023
     */
    co2eWellToWheel: number;
    /**
     * The tank-to-wheel energy use [MJ].
     * @type {number}
     * @memberof EmissionsISO140832023
     */
    energyUseTankToWheel: number;
    /**
     * The well-to-wheel energy use [MJ].
     * @type {number}
     * @memberof EmissionsISO140832023
     */
    energyUseWellToWheel: number;
}

/**
 * Check if a given object implements the EmissionsISO140832023 interface.
 */
export function instanceOfEmissionsISO140832023(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "fuelConsumption" in value;
    isInstance = isInstance && "electricityConsumption" in value;
    isInstance = isInstance && "co2eTankToWheel" in value;
    isInstance = isInstance && "co2eWellToWheel" in value;
    isInstance = isInstance && "energyUseTankToWheel" in value;
    isInstance = isInstance && "energyUseWellToWheel" in value;

    return isInstance;
}

export function EmissionsISO140832023FromJSON(json: any): EmissionsISO140832023 {
    return EmissionsISO140832023FromJSONTyped(json, false);
}

export function EmissionsISO140832023FromJSONTyped(json: any, ignoreDiscriminator: boolean): EmissionsISO140832023 {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'fuelConsumption': json['fuelConsumption'],
        'electricityConsumption': json['electricityConsumption'],
        'co2eTankToWheel': json['co2eTankToWheel'],
        'co2eWellToWheel': json['co2eWellToWheel'],
        'energyUseTankToWheel': json['energyUseTankToWheel'],
        'energyUseWellToWheel': json['energyUseWellToWheel'],
    };
}

export function EmissionsISO140832023ToJSON(value?: EmissionsISO140832023 | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'fuelConsumption': value.fuelConsumption,
        'electricityConsumption': value.electricityConsumption,
        'co2eTankToWheel': value.co2eTankToWheel,
        'co2eWellToWheel': value.co2eWellToWheel,
        'energyUseTankToWheel': value.energyUseTankToWheel,
        'energyUseWellToWheel': value.energyUseWellToWheel,
    };
}

