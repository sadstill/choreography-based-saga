FROM openjdk:21-jdk-slim
WORKDIR /app
COPY build/libs/order-service.jar app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
