FROM maven:3.5-jdk-8-alpine as build-stage
WORKDIR /app
COPY ./ /app/
RUN mvn clean install

FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build-stage /app/target/cloud-test-server-1.0.0-SNAPSHOT.jar /app
EXPOSE 8090
CMD ["java", "-jar", "-Dsvnkit.http.methods=NTLM", "./cloud-test-server-1.0.0-SNAPSHOT.jar"]