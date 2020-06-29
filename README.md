# Checkout APIREST project

Tech test for Hiberus
Checkout API REST
@Jorge Torres

## Tecnologies and Frameworks

1. Springboot
2. Swagger 
3. Maven
4. h2database

## Build and run project whit maven

From each project path

> ./mvnw package && java -jar target/checkout-0.0.1-SNAPSHOT.jar

> ./mvnw package && java -jar target/bill-0.0.1-SNAPSHOT.jar

> ./mvnw package && java -jar target/logistic-0.0.1-SNAPSHOT.jar

## Build and run project whit Containerizing project

From each project path

> docker build -t springio/checkout .

> docker run -p 9000:9000 springio/checkout

> docker build -t springio/checkout .

> docker run -p 9001:9001 springio/bill

> docker build -t springio/checkout .

> docker run -p 9002:9002 springio/logistic


## Architect decitions 

The project use springboot because of my experiences about this framework
only "checkout" project is documented with swagger because this is the public interface
Maven is very easy for deploy in other enviroments
Due to the size of the project, it's not necessary a module for centralize all DTOs
In some cases, the microservices simulates call to athers microservices
By other hand, dockerization is new for me in the practice, but I tried
Finally I use h2database for easy assembly for the reviewers

## Extras

Swagger docs: 'http://localhost:9001/api/swagger-ui.html'
