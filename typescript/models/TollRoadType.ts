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
 * The reason why toll is charged.  
 *  * `GENERAL` - A general toll road where no special toll applies.  
 *  * `CITY` - An urban area or city is subject to toll.  
 *  * `BRIDGE` - A bridge is subject to toll.  
 *  * `TUNNEL` - A tunnel is subject to toll.  
 *  * `FERRY` - A ferry is subject to toll.  
 *  * `MOUNTAIN_PASS` - A mountain pass is subject to toll.  
 * @export
 */
export const TollRoadType = {
    GENERAL: 'GENERAL',
    CITY: 'CITY',
    BRIDGE: 'BRIDGE',
    TUNNEL: 'TUNNEL',
    FERRY: 'FERRY',
    MOUNTAIN_PASS: 'MOUNTAIN_PASS'
} as const;
export type TollRoadType = typeof TollRoadType[keyof typeof TollRoadType];


export function TollRoadTypeFromJSON(json: any): TollRoadType {
    return TollRoadTypeFromJSONTyped(json, false);
}

export function TollRoadTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): TollRoadType {
    return json as TollRoadType;
}

export function TollRoadTypeToJSON(value?: TollRoadType | null): any {
    return value as any;
}

