
# ManipulateRouteWaypoint

A _manipulate-route waypoint_ will not actually be reached but it influences the route path, so that the route passes an area defined by the given radius. This waypoint will not appear as a waypoint event in the response and may not be used as start and destination.

## Properties

Name | Type
------------ | -------------
`latitude` | number
`longitude` | number
`radius` | number

## Example

```typescript
import type { ManipulateRouteWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "latitude": 49.480301,
  "longitude": 6.110667,
  "radius": null,
} satisfies ManipulateRouteWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ManipulateRouteWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


