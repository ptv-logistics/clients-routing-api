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
 * 
 * @export
 */
export const HazardousMaterials = {
    HAZARDOUS_TO_WATER: 'HAZARDOUS_TO_WATER',
    EXPLOSIVE: 'EXPLOSIVE',
    FLAMMABLE: 'FLAMMABLE',
    RADIOACTIVE: 'RADIOACTIVE',
    INHALATION_HAZARD: 'INHALATION_HAZARD',
    MEDICAL_WASTE: 'MEDICAL_WASTE',
    OTHER: 'OTHER',
    NONE: 'NONE'
} as const;
export type HazardousMaterials = typeof HazardousMaterials[keyof typeof HazardousMaterials];


export function HazardousMaterialsFromJSON(json: any): HazardousMaterials {
    return HazardousMaterialsFromJSONTyped(json, false);
}

export function HazardousMaterialsFromJSONTyped(json: any, ignoreDiscriminator: boolean): HazardousMaterials {
    return json as HazardousMaterials;
}

export function HazardousMaterialsToJSON(value?: HazardousMaterials | null): any {
    return value as any;
}

