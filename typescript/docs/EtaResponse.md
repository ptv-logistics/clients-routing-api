
# EtaResponse

The response of an ETA calculation.

## Properties

Name | Type
------------ | -------------
`remainingWaypoints` | [Array&lt;RemainingWaypoint&gt;](RemainingWaypoint.md)
`routeId` | string
`warnings` | [Array&lt;Warning&gt;](Warning.md)

## Example

```typescript
import type { EtaResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "remainingWaypoints": null,
  "routeId": null,
  "warnings": null,
} satisfies EtaResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EtaResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


