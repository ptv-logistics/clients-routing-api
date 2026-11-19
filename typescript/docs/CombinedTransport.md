
# CombinedTransport

Influences the route path, so that the route uses a ferry or railway connection between the given locations. Both locations will be matched to the nearest ports looking for a direct connection. If no connection can be found, this waypoint will be ignored, and the warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_IGNORED_ will be returned. If more than one connection is found, the best one will be used, and the alternative connections will be returned in the response in a warning _ROUTING_COMBINED_TRANSPORT_WAYPOINT_AMBIGUOUS_. This waypoint will not appear as a waypoint event in the response and may not be used as start or destination. We will refer to this type of waypoint as a _combined-transport waypoint_.

## Properties

Name | Type
------------ | -------------
`start` | [CombinedTransportLocation](CombinedTransportLocation.md)
`destination` | [CombinedTransportLocation](CombinedTransportLocation.md)

## Example

```typescript
import type { CombinedTransport } from ''

// TODO: Update the object below with actual values
const example = {
  "start": null,
  "destination": null,
} satisfies CombinedTransport

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CombinedTransport
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


