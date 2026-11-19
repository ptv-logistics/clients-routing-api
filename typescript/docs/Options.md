
# Options


## Properties

Name | Type
------------ | -------------
`startTime` | Date
`arrivalTime` | Date
`tollTime` | Date
`trafficMode` | [TrafficMode](TrafficMode.md)
`allowedCountries` | string
`prohibitedCountries` | string
`preferTurnsOnPassengerSide` | boolean
`avoid` | string
`blockIntersectingRoads` | string
`customRoadAttributeScenarios` | string
`routingMode` | [RoutingMode](RoutingMode.md)
`maximumSpeed` | number
`speedFactor` | number
`language` | string
`polylineFormat` | [PolylineFormat](PolylineFormat.md)
`polylineMapType` | [PolylineMapType](PolylineMapType.md)
`currency` | string
`maximumDistanceBetweenEvents` | number

## Example

```typescript
import type { Options } from ''

// TODO: Update the object below with actual values
const example = {
  "startTime": 2020-12-04T06:00Z,
  "arrivalTime": null,
  "tollTime": null,
  "trafficMode": null,
  "allowedCountries": null,
  "prohibitedCountries": null,
  "preferTurnsOnPassengerSide": false,
  "avoid": null,
  "blockIntersectingRoads": 49.8,9.9,49.9,10|33.1,-111.1,33.0,-111.2,
  "customRoadAttributeScenarios": null,
  "routingMode": null,
  "maximumSpeed": null,
  "speedFactor": 1.1,
  "language": null,
  "polylineFormat": null,
  "polylineMapType": null,
  "currency": null,
  "maximumDistanceBetweenEvents": null,
} satisfies Options

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Options
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


