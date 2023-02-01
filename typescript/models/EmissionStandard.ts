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


/**
 * The emission standard of the vehicle valid in the European Union.
 * 
 * Values different from _NONE_ supported for **engineType** _COMBUSTION_ and _HBYRID_. Relevant for `toll`, `emissions`.
 * @export
 */
export const EmissionStandard = {
    NONE: 'NONE',
    EURO_0: 'EURO_0',
    EURO_1: 'EURO_1',
    EURO_2: 'EURO_2',
    EURO_3: 'EURO_3',
    EURO_4: 'EURO_4',
    EURO_5: 'EURO_5',
    EURO_EEV: 'EURO_EEV',
    EURO_6: 'EURO_6',
    EURO_6C: 'EURO_6C',
    EURO_6D_TEMP: 'EURO_6D_TEMP',
    EURO_6D: 'EURO_6D',
    EURO_6E: 'EURO_6E',
    EURO_7: 'EURO_7'
} as const;
export type EmissionStandard = typeof EmissionStandard[keyof typeof EmissionStandard];


export function EmissionStandardFromJSON(json: any): EmissionStandard {
    return EmissionStandardFromJSONTyped(json, false);
}

export function EmissionStandardFromJSONTyped(json: any, ignoreDiscriminator: boolean): EmissionStandard {
    return json as EmissionStandard;
}

export function EmissionStandardToJSON(value?: EmissionStandard | null): any {
    return value as any;
}

