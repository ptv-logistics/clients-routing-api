
# Vehicle


## Properties

Name | Type
------------ | -------------
`engineType` | [EngineType](EngineType.md)
`fuelType` | [FuelType](FuelType.md)
`electricityType` | [ElectricityType](ElectricityType.md)
`averageFuelConsumption` | number
`averageElectricityConsumption` | number
`bioFuelRatio` | number
`hybridRatio` | number
`dualFuelRatio` | number
`cylinderCapacity` | number
`emissionStandard` | [EmissionStandard](EmissionStandard.md)
`co2EmissionClass` | number
`lowEmissionZoneTypes` | string
`lowEmissionZoneApprovals` | string
`lowEmissionZoneExemptions` | string
`particleReductionClass` | [ParticleReductionClass](ParticleReductionClass.md)
`emptyWeight` | number
`loadWeight` | number
`totalPermittedWeight` | number
`totalTechnicallyPermittedWeight` | number
`axleWeight` | number
`numberOfAxles` | number
`numberOfTires` | number
`height` | number
`heightAboveFrontAxle` | number
`length` | number
`width` | number
`hazardousMaterials` | string
`tunnelRestrictionCode` | [TunnelRestrictionCode](TunnelRestrictionCode.md)
`truckRoutes` | string
`commercial` | boolean
`etcSubscriptions` | string

## Example

```typescript
import type { Vehicle } from ''

// TODO: Update the object below with actual values
const example = {
  "engineType": null,
  "fuelType": null,
  "electricityType": null,
  "averageFuelConsumption": 35,
  "averageElectricityConsumption": 115,
  "bioFuelRatio": 0,
  "hybridRatio": 50,
  "dualFuelRatio": 50,
  "cylinderCapacity": 12000,
  "emissionStandard": null,
  "co2EmissionClass": 1,
  "lowEmissionZoneTypes": null,
  "lowEmissionZoneApprovals": DE_GREEN,DK_AUTHORIZED,FR_CRITAIR_1,
  "lowEmissionZoneExemptions": FR_STRASBOURG_ZFE,GB_LONDON_ULTRA_LOW_EMISSION_ZONE,
  "particleReductionClass": null,
  "emptyWeight": 15000,
  "loadWeight": 25000,
  "totalPermittedWeight": 40000,
  "totalTechnicallyPermittedWeight": 40000,
  "axleWeight": 11500,
  "numberOfAxles": 5,
  "numberOfTires": 10,
  "height": 400,
  "heightAboveFrontAxle": 400,
  "length": 1650,
  "width": 254,
  "hazardousMaterials": null,
  "tunnelRestrictionCode": null,
  "truckRoutes": null,
  "commercial": false,
  "etcSubscriptions": null,
} satisfies Vehicle

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Vehicle
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


