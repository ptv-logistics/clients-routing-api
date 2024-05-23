/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Defines how to consider traffic in a reachable areas or a reachable locations calculation.
 *  * `REALISTIC` - Uses the most realistic **travelTime** and **distance** for the selected vehicle and the
 *  given **referenceTime** (or the current time if none **referenceTime** is specified).
 *  Takes into account the live traffic situation such as traffic jams or road works
 *  as well as the typical traffic situation at the time of day and the day of week of travel such as the rush-hour
 *  on Monday morning or light traffic on Saturday evening.
 *  * `AVERAGE` - Uses the average **travelTime** and **distance** for the selected vehicle.
 *  If **referenceTime** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rush-hour
 *  on Monday morning or light traffic on Saturday evening.
 *  If no **referenceTime** is specified the typical traffic situation will not be considered, and **travelTime** and **distance** are an average independent of when to travel.
 * 
 * See [here](./concepts/traffic-modes) for more information.
 * This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.
 * @export
 */
export const ReachableTrafficMode = {
    REALISTIC: 'REALISTIC',
    AVERAGE: 'AVERAGE'
} as const;
export type ReachableTrafficMode = typeof ReachableTrafficMode[keyof typeof ReachableTrafficMode];


export function ReachableTrafficModeFromJSON(json: any): ReachableTrafficMode {
    return ReachableTrafficModeFromJSONTyped(json, false);
}

export function ReachableTrafficModeFromJSONTyped(json: any, ignoreDiscriminator: boolean): ReachableTrafficMode {
    return json as ReachableTrafficMode;
}

export function ReachableTrafficModeToJSON(value?: ReachableTrafficMode | null): any {
    return value as any;
}

