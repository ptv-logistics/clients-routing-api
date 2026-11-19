
# RouteRequest


## Properties

Name | Type
------------ | -------------
`waypoints` | [Array&lt;Waypoint&gt;](Waypoint.md)
`routeId` | string
`driver` | [DriverBody](DriverBody.md)
`routeOptions` | [RouteOptions](RouteOptions.md)

## Example

```typescript
import type { RouteRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "waypoints": null,
  "routeId": null,
  "driver": null,
  "routeOptions": null,
} satisfies RouteRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RouteRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


