
# MonetaryCosts

Provides an overview of the costs of the route.   Requires the result _MONETARY_COSTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`currency` | string
`totalCost` | number
`distanceCost` | number
`workingTimeCost` | number
`energyCost` | number
`tollCost` | number

## Example

```typescript
import type { MonetaryCosts } from ''

// TODO: Update the object below with actual values
const example = {
  "currency": null,
  "totalCost": null,
  "distanceCost": null,
  "workingTimeCost": null,
  "energyCost": null,
  "tollCost": null,
} satisfies MonetaryCosts

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MonetaryCosts
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


