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


/**
 * 
 * @export
 */
export const LowEmissionZoneTypes = {
    DE_GREEN: 'DE_GREEN',
    DE_YELLOW: 'DE_YELLOW',
    DE_RED: 'DE_RED',
    DE_NONE: 'DE_NONE'
} as const;
export type LowEmissionZoneTypes = typeof LowEmissionZoneTypes[keyof typeof LowEmissionZoneTypes];


export function instanceOfLowEmissionZoneTypes(value: any): boolean {
    for (const key in LowEmissionZoneTypes) {
        if (Object.prototype.hasOwnProperty.call(LowEmissionZoneTypes, key)) {
            if (LowEmissionZoneTypes[key as keyof typeof LowEmissionZoneTypes] === value) {
                return true;
            }
        }
    }
    return false;
}

export function LowEmissionZoneTypesFromJSON(json: any): LowEmissionZoneTypes {
    return LowEmissionZoneTypesFromJSONTyped(json, false);
}

export function LowEmissionZoneTypesFromJSONTyped(json: any, ignoreDiscriminator: boolean): LowEmissionZoneTypes {
    return json as LowEmissionZoneTypes;
}

export function LowEmissionZoneTypesToJSON(value?: LowEmissionZoneTypes | null): any {
    return value as any;
}

