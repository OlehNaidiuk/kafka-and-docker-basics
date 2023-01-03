FROM openjdk:17-jdk-oracle
ARG JAR_FILE=target/consumer-nosql-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} consumer-nosql.jar
ENTRYPOINT ["java","-jar","/consumer-nosql.jar"]