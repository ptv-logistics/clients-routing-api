
# Event


## Properties

Name | Type
------------ | -------------
`latitude` | number
`longitude` | number
`startsAt` | Date
`distanceFromStart` | number
`travelTimeFromStart` | number
`countryCode` | string
`utcOffset` | number
`toll` | [TollEvent](TollEvent.md)
`maneuver` | [ManeuverEvent](ManeuverEvent.md)
`border` | [BorderEvent](BorderEvent.md)
`violation` | [ViolationEvent](ViolationEvent.md)
`waypoint` | [WaypointEvent](WaypointEvent.md)
`utcOffsetChange` | [UTCOffsetChangeEvent](UTCOffsetChangeEvent.md)
`schedule` | [ScheduleEvent](ScheduleEvent.md)
`combinedTransport` | [CombinedTransportEvent](CombinedTransportEvent.md)
`traffic` | [TrafficEvent](TrafficEvent.md)
`lowEmissionZone` | [LowEmissionZoneEvent](LowEmissionZoneEvent.md)
`deliveryOnly` | [DeliveryOnlyEvent](DeliveryOnlyEvent.md)
`evStatus` | [EvStatusEvent](EvStatusEvent.md)
`charge` | [ChargeEvent](ChargeEvent.md)

## Example

```typescript
import type { Event } from ''

// TODO: Update the object below with actual values
const example = {
  "latitude": 49.254878,
  "longitude": 8.544585,
  "startsAt": 2020-04-06T06:00Z,
  "distanceFromStart": 1422,
  "travelTimeFromStart": 56,
  "countryCode": DE,
  "utcOffset": null,
  "toll": null,
  "maneuver": null,
  "border": null,
  "violation": null,
  "waypoint": null,
  "utcOffsetChange": null,
  "schedule": null,
  "combinedTransport": null,
  "traffic": null,
  "lowEmissionZone": null,
  "deliveryOnly": null,
  "evStatus": null,
  "charge": null,
} satisfies Event

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Event
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


