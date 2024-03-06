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


/**
 * Specifies the geographical horizon.
 *  * `DISTANCE` - Represents a geographical horizon that is described by a distance. Every point or road segment that is reachable from the source within the specified distance is included in the horizon.
 *  * `TRAVEL_TIME` - Represents a geographical horizon that is described by a travel time. Every point or road segment that is reachable from the source within the specified travel time is included in the horizon.
 * @export
 */
export const HorizonType = {
    DISTANCE: 'DISTANCE',
    TRAVEL_TIME: 'TRAVEL_TIME'
} as const;
export type HorizonType = typeof HorizonType[keyof typeof HorizonType];


export function HorizonTypeFromJSON(json: any): HorizonType {
    return HorizonTypeFromJSONTyped(json, false);
}

export function HorizonTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): HorizonType {
    return json as HorizonType;
}

export function HorizonTypeToJSON(value?: HorizonType | null): any {
    return value as any;
}

