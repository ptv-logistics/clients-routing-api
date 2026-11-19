
# ReachableTrafficMode

Defines how to consider traffic in a reachable areas or a reachable locations calculation.  * `REALISTIC` - Uses the most realistic **travelTime** and **distance** for the selected vehicle and the  given **options[referenceTime]** or the current time if **options[referenceTime]** is not specified.  Takes into account the live traffic situation such as traffic jams or road works  as well as the typical traffic situation at the time of day and the day of week of travel such as the rush-hour  on Monday morning or light traffic on Saturday evening.  * `AVERAGE` - Uses the average **travelTime** and **distance** for the selected vehicle.  If **options[referenceTime]** is specified, the typical traffic situation for that time of day and day of week will be considered such as the rush-hour  on Monday morning or light traffic on Saturday evening.  If no **options[referenceTime]** is specified the typical traffic situation will not be considered, and **travelTime** and **distance** are an average independent of when to travel.  * `CONSTANT` - Returns a **travelTime** and **distance** for the selected vehicle which is independent of the date and time of travel.  The typical traffic situation will not be considered, and **travelTime** and **distance** are independent of when to travel.  See [here](./concepts/traffic-modes) for more information. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { ReachableTrafficMode } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies ReachableTrafficMode

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReachableTrafficMode
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


