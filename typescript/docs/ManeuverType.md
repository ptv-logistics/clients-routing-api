
# ManeuverType

Describes the type of maneuver to execute.     * `START` - Departure at an on-road waypoint.     * `START_LEFT` - Departure at an off-road waypoint to begin the route heading left.     * `START_RIGHT` - Departure at an off-road waypoint to begin the route heading right.     * `ARRIVE` - Arrival at an on-road waypoint.     * `ARRIVE_LEFT` - Arrival at an off-road waypoint if the waypoint is on the left.     * `ARRIVE_RIGHT` - Arrival at an off-road waypoint if the waypoint is on the right.     * `CONTINUE` - Follow the current road, usually when the road type changes although the road goes straight.     * `KEEP_STRAIGHT` - Stay on the straight lane, usually in fork-shaped intersections with more than two spikes.     * `KEEP_LEFT` - Keep left or to take the left lane, usually in Y-shaped intersections.     * `KEEP_RIGHT` - Keep right or to take the right lane, usually  in Y-shaped intersections.     * `TURN_HALF_LEFT` - Turn half left at a crossing where at least one additional trailing road exists,  usually at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * `TURN_LEFT` - Turn left at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * `TURN_SHARP_LEFT` - Turn sharp left at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * `TURN_HALF_RIGHT` - Turn half right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * `TURN_RIGHT` - Turn right at a crossing where at least one additional trailing road exists, usually  at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * `TURN_SHARP_RIGHT` - Turn sharp right at a crossing where at least one additional trailing road exists, usually   at T- or X-shaped crossings on urban or country roads. Even if the name of the turning road does not change a maneuver will be created.     * `MAKE_U_TURN` - Make a U-turn, either at the same road or at structurally separated roads. The **relativeDirection**   indicates whether to turn left or right.     * `TAKE_ROUNDABOUT_LEFT` - Enter a roundabout to the left and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * `TAKE_ROUNDABOUT_RIGHT` - Enter a roundabout to the right and leave it at the given **roundaboutExit**.   Only drivable roads of the roundabout are counted.     * `TAKE_COMBINED_TRANSPORT` - Take boat (ferry) or rail (train or rail shuttle) connection.  * `ENTER` - Enter a highway/freeway/major road straight.     * `ENTER_LEFT` - Enter a highway/freeway/major road to the left.     * `ENTER_RIGHT` - Enter a highway/freeway/major road to the right.     * `EXIT` - Leave a highway/freeway/major road straight.     * `EXIT_LEFT` - Leave a highway/freeway/major road to the left.     * `EXIT_RIGHT` - Leave a highway/freeway/major road to the right.     * `CHANGE` - Change straight to another highway/freeway at an interchange.     * `CHANGE_LEFT` - Change to the left to another highway/freeway at an interchange.     * `CHANGE_RIGHT` - Change to the right to another highway/freeway at an interchange.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { ManeuverType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies ManeuverType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ManeuverType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


