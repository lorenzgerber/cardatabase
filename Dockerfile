FROM eclipse-temurin:17
ENV SPRING_DATASOURCE_URL=jdbc:mariadb://mariadb:3306/cardb
VOLUME /tmp
EXPOSE 8080
ARG JAR FILE
COPY target/cardatabase-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
