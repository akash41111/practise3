FROM openjdk:17
EXPOSE 9091
ADD target/springboot.jar springboot.jar
ENTRYPOINT ["java","-jar","springboot.jar"]