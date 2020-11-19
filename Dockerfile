FROM openjdk:8
EXPOSE 7008
ADD target/jenkins-pipeline-demo.jar jenkins-pipeline-demo.jar
ENTRYPOINT ["java","-jar","/jenkins-pipeline-demo.jar"]