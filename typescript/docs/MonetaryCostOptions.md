
# MonetaryCostOptions


## Properties

Name | Type
------------ | -------------
`costPerKilometer` | number
`workingCostPerHour` | number
`costPerKwh` | number
`costPerFuelUnit` | number

## Example

```typescript
import type { MonetaryCostOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "costPerKilometer": null,
  "workingCostPerHour": null,
  "costPerKwh": null,
  "costPerFuelUnit": null,
} satisfies MonetaryCostOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MonetaryCostOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


