FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
ENV BASE_DIR /app
COPY target/spring-shopping-3.0-SNAPSHOT.jar $BASE_DIR/app.jar
COPY resources $BASE_DIR/resources
WORKDIR $BASE_DIR
ENTRYPOINT ["java", "-jar", "app.jar"]
