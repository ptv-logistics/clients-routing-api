
# Waypoint


## Properties

Name | Type
------------ | -------------
`name` | string
`onRoad` | [OnRoadWaypoint](OnRoadWaypoint.md)
`offRoad` | [OffRoadWaypoint](OffRoadWaypoint.md)
`manipulate` | [ManipulateRouteWaypoint](ManipulateRouteWaypoint.md)
`combinedTransport` | [CombinedTransport](CombinedTransport.md)

## Example

```typescript
import type { Waypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "onRoad": null,
  "offRoad": null,
  "manipulate": null,
  "combinedTransport": null,
} satisfies Waypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Waypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


