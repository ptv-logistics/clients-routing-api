
# WaypointEvent

Issued when a waypoint is reached by the route, but not for route-manipulation waypoints. When using drivers\' working hours and the schedule requires a break or a waiting time before the service, the waypoint event is issued already with the break or the waiting time as the location is already reached. Requires _WAYPOINT_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`index` | number
`name` | string

## Example

```typescript
import type { WaypointEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "index": null,
  "name": null,
} satisfies WaypointEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as WaypointEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


