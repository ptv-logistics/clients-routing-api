
# OffRoadWaypoint

An _off-road waypoint_ will be part of the route. The air-line connection between given and matched coordinates is included in the route polyline, distance and duration. Use this waypoint type to recalculate a route planned by the Route Optimization API.

## Properties

Name | Type
------------ | -------------
`latitude` | number
`longitude` | number
`roadAcess` | [RoadAccess](RoadAccess.md)
`matchSideOfStreet` | boolean
`serviceTime` | number
`useServiceTimeForRecreation` | boolean
`openingIntervals` | [Array&lt;TimeInterval&gt;](TimeInterval.md)
`vehicleParameters` | [VehicleParametersAtWaypoint](VehicleParametersAtWaypoint.md)
`evParameters` | [EvParametersAtWaypoint](EvParametersAtWaypoint.md)

## Example

```typescript
import type { OffRoadWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "latitude": 49.480301,
  "longitude": 6.110667,
  "roadAcess": null,
  "matchSideOfStreet": null,
  "serviceTime": null,
  "useServiceTimeForRecreation": null,
  "openingIntervals": null,
  "vehicleParameters": null,
  "evParameters": null,
} satisfies OffRoadWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OffRoadWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


