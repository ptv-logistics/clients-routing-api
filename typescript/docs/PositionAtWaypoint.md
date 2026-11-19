
# PositionAtWaypoint

The vehicle position if it is at a waypoint. This parameter is mutually exclusive with **position**.

## Properties

Name | Type
------------ | -------------
`name` | string
`performedServiceTime` | number

## Example

```typescript
import type { PositionAtWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "performedServiceTime": null,
} satisfies PositionAtWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PositionAtWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


