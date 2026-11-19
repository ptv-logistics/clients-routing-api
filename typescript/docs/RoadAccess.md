
# RoadAccess

Use these coordinates for matching to the nearest road. This is useful if the waypoint should not be matched to the nearest possible road but to some road further away, e.g. garage exit at a different road.

## Properties

Name | Type
------------ | -------------
`latitude` | number
`longitude` | number

## Example

```typescript
import type { RoadAccess } from ''

// TODO: Update the object below with actual values
const example = {
  "latitude": 49.480301,
  "longitude": 6.110667,
} satisfies RoadAccess

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RoadAccess
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


