FROM openjdk:8
EXPOSE 8083
VOLUME /tmp
ADD target/APIGateWay-0.0.1-SNAPSHOT.jar APIGateWay-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar" ,"APIGateWay-0.0.1-SNAPSHOT.jar" ]
