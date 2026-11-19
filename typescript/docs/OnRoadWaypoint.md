
# OnRoadWaypoint

An _on-road waypoint_ will be matched to the nearest possible road. The air-line connection between given and matched coordinates is not included in the route polyline, distance and duration.

## Properties

Name | Type
------------ | -------------
`latitude` | number
`longitude` | number
`matchSideOfStreet` | boolean
`considerAlternativeNearbyRoads` | boolean
`serviceTime` | number
`useServiceTimeForRecreation` | boolean
`openingIntervals` | [Array&lt;TimeInterval&gt;](TimeInterval.md)
`vehicleParameters` | [VehicleParametersAtWaypoint](VehicleParametersAtWaypoint.md)
`evParameters` | [EvParametersAtWaypoint](EvParametersAtWaypoint.md)

## Example

```typescript
import type { OnRoadWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "latitude": 49.480301,
  "longitude": 6.110667,
  "matchSideOfStreet": null,
  "considerAlternativeNearbyRoads": null,
  "serviceTime": null,
  "useServiceTimeForRecreation": null,
  "openingIntervals": null,
  "vehicleParameters": null,
  "evParameters": null,
} satisfies OnRoadWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OnRoadWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


