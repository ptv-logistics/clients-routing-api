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


import * as runtime from '../runtime';
import {
    ErrorResponse,
    ErrorResponseFromJSON,
    ErrorResponseToJSON,
    HorizonType,
    HorizonTypeFromJSON,
    HorizonTypeToJSON,
    Locations,
    LocationsFromJSON,
    LocationsToJSON,
    ReachableLocationsId,
    ReachableLocationsIdFromJSON,
    ReachableLocationsIdToJSON,
    ReachableLocationsResponse,
    ReachableLocationsResponseFromJSON,
    ReachableLocationsResponseToJSON,
    ReachableOptions,
    ReachableOptionsFromJSON,
    ReachableOptionsToJSON,
} from '../models';

export interface DeleteReachableLocationsRequest {
    id: string;
}

export interface GetReachableLocationsRequest {
    id: string;
}

export interface StartAndCreateReachableLocationsRequest {
    horizon: number;
    locations: Locations;
    waypoint?: string;
    routeId?: string;
    profile?: string;
    horizonType?: HorizonType;
    options?: ReachableOptions;
}

/**
 * 
 */
export class ReachableLocationsApi extends runtime.BaseAPI {

    /**
     * Deletes calculated reachable locations specified by its ID.
     */
    async deleteReachableLocationsRaw(requestParameters: DeleteReachableLocationsRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<void>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling deleteReachableLocations.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-locations/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'DELETE',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.VoidApiResponse(response);
    }

    /**
     * Deletes calculated reachable locations specified by its ID.
     */
    async deleteReachableLocations(requestParameters: DeleteReachableLocationsRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<void> {
        await this.deleteReachableLocationsRaw(requestParameters, initOverrides);
    }

    /**
     * Gets the results of a reachable locations calculation specified by its ID.
     */
    async getReachableLocationsRaw(requestParameters: GetReachableLocationsRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<ReachableLocationsResponse>> {
        if (requestParameters.id === null || requestParameters.id === undefined) {
            throw new runtime.RequiredError('id','Required parameter requestParameters.id was null or undefined when calling getReachableLocations.');
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-locations/{id}`.replace(`{${"id"}}`, encodeURIComponent(String(requestParameters.id))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReachableLocationsResponseFromJSON(jsonValue));
    }

    /**
     * Gets the results of a reachable locations calculation specified by its ID.
     */
    async getReachableLocations(requestParameters: GetReachableLocationsRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<ReachableLocationsResponse> {
        const response = await this.getReachableLocationsRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Starts the calculation of the sets of reachable and unreachable locations from the given ones and creates them as the result.
     */
    async startAndCreateReachableLocationsRaw(requestParameters: StartAndCreateReachableLocationsRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<runtime.ApiResponse<ReachableLocationsId>> {
        if (requestParameters.horizon === null || requestParameters.horizon === undefined) {
            throw new runtime.RequiredError('horizon','Required parameter requestParameters.horizon was null or undefined when calling startAndCreateReachableLocations.');
        }

        if (requestParameters.locations === null || requestParameters.locations === undefined) {
            throw new runtime.RequiredError('locations','Required parameter requestParameters.locations was null or undefined when calling startAndCreateReachableLocations.');
        }

        const queryParameters: any = {};

        if (requestParameters.waypoint !== undefined) {
            queryParameters['waypoint'] = requestParameters.waypoint;
        }

        if (requestParameters.routeId !== undefined) {
            queryParameters['routeId'] = requestParameters.routeId;
        }

        if (requestParameters.profile !== undefined) {
            queryParameters['profile'] = requestParameters.profile;
        }

        if (requestParameters.horizon !== undefined) {
            queryParameters['horizon'] = requestParameters.horizon;
        }

        if (requestParameters.horizonType !== undefined) {
            queryParameters['horizonType'] = requestParameters.horizonType;
        }

        if (requestParameters.options !== undefined) {
            queryParameters['options'] = requestParameters.options;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && this.configuration.apiKey) {
            headerParameters["apiKey"] = this.configuration.apiKey("apiKey"); // apiKeyAuth authentication
        }

        const response = await this.request({
            path: `/reachable-locations`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: LocationsToJSON(requestParameters.locations),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => ReachableLocationsIdFromJSON(jsonValue));
    }

    /**
     * Starts the calculation of the sets of reachable and unreachable locations from the given ones and creates them as the result.
     */
    async startAndCreateReachableLocations(requestParameters: StartAndCreateReachableLocationsRequest, initOverrides?: RequestInit | runtime.InitOverideFunction): Promise<ReachableLocationsId> {
        const response = await this.startAndCreateReachableLocationsRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
