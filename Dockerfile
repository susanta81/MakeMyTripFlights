#FROM openjdk:17
#EXPOSE 8080
#ADD target/HelloWorld-0.0.1-SNAPSHOT.jar helloworld.jar
#CMD ["java", "-jar", "helloworld.jar"]

# syntax=docker/dockerfile:1

FROM openjdk:17
WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
COPY src ./src
CMD ["./mvnw", "clean","package"]
