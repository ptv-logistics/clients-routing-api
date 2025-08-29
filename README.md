# Clients for the Routing API (Version 1.36)

Using client classes makes it easier and more convenient to integrate the API into an existing programming environment. We provide here clients for Java, C# and TypeScript. Alternatively you can generate the clients yourself by using this [tutorial](https://developer.myptv.com/en/resources/tutorials/general/how-generate-clients-ptv-developer-apis).


Language depending information:
* **DotNet:** Please add the following nuget packages to your client project
  * Please use .NET 8.0
  * JsonSubTypes (2.0.1)
  * Newtonsoft.Json (13.0.3)
  * RestSharp (112.0.0)
  * Polly (8.1.0)
  
  To initialize your client with your APIKey you can use the following snippet:
    ```
     var apiKey = new Dictionary<string, string>(){["apiKey"] = "Enter your ApiKey here" };
     var configuration = new Configuration() { ApiKey = apiKey };
     RoutingApi routingApi = new RoutingApi(configuration);
    ```

* **Java:** Please add the following dependencies to your project
  ```   <dependencies>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-core</artifactId>
            <version>2.19.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-annotations</artifactId>
            <version>2.19.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.core</groupId>
            <artifactId>jackson-databind</artifactId>
            <version>2.19.0</version>
        </dependency>
        <dependency>
            <groupId>com.fasterxml.jackson.datatype</groupId>
            <artifactId>jackson-datatype-jsr310</artifactId>
            <version>2.19.0</version>
        </dependency>
        <dependency>
            <groupId>org.openapitools</groupId>
            <artifactId>jackson-databind-nullable</artifactId>
            <version>0.2.6</version>
        </dependency>
        <dependency>
            <groupId>javax.ws.rs</groupId>
            <artifactId>javax.ws.rs-api</artifactId>
            <version>2.1.1</version>
        </dependency>
  ```       
    To initialize your client with your APIKey you can use the following snippet:
   ```
   ApiClient apiClient = Configuration.getDefaultApiClient()
       .setRequestInterceptor(builder -> builder.setHeader("ApiKey", "Enter your ApiKey here"));
   RoutingApi routingApi = new RoutingApi(apiClient);
   ```


* **TypeScript:** Please add the following dependencies to your project
  * nodeVersion (18.14.0 or higher)
  * aurelia-api (3.2.1)
  * aurelia-fetch-client (1.8.2)
  * node-fetch (2.7.0)
  * polly-js (1.8.3)
  * typescript (4.9.5)
  * typescript-http-client (0.10.4)
  * @types/node-fetch (2.6.9)
  
  
  To initialize your client with your APIKey you can use the following snippet:
    ```
    let configurationParameters: ConfigurationParameters = {fetchApi: require('node-fetch'),
                                                            headers: {ApiKey: "Enter your ApiKey here"}};
    let configuration: Configuration = new Configuration(configurationParameters);
    let routingApi: RoutingApi = new RoutingApi(configuration);
    ```

 &nbsp;  
 &nbsp;  
Please refer to our [Routing API](https://developer.myptv.com/en/documentation/routing-api/quick-start-routing-api) documentation.