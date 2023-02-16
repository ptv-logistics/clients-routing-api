/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.16
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = PTV.Developer.Clients.routing.Client.OpenAPIDateConverter;

namespace PTV.Developer.Clients.routing.Model
{
    /// <summary>
    /// The vehicle parameters that change at a waypoint. A vehicle parameter specified at a waypoint overrides the setting from the **profile** and **vehicle**. It is valid until the end of the route unless it is changed again at a subsequent waypoint. 
    /// </summary>
    [DataContract(Name = "VehicleParametersAtWaypoint")]
    public partial class VehicleParametersAtWaypoint : IEquatable<VehicleParametersAtWaypoint>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets TunnelRestrictionCode
        /// </summary>
        [DataMember(Name = "tunnelRestrictionCode", EmitDefaultValue = true)]
        public TunnelRestrictionCode? TunnelRestrictionCode { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="VehicleParametersAtWaypoint" /> class.
        /// </summary>
        /// <param name="averageFuelConsumption">The average fuel consumption of the vehicle. Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.  Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for &#x60;emissions&#x60;. .</param>
        /// <param name="averageElectricityConsumption">The average electricity consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh/100km].  Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for &#x60;emissions&#x60;. .</param>
        /// <param name="loadWeight">The weight of the vehicle&#39;s load [kg].  Relevant for &#x60;routing&#x60;, &#x60;emissions&#x60;. .</param>
        /// <param name="axleWeight">The maximum distributed weight that may be supported by an axle of the vehicle [kg].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. .</param>
        /// <param name="height">The height of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. .</param>
        /// <param name="length">The length of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. .</param>
        /// <param name="width">The width of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. .</param>
        /// <param name="hazardousMaterials">Comma-separated list of hazardous materials the vehicle has loaded. Use a list with only the _NONE_ value to specify that no hazardous material is loaded from that waypoint on. An empty list means that the hazardous materials don&#39;t change at the waypoint. If _NONE_ is specified along with other hazardous materials it is ignored.  Relevant for &#x60;routing&#x60;. .</param>
        /// <param name="tunnelRestrictionCode">tunnelRestrictionCode.</param>
        /// <param name="truckRoutes">Comma-separated list of truck routes the vehicle has to follow. This parameter will be ignored for non-truck profiles such as EUR_CAR, EUR_VAN, USA_1_PICKUP or AUS_LCV_LIGHT_COMMERCIAL.  * &#x60;DE_LKWUEBERLSTVAUSNV&#x60;  Preferred routes for long trucks in Germany, also known as Lang-LKW.  * &#x60;NL_LZV&#x60;  Preferred routes for long trucks in the Netherlands, also known as LZV (Langere en Zwaardere Vrachtautocombinatie).  * &#x60;NZ_HPMV&#x60;  The network for High Productivity Motor Vehicles (HPMV) carrying the maximum loads available under a permit (New Zeland Transport Agency).  * &#x60;SE_BK_1&#x60;  Public roads and bridges that support up to 64 t total permitted weight (Swedish Transport Administration).  * &#x60;SE_BK_2&#x60;  Public roads and bridges that support up to 51.4 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_3&#x60;  Public roads and bridges that support up to 37.5 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_4&#x60;  Public roads and bridges that support up to 74 t total permitted weight (draft summer 2018, Swedish Transport Administration).  * &#x60;US_STAA&#x60;  Routes that belong to the highway network as defined by the Surface Transportation Assistance Act in the US.  * &#x60;US_TD&#x60;  Part of a state-designated highway network for trucks in the US.  * &#x60;AU_B_DOUBLE&#x60;  B-Double routes as defined in Australia.  * &#x60;AU_B_DOUBLE_HML&#x60;  Routes for B-Double vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_B_TRIPLE&#x60;  B-Triple routes as defined in Australia.  * &#x60;AU_B_TRIPLE_HML&#x60;  Routes for B-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE&#x60;  Routes for AB-Triple vehicle combinations operating (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE_HML&#x60;  Routes for AB-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;NONE&#x60;  This value does not refer to a truck route. Use a list with only the _NONE_ value for the truck routes  at a waypoint to specify that no truck route must be used from that waypoint on. An empty list of truck routes  at a waypoint means that the truck routes don&#39;t change at the waypoint. If _NONE_ is specified along with other  truck routes it is ignored.  Relevant for &#x60;routing&#x60;. Cannot be used with **options[routingMode]&#x3D;MONETARY**. .</param>
        public VehicleParametersAtWaypoint(double? averageFuelConsumption = default(double?), double? averageElectricityConsumption = default(double?), int? loadWeight = default(int?), int? axleWeight = default(int?), int? height = default(int?), int? length = default(int?), int? width = default(int?), List<HazardousMaterials> hazardousMaterials = default(List<HazardousMaterials>), TunnelRestrictionCode? tunnelRestrictionCode = default(TunnelRestrictionCode?), List<TruckRoutes> truckRoutes = default(List<TruckRoutes>))
        {
            this.AverageFuelConsumption = averageFuelConsumption;
            this.AverageElectricityConsumption = averageElectricityConsumption;
            this.LoadWeight = loadWeight;
            this.AxleWeight = axleWeight;
            this.Height = height;
            this.Length = length;
            this.Width = width;
            this.HazardousMaterials = hazardousMaterials;
            this.TunnelRestrictionCode = tunnelRestrictionCode;
            this.TruckRoutes = truckRoutes;
        }

        /// <summary>
        /// The average fuel consumption of the vehicle. Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.  Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for &#x60;emissions&#x60;. 
        /// </summary>
        /// <value>The average fuel consumption of the vehicle. Depending on the **fuelType** [l/100km] for liquid fuel types or [kg/100km] for gaseous fuel types.  Supported for **engineType** _COMBUSTION_  or _HYBRID_. Relevant for &#x60;emissions&#x60;. </value>
        [DataMember(Name = "averageFuelConsumption", EmitDefaultValue = true)]
        public double? AverageFuelConsumption { get; set; }

        /// <summary>
        /// The average electricity consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh/100km].  Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for &#x60;emissions&#x60;. 
        /// </summary>
        /// <value>The average electricity consumption of the vehicle if the **engineType** is _ELECTRIC_ or _HYBRID_ [kWh/100km].  Supported for **engineType** _ELECTRIC_ or _HYBRID_. Relevant for &#x60;emissions&#x60;. </value>
        [DataMember(Name = "averageElectricityConsumption", EmitDefaultValue = true)]
        public double? AverageElectricityConsumption { get; set; }

        /// <summary>
        /// The weight of the vehicle&#39;s load [kg].  Relevant for &#x60;routing&#x60;, &#x60;emissions&#x60;. 
        /// </summary>
        /// <value>The weight of the vehicle&#39;s load [kg].  Relevant for &#x60;routing&#x60;, &#x60;emissions&#x60;. </value>
        [DataMember(Name = "loadWeight", EmitDefaultValue = true)]
        public int? LoadWeight { get; set; }

        /// <summary>
        /// The maximum distributed weight that may be supported by an axle of the vehicle [kg].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
        /// </summary>
        /// <value>The maximum distributed weight that may be supported by an axle of the vehicle [kg].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. </value>
        [DataMember(Name = "axleWeight", EmitDefaultValue = true)]
        public int? AxleWeight { get; set; }

        /// <summary>
        /// The height of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
        /// </summary>
        /// <value>The height of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. </value>
        [DataMember(Name = "height", EmitDefaultValue = true)]
        public int? Height { get; set; }

        /// <summary>
        /// The length of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
        /// </summary>
        /// <value>The length of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. </value>
        [DataMember(Name = "length", EmitDefaultValue = true)]
        public int? Length { get; set; }

        /// <summary>
        /// The width of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. 
        /// </summary>
        /// <value>The width of the vehicle [cm].  Relevant for &#x60;routing&#x60;, &#x60;toll&#x60;. </value>
        [DataMember(Name = "width", EmitDefaultValue = true)]
        public int? Width { get; set; }

        /// <summary>
        /// Comma-separated list of hazardous materials the vehicle has loaded. Use a list with only the _NONE_ value to specify that no hazardous material is loaded from that waypoint on. An empty list means that the hazardous materials don&#39;t change at the waypoint. If _NONE_ is specified along with other hazardous materials it is ignored.  Relevant for &#x60;routing&#x60;. 
        /// </summary>
        /// <value>Comma-separated list of hazardous materials the vehicle has loaded. Use a list with only the _NONE_ value to specify that no hazardous material is loaded from that waypoint on. An empty list means that the hazardous materials don&#39;t change at the waypoint. If _NONE_ is specified along with other hazardous materials it is ignored.  Relevant for &#x60;routing&#x60;. </value>
        [DataMember(Name = "hazardousMaterials", EmitDefaultValue = true)]
        public List<HazardousMaterials> HazardousMaterials { get; set; }

        /// <summary>
        /// Comma-separated list of truck routes the vehicle has to follow. This parameter will be ignored for non-truck profiles such as EUR_CAR, EUR_VAN, USA_1_PICKUP or AUS_LCV_LIGHT_COMMERCIAL.  * &#x60;DE_LKWUEBERLSTVAUSNV&#x60;  Preferred routes for long trucks in Germany, also known as Lang-LKW.  * &#x60;NL_LZV&#x60;  Preferred routes for long trucks in the Netherlands, also known as LZV (Langere en Zwaardere Vrachtautocombinatie).  * &#x60;NZ_HPMV&#x60;  The network for High Productivity Motor Vehicles (HPMV) carrying the maximum loads available under a permit (New Zeland Transport Agency).  * &#x60;SE_BK_1&#x60;  Public roads and bridges that support up to 64 t total permitted weight (Swedish Transport Administration).  * &#x60;SE_BK_2&#x60;  Public roads and bridges that support up to 51.4 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_3&#x60;  Public roads and bridges that support up to 37.5 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_4&#x60;  Public roads and bridges that support up to 74 t total permitted weight (draft summer 2018, Swedish Transport Administration).  * &#x60;US_STAA&#x60;  Routes that belong to the highway network as defined by the Surface Transportation Assistance Act in the US.  * &#x60;US_TD&#x60;  Part of a state-designated highway network for trucks in the US.  * &#x60;AU_B_DOUBLE&#x60;  B-Double routes as defined in Australia.  * &#x60;AU_B_DOUBLE_HML&#x60;  Routes for B-Double vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_B_TRIPLE&#x60;  B-Triple routes as defined in Australia.  * &#x60;AU_B_TRIPLE_HML&#x60;  Routes for B-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE&#x60;  Routes for AB-Triple vehicle combinations operating (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE_HML&#x60;  Routes for AB-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;NONE&#x60;  This value does not refer to a truck route. Use a list with only the _NONE_ value for the truck routes  at a waypoint to specify that no truck route must be used from that waypoint on. An empty list of truck routes  at a waypoint means that the truck routes don&#39;t change at the waypoint. If _NONE_ is specified along with other  truck routes it is ignored.  Relevant for &#x60;routing&#x60;. Cannot be used with **options[routingMode]&#x3D;MONETARY**. 
        /// </summary>
        /// <value>Comma-separated list of truck routes the vehicle has to follow. This parameter will be ignored for non-truck profiles such as EUR_CAR, EUR_VAN, USA_1_PICKUP or AUS_LCV_LIGHT_COMMERCIAL.  * &#x60;DE_LKWUEBERLSTVAUSNV&#x60;  Preferred routes for long trucks in Germany, also known as Lang-LKW.  * &#x60;NL_LZV&#x60;  Preferred routes for long trucks in the Netherlands, also known as LZV (Langere en Zwaardere Vrachtautocombinatie).  * &#x60;NZ_HPMV&#x60;  The network for High Productivity Motor Vehicles (HPMV) carrying the maximum loads available under a permit (New Zeland Transport Agency).  * &#x60;SE_BK_1&#x60;  Public roads and bridges that support up to 64 t total permitted weight (Swedish Transport Administration).  * &#x60;SE_BK_2&#x60;  Public roads and bridges that support up to 51.4 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_3&#x60;  Public roads and bridges that support up to 37.5 t total permitted weight.  Actual limit depends on wheelbase and axle weight (Swedish Transport Administration).  * &#x60;SE_BK_4&#x60;  Public roads and bridges that support up to 74 t total permitted weight (draft summer 2018, Swedish Transport Administration).  * &#x60;US_STAA&#x60;  Routes that belong to the highway network as defined by the Surface Transportation Assistance Act in the US.  * &#x60;US_TD&#x60;  Part of a state-designated highway network for trucks in the US.  * &#x60;AU_B_DOUBLE&#x60;  B-Double routes as defined in Australia.  * &#x60;AU_B_DOUBLE_HML&#x60;  Routes for B-Double vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_B_TRIPLE&#x60;  B-Triple routes as defined in Australia.  * &#x60;AU_B_TRIPLE_HML&#x60;  Routes for B-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE&#x60;  Routes for AB-Triple vehicle combinations operating (Australian Transport Administration).  * &#x60;AU_AB_TRIPLE_HML&#x60;  Routes for AB-Triple vehicle combinations operating at Higher Mass Limits (HML) (Australian Transport Administration).  * &#x60;NONE&#x60;  This value does not refer to a truck route. Use a list with only the _NONE_ value for the truck routes  at a waypoint to specify that no truck route must be used from that waypoint on. An empty list of truck routes  at a waypoint means that the truck routes don&#39;t change at the waypoint. If _NONE_ is specified along with other  truck routes it is ignored.  Relevant for &#x60;routing&#x60;. Cannot be used with **options[routingMode]&#x3D;MONETARY**. </value>
        [DataMember(Name = "truckRoutes", EmitDefaultValue = true)]
        public List<TruckRoutes> TruckRoutes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VehicleParametersAtWaypoint {\n");
            sb.Append("  AverageFuelConsumption: ").Append(AverageFuelConsumption).Append("\n");
            sb.Append("  AverageElectricityConsumption: ").Append(AverageElectricityConsumption).Append("\n");
            sb.Append("  LoadWeight: ").Append(LoadWeight).Append("\n");
            sb.Append("  AxleWeight: ").Append(AxleWeight).Append("\n");
            sb.Append("  Height: ").Append(Height).Append("\n");
            sb.Append("  Length: ").Append(Length).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
            sb.Append("  HazardousMaterials: ").Append(HazardousMaterials).Append("\n");
            sb.Append("  TunnelRestrictionCode: ").Append(TunnelRestrictionCode).Append("\n");
            sb.Append("  TruckRoutes: ").Append(TruckRoutes).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as VehicleParametersAtWaypoint);
        }

