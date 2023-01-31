FROM openjdk:17
EXPOSE 8080
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar helloworld.jar
CMD ["java", "-jar", "helloworld.jar"]