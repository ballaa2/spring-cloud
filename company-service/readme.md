How to register company-service microservice application in eureka server :

Add org.springframework.cloud:spring-cloud-starter-eureka to the company-service<br>
Add @EnableDiscoveryClient to the company-service's DemoApplication<br>
Add below configuration in applicatin.yml file<br>
spring.application.name: company-service<br>
    
eureka:<br>
  client:<br>
    serviceUrl:<br>
      defaultZone: ${vcap.services.eureka-service.credentials.uri:http://127.0.0.1:8761}/eureka/<br>
      
and restart the process, and then confirm its appearance in the Eureka Server at http://localhost:8761<br>
