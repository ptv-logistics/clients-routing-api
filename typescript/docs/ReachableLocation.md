
# ReachableLocation

Contains the distance and travel time from the input waypoint or route to a reached location or vice versa (depending on the request drivingDirection).

## Properties

Name | Type
------------ | -------------
`distance` | number
`travelTime` | number
`index` | number

## Example

```typescript
import type { ReachableLocation } from ''

// TODO: Update the object below with actual values
const example = {
  "distance": null,
  "travelTime": null,
  "index": null,
} satisfies ReachableLocation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReachableLocation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


