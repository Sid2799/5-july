FROM openjdk:18.0.1.1
ADD target/emp-0.0.1-SNAPSHOT.jar emp-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","emp-0.0.1-SNAPSHOT.jar"]