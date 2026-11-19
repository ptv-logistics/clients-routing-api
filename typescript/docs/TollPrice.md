
# TollPrice

The toll price payable in this country.

## Properties

Name | Type
------------ | -------------
`price` | number
`currency` | string

## Example

```typescript
import type { TollPrice } from ''

// TODO: Update the object below with actual values
const example = {
  "price": 12.91,
  "currency": EUR,
} satisfies TollPrice

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollPrice
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


