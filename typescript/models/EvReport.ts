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
import type { ElectricityPrice } from './ElectricityPrice';
import {
    ElectricityPriceFromJSON,
    ElectricityPriceFromJSONTyped,
    ElectricityPriceToJSON,
} from './ElectricityPrice';

/**
 * The consumption and charging summary for the specified vehicle model. Only present if _EV_REPORT_ is requested.
 * 
 * @export
 * @interface EvReport
 */
export interface EvReport {
    /**
     * The electricity consumption since the start of the route [kWh].
     * @type {number}
     * @memberof EvReport
     */
    electricityConsumption: number;
    /**
     * The remaining state of charge at the end of the route [%]. May be below the defined minimum state of charge or even below zero, if the electricity consumption exceeds the available energy in the battery and charging is not possible before falling below zero.
     * @type {number}
     * @memberof EvReport
     */
    batteryStateOfCharge: number;
    /**
     * The time spent for charging the battery [s]. The charging time is a proposal, currently for information only. It is not included in the travel time of the route and the start time of subsequent events is not offset by it.
     * @type {number}
     * @memberof EvReport
     */
    chargingTime: number;
    /**
     * The amount of electricity charged along the route [kWh].
     * @type {number}
     * @memberof EvReport
     */
    electricityCharged: number;
    /**
     * The percentage of battery charged along the route [%].
     * @type {number}
     * @memberof EvReport
     */
    percentageCharged: number;
    /**
     * 
     * @type {ElectricityPrice}
     * @memberof EvReport
     */
    cost: ElectricityPrice;
}

/**
 * Check if a given object implements the EvReport interface.
 */
export function instanceOfEvReport(value: object): value is EvReport {
    if (!('electricityConsumption' in value) || value['electricityConsumption'] === undefined) return false;
    if (!('batteryStateOfCharge' in value) || value['batteryStateOfCharge'] === undefined) return false;
    if (!('chargingTime' in value) || value['chargingTime'] === undefined) return false;
    if (!('electricityCharged' in value) || value['electricityCharged'] === undefined) return false;
    if (!('percentageCharged' in value) || value['percentageCharged'] === undefined) return false;
    if (!('cost' in value) || value['cost'] === undefined) return false;
    return true;
}

export function EvReportFromJSON(json: any): EvReport {
    return EvReportFromJSONTyped(json, false);
}

export function EvReportFromJSONTyped(json: any, ignoreDiscriminator: boolean): EvReport {
    if (json == null) {
        return json;
    }
    return {
        
        'electricityConsumption': json['electricityConsumption'],
        'batteryStateOfCharge': json['batteryStateOfCharge'],
        'chargingTime': json['chargingTime'],
        'electricityCharged': json['electricityCharged'],
        'percentageCharged': json['percentageCharged'],
        'cost': ElectricityPriceFromJSON(json['cost']),
    };
}

export function EvReportToJSON(value?: EvReport | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'electricityConsumption': value['electricityConsumption'],
        'batteryStateOfCharge': value['batteryStateOfCharge'],
        'chargingTime': value['chargingTime'],
        'electricityCharged': value['electricityCharged'],
        'percentageCharged': value['percentageCharged'],
        'cost': ElectricityPriceToJSON(value['cost']),
    };
}

