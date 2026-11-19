
# DriverBody

Options regarding the drivers\' working hours and work logbook. If no driver object with a working hours preset is passed with the request, working hours will be unlimited.

## Properties

Name | Type
------------ | -------------
`workingHoursPreset` | [WorkingHoursPreset](WorkingHoursPreset.md)
`workLogbook` | [WorkLogbook](WorkLogbook.md)
`useTimeOnCombinedTransportForRecreation` | boolean

## Example

```typescript
import type { DriverBody } from ''

// TODO: Update the object below with actual values
const example = {
  "workingHoursPreset": null,
  "workLogbook": null,
  "useTimeOnCombinedTransportForRecreation": null,
} satisfies DriverBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DriverBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


