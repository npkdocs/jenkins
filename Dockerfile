FROM openjdk:8-jdk-alpine
#FROM openjdk:8
ARG JAR_FILE=target/spring-boot-docker.jar
COPY ${JAR_FILE} spring-boot-docker.jar
EXPOSE 8090
#ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker.jar"]