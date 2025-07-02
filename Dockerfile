FROM openjdk:17-jdk-slim
EXPOSE 8081
ADD ./target/spring-task-hub-1.0.0.jar spring-task-hub-1.0.0.jar
ENTRYPOINT ["java", "-jar", "spring-task-hub-1.0.0.jar"]