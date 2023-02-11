FROM openjdk:17
EXPOSE 8080
WORKDIR /myapp
COPY target/HelloWorld-0.0.1-SNAPSHOT.jar /myapp/spring-boot-k8s.jar
ENTRYPOINT ["java","-jar","spring-boot-k8s.jar"]
