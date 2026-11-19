
# Weather

The weather at a waypoint. It is relevant to the electricity consumption calculation of electric vehicles. The  weather is valid until the end of the route unless it is changed again at a subsequent waypoint. If no weather  is configured at any waypoint, the weather is automatically determined using the [OpenMeteo](https://open-meteo.com)  weather service. This is only available if the time of the route is no more than 14 days in the future. If the routing is outside of this time box and no weather is configured at any waypoint, a temperature of 23°C and no  wind is assumed for minimal impact on the consumption calculation. The parameter **windDirection** must not be null if **windSpeed** is set to anything but 0. 

## Properties

Name | Type
------------ | -------------
`temperature` | number
`windSpeed` | number
`windDirection` | number

## Example

```typescript
import type { Weather } from ''

// TODO: Update the object below with actual values
const example = {
  "temperature": null,
  "windSpeed": null,
  "windDirection": null,
} satisfies Weather

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Weather
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


