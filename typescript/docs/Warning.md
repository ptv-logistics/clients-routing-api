
# Warning


## Properties

Name | Type
------------ | -------------
`description` | string
`warningCode` | string
`details` | { [key: string]: any; }

## Example

```typescript
import type { Warning } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "warningCode": null,
  "details": null,
} satisfies Warning

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Warning
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


