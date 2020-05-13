FROM openjdk:8-jdk-alpine
ARG JAR_FILE=experian-rest/target/*.jar
ARG CERT_FILE = experian-rest/src/main/resources/dev/*.p12
COPY ${JAR_FILE} app.jar
COPY ${CERT_FILE} /tmp/
ENTRYPOINT ["java","-jar","/app.jar"]