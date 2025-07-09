FROM openjdk:17
LABEL maintainer="fitni_backend"
ADD target/fitni_backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
