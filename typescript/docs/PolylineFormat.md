
# PolylineFormat

Defines the format for polylines in the response.    * `GEO_JSON` - Polylines are returned in [GeoJSON](https://en.wikipedia.org/wiki/GeoJSON) format.    * `GOOGLE_ENCODED_POLYLINE` - Polylines are returned in [Google\'s Encoded Polyline](https://developers.google.com/maps/documentation/utilities/polylinealgorithm) format.  

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { PolylineFormat } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies PolylineFormat

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PolylineFormat
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


