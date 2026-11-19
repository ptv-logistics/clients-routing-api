
# ViolationType

The reason why the road or the schedule is violated.  * `PROHIBITED` - The violated road is prohibited in general for the current vehicle such as some roads in city centers, parks, forests and farmland or it is temporarily closed due to construction sites.    * `DELIVERY_ONLY` - The violated road is prohibited except for delivery vehicles such as factory premises or pedestrian zones. Cars and vans are no delivery vehicles and may produce such violations.    * `URBAN` - The violated road is prohibited because urban roads are prohibited for the current vehicle. This will not happen for the predefined profiles.    * `RESIDENTS_ONLY` - The violated road is prohibited because roads flagged as residents only are prohibited for the current vehicle. This will not happen for the predefined profiles.  * `RESTRICTED_ACCESS` - The violated road is prohibited because it has restricted access because a gate or a bollard has to be passed. This will always have **accessType** _PASS_.    * `VEHICLE_PROPERTY` - The violated road is prohibited for the current vehicle as some vehicle property exceeds a limit such as the weight or height, or the road is prohibited for trucks in general.    * `COMBINED_TRANSPORT` - The violated road is a boat (ferry) or rail (train or rail shuttle) connection prohibited for the current vehicle.  * `SCHEDULE` - The schedule is violated. The reasons can be found in **scheduleViolationTypes**.  * `BLOCKED_ROAD_BY_INTERSECTION` - The violated road has been blocked through **options[blockIntersectingRoads]**.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { ViolationType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies ViolationType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ViolationType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


