FROM openjdk:17-jdk-oracle
ARG JAR_FILE=target/producer-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} producer.jar
ENTRYPOINT ["java","-jar","/producer.jar"]