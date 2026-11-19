
# ElevationReport

Provides information on the topography of the route or leg, i.e. the total ascent and descent. Elevation‑based metrics represent approximate values and may differ from real‑world measurements.  For each leg the constraint ascent − descent = net elevation difference (last point minus first point) is maintained. Because of this, the sum of ascent or descent values across all legs may slightly exceed the corresponding route total.

## Properties

Name | Type
------------ | -------------
`ascent` | number
`descent` | number

## Example

```typescript
import type { ElevationReport } from ''

// TODO: Update the object below with actual values
const example = {
  "ascent": null,
  "descent": null,
} satisfies ElevationReport

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ElevationReport
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


