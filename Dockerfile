FROM openjdk:8-jre-alpine

MAINTAINER Salva Vilarrasa <shagy69@gmail.com>

ADD target/product-service.jar product-service.jar

ENTRYPOINT ["java", "-jar", "/product-service.jar"]

EXPOSE 8888