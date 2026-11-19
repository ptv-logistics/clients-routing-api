
# EvReportLeg

The consumption summary for the specified vehicle model including the weather used for consumption calculation. Only present if both _EV_REPORT_ and _LEGS_ is requested. 

## Properties

Name | Type
------------ | -------------
`electricityConsumption` | number
`batteryStateOfCharge` | number
`weatherAtStart` | [WeatherResponse](WeatherResponse.md)
`weatherAtEnd` | [WeatherResponse](WeatherResponse.md)

## Example

```typescript
import type { EvReportLeg } from ''

// TODO: Update the object below with actual values
const example = {
  "electricityConsumption": null,
  "batteryStateOfCharge": 58,
  "weatherAtStart": null,
  "weatherAtEnd": null,
} satisfies EvReportLeg

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EvReportLeg
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


