
# EmissionsEN162582012

Emissions according to EN16258 from 2012 (a.k.a. CEN standard).

## Properties

Name | Type
------------ | -------------
`fuelConsumption` | number
`co2eTankToWheel` | number
`co2eWellToWheel` | number
`energyUseTankToWheel` | number
`energyUseWellToWheel` | number

## Example

```typescript
import type { EmissionsEN162582012 } from ''

// TODO: Update the object below with actual values
const example = {
  "fuelConsumption": null,
  "co2eTankToWheel": null,
  "co2eWellToWheel": null,
  "energyUseTankToWheel": null,
  "energyUseWellToWheel": null,
} satisfies EmissionsEN162582012

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EmissionsEN162582012
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


