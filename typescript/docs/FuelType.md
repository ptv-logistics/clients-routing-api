
# FuelType

The fuel type of the vehicle. The fuel types _CNG_GASOLINE_ and _LNG_GASOLINE_ are used for dual-fuel vehicles, therefore the **dualFuelRatio** has to be specified. These fuel types cannot be used with hybrid vehicles.  Supported for **engineType** _COMBUSTION_ and _HYBRID_. Relevant for `emissions`. 

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { FuelType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies FuelType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FuelType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


