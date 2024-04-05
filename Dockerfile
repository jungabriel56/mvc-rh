FROM maven:3.8.7-openjdk-18-slim AS build

RUN mkdir /opt/app

COPY . /opt/app

WORKDIR /opt/app

RUN mvn clean package

ENV PROFILE=dev

EXPOSE 8080

FROM eclipse-temurin:18-jre-alpine

RUN mkdir /opt/app

COPY --from=build /opt/app/target/app.jar /opt/app/app.jar

wORKDIR	/opt/app

ENV PROFILE=dev

EXPOSE 8080

ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFILE}", "-jar", "app.jar"]
