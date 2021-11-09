# times-table-calculator
A simple times table calculator exposed as Rest API, built with Java 11 using Spring Boot.

## Requirement
Install Java 11 JDK. It can be downloaded from Oracle using the following link: https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html 

## Run
As with every Spring Boot application, it can be runned in the terminal using the following command *./mvnw spring-boot:run*

After that the application can be accessed using the base url *http://localhost:8080/calculate/times-table*

The API requires a numeric parameter called "multiplier". You must insert a number GREATER than 0 and LESSER than 1000. 
