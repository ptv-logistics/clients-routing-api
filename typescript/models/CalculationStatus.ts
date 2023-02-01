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
 * The current status of the calculation.
 *  * `RUNNING` - The calculation is still running.
 *  * `SUCCEEDED` - The calculation has completed successfully.
 *  * `FAILED` - The calculation has completed with a failure.
 * @export
 */
export const CalculationStatus = {
    RUNNING: 'RUNNING',
    SUCCEEDED: 'SUCCEEDED',
    FAILED: 'FAILED'
} as const;
export type CalculationStatus = typeof CalculationStatus[keyof typeof CalculationStatus];


export function CalculationStatusFromJSON(json: any): CalculationStatus {
    return CalculationStatusFromJSONTyped(json, false);
}

export function CalculationStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): CalculationStatus {
    return json as CalculationStatus;
}

export function CalculationStatusToJSON(value?: CalculationStatus | null): any {
    return value as any;
}

