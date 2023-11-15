/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * 
 * @export
 */
export const TruckRoutes = {
    DE_LKWUEBERLSTVAUSNV: 'DE_LKWUEBERLSTVAUSNV',
    NL_LZV: 'NL_LZV',
    NZ_HPMV: 'NZ_HPMV',
    SE_BK_1: 'SE_BK_1',
    SE_BK_2: 'SE_BK_2',
    SE_BK_3: 'SE_BK_3',
    SE_BK_4: 'SE_BK_4',
    US_STAA: 'US_STAA',
    US_TD: 'US_TD',
    AU_B_DOUBLE: 'AU_B_DOUBLE',
    AU_B_DOUBLE_HML: 'AU_B_DOUBLE_HML',
    AU_B_TRIPLE: 'AU_B_TRIPLE',
    AU_B_TRIPLE_HML: 'AU_B_TRIPLE_HML',
    AU_AB_TRIPLE: 'AU_AB_TRIPLE',
    AU_AB_TRIPLE_HML: 'AU_AB_TRIPLE_HML',
    NONE: 'NONE'
} as const;
export type TruckRoutes = typeof TruckRoutes[keyof typeof TruckRoutes];


export function TruckRoutesFromJSON(json: any): TruckRoutes {
    return TruckRoutesFromJSONTyped(json, false);
}

export function TruckRoutesFromJSONTyped(json: any, ignoreDiscriminator: boolean): TruckRoutes {
    return json as TruckRoutes;
}

export function TruckRoutesToJSON(value?: TruckRoutes | null): any {
    return value as any;
}

