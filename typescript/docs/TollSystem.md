
# TollSystem


## Properties

Name | Type
------------ | -------------
`name` | string
`operatorName` | string
`tariffVersion` | string
`tariffVersionValidFrom` | Date

## Example

```typescript
import type { TollSystem } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "operatorName": null,
  "tariffVersion": null,
  "tariffVersionValidFrom": null,
} satisfies TollSystem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollSystem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


