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
 * Issued when a border of a country of a subdivision is crossed by the route, i.e. the current country code changes. Requires _BORDER_EVENTS_ to be requested.
 * @export
 * @interface BorderEvent
 */
export interface BorderEvent {
    /**
     * The country or subdivision the route enters represented by its code according to [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof BorderEvent
     */
    countryCode: string;
}

/**
 * Check if a given object implements the BorderEvent interface.
 */
export function instanceOfBorderEvent(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "countryCode" in value;

    return isInstance;
}

export function BorderEventFromJSON(json: any): BorderEvent {
    return BorderEventFromJSONTyped(json, false);
}

export function BorderEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): BorderEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'countryCode': json['countryCode'],
    };
}

export function BorderEventToJSON(value?: BorderEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'countryCode': value.countryCode,
    };
}

