
# ChargeEvent

Issued when the battery should be charged at a waypoint.  Requires _EV_CHARGE_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`chargingTime` | number
`electricityCharged` | number
`percentageCharged` | number
`cost` | [ElectricityPrice](ElectricityPrice.md)

## Example

```typescript
import type { ChargeEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "chargingTime": null,
  "electricityCharged": null,
  "percentageCharged": null,
  "cost": null,
} satisfies ChargeEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChargeEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


