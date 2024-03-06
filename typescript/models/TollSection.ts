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
import type { TollRoadType } from './TollRoadType';
import {
    TollRoadTypeFromJSON,
    TollRoadTypeFromJSONTyped,
    TollRoadTypeToJSON,
} from './TollRoadType';
import type { TollSectionCost } from './TollSectionCost';
import {
    TollSectionCostFromJSON,
    TollSectionCostFromJSONTyped,
    TollSectionCostToJSON,
} from './TollSectionCost';

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
export function instanceOfTollSection(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "costs" in value;
    isInstance = isInstance && "tollRoadType" in value;
    isInstance = isInstance && "countryCode" in value;

    return isInstance;
}

export function TollSectionFromJSON(json: any): TollSection {
    return TollSectionFromJSONTyped(json, false);
}

export function TollSectionFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollSection {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'costs': ((json['costs'] as Array<any>).map(TollSectionCostFromJSON)),
        'tollRoadType': TollRoadTypeFromJSON(json['tollRoadType']),
        'tollSystemIndex': !exists(json, 'tollSystemIndex') ? undefined : json['tollSystemIndex'],
        'countryCode': json['countryCode'],
        'displayName': !exists(json, 'displayName') ? undefined : json['displayName'],
        'officialDistance': !exists(json, 'officialDistance') ? undefined : json['officialDistance'],
        'calculatedDistance': !exists(json, 'calculatedDistance') ? undefined : json['calculatedDistance'],
    };
}

export function TollSectionToJSON(value?: TollSection | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'costs': ((value.costs as Array<any>).map(TollSectionCostToJSON)),
        'tollRoadType': TollRoadTypeToJSON(value.tollRoadType),
        'tollSystemIndex': value.tollSystemIndex,
        'countryCode': value.countryCode,
        'displayName': value.displayName,
        'officialDistance': value.officialDistance,
        'calculatedDistance': value.calculatedDistance,
    };
}

