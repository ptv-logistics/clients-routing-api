/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * The cumulated toll price in the converted currency.
 * @export
 * @interface TollCostsConvertedPrice
 */
export interface TollCostsConvertedPrice {
    /**
     * The toll price in the specified currency.
     * @type {number}
     * @memberof TollCostsConvertedPrice
     */
    price: number;
    /**
     * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
     * @type {string}
     * @memberof TollCostsConvertedPrice
     */
    currency: string;
}

/**
 * Check if a given object implements the TollCostsConvertedPrice interface.
 */
export function instanceOfTollCostsConvertedPrice(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "price" in value;
    isInstance = isInstance && "currency" in value;

    return isInstance;
}

export function TollCostsConvertedPriceFromJSON(json: any): TollCostsConvertedPrice {
    return TollCostsConvertedPriceFromJSONTyped(json, false);
}

export function TollCostsConvertedPriceFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollCostsConvertedPrice {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'price': json['price'],
        'currency': json['currency'],
    };
}

export function TollCostsConvertedPriceToJSON(value?: TollCostsConvertedPrice | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'price': value.price,
        'currency': value.currency,
    };
}

