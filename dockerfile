FROM openjdk:17-oracle
EXPOSE 8080/tcp
ADD
ENTRYPOINT ["java", "-jar", "/app.jar"]