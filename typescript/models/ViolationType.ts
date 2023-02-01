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
 * The reason why the road or the schedule is violated.
 *  * `PROHIBITED` - The violated road is prohibited in general for the current vehicle.  
 *  * `DELIVERY_ONLY` - The violated road is prohibited except for delivery reasons but delivery is disallowed for the cars and vans.  
 *  * `URBAN` - The violated road is prohibited because it is flagged as urban.  
 *  * `RESIDENTS_ONLY` - The violated road is prohibited because it is flagged as residents only for the current vehicle.  
 *  * `RESTRICTED_ACCESS` - A point with restricted access, e.g. a gate or a bollard was passed.  
 *  * `VEHICLE_PROPERTY` - The violated road is prohibited for the current vehicle due to a vehicle property such as the weight or height.  
 *  * `COMBINED_TRANSPORT` - The violated road is a boat(ferry) or rail (train or rail shuttle) connection prohibited for the current vehicle.
 *  * `SCHEDULE` - The schedule is violated. The reasons can be found in **scheduleViolationTypes**.
 *  * `BLOCKED_ROAD_BY_INTERSECTION` - The violated road has been blocked through **options[blockIntersectingRoads]**.
 * @export
 */
export const ViolationType = {
    PROHIBITED: 'PROHIBITED',
    DELIVERY_ONLY: 'DELIVERY_ONLY',
    URBAN: 'URBAN',
    RESIDENTS_ONLY: 'RESIDENTS_ONLY',
    RESTRICTED_ACCESS: 'RESTRICTED_ACCESS',
    VEHICLE_PROPERTY: 'VEHICLE_PROPERTY',
    COMBINED_TRANSPORT: 'COMBINED_TRANSPORT',
    SCHEDULE: 'SCHEDULE',
    BLOCKED_ROAD_BY_INTERSECTION: 'BLOCKED_ROAD_BY_INTERSECTION'
} as const;
export type ViolationType = typeof ViolationType[keyof typeof ViolationType];


export function ViolationTypeFromJSON(json: any): ViolationType {
    return ViolationTypeFromJSONTyped(json, false);
}

export function ViolationTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ViolationType {
    return json as ViolationType;
}

export function ViolationTypeToJSON(value?: ViolationType | null): any {
    return value as any;
}

