Go to the Spring Initializr, 
select the Eureka Server (this brings in org.springframework.cloud:spring-cloud-starter-eureka-server) checkbox,
name it eureka-server and then add @EnableEurekaServer to the DemoApplication class.
Make sure this module also talks to the Config Server as described in the last lab by adding the
org.springframework.cloud:spring-cloud-starter-config.
