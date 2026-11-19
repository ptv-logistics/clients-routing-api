
# EmissionStandard

The emission standard of the vehicle valid in the European Union. This parameter is not only important for proper toll and emission calculation,  there are also low-emission zones which can be entered only if the vehicle has a proper emission standard. In contrast to explicit approvals like environmental badges or vehicle registrations the emission standard is automatically considered when entering such low-emission zones.  Values different from _NONE_ are supported for **engineType** _COMBUSTION_ and _HYBRID_. Relevant for `routing`, `toll`, `emissions`. 

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { EmissionStandard } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies EmissionStandard

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EmissionStandard
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


