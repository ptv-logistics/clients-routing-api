
# PositionOnRoute

The position of the vehicle if the vehicle position is not at a waypoint but somewhere on the route. This parameter is mutually exclusive with **waypoint**.

## Properties

Name | Type
------------ | -------------
`latitude` | number
`longitude` | number
`nextWaypointName` | string
`heading` | number
`headingTolerance` | number

## Example

```typescript
import type { PositionOnRoute } from ''

// TODO: Update the object below with actual values
const example = {
  "latitude": 49.480301,
  "longitude": 6.110667,
  "nextWaypointName": null,
  "heading": null,
  "headingTolerance": null,
} satisfies PositionOnRoute

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PositionOnRoute
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


