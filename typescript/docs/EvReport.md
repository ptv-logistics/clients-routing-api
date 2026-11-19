
# EvReport

The consumption and charging summary for the specified vehicle model. Only present if _EV_REPORT_ is requested. 

## Properties

Name | Type
------------ | -------------
`electricityConsumption` | number
`batteryStateOfCharge` | number
`chargingTime` | number
`electricityCharged` | number
`percentageCharged` | number
`cost` | [ElectricityPrice](ElectricityPrice.md)

## Example

```typescript
import type { EvReport } from ''

// TODO: Update the object below with actual values
const example = {
  "electricityConsumption": null,
  "batteryStateOfCharge": 58,
  "chargingTime": null,
  "electricityCharged": null,
  "percentageCharged": null,
  "cost": null,
} satisfies EvReport

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvReport
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


