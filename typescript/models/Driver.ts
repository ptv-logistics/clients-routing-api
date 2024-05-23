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

import { exists, mapValues } from '../runtime';
import type { WorkingHoursPreset } from './WorkingHoursPreset';
import {
    WorkingHoursPresetFromJSON,
    WorkingHoursPresetFromJSONTyped,
    WorkingHoursPresetToJSON,
} from './WorkingHoursPreset';

/**
 * 
 * @export
 * @interface Driver
 */
export interface Driver {
    /**
     * 
     * @type {WorkingHoursPreset}
     * @memberof Driver
     */
    workingHoursPreset: WorkingHoursPreset | null;
}

/**
 * Check if a given object implements the Driver interface.
 */
export function instanceOfDriver(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "workingHoursPreset" in value;

    return isInstance;
}

export function DriverFromJSON(json: any): Driver {
    return DriverFromJSONTyped(json, false);
}

export function DriverFromJSONTyped(json: any, ignoreDiscriminator: boolean): Driver {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'workingHoursPreset': WorkingHoursPresetFromJSON(json['workingHoursPreset']),
    };
}

export function DriverToJSON(value?: Driver | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'workingHoursPreset': WorkingHoursPresetToJSON(value.workingHoursPreset),
    };
}

