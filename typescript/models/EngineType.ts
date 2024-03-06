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
 * The engine type of the vehicle.
 * When changing the engine type further parameters must be specified to define a valid vehicle and to
 * obtain proper results. For a hybrid or an electric vehicle **electricityType** and **averageElectricityConsumption**
 * must be specified, for a hybrid vehicle additionally the **hybridRatio**.
 * 
 * This and all dependent parameters cannot be used with a model of an electric vehicle, because all applicable 
 * parameters are automatically provided by the model.
 * Please refer to the [concept](./concepts/model-based-ev-consumption-calculation) to see specifically which 
 * parameters are not compatible and automatically set from the vehicle model.
 * 
 * Relevant for `toll`, `emissions`.
 * @export
 */
export const EngineType = {
    COMBUSTION: 'COMBUSTION',
    ELECTRIC: 'ELECTRIC',
    HYBRID: 'HYBRID'
} as const;
export type EngineType = typeof EngineType[keyof typeof EngineType];


export function EngineTypeFromJSON(json: any): EngineType {
    return EngineTypeFromJSONTyped(json, false);
}

export function EngineTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): EngineType {
    return json as EngineType;
}

export function EngineTypeToJSON(value?: EngineType | null): any {
    return value as any;
}

