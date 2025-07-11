FROM openjdk:21-jdk-slim
RUN apt-get update && apt-get install -y curl
VOLUME /tmp
EXPOSE 8080
ADD target/springboot-aws.jar springboot-aws.jar
ENTRYPOINT ["java", "-jar", "/springboot-aws.jar"]