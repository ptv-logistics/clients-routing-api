
# PenaltyOptions

Options to configure penalties for specific road categories or road types. Penalties influence the route calculation by making certain roads more or less attractive. Use these parameters carefully, in particular negative or blocking values can lead to unwanted results.  **Value ranges:** * `-99` to `-1` — Preference (makes the road more attractive) * `0` — No effect (default) * `1` to `2500` — Avoidance (makes the road less attractive, higher = stronger avoidance) * `2501` — Blocked (road is prohibited, may cause violations if no alternative exists, in particular when a waypoint is located on such a road)  All penalties except for **byRoadCategory**, **ferries** and **railShuttles** will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_.  Behavior for requests with **routeId**: When a **routeId** is specified, all penalties are ignored.  Behavior for **routingMode** _MONETARY_: As route calculation is optimized for costs, penalties have no effect. Therefore, only the values 0 (roads are allowed) and 2501 (roads are blocked) are supported. All other values are ignored.  Behavior for **options[avoid]**: When both **options[avoid]** and a penalty are specified for the same road type, the request is rejected with an error.  See [here](./concepts/penalties) for more information.

## Properties

Name | Type
------------ | -------------
`byRoadCategory` | Array&lt;number&gt;
`deliveryOnly` | number
`residentsOnly` | number
`toll` | number
`ferries` | number
`railShuttles` | number

## Example

```typescript
import type { PenaltyOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "byRoadCategory": null,
  "deliveryOnly": null,
  "residentsOnly": null,
  "toll": null,
  "ferries": null,
  "railShuttles": null,
} satisfies PenaltyOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PenaltyOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


