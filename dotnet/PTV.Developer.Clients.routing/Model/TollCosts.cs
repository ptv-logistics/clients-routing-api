/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.31
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
    /// The toll prices payable for this route or leg aggregated by currency.
    /// </summary>
    [DataContract(Name = "TollCosts")]
    public partial class TollCosts : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TollCosts" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollCosts() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollCosts" /> class.
        /// </summary>
        /// <param name="prices">The toll prices payable in the given currencies. The price may be 0 if no toll applies for a currency in a country passed by the route. (required).</param>
        /// <param name="convertedPrice">The cumulated toll price in the converted currency..</param>
        /// <param name="countries">The toll prices by country or subdivision. The price may be 0 if no toll applies in a country passed by the route. (required).</param>
        public TollCosts(List<TollPrice> prices = default(List<TollPrice>), TollPrice convertedPrice = default(TollPrice), List<TollCostsByCountry> countries = default(List<TollCostsByCountry>))
        {
            // to ensure "prices" is required (not null)
            if (prices == null)
            {
                throw new ArgumentNullException("prices is a required property for TollCosts and cannot be null");
            }
            this.Prices = prices;
            // to ensure "countries" is required (not null)
            if (countries == null)
            {
                throw new ArgumentNullException("countries is a required property for TollCosts and cannot be null");
            }
            this.Countries = countries;
            this.ConvertedPrice = convertedPrice;
        }

        /// <summary>
        /// The toll prices payable in the given currencies. The price may be 0 if no toll applies for a currency in a country passed by the route.
        /// </summary>
        /// <value>The toll prices payable in the given currencies. The price may be 0 if no toll applies for a currency in a country passed by the route.</value>
        [DataMember(Name = "prices", IsRequired = true, EmitDefaultValue = true)]
        public List<TollPrice> Prices { get; set; }

        /// <summary>
        /// The cumulated toll price in the converted currency.
        /// </summary>
        /// <value>The cumulated toll price in the converted currency.</value>
        [DataMember(Name = "convertedPrice", EmitDefaultValue = false)]
        public TollPrice ConvertedPrice { get; set; }

        /// <summary>
        /// The toll prices by country or subdivision. The price may be 0 if no toll applies in a country passed by the route.
        /// </summary>
        /// <value>The toll prices by country or subdivision. The price may be 0 if no toll applies in a country passed by the route.</value>
        [DataMember(Name = "countries", IsRequired = true, EmitDefaultValue = true)]
        public List<TollCostsByCountry> Countries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollCosts {\n");
            sb.Append("  Prices: ").Append(Prices).Append("\n");
            sb.Append("  ConvertedPrice: ").Append(ConvertedPrice).Append("\n");
            sb.Append("  Countries: ").Append(Countries).Append("\n");
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
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
