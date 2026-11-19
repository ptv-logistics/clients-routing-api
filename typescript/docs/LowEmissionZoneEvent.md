
# LowEmissionZoneEvent

Issued when the route passes a low-emission zone. Requires _LOW_EMISSION_ZONE_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`name` | string
`accessType` | [AccessType](AccessType.md)
`relatedEventIndex` | number

## Example

```typescript
import type { LowEmissionZoneEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "accessType": null,
  "relatedEventIndex": null,
} satisfies LowEmissionZoneEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LowEmissionZoneEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


