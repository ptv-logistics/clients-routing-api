
# PolylineMapType

Defines whether polylines should match the Raster Maps API or the Vector Maps API.  Not only the polyline itself, but also other results and parameters that use the polyline of the route may change slightly, e.g. emission-related results and **matchSideOfStreet**.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { PolylineMapType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies PolylineMapType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PolylineMapType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


