/* tslint:disable */
/* eslint-disable */
/**
 * Routing
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver\'s working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * A payment method for toll costs.  
 *  * `ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION` - Pay with an electronic toll collection system for which a subscription is required.  
 *  * `ELECTRONIC_TOLL_COLLECTION` - Pay with some electronic toll collection system for which no prior subscription is required.  
 *  * `CASH` - Pay with cash at a toll booth.  
 *  * `CREDIT_CARD` - Pay with credit card at a toll booth.
 * @export
 */
export const PaymentMethod = {
    ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION: 'ELECTRONIC_TOLL_COLLECTION_SUBSCRIPTION',
    ELECTRONIC_TOLL_COLLECTION: 'ELECTRONIC_TOLL_COLLECTION',
    CASH: 'CASH',
    CREDIT_CARD: 'CREDIT_CARD'
} as const;
export type PaymentMethod = typeof PaymentMethod[keyof typeof PaymentMethod];


export function PaymentMethodFromJSON(json: any): PaymentMethod {
    return PaymentMethodFromJSONTyped(json, false);
}

export function PaymentMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): PaymentMethod {
    return json as PaymentMethod;
}

export function PaymentMethodToJSON(value?: PaymentMethod | null): any {
    return value as any;
}

