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
    /// Defines EtcSubscriptionTypes
    /// </summary>
    [JsonConverter(typeof(StringEnumConverter))]
    public enum EtcSubscriptionTypes
    {
        /// <summary>
        /// Enum AT_GOBOX for value: AT_GOBOX
        /// </summary>
        [EnumMember(Value = "AT_GOBOX")]
        AT_GOBOX = 1,

        /// <summary>
        /// Enum BE_TELETOL for value: BE_TELETOL
        /// </summary>
        [EnumMember(Value = "BE_TELETOL")]
        BE_TELETOL = 2,

        /// <summary>
        /// Enum BE_VIAPASS for value: BE_VIAPASS
        /// </summary>
        [EnumMember(Value = "BE_VIAPASS")]
        BE_VIAPASS = 3,

        /// <summary>
        /// Enum CH_LSVA for value: CH_LSVA
        /// </summary>
        [EnumMember(Value = "CH_LSVA")]
        CH_LSVA = 4,

        /// <summary>
        /// Enum DE_QUICKBOX for value: DE_QUICKBOX
        /// </summary>
        [EnumMember(Value = "DE_QUICKBOX")]
        DE_QUICKBOX = 5,

        /// <summary>
        /// Enum DE_TOLLCOLLECT for value: DE_TOLLCOLLECT
        /// </summary>
        [EnumMember(Value = "DE_TOLLCOLLECT")]
        DE_TOLLCOLLECT = 6,

        /// <summary>
        /// Enum DE_WARNOWTUNNEL_RFID for value: DE_WARNOWTUNNEL_RFID
        /// </summary>
        [EnumMember(Value = "DE_WARNOWTUNNEL_RFID")]
        DE_WARNOWTUNNEL_RFID = 7,

        /// <summary>
        /// Enum DK_BROPAS_BUSINESS for value: DK_BROPAS_BUSINESS
        /// </summary>
        [EnumMember(Value = "DK_BROPAS_BUSINESS")]
        DK_BROPAS_BUSINESS = 8,

        /// <summary>
        /// Enum IT_TELEPASS for value: IT_TELEPASS
        /// </summary>
        [EnumMember(Value = "IT_TELEPASS")]
        IT_TELEPASS = 9,

        /// <summary>
        /// Enum NL_TELECARD for value: NL_TELECARD
        /// </summary>
        [EnumMember(Value = "NL_TELECARD")]
        NL_TELECARD = 10,

        /// <summary>
        /// Enum NL_TTAG for value: NL_TTAG
        /// </summary>
        [EnumMember(Value = "NL_TTAG")]
        NL_TTAG = 11,

        /// <summary>
        /// Enum NO_AUTOPASS for value: NO_AUTOPASS
        /// </summary>
        [EnumMember(Value = "NO_AUTOPASS")]
        NO_AUTOPASS = 12,

        /// <summary>
        /// Enum PT_VIA_VERDE for value: PT_VIA_VERDE
        /// </summary>
        [EnumMember(Value = "PT_VIA_VERDE")]
        PT_VIA_VERDE = 13,

        /// <summary>
        /// Enum US_APASS for value: US_APASS
        /// </summary>
        [EnumMember(Value = "US_APASS")]
        US_APASS = 14,

        /// <summary>
        /// Enum US_BREEZEBY for value: US_BREEZEBY
        /// </summary>
        [EnumMember(Value = "US_BREEZEBY")]
        US_BREEZEBY = 15,

        /// <summary>
        /// Enum US_DOWNBEACH_EXPRESSPASS for value: US_DOWNBEACH_EXPRESSPASS
        /// </summary>
        [EnumMember(Value = "US_DOWNBEACH_EXPRESSPASS")]
        US_DOWNBEACH_EXPRESSPASS = 16,

        /// <summary>
        /// Enum US_EPASS for value: US_EPASS
        /// </summary>
        [EnumMember(Value = "US_EPASS")]
        US_EPASS = 17,

        /// <summary>
        /// Enum US_EXPRESSACCOUNT for value: US_EXPRESSACCOUNT
        /// </summary>
        [EnumMember(Value = "US_EXPRESSACCOUNT")]
        US_EXPRESSACCOUNT = 18,

        /// <summary>
        /// Enum US_EXPRESSCARD for value: US_EXPRESSCARD
        /// </summary>
        [EnumMember(Value = "US_EXPRESSCARD")]
        US_EXPRESSCARD = 19,

        /// <summary>
        /// Enum US_EXPRESSPASS for value: US_EXPRESSPASS
        /// </summary>
        [EnumMember(Value = "US_EXPRESSPASS")]
        US_EXPRESSPASS = 20,

        /// <summary>
        /// Enum US_EXPRESSTOLL for value: US_EXPRESSTOLL
        /// </summary>
        [EnumMember(Value = "US_EXPRESSTOLL")]
        US_EXPRESSTOLL = 21,

        /// <summary>
        /// Enum US_EZPASS for value: US_EZPASS
        /// </summary>
        [EnumMember(Value = "US_EZPASS")]
        US_EZPASS = 22,

        /// <summary>
        /// Enum US_EZTAG for value: US_EZTAG
        /// </summary>
        [EnumMember(Value = "US_EZTAG")]
        US_EZTAG = 23,

        /// <summary>
        /// Enum US_FASTRAK for value: US_FASTRAK
        /// </summary>
        [EnumMember(Value = "US_FASTRAK")]
        US_FASTRAK = 24,

        /// <summary>
        /// Enum US_GEAUXPASS for value: US_GEAUXPASS
        /// </summary>
        [EnumMember(Value = "US_GEAUXPASS")]
        US_GEAUXPASS = 25,

        /// <summary>
        /// Enum US_GOODTOGO for value: US_GOODTOGO
        /// </summary>
        [EnumMember(Value = "US_GOODTOGO")]
        US_GOODTOGO = 26,

        /// <summary>
        /// Enum US_GOPASS for value: US_GOPASS
        /// </summary>
        [EnumMember(Value = "US_GOPASS")]
        US_GOPASS = 27,

        /// <summary>
        /// Enum US_IPASS for value: US_IPASS
        /// </summary>
        [EnumMember(Value = "US_IPASS")]
        US_IPASS = 28,

        /// <summary>
        /// Enum US_KTAG for value: US_KTAG
        /// </summary>
        [EnumMember(Value = "US_KTAG")]
        US_KTAG = 29,

        /// <summary>
        /// Enum US_LEEWAY for value: US_LEEWAY
        /// </summary>
        [EnumMember(Value = "US_LEEWAY")]
        US_LEEWAY = 30,

        /// <summary>
        /// Enum US_MACKINACBRIDGE_MACPASS for value: US_MACKINACBRIDGE_MACPASS
        /// </summary>
        [EnumMember(Value = "US_MACKINACBRIDGE_MACPASS")]
        US_MACKINACBRIDGE_MACPASS = 31,

        /// <summary>
        /// Enum US_MARYLAND_EZPASS for value: US_MARYLAND_EZPASS
        /// </summary>
        [EnumMember(Value = "US_MARYLAND_EZPASS")]
        US_MARYLAND_EZPASS = 32,

        /// <summary>
        /// Enum US_MASSACHUSETTS_EZPASS for value: US_MASSACHUSETTS_EZPASS
        /// </summary>
        [EnumMember(Value = "US_MASSACHUSETTS_EZPASS")]
        US_MASSACHUSETTS_EZPASS = 33,

        /// <summary>
        /// Enum US_NC_QUICKPASS for value: US_NC_QUICKPASS
        /// </summary>
        [EnumMember(Value = "US_NC_QUICKPASS")]
        US_NC_QUICKPASS = 34,

        /// <summary>
        /// Enum US_NEWHAMPSHIRE_EZPASS for value: US_NEWHAMPSHIRE_EZPASS
        /// </summary>
        [EnumMember(Value = "US_NEWHAMPSHIRE_EZPASS")]
        US_NEWHAMPSHIRE_EZPASS = 35,

        /// <summary>
        /// Enum US_NEWJERSEY_EZPASS for value: US_NEWJERSEY_EZPASS
        /// </summary>
        [EnumMember(Value = "US_NEWJERSEY_EZPASS")]
        US_NEWJERSEY_EZPASS = 36,

        /// <summary>
        /// Enum US_NEWYORK_EZPASS for value: US_NEWYORK_EZPASS
        /// </summary>
        [EnumMember(Value = "US_NEWYORK_EZPASS")]
        US_NEWYORK_EZPASS = 37,

        /// <summary>
        /// Enum US_NEXPRESS for value: US_NEXPRESS
        /// </summary>
        [EnumMember(Value = "US_NEXPRESS")]
        US_NEXPRESS = 38,

        /// <summary>
        /// Enum US_OHIO_EZPASS for value: US_OHIO_EZPASS
        /// </summary>
        [EnumMember(Value = "US_OHIO_EZPASS")]
        US_OHIO_EZPASS = 39,

        /// <summary>
        /// Enum US_PALPASS for value: US_PALPASS
        /// </summary>
        [EnumMember(Value = "US_PALPASS")]
        US_PALPASS = 40,

        /// <summary>
        /// Enum US_PIKEPASS for value: US_PIKEPASS
        /// </summary>
        [EnumMember(Value = "US_PIKEPASS")]
        US_PIKEPASS = 41,

        /// <summary>
        /// Enum US_RIVERLINK for value: US_RIVERLINK
        /// </summary>
        [EnumMember(Value = "US_RIVERLINK")]
        US_RIVERLINK = 42,

        /// <summary>
        /// Enum US_RIVERLINK_NOTRANSPONDER for value: US_RIVERLINK_NOTRANSPONDER
        /// </summary>
        [EnumMember(Value = "US_RIVERLINK_NOTRANSPONDER")]
        US_RIVERLINK_NOTRANSPONDER = 43,

        /// <summary>
        /// Enum US_SEAWAYTRANSITCARD for value: US_SEAWAYTRANSITCARD
        /// </summary>
        [EnumMember(Value = "US_SEAWAYTRANSITCARD")]
        US_SEAWAYTRANSITCARD = 44,

        /// <summary>
        /// Enum US_SUNPASS for value: US_SUNPASS
        /// </summary>
        [EnumMember(Value = "US_SUNPASS")]
        US_SUNPASS = 45,

        /// <summary>
        /// Enum US_TOLLTAG for value: US_TOLLTAG
        /// </summary>
        [EnumMember(Value = "US_TOLLTAG")]
        US_TOLLTAG = 46,

        /// <summary>
        /// Enum US_TXTAG for value: US_TXTAG
        /// </summary>
        [EnumMember(Value = "US_TXTAG")]
        US_TXTAG = 47,

        /// <summary>
        /// Enum US_VIRGINIA_EZPASS for value: US_VIRGINIA_EZPASS
        /// </summary>
        [EnumMember(Value = "US_VIRGINIA_EZPASS")]
        US_VIRGINIA_EZPASS = 48,

        /// <summary>
        /// Enum US_WESTVIRGINIA_EZPASS for value: US_WESTVIRGINIA_EZPASS
        /// </summary>
        [EnumMember(Value = "US_WESTVIRGINIA_EZPASS")]
        US_WESTVIRGINIA_EZPASS = 49,

        /// <summary>
        /// Enum US_PEACHPASS for value: US_PEACHPASS
        /// </summary>
        [EnumMember(Value = "US_PEACHPASS")]
        US_PEACHPASS = 50,

        /// <summary>
        /// Enum US_NEXUS for value: US_NEXUS
        /// </summary>
        [EnumMember(Value = "US_NEXUS")]
        US_NEXUS = 51,

        /// <summary>
        /// Enum US_DELAWARE_EZPASS for value: US_DELAWARE_EZPASS
        /// </summary>
        [EnumMember(Value = "US_DELAWARE_EZPASS")]
        US_DELAWARE_EZPASS = 52,

        /// <summary>
        /// Enum US_GROSSEILETOLLBRIDGE_PASSTAG for value: US_GROSSEILETOLLBRIDGE_PASSTAG
        /// </summary>
        [EnumMember(Value = "US_GROSSEILETOLLBRIDGE_PASSTAG")]
        US_GROSSEILETOLLBRIDGE_PASSTAG = 53,

        /// <summary>
        /// Enum US_EZPASS_PAYBYPLATE for value: US_EZPASS_PAYBYPLATE
        /// </summary>
        [EnumMember(Value = "US_EZPASS_PAYBYPLATE")]
        US_EZPASS_PAYBYPLATE = 54

    }

}
