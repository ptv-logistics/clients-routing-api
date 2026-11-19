
# Emissions

Emissions such as the CO2-equivalent (CO2e) according to the selected standards.  The CO2e value is the unit for comparing the radiative forcing of a greenhouse gas to carbon dioxide according to [ISO 14064-1:2006](https://en.wikipedia.org/wiki/ISO_14064).

## Properties

Name | Type
------------ | -------------
`en162582012` | [EmissionsEN162582012](EmissionsEN162582012.md)
`iso140832022` | [EmissionsISO140832022](EmissionsISO140832022.md)
`iso140832023` | [EmissionsISO140832023](EmissionsISO140832023.md)
`frenchCO2eDecree2017639` | [EmissionsFrenchCO2eDecree2017639](EmissionsFrenchCO2eDecree2017639.md)

## Example

```typescript
import type { Emissions } from ''

// TODO: Update the object below with actual values
const example = {
  "en162582012": null,
  "iso140832022": null,
  "iso140832023": null,
  "frenchCO2eDecree2017639": null,
} satisfies Emissions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Emissions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


