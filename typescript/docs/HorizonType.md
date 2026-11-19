
# HorizonType

Specifies the geographical horizon.  * `DISTANCE` - Represents a geographical horizon that is described by a distance. Every point or road segment that is reachable from the source within the specified distance is included in the horizon.  * `TRAVEL_TIME` - Represents a geographical horizon that is described by a travel time. Every point or road segment that is reachable from the source within the specified travel time is included in the horizon.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { HorizonType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies HorizonType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as HorizonType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


