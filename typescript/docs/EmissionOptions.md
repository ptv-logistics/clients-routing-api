
# EmissionOptions


## Properties

Name | Type
------------ | -------------
`calculationMethods` | string
`defaultConsumption` | boolean
`iso14083EmissionFactorsVersion` | [Iso14083EmissionFactorsVersion](Iso14083EmissionFactorsVersion.md)

## Example

```typescript
import type { EmissionOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "calculationMethods": null,
  "defaultConsumption": null,
  "iso14083EmissionFactorsVersion": null,
} satisfies EmissionOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EmissionOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


