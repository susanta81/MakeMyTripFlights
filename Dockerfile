FROM openjdk:17
EXPOSE 8080
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar spring-boot-k8s.jar
ENTRYPOINT ["java","-jar","spring-boot-k8s.jar"]
