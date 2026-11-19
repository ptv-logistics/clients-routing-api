
# ReachableAreas

The result of the reachable areas calculation.

## Properties

Name | Type
------------ | -------------
`polygons` | Array&lt;string&gt;
`warnings` | [Array&lt;Warning&gt;](Warning.md)

## Example

```typescript
import type { ReachableAreas } from ''

// TODO: Update the object below with actual values
const example = {
  "polygons": null,
  "warnings": null,
} satisfies ReachableAreas

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReachableAreas
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


