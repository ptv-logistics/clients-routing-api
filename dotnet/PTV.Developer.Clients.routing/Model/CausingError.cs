/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.14
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
    /// CausingError
    /// </summary>
    [DataContract(Name = "CausingError")]
    public partial class CausingError : IEquatable<CausingError>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CausingError" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CausingError() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CausingError" /> class.
        /// </summary>
        /// <param name="description">A human readable message that describes the error. (required).</param>
        /// <param name="errorCode">A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.    **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;GENERAL_INVALID_INTERVAL&#x60; - A time interval is invalid, i.e. start is greater than end. * &#x60;ROUTING_INVALID_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is set to an invalid value.   * &#x60;attribute&#x60; - The invalid waypoint attribute. * &#x60;ROUTING_UNRECOGNIZED_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is unknown.   * &#x60;attribute&#x60; - The invalid waypoint key. * &#x60;ROUTING_DUPLICATE_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is duplicated.   * &#x60;attribute&#x60; - The duplicated waypoint key. * &#x60;ROUTING_WAYPOINT_ATTRIBUTE_CONFLICT&#x60; - Two waypoint attributes are in conflict with each other.   * &#x60;attribute&#x60; - The first conflicting attribute.   * &#x60;conflictingAttribute&#x60; - The second conflicting attribute. * &#x60;ROUTING_INVALID_MANIPULATION_WAYPOINT_ORDER&#x60; - The manipulation waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_COMBINED_TRANSPORT_WAYPOINT_ORDER&#x60; - The combinedTransport waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_WAYPOINT_LIST_FOR_ALTERNATIVE_ROUTES&#x60; - Alternative routes are supported only for two on-road or off-road waypoints. * &#x60;ROUTING_INVALID_WAYPOINT&#x60; - A waypoint contains multiple types or none of them, but exactly one must be specified. * &#x60;ROUTING_MUST_HAVE_WAYPOINTS_OR_ROUTE_ID&#x60; - The request must have either at least two waypoints or a routeId. * &#x60;ROUTING_EMISSIONS_MUTUALLY_EXCLUSIVE&#x60; - All emissions EN16258_2012 results and ISO14083_2022 results are mutually exclusive.   * &#x60;attribute&#x60; - The first conflicting emissions standard.   * &#x60;conflictingAttributes&#x60; - The list of other conflicting emissions standards. * &#x60;ROUTING_START_AND_ARRIVAL_TIME_MUTUALLY_EXCLUSIVE&#x60; - startTime and arrivalTime are mutually exclusive. - _The **parameter** remains empty._ * &#x60;ROUTING_ESTIMATED_DISTANCE_TOO_LONG&#x60; - The distance of the route (estimated by air-line) for non-motorized vehicles is too long. - _The **parameter** remains empty._   * &#x60;distance&#x60; - The estimated distance (integer).   * &#x60;limit&#x60; - The maximum allowable distance (integer). * &#x60;ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message. * &#x60;ROUTING_NO_VALID_COUNTRY_ALLOWED&#x60; - The list of allowed countries does not contain any of the available countries so that the effective list of countries allowed for routing is empty.   * &#x60;allowedCountries&#x60; - The list of allowed countries. * &#x60;ROUTING_ALL_VALID_COUNTRIES_PROHIBITED&#x60; - The list of prohibited countries contains all available countries so that the effective list of countries allowed for routing is empty.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_CONFLICT&#x60; - The lists of allowed and prohibited countries contain the same countries so that the effective list of countries allowed for routing is empty. - _The **parameter** remains empty._   * &#x60;allowedCountries&#x60; - The list of allowed countries.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_MAXIMUM_HORIZON_VALUE_VIOLATED&#x60; - The maximum value of horizon is violated.   * &#x60;limit&#x60; - The maximum allowable horizon (integer). * &#x60;ROUTING_MUST_HAVE_ONE_WAYPOINT_OR_ROUTE_ID&#x60; - The request must have either a waypoint or a routeId. * &#x60;ROUTING_HORIZONS_EQUAL_OR_NOT_ASCENDING&#x60; - The horizons have equal values or are not ascending.   * &#x60;value&#x60; - The invalid horizon. * &#x60;ROUTING_ROUTE_TOO_LONG_FOR_REACHABILITY&#x60; - The route is too long to be used with reachable areas or locations.   * &#x60;length&#x60; - The actual route length (integer).   * &#x60;limit&#x60; - The maximum allowable route length (integer). * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_IN_CONFLICT_WITH_ROUTE_ID&#x60; - The lists of allowed and prohibited countries are in conflict with the routeId which passes an effectively prohibited country.   * &#x60;value&#x60; - The value in conflict. * &#x60;ROUTING_ROUTE_ID_NOT_FOUND&#x60; - The routeId cannot be found.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_ROUTE_ID_CANNOT_BE_USED&#x60; - The routeId cannot be used for this operation as it was created by a service other than routing and lacks a routing context.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The profile name. * &#x60;ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;currency&#x60; - The unsupported currency. * &#x60;ROUTING_PARAMETER_ONLY_SUPPORTED_BY_POST&#x60; - A requested parameter is only supported for the appropriate POST operation.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_OPENING_INTERVALS_REQUIRE_TIME&#x60; - When using opening intervals with a waypoint and with **options[trafficMode]&#x3D;AVERAGE** either a start or an arrival time has to be specified. * &#x60;ROUTING_ARRIVAL_TIME_WITH_SCHEDULE&#x60; - **options[arrivalTime]** cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_INVALID_NUMBER_OF_COORDINATES&#x60; - The polyline cannot be parsed because the number of coordinates is not even.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found. * &#x60;ROUTING_INVALID_COORDINATE&#x60; - The provided coordinate is not in the valid range or cannot be parsed.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found.   * &#x60;coordinateIndex&#x60; - The index denoting the erroneous coordinate within the polyline. * &#x60;ROUTING_FEATURE_NOT_SUPPORTED_WITH_MONETARY_COSTS&#x60; - The requested feature is not supported when **options[routingMode] is _MONETARY_**.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_MUST_HAVE_MONETARY_COST_VALUE&#x60; - Both values monetaryCostOptions[costPerKilometer] and monetaryCostOptions[workingCostPerHour] are zero. Use a value greater zero for at least one of this monetaryCostOptions parameters.  **Error codes for** &#x60;ROUTING_ERROR&#x60;  * &#x60;ROUTING_WAYPOINT_CANNOT_BE_MATCHED&#x60; - The waypoint cannot be matched to the nearest possible road. * &#x60;ROUTING_ROUTE_NOT_FOUND&#x60; - A route between at least two waypoints could not be found for the current configuration and profile. - _The **parameter** remains empty._ * &#x60;ROUTING_UTC_OFFSET_CANNOT_BE_DETERMINED&#x60; - The UTC offset of the start waypoint cannot be determined. * &#x60;ROUTING_BLOCK_INTERSECTING_ROADS_TOO_MANY_SEGMENTS&#x60; - The maximum number of road segments intersecting one polyline must not exceed 5000.  **Error codes for** &#x60;ROUTING_RESTRICTION_EXCEEDED&#x60;  * &#x60;ROUTING_TOO_MANY_WAYPOINTS&#x60; - The request contains too many waypoints.   * &#x60;limit&#x60;- The maximum allowed number of waypoints for a single request (integer).  **Error codes for** &#x60;GENERAL_RESOURCE_NOT_FOUND&#x60;  * &#x60;GENERAL_INVALID_ID&#x60; - The ID does not exist.   * &#x60;value&#x60; - The invalid ID. (required).</param>
        /// <param name="_parameter">The name of the affected query or path parameter or a JSONPath to the affected property of the request..</param>
        /// <param name="details">Additional properties specific to this error class..</param>
        public CausingError(string description = default(string), string errorCode = default(string), string _parameter = default(string), Dictionary<string, Object> details = default(Dictionary<string, Object>))
        {
            // to ensure "description" is required (not null)
            if (description == null)
            {
                throw new ArgumentNullException("description is a required property for CausingError and cannot be null");
            }
            this.Description = description;
            // to ensure "errorCode" is required (not null)
            if (errorCode == null)
            {
                throw new ArgumentNullException("errorCode is a required property for CausingError and cannot be null");
            }
            this.ErrorCode = errorCode;
            this.Parameter = _parameter;
            this.Details = details;
        }

        /// <summary>
        /// A human readable message that describes the error.
        /// </summary>
        /// <value>A human readable message that describes the error.</value>
        [DataMember(Name = "description", IsRequired = true, EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.    **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;GENERAL_INVALID_INTERVAL&#x60; - A time interval is invalid, i.e. start is greater than end. * &#x60;ROUTING_INVALID_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is set to an invalid value.   * &#x60;attribute&#x60; - The invalid waypoint attribute. * &#x60;ROUTING_UNRECOGNIZED_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is unknown.   * &#x60;attribute&#x60; - The invalid waypoint key. * &#x60;ROUTING_DUPLICATE_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is duplicated.   * &#x60;attribute&#x60; - The duplicated waypoint key. * &#x60;ROUTING_WAYPOINT_ATTRIBUTE_CONFLICT&#x60; - Two waypoint attributes are in conflict with each other.   * &#x60;attribute&#x60; - The first conflicting attribute.   * &#x60;conflictingAttribute&#x60; - The second conflicting attribute. * &#x60;ROUTING_INVALID_MANIPULATION_WAYPOINT_ORDER&#x60; - The manipulation waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_COMBINED_TRANSPORT_WAYPOINT_ORDER&#x60; - The combinedTransport waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_WAYPOINT_LIST_FOR_ALTERNATIVE_ROUTES&#x60; - Alternative routes are supported only for two on-road or off-road waypoints. * &#x60;ROUTING_INVALID_WAYPOINT&#x60; - A waypoint contains multiple types or none of them, but exactly one must be specified. * &#x60;ROUTING_MUST_HAVE_WAYPOINTS_OR_ROUTE_ID&#x60; - The request must have either at least two waypoints or a routeId. * &#x60;ROUTING_EMISSIONS_MUTUALLY_EXCLUSIVE&#x60; - All emissions EN16258_2012 results and ISO14083_2022 results are mutually exclusive.   * &#x60;attribute&#x60; - The first conflicting emissions standard.   * &#x60;conflictingAttributes&#x60; - The list of other conflicting emissions standards. * &#x60;ROUTING_START_AND_ARRIVAL_TIME_MUTUALLY_EXCLUSIVE&#x60; - startTime and arrivalTime are mutually exclusive. - _The **parameter** remains empty._ * &#x60;ROUTING_ESTIMATED_DISTANCE_TOO_LONG&#x60; - The distance of the route (estimated by air-line) for non-motorized vehicles is too long. - _The **parameter** remains empty._   * &#x60;distance&#x60; - The estimated distance (integer).   * &#x60;limit&#x60; - The maximum allowable distance (integer). * &#x60;ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message. * &#x60;ROUTING_NO_VALID_COUNTRY_ALLOWED&#x60; - The list of allowed countries does not contain any of the available countries so that the effective list of countries allowed for routing is empty.   * &#x60;allowedCountries&#x60; - The list of allowed countries. * &#x60;ROUTING_ALL_VALID_COUNTRIES_PROHIBITED&#x60; - The list of prohibited countries contains all available countries so that the effective list of countries allowed for routing is empty.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_CONFLICT&#x60; - The lists of allowed and prohibited countries contain the same countries so that the effective list of countries allowed for routing is empty. - _The **parameter** remains empty._   * &#x60;allowedCountries&#x60; - The list of allowed countries.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_MAXIMUM_HORIZON_VALUE_VIOLATED&#x60; - The maximum value of horizon is violated.   * &#x60;limit&#x60; - The maximum allowable horizon (integer). * &#x60;ROUTING_MUST_HAVE_ONE_WAYPOINT_OR_ROUTE_ID&#x60; - The request must have either a waypoint or a routeId. * &#x60;ROUTING_HORIZONS_EQUAL_OR_NOT_ASCENDING&#x60; - The horizons have equal values or are not ascending.   * &#x60;value&#x60; - The invalid horizon. * &#x60;ROUTING_ROUTE_TOO_LONG_FOR_REACHABILITY&#x60; - The route is too long to be used with reachable areas or locations.   * &#x60;length&#x60; - The actual route length (integer).   * &#x60;limit&#x60; - The maximum allowable route length (integer). * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_IN_CONFLICT_WITH_ROUTE_ID&#x60; - The lists of allowed and prohibited countries are in conflict with the routeId which passes an effectively prohibited country.   * &#x60;value&#x60; - The value in conflict. * &#x60;ROUTING_ROUTE_ID_NOT_FOUND&#x60; - The routeId cannot be found.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_ROUTE_ID_CANNOT_BE_USED&#x60; - The routeId cannot be used for this operation as it was created by a service other than routing and lacks a routing context.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The profile name. * &#x60;ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;currency&#x60; - The unsupported currency. * &#x60;ROUTING_PARAMETER_ONLY_SUPPORTED_BY_POST&#x60; - A requested parameter is only supported for the appropriate POST operation.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_OPENING_INTERVALS_REQUIRE_TIME&#x60; - When using opening intervals with a waypoint and with **options[trafficMode]&#x3D;AVERAGE** either a start or an arrival time has to be specified. * &#x60;ROUTING_ARRIVAL_TIME_WITH_SCHEDULE&#x60; - **options[arrivalTime]** cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_INVALID_NUMBER_OF_COORDINATES&#x60; - The polyline cannot be parsed because the number of coordinates is not even.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found. * &#x60;ROUTING_INVALID_COORDINATE&#x60; - The provided coordinate is not in the valid range or cannot be parsed.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found.   * &#x60;coordinateIndex&#x60; - The index denoting the erroneous coordinate within the polyline. * &#x60;ROUTING_FEATURE_NOT_SUPPORTED_WITH_MONETARY_COSTS&#x60; - The requested feature is not supported when **options[routingMode] is _MONETARY_**.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_MUST_HAVE_MONETARY_COST_VALUE&#x60; - Both values monetaryCostOptions[costPerKilometer] and monetaryCostOptions[workingCostPerHour] are zero. Use a value greater zero for at least one of this monetaryCostOptions parameters.  **Error codes for** &#x60;ROUTING_ERROR&#x60;  * &#x60;ROUTING_WAYPOINT_CANNOT_BE_MATCHED&#x60; - The waypoint cannot be matched to the nearest possible road. * &#x60;ROUTING_ROUTE_NOT_FOUND&#x60; - A route between at least two waypoints could not be found for the current configuration and profile. - _The **parameter** remains empty._ * &#x60;ROUTING_UTC_OFFSET_CANNOT_BE_DETERMINED&#x60; - The UTC offset of the start waypoint cannot be determined. * &#x60;ROUTING_BLOCK_INTERSECTING_ROADS_TOO_MANY_SEGMENTS&#x60; - The maximum number of road segments intersecting one polyline must not exceed 5000.  **Error codes for** &#x60;ROUTING_RESTRICTION_EXCEEDED&#x60;  * &#x60;ROUTING_TOO_MANY_WAYPOINTS&#x60; - The request contains too many waypoints.   * &#x60;limit&#x60;- The maximum allowed number of waypoints for a single request (integer).  **Error codes for** &#x60;GENERAL_RESOURCE_NOT_FOUND&#x60;  * &#x60;GENERAL_INVALID_ID&#x60; - The ID does not exist.   * &#x60;value&#x60; - The invalid ID.
        /// </summary>
        /// <value>A constant string that can be used to identify this error class programmatically. An errorCode can have **details** to provide information in additional properties which are described with the code they apply to. They are of type string unless otherwise specified. Note that additional errorCodes as well as the **details** of existing errorCodes may be added at any time. Furthermore, the **description** may change at any time.    **Error codes for** &#x60;GENERAL_VALIDATION_ERROR&#x60;  * &#x60;GENERAL_INVALID_VALUE&#x60; - A parameter is set to an invalid value.   * &#x60;value&#x60; - The invalid value. * &#x60;GENERAL_UNRECOGNIZED_PARAMETER&#x60; - A parameter is unknown. * &#x60;GENERAL_MISSING_PARAMETER&#x60; - A required parameter is missing. * &#x60;GENERAL_MINIMUM_LENGTH_VIOLATED&#x60; - The minimum length is violated.   * &#x60;minimumLength&#x60; - The minimum length (integer). * &#x60;GENERAL_MAXIMUM_LENGTH_VIOLATED&#x60; - The maximum length is violated.   * &#x60;maximumLength&#x60; - The maximum length (integer). * &#x60;GENERAL_MINIMUM_VALUE_VIOLATED&#x60; - The minimum value restriction is violated.   * &#x60;minimumValue&#x60; - The minimum value (integer or double). * &#x60;GENERAL_MAXIMUM_VALUE_VIOLATED&#x60; - The maximum value restriction is violated.   * &#x60;maximumValue&#x60; - The maximum value (integer or double). * &#x60;GENERAL_DUPLICATE_PARAMETER&#x60; - A parameter is duplicated. * &#x60;GENERAL_INVALID_LIST&#x60; - A list has an invalid format such as duplicate commas.   * &#x60;value&#x60; - The invalid list. * &#x60;GENERAL_INVALID_INTERVAL&#x60; - A time interval is invalid, i.e. start is greater than end. * &#x60;ROUTING_INVALID_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is set to an invalid value.   * &#x60;attribute&#x60; - The invalid waypoint attribute. * &#x60;ROUTING_UNRECOGNIZED_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is unknown.   * &#x60;attribute&#x60; - The invalid waypoint key. * &#x60;ROUTING_DUPLICATE_WAYPOINT_ATTRIBUTE&#x60; - A waypoint attribute is duplicated.   * &#x60;attribute&#x60; - The duplicated waypoint key. * &#x60;ROUTING_WAYPOINT_ATTRIBUTE_CONFLICT&#x60; - Two waypoint attributes are in conflict with each other.   * &#x60;attribute&#x60; - The first conflicting attribute.   * &#x60;conflictingAttribute&#x60; - The second conflicting attribute. * &#x60;ROUTING_INVALID_MANIPULATION_WAYPOINT_ORDER&#x60; - The manipulation waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_COMBINED_TRANSPORT_WAYPOINT_ORDER&#x60; - The combinedTransport waypoint is not valid for start or destination. * &#x60;ROUTING_INVALID_WAYPOINT_LIST_FOR_ALTERNATIVE_ROUTES&#x60; - Alternative routes are supported only for two on-road or off-road waypoints. * &#x60;ROUTING_INVALID_WAYPOINT&#x60; - A waypoint contains multiple types or none of them, but exactly one must be specified. * &#x60;ROUTING_MUST_HAVE_WAYPOINTS_OR_ROUTE_ID&#x60; - The request must have either at least two waypoints or a routeId. * &#x60;ROUTING_EMISSIONS_MUTUALLY_EXCLUSIVE&#x60; - All emissions EN16258_2012 results and ISO14083_2022 results are mutually exclusive.   * &#x60;attribute&#x60; - The first conflicting emissions standard.   * &#x60;conflictingAttributes&#x60; - The list of other conflicting emissions standards. * &#x60;ROUTING_START_AND_ARRIVAL_TIME_MUTUALLY_EXCLUSIVE&#x60; - startTime and arrivalTime are mutually exclusive. - _The **parameter** remains empty._ * &#x60;ROUTING_ESTIMATED_DISTANCE_TOO_LONG&#x60; - The distance of the route (estimated by air-line) for non-motorized vehicles is too long. - _The **parameter** remains empty._   * &#x60;distance&#x60; - The estimated distance (integer).   * &#x60;limit&#x60; - The maximum allowable distance (integer). * &#x60;ROUTING_PARAMETER_CONFLICT&#x60; - Two parameters are in conflict with each other.   * &#x60;conflictingParameter&#x60; - The conflicting parameter.   * &#x60;message&#x60; - The error message. * &#x60;ROUTING_NO_VALID_COUNTRY_ALLOWED&#x60; - The list of allowed countries does not contain any of the available countries so that the effective list of countries allowed for routing is empty.   * &#x60;allowedCountries&#x60; - The list of allowed countries. * &#x60;ROUTING_ALL_VALID_COUNTRIES_PROHIBITED&#x60; - The list of prohibited countries contains all available countries so that the effective list of countries allowed for routing is empty.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_CONFLICT&#x60; - The lists of allowed and prohibited countries contain the same countries so that the effective list of countries allowed for routing is empty. - _The **parameter** remains empty._   * &#x60;allowedCountries&#x60; - The list of allowed countries.   * &#x60;prohibitedCountries&#x60; - The list of prohibited countries. * &#x60;ROUTING_MAXIMUM_HORIZON_VALUE_VIOLATED&#x60; - The maximum value of horizon is violated.   * &#x60;limit&#x60; - The maximum allowable horizon (integer). * &#x60;ROUTING_MUST_HAVE_ONE_WAYPOINT_OR_ROUTE_ID&#x60; - The request must have either a waypoint or a routeId. * &#x60;ROUTING_HORIZONS_EQUAL_OR_NOT_ASCENDING&#x60; - The horizons have equal values or are not ascending.   * &#x60;value&#x60; - The invalid horizon. * &#x60;ROUTING_ROUTE_TOO_LONG_FOR_REACHABILITY&#x60; - The route is too long to be used with reachable areas or locations.   * &#x60;length&#x60; - The actual route length (integer).   * &#x60;limit&#x60; - The maximum allowable route length (integer). * &#x60;ROUTING_ALLOWED_AND_PROHIBITED_COUNTRIES_IN_CONFLICT_WITH_ROUTE_ID&#x60; - The lists of allowed and prohibited countries are in conflict with the routeId which passes an effectively prohibited country.   * &#x60;value&#x60; - The value in conflict. * &#x60;ROUTING_ROUTE_ID_NOT_FOUND&#x60; - The routeId cannot be found.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_ROUTE_ID_CANNOT_BE_USED&#x60; - The routeId cannot be used for this operation as it was created by a service other than routing and lacks a routing context.   * &#x60;value&#x60; - The routeId. * &#x60;ROUTING_PROFILE_NOT_FOUND&#x60; - The requested profile could not be found.   * &#x60;value&#x60; - The profile name. * &#x60;ROUTING_UNSUPPORTED_CURRENCY&#x60; - The specified currency is not supported.   * &#x60;currency&#x60; - The unsupported currency. * &#x60;ROUTING_PARAMETER_ONLY_SUPPORTED_BY_POST&#x60; - A requested parameter is only supported for the appropriate POST operation.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_OPENING_INTERVALS_REQUIRE_TIME&#x60; - When using opening intervals with a waypoint and with **options[trafficMode]&#x3D;AVERAGE** either a start or an arrival time has to be specified. * &#x60;ROUTING_ARRIVAL_TIME_WITH_SCHEDULE&#x60; - **options[arrivalTime]** cannot be used with the **results** _SCHEDULE_REPORT_ and _SCHEDULE_EVENT_ nor when **openingIntervals**, **serviceTime** or **workingHoursPreset** are specified.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_INVALID_NUMBER_OF_COORDINATES&#x60; - The polyline cannot be parsed because the number of coordinates is not even.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found. * &#x60;ROUTING_INVALID_COORDINATE&#x60; - The provided coordinate is not in the valid range or cannot be parsed.   * &#x60;value&#x60; - The invalid parameter value.   * &#x60;polylineIndex&#x60; - The index denoting the polyline in which the error was found.   * &#x60;coordinateIndex&#x60; - The index denoting the erroneous coordinate within the polyline. * &#x60;ROUTING_FEATURE_NOT_SUPPORTED_WITH_MONETARY_COSTS&#x60; - The requested feature is not supported when **options[routingMode] is _MONETARY_**.   * &#x60;value&#x60; - The invalid parameter value. * &#x60;ROUTING_MUST_HAVE_MONETARY_COST_VALUE&#x60; - Both values monetaryCostOptions[costPerKilometer] and monetaryCostOptions[workingCostPerHour] are zero. Use a value greater zero for at least one of this monetaryCostOptions parameters.  **Error codes for** &#x60;ROUTING_ERROR&#x60;  * &#x60;ROUTING_WAYPOINT_CANNOT_BE_MATCHED&#x60; - The waypoint cannot be matched to the nearest possible road. * &#x60;ROUTING_ROUTE_NOT_FOUND&#x60; - A route between at least two waypoints could not be found for the current configuration and profile. - _The **parameter** remains empty._ * &#x60;ROUTING_UTC_OFFSET_CANNOT_BE_DETERMINED&#x60; - The UTC offset of the start waypoint cannot be determined. * &#x60;ROUTING_BLOCK_INTERSECTING_ROADS_TOO_MANY_SEGMENTS&#x60; - The maximum number of road segments intersecting one polyline must not exceed 5000.  **Error codes for** &#x60;ROUTING_RESTRICTION_EXCEEDED&#x60;  * &#x60;ROUTING_TOO_MANY_WAYPOINTS&#x60; - The request contains too many waypoints.   * &#x60;limit&#x60;- The maximum allowed number of waypoints for a single request (integer).  **Error codes for** &#x60;GENERAL_RESOURCE_NOT_FOUND&#x60;  * &#x60;GENERAL_INVALID_ID&#x60; - The ID does not exist.   * &#x60;value&#x60; - The invalid ID.</value>
        [DataMember(Name = "errorCode", IsRequired = true, EmitDefaultValue = false)]
        public string ErrorCode { get; set; }

        /// <summary>
        /// The name of the affected query or path parameter or a JSONPath to the affected property of the request.
        /// </summary>
        /// <value>The name of the affected query or path parameter or a JSONPath to the affected property of the request.</value>
        [DataMember(Name = "parameter", EmitDefaultValue = false)]
        public string Parameter { get; set; }

        /// <summary>
        /// Additional properties specific to this error class.
        /// </summary>
        /// <value>Additional properties specific to this error class.</value>
        [DataMember(Name = "details", EmitDefaultValue = false)]
        public Dictionary<string, Object> Details { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CausingError {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  ErrorCode: ").Append(ErrorCode).Append("\n");
            sb.Append("  Parameter: ").Append(Parameter).Append("\n");
            sb.Append("  Details: ").Append(Details).Append("\n");
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
            return this.Equals(input as CausingError);
        }

        /// <summary>
        /// Returns true if CausingError instances are equal
        /// </summary>
        /// <param name="input">Instance of CausingError to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CausingError input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.ErrorCode == input.ErrorCode ||
                    (this.ErrorCode != null &&
                    this.ErrorCode.Equals(input.ErrorCode))
                ) && 
                (
                    this.Parameter == input.Parameter ||
                    (this.Parameter != null &&
                    this.Parameter.Equals(input.Parameter))
                ) && 
                (
                    this.Details == input.Details ||
                    this.Details != null &&
                    input.Details != null &&
                    this.Details.SequenceEqual(input.Details)
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
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.ErrorCode != null)
                {
                    hashCode = (hashCode * 59) + this.ErrorCode.GetHashCode();
                }
                if (this.Parameter != null)
                {
                    hashCode = (hashCode * 59) + this.Parameter.GetHashCode();
                }
                if (this.Details != null)
                {
                    hashCode = (hashCode * 59) + this.Details.GetHashCode();
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
            yield break;
        }
    }

}
