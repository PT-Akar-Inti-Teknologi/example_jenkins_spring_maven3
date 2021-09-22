# Spring Boot Jenkins Example

Sample project to demonstrate how to use Jenkins & SonarQube in Spring Boot with Maven.

## Table of Contents

- [General Information](#general-information)
- [Technologies Used](#technologies-used)
- [Setup](#setup)

## General Information

- This sample project uses Docker for Jenkins pipeline to build and test a typical Spring Boot project
- Please see `Jenkinsfile` and `sonar-project.properties` as a reference
- This is a preferred way to run Jenkins pipeline

## Technologies Used

- Spring Boot 2.1.6
- JDK 8
- Lombok
- Jacoco

## Setup

### Development

- `./mvnw clean verify`
- `./mvnw spring-boot:run`

### Test

- `./mvnw test`
