
# TollCosts

The toll prices payable for this route or leg aggregated by currency.

## Properties

Name | Type
------------ | -------------
`prices` | [Array&lt;TollPrice&gt;](TollPrice.md)
`convertedPrice` | [TollPrice](TollPrice.md)
`countries` | [Array&lt;TollCostsByCountry&gt;](TollCostsByCountry.md)
`containsApproximatedSections` | boolean

## Example

```typescript
import type { TollCosts } from ''

// TODO: Update the object below with actual values
const example = {
  "prices": null,
  "convertedPrice": null,
  "countries": null,
  "containsApproximatedSections": false,
} satisfies TollCosts

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollCosts
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


