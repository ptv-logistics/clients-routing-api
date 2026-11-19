
# TrafficEvent

Issued when the route passes a road for which live traffic data contain an incident such as a traffic jam. Requires _TRAFFIC_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`delay` | number
`description` | string
`language` | string
`accessType` | [AccessType](AccessType.md)
`relatedEventIndex` | number
`polyline` | string

## Example

```typescript
import type { TrafficEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "delay": null,
  "description": null,
  "language": null,
  "accessType": null,
  "relatedEventIndex": null,
  "polyline": null,
} satisfies TrafficEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrafficEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


