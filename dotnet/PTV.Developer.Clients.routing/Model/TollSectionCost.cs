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
    /// TollSectionCost
    /// </summary>
    [DataContract(Name = "TollSectionCost")]
    public partial class TollSectionCost : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSectionCost" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected TollSectionCost() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="TollSectionCost" /> class.
        /// </summary>
        /// <param name="price">The price in the specified currency. (required).</param>
        /// <param name="currency">The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217). (required).</param>
        /// <param name="paymentMethods">The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth..</param>
        /// <param name="etcSubscriptions">The required electronic toll collection subscriptions for the payment method _ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION_..</param>
        /// <param name="convertedPrice">The price of the section in the converted currency..</param>
        public TollSectionCost(double? price = default(double?), string currency = default(string), List<PaymentMethod> paymentMethods = default(List<PaymentMethod>), List<string> etcSubscriptions = default(List<string>), TollPrice convertedPrice = default(TollPrice))
        {
            // to ensure "price" is required (not null)
            if (price == null)
            {
                throw new ArgumentNullException("price is a required property for TollSectionCost and cannot be null");
            }
            this.Price = price;
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for TollSectionCost and cannot be null");
            }
            this.Currency = currency;
            this.PaymentMethods = paymentMethods;
            this.EtcSubscriptions = etcSubscriptions;
            this.ConvertedPrice = convertedPrice;
        }

        /// <summary>
        /// The price in the specified currency.
        /// </summary>
        /// <value>The price in the specified currency.</value>
        [DataMember(Name = "price", IsRequired = true, EmitDefaultValue = true)]
        public double? Price { get; set; }

        /// <summary>
        /// The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
        /// </summary>
        /// <value>The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).</value>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth.
        /// </summary>
        /// <value>The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth.</value>
        [DataMember(Name = "paymentMethods", EmitDefaultValue = false)]
        public List<PaymentMethod> PaymentMethods { get; set; }

        /// <summary>
        /// The required electronic toll collection subscriptions for the payment method _ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION_.
        /// </summary>
        /// <value>The required electronic toll collection subscriptions for the payment method _ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION_.</value>
        [DataMember(Name = "etcSubscriptions", EmitDefaultValue = false)]
        public List<string> EtcSubscriptions { get; set; }

        /// <summary>
        /// The price of the section in the converted currency.
        /// </summary>
        /// <value>The price of the section in the converted currency.</value>
        [DataMember(Name = "convertedPrice", EmitDefaultValue = false)]
        public TollPrice ConvertedPrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class TollSectionCost {\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  PaymentMethods: ").Append(PaymentMethods).Append("\n");
            sb.Append("  EtcSubscriptions: ").Append(EtcSubscriptions).Append("\n");
            sb.Append("  ConvertedPrice: ").Append(ConvertedPrice).Append("\n");
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
            // Price (double?) minimum
            if (this.Price < (double?)0)
            {
                yield return new ValidationResult("Invalid value for Price, must be a value greater than or equal to 0.", new [] { "Price" });
            }

            yield break;
        }
    }

}
