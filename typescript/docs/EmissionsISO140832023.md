
# EmissionsISO140832023

Emissions according to ISO 14083:2023 (a.k.a. ISO standard).

## Properties

Name | Type
------------ | -------------
`fuelConsumption` | number
`electricityConsumption` | number
`co2eTankToWheel` | number
`co2eWellToWheel` | number
`energyUseTankToWheel` | number
`energyUseWellToWheel` | number

## Example

```typescript
import type { EmissionsISO140832023 } from ''

// TODO: Update the object below with actual values
const example = {
  "fuelConsumption": null,
  "electricityConsumption": null,
  "co2eTankToWheel": null,
  "co2eWellToWheel": null,
  "energyUseTankToWheel": null,
  "energyUseWellToWheel": null,
} satisfies EmissionsISO140832023

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EmissionsISO140832023
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


