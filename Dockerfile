FROM openjdk:21-slim
COPY target/*.jar security-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","/security-0.0.1-SNAPSHOT.jar"]