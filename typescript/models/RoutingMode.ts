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
 * Specifies which objective function should be used for the route calculation.  
 * * _FAST_ is the default which returns a route considering a tradeoff between distance an travel time.
 * All vehicle-specific restrictions are properly considered and violated only, if no other route can be found.
 * * _SHORT_ returns a route which is probably shorter but accepting longer travel times.
 * The resulting route is still sensible and can be driven with the given vehicle, but it may disregard restrictions like driving through residential areas.
 * * _MONETARY_ assigns monetary costs to each road segment according the provided cost parameters and the vehicles properties like its consumption.
 * Furthermore, toll costs are integrated as well. See [here](./concepts/monetary-costs) for more information.
 * @export
 */
export const RoutingMode = {
    FAST: 'FAST',
    SHORT: 'SHORT',
    MONETARY: 'MONETARY'
} as const;
export type RoutingMode = typeof RoutingMode[keyof typeof RoutingMode];


export function RoutingModeFromJSON(json: any): RoutingMode {
    return RoutingModeFromJSONTyped(json, false);
}

export function RoutingModeFromJSONTyped(json: any, ignoreDiscriminator: boolean): RoutingMode {
    return json as RoutingMode;
}

export function RoutingModeToJSON(value?: RoutingMode | null): any {
    return value as any;
}

