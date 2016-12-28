The 12 Factor manifesto talks about externalizing the properties that  changes from one environment to another - hosts, locators, passwords, etc. - from the application itself. Spring Boot readily supports this pattern, but it's not enough. In this lab, we'll look at how to centralize, externalize, and dynamically update application configuration with the Spring Cloud Config Server.



spring default profile is "default"

so you can view the properties file defined in config repo https://github.com/ballaa2/config-repo

http://localhost:8888/demo-{profile}.properties


http://localhost:8888/demo-default.properties
http://localhost:8888/demo-dev-default.properties
http://localhost:8888/application-default.properties
