
# TrafficMode

Defines how to consider traffic in a route calculation.  * `REALISTIC` - Returns the most realistic **travelTime** and **distance** for the selected vehicle and the  given **startTime** or **arrivalTime** or the current time if none of them is specified.  Takes into account the live traffic situation such as traffic jams or road works  as well as the typical traffic situation at the time of day and the day of week of travel such as the rush-hour  on Monday morning or light traffic on Saturday evening.  For best results, the date of travel should be on the current day.  * `AVERAGE` - Returns the average **travelTime** and **distance** for the selected vehicle.  If **startTime** or **arrivalTime** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rush-hour  on Monday morning or light traffic on Saturday evening. Toll will be calculated according to that date and time.  If none of them is specified the typical traffic situation will not be considered, and **travelTime** and **distance** are an average independent of when to travel.  Toll will be calculated based on the toll prices valid at noon on Monday of the current week, using the time zone of the start waypoint.  * `CONSTANT` - Returns a **travelTime** and **distance** for the selected vehicle which is independent of the date and time of travel.  The typical traffic situation will not be considered, and **travelTime** and **distance** are independent of when to travel.  If **startTime** or **arrivalTime** is specified, toll will be calculated according to that date and time, otherwise   Toll will be calculated based on the toll prices valid at noon on Monday of the current week, using the time zone of the start waypoint.   See [here](./concepts/traffic-modes) for more information. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { TrafficMode } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies TrafficMode

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrafficMode
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


