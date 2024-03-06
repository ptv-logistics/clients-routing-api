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
import type { ElectricityPrice } from './ElectricityPrice';
import {
    ElectricityPriceFromJSON,
    ElectricityPriceFromJSONTyped,
    ElectricityPriceToJSON,
} from './ElectricityPrice';

/**
 * Issued when the battery is charged at a waypoint.
 * Requires _EV_CHARGE_EVENTS_ to be requested.
 * @export
 * @interface ChargeEvent
 */
export interface ChargeEvent {
    /**
     * The time spent for charging the battery [s].
     * @type {number}
     * @memberof ChargeEvent
     */
    chargingTime: number;
    /**
     * The amount of electricity charged [kWh].
     * @type {number}
     * @memberof ChargeEvent
     */
    electricityCharged: number;
    /**
     * The percentage of battery charged [%].
     * @type {number}
     * @memberof ChargeEvent
     */
    percentageCharged: number;
    /**
     * 
     * @type {ElectricityPrice}
     * @memberof ChargeEvent
     */
    cost: ElectricityPrice;
}

/**
 * Check if a given object implements the ChargeEvent interface.
 */
export function instanceOfChargeEvent(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "chargingTime" in value;
    isInstance = isInstance && "electricityCharged" in value;
    isInstance = isInstance && "percentageCharged" in value;
    isInstance = isInstance && "cost" in value;

    return isInstance;
}

export function ChargeEventFromJSON(json: any): ChargeEvent {
    return ChargeEventFromJSONTyped(json, false);
}

export function ChargeEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): ChargeEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'chargingTime': json['chargingTime'],
        'electricityCharged': json['electricityCharged'],
        'percentageCharged': json['percentageCharged'],
        'cost': ElectricityPriceFromJSON(json['cost']),
    };
}

export function ChargeEventToJSON(value?: ChargeEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'chargingTime': value.chargingTime,
        'electricityCharged': value.electricityCharged,
        'percentageCharged': value.percentageCharged,
        'cost': ElectricityPriceToJSON(value.cost),
    };
}

