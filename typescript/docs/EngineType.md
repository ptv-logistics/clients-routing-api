
# EngineType

The engine type of the vehicle. When changing the engine type further parameters must be specified to define a valid vehicle and to obtain proper results. For a hybrid or an electric vehicle **electricityType** and **averageElectricityConsumption** must be specified, for a hybrid vehicle additionally the **hybridRatio**.  This and all dependent parameters cannot be used with a model of an electric vehicle, because all applicable  parameters are automatically provided by the model. Please refer to the [concept](./concepts/model-based-ev-consumption-calculation) to see specifically which  parameters are not compatible and automatically set from the vehicle model.  Relevant for `toll`, `emissions`. 

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { EngineType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies EngineType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EngineType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


