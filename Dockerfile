FROM openjdk:8-jdk-alpine

EXPOSE 8080
LABEL authors="imene"

ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]