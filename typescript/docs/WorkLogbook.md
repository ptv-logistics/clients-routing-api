
# WorkLogbook

Defines the accumulated driving, working and travel times since the last break or daily rest. For details see this [concept](./concepts/drivers-working-hours).

## Properties

Name | Type
------------ | -------------
`lastTimeTheDriverWorked` | Date
`accumulatedDrivingTimeSinceLastBreak` | number
`accumulatedWorkingTimeSinceLastBreak` | number
`accumulatedDrivingTimeSinceLastDailyRest` | number
`accumulatedTravelTimeSinceLastDailyRest` | number

## Example

```typescript
import type { WorkLogbook } from ''

// TODO: Update the object below with actual values
const example = {
  "lastTimeTheDriverWorked": 2020-12-04T06:00Z,
  "accumulatedDrivingTimeSinceLastBreak": null,
  "accumulatedWorkingTimeSinceLastBreak": null,
  "accumulatedDrivingTimeSinceLastDailyRest": null,
  "accumulatedTravelTimeSinceLastDailyRest": null,
} satisfies WorkLogbook

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as WorkLogbook
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


