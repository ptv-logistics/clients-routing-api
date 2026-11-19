
# TollEvent

Issued when a road subject to toll is entered or exited. Requires _TOLL_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`sectionIndex` | number
`displayName` | string
`accessType` | [AccessType](AccessType.md)
`relatedEventIndex` | number

## Example

```typescript
import type { TollEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "sectionIndex": null,
  "displayName": null,
  "accessType": null,
  "relatedEventIndex": null,
} satisfies TollEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


