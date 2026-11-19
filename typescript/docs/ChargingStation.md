
# ChargingStation

Defines the charging capabilities available at a waypoint. 

## Properties

Name | Type
------------ | -------------
`power` | number
`currentType` | [CurrentType](CurrentType.md)
`setupTime` | number
`kWhPrice` | number
`useServiceTimeForCharging` | boolean

## Example

```typescript
import type { ChargingStation } from ''

// TODO: Update the object below with actual values
const example = {
  "power": null,
  "currentType": null,
  "setupTime": null,
  "kWhPrice": null,
  "useServiceTimeForCharging": null,
} satisfies ChargingStation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ChargingStation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


