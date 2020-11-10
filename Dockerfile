FROM openjdk:8-jre-alpine

EXPOSE 8080

WORKDIR /app

COPY target/mss-value-comparator-0.0.1-SNAPSHOT.jar .

ENTRYPOINT [ "java", "-jar", "mss-value-comparator-0.0.1-SNAPSHOT.jar" ]