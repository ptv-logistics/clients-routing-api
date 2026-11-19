
# TollRoadType

The reason why toll is charged.    * `GENERAL` - A general toll road where no special toll applies.    * `CITY` - An urban area or city is subject to toll.    * `BRIDGE` - A bridge is subject to toll.    * `TUNNEL` - A tunnel is subject to toll.    * `FERRY` - A ferry is subject to toll.    * `MOUNTAIN_PASS` - A mountain pass is subject to toll.  

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { TollRoadType } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies TollRoadType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollRoadType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


