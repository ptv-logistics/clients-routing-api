
# EvParametersAtWaypoint

The ev parameters that are specific to a waypoint.  This parameter is in a preview state, the API is stable, feature changes could be introduced in future. 

## Properties

Name | Type
------------ | -------------
`weather` | [Weather](Weather.md)
`chargingStation` | [ChargingStation](ChargingStation.md)
`powerConsumptionDuringService` | number

## Example

```typescript
import type { EvParametersAtWaypoint } from ''

// TODO: Update the object below with actual values
const example = {
  "weather": null,
  "chargingStation": null,
  "powerConsumptionDuringService": null,
} satisfies EvParametersAtWaypoint

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvParametersAtWaypoint
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


