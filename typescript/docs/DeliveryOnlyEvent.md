
# DeliveryOnlyEvent

Issued when the route passes roads which are prohibited except for delivery vehicles such as factory premises or pedestrian zones.  Requires _DELIVERY_ONLY_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`accessType` | [AccessType](AccessType.md)
`relatedEventIndex` | number
`polyline` | string

## Example

```typescript
import type { DeliveryOnlyEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "accessType": null,
  "relatedEventIndex": null,
  "polyline": null,
} satisfies DeliveryOnlyEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeliveryOnlyEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


