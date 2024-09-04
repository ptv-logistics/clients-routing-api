/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.31
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { TollSectionCost } from './TollSectionCost';
import {
    TollSectionCostFromJSON,
    TollSectionCostFromJSONTyped,
    TollSectionCostToJSON,
} from './TollSectionCost';
import type { TollRoadType } from './TollRoadType';
import {
    TollRoadTypeFromJSON,
    TollRoadTypeFromJSONTyped,
    TollRoadTypeToJSON,
} from './TollRoadType';

/**
 * 
 * @export
 * @interface TollSection
 */
export interface TollSection {
    /**
     * The toll costs payable for this section. If different prices according to the payment method exist, this list contains one item for each price.
     * The first item contains the price used to calculate the total toll costs for the route.
     * Further items are alternative costs for the section with different payment methods or different subscriptions.
     * @type {Array<TollSectionCost>}
     * @memberof TollSection
     */
    costs: Array<TollSectionCost>;
    /**
     * 
     * @type {TollRoadType}
     * @memberof TollSection
     */
    tollRoadType: TollRoadType;
    /**
     * The index in the list of toll systems this toll section belongs to.
     * @type {number}
     * @memberof TollSection
     */
    tollSystemIndex?: number;
    /**
     * Countries are represented according to their [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) or [ISO 3166-2](https://en.wikipedia.org/wiki/ISO_3166-2) if referring to a subdivision.
     * @type {string}
     * @memberof TollSection
     */
    countryCode: string;
    /**
     * A name that describes this toll section. It can relate to the names of the road intersections, to the area in general or to the type of toll.
     * @type {string}
     * @memberof TollSection
     */
    displayName?: string;
    /**
     * The official distance defined by the toll operator [m].  It may be different from the travel distance. Only present if the toll operator provides an official distance.
     * @type {number}
     * @memberof TollSection
     */
    officialDistance?: number;
    /**
     * The calculated distance of the toll section on the current route.  It may be different from the official distance.
     * @type {number}
     * @memberof TollSection
     */
    calculatedDistance?: number;
}



/**
 * Check if a given object implements the TollSection interface.
 */
export function instanceOfTollSection(value: object): value is TollSection {
    if (!('costs' in value) || value['costs'] === undefined) return false;
    if (!('tollRoadType' in value) || value['tollRoadType'] === undefined) return false;
    if (!('countryCode' in value) || value['countryCode'] === undefined) return false;
    return true;
}

export function TollSectionFromJSON(json: any): TollSection {
    return TollSectionFromJSONTyped(json, false);
}

export function TollSectionFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollSection {
    if (json == null) {
        return json;
    }
    return {
        
        'costs': ((json['costs'] as Array<any>).map(TollSectionCostFromJSON)),
        'tollRoadType': TollRoadTypeFromJSON(json['tollRoadType']),
        'tollSystemIndex': json['tollSystemIndex'] == null ? undefined : json['tollSystemIndex'],
        'countryCode': json['countryCode'],
        'displayName': json['displayName'] == null ? undefined : json['displayName'],
        'officialDistance': json['officialDistance'] == null ? undefined : json['officialDistance'],
        'calculatedDistance': json['calculatedDistance'] == null ? undefined : json['calculatedDistance'],
    };
}

export function TollSectionToJSON(value?: TollSection | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'costs': ((value['costs'] as Array<any>).map(TollSectionCostToJSON)),
        'tollRoadType': TollRoadTypeToJSON(value['tollRoadType']),
        'tollSystemIndex': value['tollSystemIndex'],
        'countryCode': value['countryCode'],
        'displayName': value['displayName'],
        'officialDistance': value['officialDistance'],
        'calculatedDistance': value['calculatedDistance'],
    };
}

