Spring Boot Application
-----------------------


To Build project: `mvn clean install`

To start application from command line: `mvn spring-boot:run`

To start application from intellij, run SpringBootTestApplication as java application.


REST controller example
------------------------

GreetingController

http://localhost:8080/greeting

http://localhost:8080/greeting?name=Vishal


Spring Cacheable Example
------------------------

GreetingRepository

Takes time to return response the first time for a name, but returns from cache the next time.


Spring MVC Example
------------------

HelloController

Sets attribute `name` and routes to jsp `hello.html` which renders the value of the name


SOAP Service Example
--------------------

CountryEndpoint

WebServiceConfig defines the necessary beans

wsdl: `http://localhost:8080/ws/countries.wsdl`

Endpoint: `http://localhost:8080/ws` 

To invoke: $ curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws

request xml

```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
				  xmlns:gs="http://spring.io/guides/gs-producing-web-service">
   <soapenv:Header/>
   <soapenv:Body>
      <gs:getCountryRequest>
         <gs:name>Spain</gs:name>
      </gs:getCountryRequest>
   </soapenv:Body>
</soapenv:Envelope>
```

