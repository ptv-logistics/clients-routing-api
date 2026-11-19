
# Currencies

Information about the currencies that are listed in the toll costs and/or toll sections objects.

## Properties

Name | Type
------------ | -------------
`date` | Date
`provider` | string
`baseCurrency` | string
`exchangeRates` | [Array&lt;ExchangeRate&gt;](ExchangeRate.md)

## Example

```typescript
import type { Currencies } from ''

// TODO: Update the object below with actual values
const example = {
  "date": null,
  "provider": null,
  "baseCurrency": null,
  "exchangeRates": null,
} satisfies Currencies

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Currencies
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


