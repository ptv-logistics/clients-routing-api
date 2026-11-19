
# ReachableOptions


## Properties

Name | Type
------------ | -------------
`drivingDirection` | [DrivingDirection](DrivingDirection.md)
`referenceTime` | Date
`trafficMode` | [ReachableTrafficMode](ReachableTrafficMode.md)
`allowedCountries` | string
`prohibitedCountries` | string
`blockIntersectingRoads` | string

## Example

```typescript
import type { ReachableOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "drivingDirection": null,
  "referenceTime": 2020-12-04T06:00Z,
  "trafficMode": null,
  "allowedCountries": null,
  "prohibitedCountries": null,
  "blockIntersectingRoads": 49.8,9.9,49.9,10|33.1,-111.1,33.0,-111.2,
} satisfies ReachableOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReachableOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


