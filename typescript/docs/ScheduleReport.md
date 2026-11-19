
# ScheduleReport

Provides an overview of the times of the schedule of this route including break and rest times. The sum of all times is equal to the **travelTime** of the route.         If **useServiceTimeForRecreation** is true, waiting, break and rest times which take place during service will not be reported here. If that does not match your needs, please evaluate the corresponding **scheduleEvent**s.  Requires _SCHEDULE_REPORT_ to be requested, POST only.

## Properties

Name | Type
------------ | -------------
`startTime` | Date
`endTime` | Date
`drivingTime` | number
`serviceTime` | number
`waitingTime` | number
`breakTime` | number
`restTime` | number

## Example

```typescript
import type { ScheduleReport } from ''

// TODO: Update the object below with actual values
const example = {
  "startTime": null,
  "endTime": null,
  "drivingTime": null,
  "serviceTime": null,
  "waitingTime": null,
  "breakTime": null,
  "restTime": null,
} satisfies ScheduleReport

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleReport
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


