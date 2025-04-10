/*
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, drivers' working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.35
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
import com.ptvgroup.developer.client.routing.model.TollCostsByCountry;
import com.ptvgroup.developer.client.routing.model.TollPrice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


import com.ptvgroup.developer.client.routing.ApiClient;
/**
 * The toll prices payable for this route or leg aggregated by currency.
 */
@JsonPropertyOrder({
  TollCosts.JSON_PROPERTY_PRICES,
  TollCosts.JSON_PROPERTY_CONVERTED_PRICE,
  TollCosts.JSON_PROPERTY_COUNTRIES,
  TollCosts.JSON_PROPERTY_CONTAINS_APPROXIMATED_SECTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-10T12:35:48.280309247Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class TollCosts {
  public static final String JSON_PROPERTY_PRICES = "prices";
  private List<TollPrice> prices = new ArrayList<>();

  public static final String JSON_PROPERTY_CONVERTED_PRICE = "convertedPrice";
  private TollPrice convertedPrice;

  public static final String JSON_PROPERTY_COUNTRIES = "countries";
  private List<TollCostsByCountry> countries = new ArrayList<>();

  public static final String JSON_PROPERTY_CONTAINS_APPROXIMATED_SECTIONS = "containsApproximatedSections";
  private Boolean containsApproximatedSections;

  public TollCosts() { 
  }

  public TollCosts prices(List<TollPrice> prices) {
    this.prices = prices;
    return this;
  }

  public TollCosts addPricesItem(TollPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * The toll prices payable in the given currencies. The price may be 0 if no toll applies for a currency in a country passed by the route.
   * @return prices
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TollPrice> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrices(List<TollPrice> prices) {
    this.prices = prices;
  }


  public TollCosts convertedPrice(TollPrice convertedPrice) {
    this.convertedPrice = convertedPrice;
    return this;
  }

  /**
   * The cumulated toll price in the converted currency.
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


  public TollCosts countries(List<TollCostsByCountry> countries) {
    this.countries = countries;
    return this;
  }

  public TollCosts addCountriesItem(TollCostsByCountry countriesItem) {
    if (this.countries == null) {
      this.countries = new ArrayList<>();
    }
    this.countries.add(countriesItem);
    return this;
  }

  /**
   * The toll prices by country or subdivision. The price may be 0 if no toll applies in a country passed by the route.
   * @return countries
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<TollCostsByCountry> getCountries() {
    return countries;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountries(List<TollCostsByCountry> countries) {
    this.countries = countries;
  }


  public TollCosts containsApproximatedSections(Boolean containsApproximatedSections) {
    this.containsApproximatedSections = containsApproximatedSections;
    return this;
  }

  /**
   * True, if the start or destination waypoint is located inside a toll section. In such cases the exact toll price cannot be calculated and the closest toll location after the waypoint is used to approximate the toll price. When toll sections are requested, the affected section is marked as well.
   * @return containsApproximatedSections
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONTAINS_APPROXIMATED_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getContainsApproximatedSections() {
    return containsApproximatedSections;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINS_APPROXIMATED_SECTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainsApproximatedSections(Boolean containsApproximatedSections) {
    this.containsApproximatedSections = containsApproximatedSections;
  }


  /**
   * Return true if this TollCosts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TollCosts tollCosts = (TollCosts) o;
    return Objects.equals(this.prices, tollCosts.prices) &&
        Objects.equals(this.convertedPrice, tollCosts.convertedPrice) &&
        Objects.equals(this.countries, tollCosts.countries) &&
        Objects.equals(this.containsApproximatedSections, tollCosts.containsApproximatedSections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, convertedPrice, countries, containsApproximatedSections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TollCosts {\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    convertedPrice: ").append(toIndentedString(convertedPrice)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    containsApproximatedSections: ").append(toIndentedString(containsApproximatedSections)).append("\n");
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

    // add `prices` to the URL query string
    if (getPrices() != null) {
      for (int i = 0; i < getPrices().size(); i++) {
        if (getPrices().get(i) != null) {
          joiner.add(getPrices().get(i).toUrlQueryString(String.format("%sprices%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `convertedPrice` to the URL query string
    if (getConvertedPrice() != null) {
      joiner.add(getConvertedPrice().toUrlQueryString(prefix + "convertedPrice" + suffix));
    }

    // add `countries` to the URL query string
    if (getCountries() != null) {
      for (int i = 0; i < getCountries().size(); i++) {
        if (getCountries().get(i) != null) {
          joiner.add(getCountries().get(i).toUrlQueryString(String.format("%scountries%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `containsApproximatedSections` to the URL query string
    if (getContainsApproximatedSections() != null) {
      joiner.add(String.format("%scontainsApproximatedSections%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getContainsApproximatedSections()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}

