How to register company-service microservice application in eureka server :

Add org.springframework.cloud:spring-cloud-starter-eureka to the company-service
Add @EnableDiscoveryClient to the company-service's DemoApplication
Add below configuration in applicatin.yml file
spring.application.name: company-service
    
eureka:
  client:
    serviceUrl:
      defaultZone: ${vcap.services.eureka-service.credentials.uri:http://127.0.0.1:8761}/eureka/
      
and restart the process, and then confirm its appearance in the Eureka Server at http://localhost:8761
