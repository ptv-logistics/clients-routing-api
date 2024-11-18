/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.33
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ptvgroup.developer.client.routing.model;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ptvgroup.developer.client.routing.model.PaymentMethod;
import com.ptvgroup.developer.client.routing.model.TollPrice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * TollSectionCost
 */
@JsonPropertyOrder({
  TollSectionCost.JSON_PROPERTY_PRICE,
  TollSectionCost.JSON_PROPERTY_CURRENCY,
  TollSectionCost.JSON_PROPERTY_PAYMENT_METHODS,
  TollSectionCost.JSON_PROPERTY_ETC_SUBSCRIPTIONS,
  TollSectionCost.JSON_PROPERTY_CONVERTED_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T13:35:23.497749140Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TollSectionCost {
  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PAYMENT_METHODS = "paymentMethods";
  private List<PaymentMethod> paymentMethods = new ArrayList<>();

  public static final String JSON_PROPERTY_ETC_SUBSCRIPTIONS = "etcSubscriptions";
  private List<String> etcSubscriptions = new ArrayList<>();

  public static final String JSON_PROPERTY_CONVERTED_PRICE = "convertedPrice";
  private TollPrice convertedPrice;

  public TollSectionCost() { 
  }

  public TollSectionCost price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * The price in the specified currency.
   * minimum: 0
   * @return price
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public TollSectionCost currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency code according to [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217).
   * @return currency
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public TollSectionCost paymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public TollSectionCost addPaymentMethodsItem(PaymentMethod paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

  /**
   * The payment methods for toll costs.    * &#x60;ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION&#x60; - Electronic toll collection system with a subscription required.    * &#x60;ELECTRONIC_TOLL_COLLECTION&#x60; - Electronic toll collection system with no subscription required.    * &#x60;CASH&#x60; - Cash payment at a toll booth.    * &#x60;CREDIT_CARD&#x60; - Credit card payment at a toll booth.
   * @return paymentMethods
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PaymentMethod> getPaymentMethods() {
    return paymentMethods;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_METHODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentMethods(List<PaymentMethod> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }


  public TollSectionCost etcSubscriptions(List<String> etcSubscriptions) {
    this.etcSubscriptions = etcSubscriptions;
    return this;
  }

  public TollSectionCost addEtcSubscriptionsItem(String etcSubscriptionsItem) {
    if (this.etcSubscriptions == null) {
      this.etcSubscriptions = new ArrayList<>();
    }
    this.etcSubscriptions.add(etcSubscriptionsItem);
    return this;
  }

  /**
   * The required electronic toll collection subscriptions for the payment method _ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION_.
   * @return etcSubscriptions
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ETC_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEtcSubscriptions() {
    return etcSubscriptions;
  }


  @JsonProperty(JSON_PROPERTY_ETC_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEtcSubscriptions(List<String> etcSubscriptions) {
    this.etcSubscriptions = etcSubscriptions;
  }


  public TollSectionCost convertedPrice(TollPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
    return this;
  }

  /**
   * The price of the section in the converted currency.
   * @return convertedPrice
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TollPrice getConvertedPrice() {
    return convertedPrice;
  }


  @JsonProperty(JSON_PROPERTY_CONVERTED_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvertedPrice(TollPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
  }


  /**
   * Return true if this TollSectionCost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollSectionCost tollSectionCost = (TollSectionCost) o;
    return Objects.equals(this.price, tollSectionCost.price) &&
        Objects.equals(this.currency, tollSectionCost.currency) &&
        Objects.equals(this.paymentMethods, tollSectionCost.paymentMethods) &&
        Objects.equals(this.etcSubscriptions, tollSectionCost.etcSubscriptions) &&
        Objects.equals(this.convertedPrice, tollSectionCost.convertedPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, currency, paymentMethods, etcSubscriptions, convertedPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollSectionCost {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    etcSubscriptions: ").append(toIndentedString(etcSubscriptions)).append("\n");
    sb.append("    convertedPrice: ").append(toIndentedString(convertedPrice)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `price` to the URL query string
    if (getPrice() != null) {
      joiner.add(String.format("%sprice%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPrice()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `currency` to the URL query string
    if (getCurrency() != null) {
      joiner.add(String.format("%scurrency%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCurrency()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `paymentMethods` to the URL query string
    if (getPaymentMethods() != null) {
      for (int i = 0; i < getPaymentMethods().size(); i++) {
        if (getPaymentMethods().get(i) != null) {
          joiner.add(String.format("%spaymentMethods%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(ApiClient.valueToString(getPaymentMethods().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
        }
      }
    }

    // add `etcSubscriptions` to the URL query string
    if (getEtcSubscriptions() != null) {
      for (int i = 0; i < getEtcSubscriptions().size(); i++) {
        joiner.add(String.format("%setcSubscriptions%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getEtcSubscriptions().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `convertedPrice` to the URL query string
    if (getConvertedPrice() != null) {
      joiner.add(getConvertedPrice().toUrlQueryString(prefix + "convertedPrice" + suffix));
    }

    return joiner.toString();
  }
}