        /// <summary>
        /// Returns true if VehicleParametersAtWaypoint instances are equal
        /// </summary>
        /// <param name="input">Instance of VehicleParametersAtWaypoint to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VehicleParametersAtWaypoint input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AverageFuelConsumption == input.AverageFuelConsumption ||
                    (this.AverageFuelConsumption != null &&
                    this.AverageFuelConsumption.Equals(input.AverageFuelConsumption))
                ) && 
                (
                    this.AverageElectricityConsumption == input.AverageElectricityConsumption ||
                    (this.AverageElectricityConsumption != null &&
                    this.AverageElectricityConsumption.Equals(input.AverageElectricityConsumption))
                ) && 
                (
                    this.LoadWeight == input.LoadWeight ||
                    (this.LoadWeight != null &&
                    this.LoadWeight.Equals(input.LoadWeight))
                ) && 
                (
                    this.AxleWeight == input.AxleWeight ||
                    (this.AxleWeight != null &&
                    this.AxleWeight.Equals(input.AxleWeight))
                ) && 
                (
                    this.Height == input.Height ||
                    (this.Height != null &&
                    this.Height.Equals(input.Height))
                ) && 
                (
                    this.Length == input.Length ||
                    (this.Length != null &&
                    this.Length.Equals(input.Length))
                ) && 
                (
                    this.Width == input.Width ||
                    (this.Width != null &&
                    this.Width.Equals(input.Width))
                ) && 
                (
                    this.HazardousMaterials == input.HazardousMaterials ||
                    this.HazardousMaterials != null &&
                    input.HazardousMaterials != null &&
                    this.HazardousMaterials.SequenceEqual(input.HazardousMaterials)
                ) && 
                (
                    this.TunnelRestrictionCode == input.TunnelRestrictionCode ||
                    this.TunnelRestrictionCode.Equals(input.TunnelRestrictionCode)
                ) && 
                (
                    this.TruckRoutes == input.TruckRoutes ||
                    this.TruckRoutes != null &&
                    input.TruckRoutes != null &&
                    this.TruckRoutes.SequenceEqual(input.TruckRoutes)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.AverageFuelConsumption != null)
                {
                    hashCode = (hashCode * 59) + this.AverageFuelConsumption.GetHashCode();
                }
                if (this.AverageElectricityConsumption != null)
                {
                    hashCode = (hashCode * 59) + this.AverageElectricityConsumption.GetHashCode();
                }
                if (this.LoadWeight != null)
                {
                    hashCode = (hashCode * 59) + this.LoadWeight.GetHashCode();
                }
                if (this.AxleWeight != null)
                {
                    hashCode = (hashCode * 59) + this.AxleWeight.GetHashCode();
                }
                if (this.Height != null)
                {
                    hashCode = (hashCode * 59) + this.Height.GetHashCode();
                }
                if (this.Length != null)
                {
                    hashCode = (hashCode * 59) + this.Length.GetHashCode();
                }
                if (this.Width != null)
                {
                    hashCode = (hashCode * 59) + this.Width.GetHashCode();
                }
                if (this.HazardousMaterials != null)
                {
                    hashCode = (hashCode * 59) + this.HazardousMaterials.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TunnelRestrictionCode.GetHashCode();
                if (this.TruckRoutes != null)
                {
                    hashCode = (hashCode * 59) + this.TruckRoutes.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            // AverageFuelConsumption (double?) minimum
            if (this.AverageFuelConsumption < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AverageFuelConsumption, must be a value greater than or equal to 0.", new [] { "AverageFuelConsumption" });
            }

            // AverageElectricityConsumption (double?) minimum
            if (this.AverageElectricityConsumption < (double?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AverageElectricityConsumption, must be a value greater than or equal to 0.", new [] { "AverageElectricityConsumption" });
            }

            // LoadWeight (int?) minimum
            if (this.LoadWeight < (int?)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LoadWeight, must be a value greater than or equal to 0.", new [] { "LoadWeight" });
            }

            // AxleWeight (int?) minimum
            if (this.AxleWeight < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for AxleWeight, must be a value greater than or equal to 1.", new [] { "AxleWeight" });
            }

            // Height (int?) minimum
            if (this.Height < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Height, must be a value greater than or equal to 1.", new [] { "Height" });
            }

            // Length (int?) minimum
            if (this.Length < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Length, must be a value greater than or equal to 1.", new [] { "Length" });
            }

            // Width (int?) minimum
            if (this.Width < (int?)1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Width, must be a value greater than or equal to 1.", new [] { "Width" });
            }

            yield break;
        }
    }

}
