
# UTCOffsetChangeEvent

Issued when the offset to UTC changes, mostly when traveling into a different time zone. Requires _UTC_OFFSET_CHANGE_EVENTS_ to be requested.    Changing the UTC offset does not necessarily mean to change the time zone. Vice-versa changing the time zone does not necessarily mean to change the UTC offset. There are some special cases to consider.  *  The UTC offset may change even within a time zone when the route takes place exactly when the daylight-saving time changes.  *  The UTC offset may not change when changing the time zone. In Canada, for example, there are regions which do not use DST   so that the neighboring time zone has the same UTC offset in summer.

## Properties

Name | Type
------------ | -------------
`utcOffset` | number

## Example

```typescript
import type { UTCOffsetChangeEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "utcOffset": null,
} satisfies UTCOffsetChangeEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UTCOffsetChangeEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


