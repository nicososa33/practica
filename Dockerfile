FROM openjdk:11-jdk
ARG JAR_FILE=target/api-core.jar
COPY ${JAR_FILE} api.jar
EXPOSE 8080
CMD ["java","-jar","api.jar"]
