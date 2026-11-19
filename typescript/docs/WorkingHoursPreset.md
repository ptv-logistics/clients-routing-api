
# WorkingHoursPreset

Enables the calculation of break and rest times according to the selected rules. Breaks and rests will be added to the **travelTime**, details can be requested through the _SCHEDULE_EVENTS_. For single day presets no schedule events of type _DAILY_REST_ will be returned. Only _VIOLATION_EVENTS_ will be returned when the maximum working time or maximum driving time is exceeded.   * `EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY` - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum driving time 9 hours, maximum travel time 13 hours.   * `EU_DRIVING_TIME_REGULATION_FOR_LONG_SINGLE_DAY` - In contrast to `EU_DRIVING_TIME_REGULATION_FOR_SINGLE_DAY`,   the exception rules \"Maximum driving time may be extended to 10h twice a week.\" and \"A daily rest may be reduced to 9h three times between weekly rests.\"   are observed in so far as the driving time limit is extended and the daily rest time is reduced.   * `EU_WORKING_TIME_DIRECTIVE_FOR_SINGLE_DAY` - Based on Directive 2002/15/EC of the European Parliament and of the Council \"on the organisation of the working time of persons performing mobile road transport activities\".   Break time 30 min, maximum working time between breaks 6 hours, maximum travel time 9.5 hours.   * `EU_WORKING_TIME_DIRECTIVES_FOR_LONG_SINGLE_DAY` - Makes sure that the standard rules of the EU directives 2003/88/EC and 2002/15/EC that are applicable for a route within a long single day are observed.   If working hours total more than 9h, a break must be 45min long. Here, a working time of at most 10h is guaranteed.   * `EU_DRIVING_AND_WORKING_TIME_RULES_FOR_LONG_SINGLE_DAY` - Combines the limits of Regulation (EC) 561/2006 (driving time) with the limits of the EU directives 2003/88/EC and 2002/15/EC (working time)   for a route within a long single day, so that both the driving time and the working time limits are observed at once.   Break time 45 min, maximum driving time between breaks 4.5 hours, maximum working time between breaks 6 hours, maximum driving time 10 hours, maximum travel time 10 hours 45 minutes.   * `EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS ` - Based on Regulation (EC) 561/2006 of the European Parliament and of the Council.   Break time 45 min, maximum driving time between breaks 4.5 hours,   daily rest time 11 hours, maximum driving time between daily rests 9 hours, maximum travel time between daily rests 13 hours,   maximum driving time 56 hours, maximum travel time 144 hours.   * `EU_DRIVING_TIME_REGULATION_FOR_TEAM_AND_MULTIPLE_DAYS` - When two drivers form a team, they can take turns.   In contrast to `EU_DRIVING_TIME_REGULATION_FOR_MULTIPLE_DAYS`, no breaks are scheduled and the daily rest time limits are raised.   * `US_HOURS_OF_SERVICE_REGULATIONS_FOR_SINGLE_DAY` - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours, maximum driving time 11 hours, maximum travel time 14 hours.   * `US_HOURS_OF_SERVICE_REGULATIONS_FOR_SHORT_HAUL_AND_SINGLE_DAY` - Makes sure that the standard rules of the HOS regulations in 49 CFR 395 that are applicable for a route within a single day are observed.   It is assumed that the short-haul exception does apply so breaks are not scheduled.   * `US_HOURS_OF_SERVICE_REGULATIONS_FOR_MULTIPLE_DAYS` - Based on Hours of Service (HOS) of Drivers as issued by the Federal Motor Carrier Safety Administration (FMCSA).   Break time 30 min, maximum driving time between breaks 8 hours,   daily rest time 10 hours, maximum driving time between daily rests 11 hours, maximum travel time between daily rests 14 hours.  If this parameter is given both as query parameter and in the body then it must match. Otherwise an error is returned. This parameter will be ignored for non-motorized profiles such as _BICYCLE_ or _PEDESTRIAN_. For details see this [concept](./concepts/drivers-working-hours).

## Properties

Name | Type
------------ | -------------

## Example

```typescript
import type { WorkingHoursPreset } from ''

// TODO: Update the object below with actual values
const example = {
} satisfies WorkingHoursPreset

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as WorkingHoursPreset
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


