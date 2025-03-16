FROM openjdk:17
ADD target/lab3-devops.jar lab3-devops.jar 
ENTRYPOINT ["java","-jar","/lab3-devops.jar "]