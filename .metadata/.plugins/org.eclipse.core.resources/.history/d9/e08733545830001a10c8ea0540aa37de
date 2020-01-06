FROM openjdk:8
EXPOSE 8761
VOLUME /tmp
ADD target/ServiceRegistryAndDiscovery-0.0.1-SNAPSHOT.jar ServiceRegistryAndDiscovery-app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "java","-jar" ,"ServiceRegistryAndDiscovery-app.jar" ]
