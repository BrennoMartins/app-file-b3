# Etapa de build com Maven + JDK 21
#FROM maven:3.9.6-eclipse-temurin-21 AS build
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests
#
## Etapa de execução com JDK 21
#FROM eclipse-temurin:21-jdk-alpine
#WORKDIR /app
#COPY --from=build /app/target/*.jar /app/app.jar
#ENV JAVA_OPTS=""
#EXPOSE 8086
#ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]
