
# DrivingDirection

Specifies the driving direction, i.e. from start to destination or from destination to start..  * `OUTBOUND` - Indicates an outbound routing from start to destination, i.e. the area which can be reached from the location within the given horizon. Use this value to calculate which can be covered e.g. by an emergency service such as a fire department.  * `INBOUND` - Indicates an inbound routing from destination to start, i.e. from where the location can be reached within the given horizon. Use this value to calculate the catchment area, e.g. of a school or a hospital.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { DrivingDirection } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies DrivingDirection

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DrivingDirection
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


