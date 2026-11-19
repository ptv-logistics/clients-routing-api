
# EvStatusEvent

Issued periodically to report electricity consumption and battery status. Requires _EV_STATUS_EVENTS_ or _EV_STATUS_EVENTS_POLYLINE_ to be requested.

## Properties

Name | Type
------------ | -------------
`batteryStateOfCharge` | number
`electricityConsumption` | number
`polyline` | string

## Example

```typescript
import type { EvStatusEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "batteryStateOfCharge": 58,
  "electricityConsumption": null,
  "polyline": null,
} satisfies EvStatusEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvStatusEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


