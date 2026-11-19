
# RoutingMode

Specifies which objective function should be used for the route calculation.   * `FAST` is the default which returns a route considering a tradeoff between distance and travel time. All vehicle-specific restrictions are properly considered and violated only, if no other route can be found. * `SHORT` returns a route which is probably shorter but accepting longer travel times. The resulting route is still sensible and can be driven with the given vehicle, but it may disregard restrictions like driving through residential areas. * `SHORTEST` is even more aggressively optimized for minimizing distance, which can significantly increase travel times. The route remains valid and drivable for the vehicle, but may more readily use slower or smaller roads. * `MONETARY` assigns monetary costs to each road segment according the provided cost parameters and the vehicles properties like its consumption. Furthermore, toll costs are integrated as well. See [here](./concepts/monetary-costs) for more information.  This parameter will be ignored, if a **routeId** is specified.  For non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_, the parameter will be ignored as well.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { RoutingMode } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies RoutingMode

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RoutingMode
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


