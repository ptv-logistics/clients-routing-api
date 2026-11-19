
# BorderEvent

Issued when a border of a country of a subdivision is crossed by the route, i.e. the current country code changes. Requires _BORDER_EVENTS_ to be requested.

## Properties

Name | Type
------------ | -------------
`countryCode` | string

## Example

```typescript
import type { BorderEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "countryCode": null,
} satisfies BorderEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BorderEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


