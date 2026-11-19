
# ReachableLocationsResponse


## Properties

Name | Type
------------ | -------------
`status` | [CalculationStatus](CalculationStatus.md)
`reachableLocations` | [ReachableLocations](ReachableLocations.md)
`error` | [ErrorResponse](ErrorResponse.md)

## Example

```typescript
import type { ReachableLocationsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "status": null,
  "reachableLocations": null,
  "error": null,
} satisfies ReachableLocationsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ReachableLocationsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


