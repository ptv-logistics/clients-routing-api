
# ManeuverEvent

Issued when the driver has to perform a maneuver, e.g. to turn or to enter a roundabout. Requires _MANEUVER_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`type` | [ManeuverType](ManeuverType.md)
`relativeDirection` | number
`absoluteDirection` | number
`description` | string
`roadAhead` | [RoadAhead](RoadAhead.md)
`directionSignText` | string
`exitNumber` | string
`exitName` | string
`roundaboutExit` | number
`combinedTransportName` | string
`combinedTransportType` | [CombinedTransportType](CombinedTransportType.md)
`crossingRoadName` | string

## Example

```typescript
import type { ManeuverEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "type": null,
  "relativeDirection": null,
  "absoluteDirection": null,
  "description": null,
  "roadAhead": null,
  "directionSignText": null,
  "exitNumber": null,
  "exitName": null,
  "roundaboutExit": null,
  "combinedTransportName": null,
  "combinedTransportType": null,
  "crossingRoadName": null,
} satisfies ManeuverEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ManeuverEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


