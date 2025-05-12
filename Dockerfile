# Build stage (Maven with JDK 21)
FROM maven:3.9.9-eclipse-temurin-21-alpine AS build 
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B 
COPY src src
RUN mvn clean package -DskipTests -Dmaven.test.skip=true 

# Run stage (Ultra-light JRE)
FROM eclipse-temurin:21-jre-alpine 
WORKDIR /app
COPY --from=build /app/target/webtest-*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
