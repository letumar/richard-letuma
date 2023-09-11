FROM docker.io/library/openjdk:19-jdk-alpine
LABEL maintainer="myname@something.com" 
COPY code-with-spring-0.0.1-SNAPSHOT.jar /
ENTRYPOINT ["java","-jar","/code-with-spring-0.0.1-SNAPSHOT.jar"]
EXPOSE 8010
