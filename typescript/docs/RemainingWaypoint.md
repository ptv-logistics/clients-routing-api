
# RemainingWaypoint


## Properties

Name | Type
------------ | -------------
`name` | string
`estimatedTimeOfArrival` | Date
`distance` | number
`travelTime` | number
`trafficDelay` | number
`waitingTime` | number
`scheduleViolations` | [Array&lt;ScheduleViolationType&gt;](ScheduleViolationType.md)
`violated` | boolean

## Example

```typescript
import type { RemainingWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "estimatedTimeOfArrival": null,
  "distance": null,
  "travelTime": null,
  "trafficDelay": null,
  "waitingTime": null,
  "scheduleViolations": null,
  "violated": false,
} satisfies RemainingWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RemainingWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


