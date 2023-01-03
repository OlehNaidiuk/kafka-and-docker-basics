FROM openjdk:17-jdk-oracle
ARG JAR_FILE=target/consumer-sql-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} consumer-sql.jar
ENTRYPOINT ["java","-jar","/consumer-sql.jar"]