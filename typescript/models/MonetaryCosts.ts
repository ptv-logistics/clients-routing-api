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
/**
 * Provides an overview of the costs of the route.  
 * Requires the result _MONETARY_COSTS_ to be requested.
 * @export
 * @interface MonetaryCosts
 */
export interface MonetaryCosts {
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * @type {string}
     * @memberof MonetaryCosts
     */
    currency: string | null;
    /**
     * The total monetary cost of the route.
     * @type {number}
     * @memberof MonetaryCosts
     */
    totalCost: number;
    /**
     * The distance cost based on the **monetaryCostOptions[costPerKilometer]** and the driving distance.
     * @type {number}
     * @memberof MonetaryCosts
     */
    distanceCost: number;
    /**
     * The working time cost based on **monetaryCostOptions[costPerWorkingHour]** and the driving time. Break, service and rest times are not considered.
     * @type {number}
     * @memberof MonetaryCosts
     */
    workingTimeCost: number;
    /**
     * The energy cost based on the vehicle's consumption and the corresponding cost parameters.
     * @type {number}
     * @memberof MonetaryCosts
     */
    energyCost: number;
    /**
     * The toll cost based on the route and the vehicle.  
     * Toll prices do not include VAT.
     * @type {number}
     * @memberof MonetaryCosts
     */
    tollCost: number;
}

export function MonetaryCostsFromJSON(json: any): MonetaryCosts {
    return MonetaryCostsFromJSONTyped(json, false);
}

export function MonetaryCostsFromJSONTyped(json: any, ignoreDiscriminator: boolean): MonetaryCosts {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'currency': json['currency'],
        'totalCost': json['totalCost'],
        'distanceCost': json['distanceCost'],
        'workingTimeCost': json['workingTimeCost'],
        'energyCost': json['energyCost'],
        'tollCost': json['tollCost'],
    };
}

export function MonetaryCostsToJSON(value?: MonetaryCosts | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'currency': value.currency,
        'totalCost': value.totalCost,
        'distanceCost': value.distanceCost,
        'workingTimeCost': value.workingTimeCost,
        'energyCost': value.energyCost,
        'tollCost': value.tollCost,
    };
}

