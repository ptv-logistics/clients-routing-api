
# ReachableLocations

The results of a reachable locations calculation.

## Properties

Name | Type
------------ | -------------
`reachable` | [Array&lt;ReachableLocation&gt;](ReachableLocation.md)
`unreachable` | Array&lt;number&gt;
`warnings` | [Array&lt;Warning&gt;](Warning.md)

## Example

```typescript
import type { ReachableLocations } from ''

// TODO: Update the object below with actual values
const example = {
  "reachable": null,
  "unreachable": null,
  "warnings": null,
} satisfies ReachableLocations

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReachableLocations
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


