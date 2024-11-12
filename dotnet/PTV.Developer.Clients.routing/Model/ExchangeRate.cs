/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.32
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
    /// ExchangeRate
    /// </summary>
    [DataContract(Name = "ExchangeRate")]
    public partial class ExchangeRate : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExchangeRate" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ExchangeRate() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ExchangeRate" /> class.
        /// </summary>
        /// <param name="currency">The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the currency from which a price has been converted. (required).</param>
        /// <param name="rate">The exchange rate to convert a price from the base currency to this currency. (required).</param>
        public ExchangeRate(string currency = default(string), double? rate = default(double?))
        {
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for ExchangeRate and cannot be null");
            }
            this.Currency = currency;
            // to ensure "rate" is required (not null)
            if (rate == null)
            {
                throw new ArgumentNullException("rate is a required property for ExchangeRate and cannot be null");
            }
            this.Rate = rate;
        }

        /// <summary>
        /// The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the currency from which a price has been converted.
        /// </summary>
        /// <value>The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) currency code of the currency from which a price has been converted.</value>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// The exchange rate to convert a price from the base currency to this currency.
        /// </summary>
        /// <value>The exchange rate to convert a price from the base currency to this currency.</value>
        [DataMember(Name = "rate", IsRequired = true, EmitDefaultValue = true)]
        public double? Rate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ExchangeRate {\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Rate: ").Append(Rate).Append("\n");
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
            if (this.Currency != null) {
                // Currency (string) pattern
                Regex regexCurrency = new Regex(@"[A-Z]{3}", RegexOptions.CultureInvariant);
                if (!regexCurrency.Match(this.Currency).Success)
                {
                    yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Currency, must match a pattern of " + regexCurrency, new [] { "Currency" });
                }
            }

            yield break;
        }
    }

}
