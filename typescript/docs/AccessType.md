
# AccessType

Indicates if a route section is entered or exited. Not present for violation events of type _SCHEDULE_.  * `ENTER` - Entering a section.    * `EXIT` - Exiting a section.    * `PASS` - Passing an intersection, a gate or a specific location. Can only occur with violation events of type _RESTRICTED_ACCESS_ and _PROHIBITED_BY_INTERSECTING_POLYLINE_.

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { AccessType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies AccessType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AccessType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


