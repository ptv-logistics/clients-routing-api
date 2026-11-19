
# ViolationEvent

Issued when the route passes a road which is prohibited for the given vehicle but passed nevertheless as there is no other valid route or when schedule restrictions are violated. Requires _VIOLATION_EVENTS_ to be requested. See [here](./concepts/violations) for more information.

## Properties

Name | Type
------------ | -------------
`type` | [ViolationType](ViolationType.md)
`scheduleViolationTypes` | [Array&lt;ScheduleViolationType&gt;](ScheduleViolationType.md)
`violatedVehicleProperties` | [Array&lt;ViolatedVehicleProperty&gt;](ViolatedVehicleProperty.md)
`temporary` | boolean
`timeDomain` | string
`accessType` | [AccessType](AccessType.md)
`relatedEventIndex` | number
`polyline` | string

## Example

```typescript
import type { ViolationEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "scheduleViolationTypes": null,
  "violatedVehicleProperties": null,
  "temporary": null,
  "timeDomain": [(y2016M2h10){m30}],
  "accessType": null,
  "relatedEventIndex": null,
  "polyline": null,
} satisfies ViolationEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ViolationEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


