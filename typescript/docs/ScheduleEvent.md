
# ScheduleEvent

Issued when the driver has to take a break or a rest, perform service or wait for a waypoint to open. If **useServiceTimeForRecreation** is true, each _SERVICE_ is reported along with another type depending on whether or not the service time is actually used for recreation. Times on a combined transport are always _WAITING_ unless used for recreation. Requires _SCHEDULE_EVENTS_ or _SCHEDULE_EVENTS_WITH_DRIVING_ to be requested, POST only. It can be helpful to take other events into account such as **waypoint** and **combinedTransport** to interpret the results, consider requesting them. When there are several waypoints at the same location, **waypoint** helps to match _SERVICE_ to the proper waypoint, **combinedTransport** helps to match recreation time.

## Properties

Name | Type
------------ | -------------
`duration` | number
`scheduleTypes` | [Array&lt;ScheduleType&gt;](ScheduleType.md)

## Example

```typescript
import type { ScheduleEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "duration": null,
  "scheduleTypes": null,
} satisfies ScheduleEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


