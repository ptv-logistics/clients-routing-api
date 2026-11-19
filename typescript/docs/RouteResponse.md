
# RouteResponse


## Properties

Name | Type
------------ | -------------
`distance` | number
`travelTime` | number
`trafficDelay` | number
`violated` | boolean
`routeId` | string
`legs` | [Array&lt;Leg&gt;](Leg.md)
`toll` | [Toll](Toll.md)
`polyline` | string
`events` | [Array&lt;Event&gt;](Event.md)
`emissions` | [Emissions](Emissions.md)
`alternativeRoutes` | [Array&lt;AlternativeRoute&gt;](AlternativeRoute.md)
`scheduleReport` | [ScheduleReport](ScheduleReport.md)
`evReport` | [EvReport](EvReport.md)
`guidedNavigation` | string
`monetaryCosts` | [MonetaryCosts](MonetaryCosts.md)
`elevationReport` | [ElevationReport](ElevationReport.md)
`warnings` | [Array&lt;Warning&gt;](Warning.md)

## Example

```typescript
import type { RouteResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "distance": 1422,
  "travelTime": 56,
  "trafficDelay": 0,
  "violated": false,
  "routeId": null,
  "legs": null,
  "toll": null,
  "polyline": null,
  "events": null,
  "emissions": null,
  "alternativeRoutes": null,
  "scheduleReport": null,
  "evReport": null,
  "guidedNavigation": null,
  "monetaryCosts": null,
  "elevationReport": null,
  "warnings": null,
} satisfies RouteResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RouteResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


