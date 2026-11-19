
# TimeInterval

A time interval specified by two points in time - the beginning and the end of the interval.

## Properties

Name | Type
------------ | -------------
`start` | Date
`end` | Date

## Example

```typescript
import type { TimeInterval } from ''

// TODO: Update the object below with actual values
const example = {
  "start": 2020-12-07T00:00Z,
  "end": 2020-12-07T01:00Z,
} satisfies TimeInterval

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TimeInterval
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


