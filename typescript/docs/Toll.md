
# Toll

Detailed information on the toll costs, providers and tariff information.   Toll prices do not include VAT. 

## Properties

Name | Type
------------ | -------------
`costs` | [TollCosts](TollCosts.md)
`sections` | [Array&lt;TollSection&gt;](TollSection.md)
`systems` | [Array&lt;TollSystem&gt;](TollSystem.md)
`currencies` | [Currencies](Currencies.md)

## Example

```typescript
import type { Toll } from ''

// TODO: Update the object below with actual values
const example = {
  "costs": null,
  "sections": null,
  "systems": null,
  "currencies": null,
} satisfies Toll

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Toll
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


