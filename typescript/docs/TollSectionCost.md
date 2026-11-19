
# TollSectionCost


## Properties

Name | Type
------------ | -------------
`price` | number
`currency` | string
`paymentMethods` | [Array&lt;PaymentMethod&gt;](PaymentMethod.md)
`etcSubscriptions` | Array&lt;string&gt;
`convertedPrice` | [TollPrice](TollPrice.md)

## Example

```typescript
import type { TollSectionCost } from ''

// TODO: Update the object below with actual values
const example = {
  "price": null,
  "currency": null,
  "paymentMethods": null,
  "etcSubscriptions": null,
  "convertedPrice": null,
} satisfies TollSectionCost

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollSectionCost
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


