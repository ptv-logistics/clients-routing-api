
# AlternativeRoute


## Properties

Name | Type
------------ | -------------
`distance` | number
`travelTime` | number
`trafficDelay` | number
`violated` | boolean
`polyline` | string
`routeId` | string

## Example

```typescript
import type { AlternativeRoute } from ''

// TODO: Update the object below with actual values
const example = {
  "distance": 1422,
  "travelTime": 56,
  "trafficDelay": 0,
  "violated": false,
  "polyline": null,
  "routeId": null,
} satisfies AlternativeRoute

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AlternativeRoute
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


