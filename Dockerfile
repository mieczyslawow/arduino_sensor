# Etap 1: Budowa aplikacji (opcjonalny, jeśli budujesz lokalnie)
# FROM maven:3.9.5-eclipse-temurin-17 AS build
# WORKDIR /app
# COPY pom.xml .
# COPY src ./src
# RUN mvn clean package -DskipTests

# Etap 2: Uruchamianie aplikacji
FROM eclipse-temurin:21-jdk-alpine

# Ustaw katalog roboczy
WORKDIR /app

# Kopiowanie gotowego jar-a do obrazu (zmień app.jar na swoją nazwę pliku)
COPY target/arduino_sensor-0.0.1-SNAPSHOT.jar app.jar

# Eksponowanie portu (np. 8080)
EXPOSE 8080

# Zmienna środowiskowa dla profilu Springa (zmień, jeśli używasz profilu)
ENV SPRING_PROFILES_ACTIVE=prod

# Uruchamianie aplikacji
ENTRYPOINT ["java", "-jar", "/app/app.jar"]