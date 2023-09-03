FROM openjdk:11

COPY target/03-sb-angular-integration-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

ENTRYPOINT ["java", "-jar", "03-sb-angular-integration-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
