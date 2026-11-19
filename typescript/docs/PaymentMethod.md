
# PaymentMethod

A payment method for toll costs.    * `ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION` - Pay with an electronic toll collection system for which a subscription is required.    * `ELECTRONIC_TOLL_COLLECTION` - Pay with some electronic toll collection system for which no prior subscription is required.    * `CASH` - Pay with cash at a toll booth.    * `CREDIT_CARD` - Pay with credit card at a toll booth.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { PaymentMethod } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies PaymentMethod

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PaymentMethod
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


