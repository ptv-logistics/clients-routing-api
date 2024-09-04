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


/**
 * The electricity type of the vehicle.
 * 
 * Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for `emissions`.
 * 
 * @export
 */
export const ElectricityType = {
    BATTERY: 'BATTERY',
    HYDROGEN_FUEL_CELL: 'HYDROGEN_FUEL_CELL',
    NONE: 'NONE'
} as const;
export type ElectricityType = typeof ElectricityType[keyof typeof ElectricityType];


export function instanceOfElectricityType(value: any): boolean {
    for (const key in ElectricityType) {
        if (Object.prototype.hasOwnProperty.call(ElectricityType, key)) {
            if (ElectricityType[key as keyof typeof ElectricityType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function ElectricityTypeFromJSON(json: any): ElectricityType {
    return ElectricityTypeFromJSONTyped(json, false);
}

export function ElectricityTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ElectricityType {
    return json as ElectricityType;
}

export function ElectricityTypeToJSON(value?: ElectricityType | null): any {
    return value as any;
}

