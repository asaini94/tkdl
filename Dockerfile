# 1. Use an official Java runtime as base image
FROM openjdk:17-jdk-slim

# 2. Set environment variables (optional)
ENV SPRING_PROFILES_ACTIVE=prod \
    TZ=Asia/Kolkata

# 3. Create app directory
WORKDIR /app

# 4. Copy the built JAR file into the container
COPY target/*.jar app.jar

# 5. Expose application port
EXPOSE 8080

# 6. Run the Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]

