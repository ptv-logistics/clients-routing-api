
# RouteOptions

Routing-relevant options which control the route path in detail. These parameters can be specified in addition to those in **options** and will override them. The default values depend on the **profile** and can be retrieved from the Data API.

## Properties

Name | Type
------------ | -------------
`maximumSpeed` | number
`speedsByRoadCategory` | [Array&lt;SpeedByRoadCategory&gt;](SpeedByRoadCategory.md)
`penalties` | [PenaltyOptions](PenaltyOptions.md)
`allowDeliveryOnlyGates` | boolean
`timePreferenceOverDistance` | number

## Example

```typescript
import type { RouteOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "maximumSpeed": null,
  "speedsByRoadCategory": null,
  "penalties": null,
  "allowDeliveryOnlyGates": null,
  "timePreferenceOverDistance": null,
} satisfies RouteOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RouteOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


