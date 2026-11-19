
# VehicleParametersAtWaypoint

The vehicle parameters that change at a waypoint. A vehicle parameter specified at a waypoint overrides the setting from the **profile** and **vehicle**. It is valid until the end of the route unless it is changed again at a subsequent waypoint.  When requesting the _ROUTE_ID_, these vehicle parameters are also taken into account during route recalculation.  To recalculate a route with different vehicle parameters, we recommend not specifying any vehicle parameters at the waypoints,  as this may lead to unexpected toll or emission results. 

## Properties

Name | Type
------------ | -------------
`averageFuelConsumption` | number
`averageElectricityConsumption` | number
`loadWeight` | number
`axleWeight` | number
`height` | number
`length` | number
`width` | number
`hazardousMaterials` | [Array&lt;HazardousMaterials&gt;](HazardousMaterials.md)
`tunnelRestrictionCode` | [TunnelRestrictionCode](TunnelRestrictionCode.md)
`truckRoutes` | [Array&lt;TruckRoutes&gt;](TruckRoutes.md)

## Example

```typescript
import type { VehicleParametersAtWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "averageFuelConsumption": 35,
  "averageElectricityConsumption": 115,
  "loadWeight": 25000,
  "axleWeight": 11500,
  "height": 400,
  "length": 1650,
  "width": 254,
  "hazardousMaterials": null,
  "tunnelRestrictionCode": null,
  "truckRoutes": null,
} satisfies VehicleParametersAtWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VehicleParametersAtWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


