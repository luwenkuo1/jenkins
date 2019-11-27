#是指含有jdk1.8的镜像
FROM java:8

VOLUME ["/tmp"]

EXPOSE 8081

#复制本地文件到镜像中
COPY target/jenkins-0.0.1-SNAPSHOT.jar app.jar
#ENTRYPOINT是指容器运行后默认执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]