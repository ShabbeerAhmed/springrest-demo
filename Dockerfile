FROM openjdk:17.0.2-jdk
EXPOSE 8081
ADD target/springrest-demo.jar springrest-demo.jar
ENTRYPOINT ["java","-jar","springrest-demo.jar"]
