/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
/**
 * Issued when the offset to UTC changes, mostly when traveling into a different time zone.
 * Requires _UTC_OFFSET_CHANGE_EVENTS_ to be requested.  
 * 
 * Changing the UTC offset does not necessarily mean to change the time
 * zone. Vice-versa changing the time zone does not necessarily mean to
 * change the UTC offset. There are some special cases to consider.
 *  *  The UTC offset may change even within a time zone when the route takes place exactly when the daylight-saving time changes.
 *  *  The UTC offset may not change when changing the time zone. In Canada, for example, there are regions which do not use DST 
 *  so that the neighboring time zone has the same UTC offset in summer.
 * @export
 * @interface UTCOffsetChangeEvent
 */
export interface UTCOffsetChangeEvent {
    /**
     * The new UTC offset [min].
     * @type {number}
     * @memberof UTCOffsetChangeEvent
     */
    utcOffset: number;
}

/**
 * Check if a given object implements the UTCOffsetChangeEvent interface.
 */
export function instanceOfUTCOffsetChangeEvent(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "utcOffset" in value;

    return isInstance;
}

export function UTCOffsetChangeEventFromJSON(json: any): UTCOffsetChangeEvent {
    return UTCOffsetChangeEventFromJSONTyped(json, false);
}

export function UTCOffsetChangeEventFromJSONTyped(json: any, ignoreDiscriminator: boolean): UTCOffsetChangeEvent {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'utcOffset': json['utcOffset'],
    };
}

export function UTCOffsetChangeEventToJSON(value?: UTCOffsetChangeEvent | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'utcOffset': value.utcOffset,
    };
}

