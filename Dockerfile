# Use a base image that has Java installed
FROM openjdk:17-jdk-alpine
# Expose the port your application runs on
EXPOSE 8080
ADD target/springbootexample-0.0.1-SNAPSHOT.jar springbootexample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springbootexample-0.0.1-SNAPSHOT.jar"]



