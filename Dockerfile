FROM openjdk:17
EXPOSE 8080
CMD ["./mvnw","install"]
ADD target/HelloWorld-0.0.1-SNAPSHOT.jar helloworld.jar
ENTRYPOINT ["java","-jar","/helloworld.jar"]
