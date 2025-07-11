FROM openjdk:21-jdk-slim
RUN yum install curl
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-aws.jar springboot-aws.jar
ENTRYPOINT ["java", "-jar", "/springboot-aws.jar"]