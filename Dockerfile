FROM maven:3.9-eclipse-temurin-23 AS build
WORKDIR /app
COPY . .
#eRUN gradle clean build

FROM openjdk:23-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
COPY src/main/resources/importB3.xlsx /app/resources/importB3.xlsx
ENV JAVA_OPTS=""
EXPOSE 8086
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

