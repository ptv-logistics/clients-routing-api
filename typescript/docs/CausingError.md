
# CausingError


## Properties

Name | Type
------------ | -------------
`description` | string
`errorCode` | string
`parameter` | string
`details` | { [key: string]: any; }

## Example

```typescript
import type { CausingError } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "errorCode": null,
  "parameter": null,
  "details": null,
} satisfies CausingError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CausingError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


