# ReachableLocationsApi

All URIs are relative to *https://api.myptv.com/routing/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteReachableLocations**](ReachableLocationsApi.md#deletereachablelocations) | **DELETE** /reachable-locations/{id} |  |
| [**getReachableLocations**](ReachableLocationsApi.md#getreachablelocations) | **GET** /reachable-locations/{id} |  |
| [**startAndCreateReachableLocations**](ReachableLocationsApi.md#startandcreatereachablelocations) | **POST** /reachable-locations |  |



## deleteReachableLocations

> deleteReachableLocations(id)



Cancels a reachable locations calculation and deletes the calculated results specified by its ID. Results already calculated cannot be requested by its ID, anymore.

### Example

```ts
import {
  Configuration,
  ReachableLocationsApi,
} from '';
import type { DeleteReachableLocationsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure API key authorization: apiKeyAuth
    apiKey: "YOUR API KEY",
  });
  const api = new ReachableLocationsApi(config);

  const body = {
    // string | The ID of the calculated reachable locations.
    id: 38400000-8cf0-11bd-b23e-10b96e4ef00d,
  } satisfies DeleteReachableLocationsRequest;

  try {
    const data = await api.deleteReachableLocations(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | The ID of the calculated reachable locations. | [Defaults to `undefined`] |

### Return type

`void` (Empty response body)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Response on success. |  -  |
| **0** | Response on failure. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## getReachableLocations

> ReachableLocationsResponse getReachableLocations(id, maximumPollingPeriod)



Gets the results of a reachable locations calculation specified by its ID.

### Example

```ts
import {
  Configuration,
  ReachableLocationsApi,
} from '';
import type { GetReachableLocationsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure API key authorization: apiKeyAuth
    apiKey: "YOUR API KEY",
  });
  const api = new ReachableLocationsApi(config);

  const body = {
    // string | The ID of the calculated reachable locations.
    id: 38400000-8cf0-11bd-b23e-10b96e4ef00d,
    // number | If the calculation is still running, this operation will be blocked and will not return before this period [ms] expires. If the calculation is completed, it will return immediately.  The default of 0 ms will cause the operation to return immediately in any case. Use a value > 0 to implement long polling to reduce the number of requests. See the [tutorial](https://developer.myptv.com/en/resources/tutorials/general/how-use-asynchronous-requests-ptv-developer-apis) on asynchronous requests for details.  (optional)
    maximumPollingPeriod: 56,
  } satisfies GetReachableLocationsRequest;

  try {
    const data = await api.getReachableLocations(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | The ID of the calculated reachable locations. | [Defaults to `undefined`] |
| **maximumPollingPeriod** | `number` | If the calculation is still running, this operation will be blocked and will not return before this period [ms] expires. If the calculation is completed, it will return immediately.  The default of 0 ms will cause the operation to return immediately in any case. Use a value &gt; 0 to implement long polling to reduce the number of requests. See the [tutorial](https://developer.myptv.com/en/resources/tutorials/general/how-use-asynchronous-requests-ptv-developer-apis) on asynchronous requests for details.  | [Optional] [Defaults to `0`] |

### Return type

[**ReachableLocationsResponse**](ReachableLocationsResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response on success. |  -  |
| **0** | Response on failure. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## startAndCreateReachableLocations

> ReachableLocationsId startAndCreateReachableLocations(horizon, locations, waypoint, routeId, profile, horizonType, options)



Starts the calculation of the sets of reachable and unreachable locations from the given ones and creates them as the result.

### Example

```ts
import {
  Configuration,
  ReachableLocationsApi,
} from '';
import type { StartAndCreateReachableLocationsRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure API key authorization: apiKeyAuth
    apiKey: "YOUR API KEY",
  });
  const api = new ReachableLocationsApi(config);

  const body = {
    // number | The distance [m] or travel time [s] of the horizons, depending of the **horizonType** (limited to 200 km or 2 hours from a waypoint, 50 km or 45 minutes from a route).
    horizon: 100,
    // Locations
    locations: ...,
    // string | The start or destination waypoint. The format of the waypoint is `<lat>,<lon>[;<attribute>;<attribute>;...]` representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behavior of a waypoint can be changed by appending the following attributes:   * `includeLastMeters` to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * `roadAccess=<lat>,<lon>`, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. (optional)
    waypoint: waypoint_example,
    // string | Instead of the waypoint mentioned above, a **routeId** from a previously calculated route or a matched track can be entered. More information and applying restrictions can be found [here](./concepts/route-ids). (optional)
    routeId: 3a58b824-fa8b-47eb-a5b8-73d6b753e1b4,
    // string | A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. (optional)
    profile: profile_example,
    // HorizonType (optional)
    horizonType: ...,
    // ReachableOptions | Routing-relevant options like driving direction or the use of additional data. Use array notation like `options[trafficMode]=AVERAGE` to set options. (optional)
    options: ...,
  } satisfies StartAndCreateReachableLocationsRequest;

  try {
    const data = await api.startAndCreateReachableLocations(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **horizon** | `number` | The distance [m] or travel time [s] of the horizons, depending of the **horizonType** (limited to 200 km or 2 hours from a waypoint, 50 km or 45 minutes from a route). | [Defaults to `undefined`] |
| **locations** | [Locations](Locations.md) |  | |
| **waypoint** | `string` | The start or destination waypoint. The format of the waypoint is &#x60;&lt;lat&gt;,&lt;lon&gt;[;&lt;attribute&gt;;&lt;attribute&gt;;...]&#x60; representing a point with the latitude value in degrees from south to north and the longitude value in degrees (WGS84/EPSG:4326) from west to east. This point will be matched to the nearest possible road. By default the air-line connection between given and matched coordinates is not included in the distance or duration. We will refer to this type of waypoint as an _on-road waypoint_.  The behavior of a waypoint can be changed by appending the following attributes:   * &#x60;includeLastMeters&#x60; to include the air-line connection between given and matched coordinates in the distance or duration.   We will refer to this type of waypoint as an _off-road waypoint_.   * &#x60;roadAccess&#x3D;&lt;lat&gt;,&lt;lon&gt;&#x60;, to use these coordinates for matching to the nearest road. Implies **includeLastMeters**, i.e.   the air-line connection between the waypoint coordinates and the matched coordinates   is included in the distance or duration. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away,   e.g. garage exit at a different road.  See [here](./concepts/waypoints) for more information. | [Optional] [Defaults to `undefined`] |
| **routeId** | `string` | Instead of the waypoint mentioned above, a **routeId** from a previously calculated route or a matched track can be entered. More information and applying restrictions can be found [here](./concepts/route-ids). | [Optional] [Defaults to `undefined`] |
| **profile** | `string` | A profile defines a vehicle by a set of attributes, matching typical transport situations. It must be the name of one of the [predefined profiles](../data-api/concepts/profiles) such as _EUR_TRAILER_TRUCK_.  If this parameter is not specified and the first waypoint or the routeId is located in the Americas, _USA_8_SEMITRAILER_5AXLE_ is used as the default instead of _EUR_TRAILER_TRUCK_.  If the first waypoint or the routeId is located in the Americas but a non-American profile is specified or vice-versa, a warning is returned (routing only). Always use a profile which matches the region of the waypoints to obtain best results.  If the attributes of the profile do not fit to your vehicle, the values can be changed by the corresponding attributes in the **vehicle** parameter (routing only).  The values of the predefined profiles may be adapted to reflect current vehicle standards. To obtain the same results when values change, it is recommended to  always send with the request the **vehicle** parameters that are important for your use case. | [Optional] [Defaults to `&#39;EUR_TRAILER_TRUCK&#39;`] |
| **horizonType** | `HorizonType` |  | [Optional] [Defaults to `undefined`] [Enum: DISTANCE, TRAVEL_TIME] |
| **options** | [](.md) | Routing-relevant options like driving direction or the use of additional data. Use array notation like &#x60;options[trafficMode]&#x3D;AVERAGE&#x60; to set options. | [Optional] [Defaults to `undefined`] |

### Return type

[**ReachableLocationsId**](ReachableLocationsId.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Response on success. |  -  |
| **0** | Response on failure. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

