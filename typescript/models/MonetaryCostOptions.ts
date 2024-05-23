/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface MonetaryCostOptions
 */
export interface MonetaryCostOptions {
    /**
     * Specifies the cost per kilometer. This value can contain the cost from the energy consumption, but it also
     * possible to define the energy costs using **monetaryCostOptions[costPerKwh]** and **monetaryCostOptions[costPerFuelUnit]**.
     * If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
     * @type {number}
     * @memberof MonetaryCostOptions
     */
    costPerKilometer?: number | null;
    /**
     * Specifies the cost per hour. It is not applied to service, break or rest periods.
     * If it is not specified the default value depends on the used **profile**. The default value of the profile can change at any time.
     * @type {number}
     * @memberof MonetaryCostOptions
     */
    workingCostPerHour?: number | null;
    /**
     * Specifies the cost per kilowatt hour. Only relevant for **vehicle[engineType]** _ELECTRIC_ and _HYBRID_.
     * @type {number}
     * @memberof MonetaryCostOptions
     */
    costPerKwh?: number | null;
    /**
     * Specifies the cost per fuel unit (per liter Diesel or per kg CNG). Only used for **vehicle[engineType]** _COMBUSTION_ and _HYBRID_.
     * @type {number}
     * @memberof MonetaryCostOptions
     */
    costPerFuelUnit?: number | null;
}

/**
 * Check if a given object implements the MonetaryCostOptions interface.
 */
export function instanceOfMonetaryCostOptions(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function MonetaryCostOptionsFromJSON(json: any): MonetaryCostOptions {
    return MonetaryCostOptionsFromJSONTyped(json, false);
}

export function MonetaryCostOptionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): MonetaryCostOptions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'costPerKilometer': !exists(json, 'costPerKilometer') ? undefined : json['costPerKilometer'],
        'workingCostPerHour': !exists(json, 'workingCostPerHour') ? undefined : json['workingCostPerHour'],
        'costPerKwh': !exists(json, 'costPerKwh') ? undefined : json['costPerKwh'],
        'costPerFuelUnit': !exists(json, 'costPerFuelUnit') ? undefined : json['costPerFuelUnit'],
    };
}

export function MonetaryCostOptionsToJSON(value?: MonetaryCostOptions | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'costPerKilometer': value.costPerKilometer,
        'workingCostPerHour': value.workingCostPerHour,
        'costPerKwh': value.costPerKwh,
        'costPerFuelUnit': value.costPerFuelUnit,
    };
}

