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

import { exists, mapValues } from '../runtime';
import type { EmissionsEN162582012 } from './EmissionsEN162582012';
import {
    EmissionsEN162582012FromJSON,
    EmissionsEN162582012FromJSONTyped,
    EmissionsEN162582012ToJSON,
} from './EmissionsEN162582012';
import type { EmissionsFrenchCO2eDecree2017639 } from './EmissionsFrenchCO2eDecree2017639';
import {
    EmissionsFrenchCO2eDecree2017639FromJSON,
    EmissionsFrenchCO2eDecree2017639FromJSONTyped,
    EmissionsFrenchCO2eDecree2017639ToJSON,
} from './EmissionsFrenchCO2eDecree2017639';
import type { EmissionsISO140832022 } from './EmissionsISO140832022';
import {
    EmissionsISO140832022FromJSON,
    EmissionsISO140832022FromJSONTyped,
    EmissionsISO140832022ToJSON,
} from './EmissionsISO140832022';
import type { EmissionsISO140832023 } from './EmissionsISO140832023';
import {
    EmissionsISO140832023FromJSON,
    EmissionsISO140832023FromJSONTyped,
    EmissionsISO140832023ToJSON,
} from './EmissionsISO140832023';

/**
 * Emissions such as the CO2-equivalent (CO2e) according to the selected standards. 
 * The CO2e value is the unit for comparing the radiative forcing of a greenhouse gas to carbon
 * dioxide according to [ISO 14064-1:2006](https://en.wikipedia.org/wiki/ISO_14064).
 * @export
 * @interface Emissions
 */
export interface Emissions {
    /**
     * 
     * @type {EmissionsEN162582012}
     * @memberof Emissions
     */
    en162582012?: EmissionsEN162582012;
    /**
     * 
     * @type {EmissionsISO140832022}
     * @memberof Emissions
     */
    iso140832022?: EmissionsISO140832022;
    /**
     * 
     * @type {EmissionsISO140832023}
     * @memberof Emissions
     */
    iso140832023?: EmissionsISO140832023;
    /**
     * 
     * @type {EmissionsFrenchCO2eDecree2017639}
     * @memberof Emissions
     */
    frenchCO2eDecree2017639?: EmissionsFrenchCO2eDecree2017639;
}

/**
 * Check if a given object implements the Emissions interface.
 */
export function instanceOfEmissions(value: object): boolean {
    let isInstance = true;

    return isInstance;
}

export function EmissionsFromJSON(json: any): Emissions {
    return EmissionsFromJSONTyped(json, false);
}

export function EmissionsFromJSONTyped(json: any, ignoreDiscriminator: boolean): Emissions {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'en162582012': !exists(json, 'en16258_2012') ? undefined : EmissionsEN162582012FromJSON(json['en16258_2012']),
        'iso140832022': !exists(json, 'iso14083_2022') ? undefined : EmissionsISO140832022FromJSON(json['iso14083_2022']),
        'iso140832023': !exists(json, 'iso14083_2023') ? undefined : EmissionsISO140832023FromJSON(json['iso14083_2023']),
        'frenchCO2eDecree2017639': !exists(json, 'frenchCO2eDecree2017_639') ? undefined : EmissionsFrenchCO2eDecree2017639FromJSON(json['frenchCO2eDecree2017_639']),
    };
}

export function EmissionsToJSON(value?: Emissions | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'en16258_2012': EmissionsEN162582012ToJSON(value.en162582012),
        'iso14083_2022': EmissionsISO140832022ToJSON(value.iso140832022),
        'iso14083_2023': EmissionsISO140832023ToJSON(value.iso140832023),
        'frenchCO2eDecree2017_639': EmissionsFrenchCO2eDecree2017639ToJSON(value.frenchCO2eDecree2017639),
    };
}

