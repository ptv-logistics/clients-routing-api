
# CombinedTransportEvent

Issued when a combined transport is entered or exited. Requires _COMBINED_TRANSPORT_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`name` | string
`type` | [CombinedTransportType](CombinedTransportType.md)
`accessType` | [AccessType](AccessType.md)
`relatedEventIndex` | number

## Example

```typescript
import type { CombinedTransportEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "type": null,
  "accessType": null,
  "relatedEventIndex": null,
} satisfies CombinedTransportEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CombinedTransportEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


