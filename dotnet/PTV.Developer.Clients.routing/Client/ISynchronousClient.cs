/*
 * Routing
 *
 * With the Routing service you can calculate routes from A to B taking into account vehicle-specific restrictions, traffic situations, toll, emissions, driver's working hours, service times and opening intervals.
 *
 * The version of the OpenAPI document: 1.27
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.IO;

namespace PTV.Developer.Clients.routing.Client
{
    /// <summary>
    /// Contract for Synchronous RESTful API interactions.
    ///
    /// This interface allows consumers to provide a custom API accessor client.
    /// </summary>
    public interface ISynchronousClient
    {
        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the GET http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Get<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);

        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the POST http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Post<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);

        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the PUT http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Put<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);

        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the DELETE http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Delete<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);

        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the HEAD http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Head<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);

        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the OPTIONS http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Options<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);

        /// <summary>
        /// Executes a blocking call to some <paramref name="path"/> using the PATCH http verb.
        /// </summary>
        /// <param name="path">The relative path to invoke.</param>
        /// <param name="options">The request parameters to pass along to the client.</param>
        /// <param name="configuration">Per-request configurable settings.</param>
        /// <typeparam name="T">The return type.</typeparam>
        /// <returns>The response data, decorated with <see cref="ApiResponse{T}"/></returns>
        ApiResponse<T> Patch<T>(string path, RequestOptions options, IReadableConfiguration configuration = null);
    }
}
