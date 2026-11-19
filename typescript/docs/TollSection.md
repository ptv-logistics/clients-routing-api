
# TollSection


## Properties

Name | Type
------------ | -------------
`costs` | [Array&lt;TollSectionCost&gt;](TollSectionCost.md)
`tollRoadType` | [TollRoadType](TollRoadType.md)
`tollSystemIndex` | number
`countryCode` | string
`displayName` | string
`officialDistance` | number
`calculatedDistance` | number
`approximated` | boolean

## Example

```typescript
import type { TollSection } from ''

// TODO: Update the object below with actual values
const example = {
  "costs": null,
  "tollRoadType": null,
  "tollSystemIndex": null,
  "countryCode": null,
  "displayName": null,
  "officialDistance": 142,
  "calculatedDistance": 141,
  "approximated": false,
} satisfies TollSection

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TollSection
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


