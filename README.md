
Installing Docker for Windows
https://www.docker.com/products/docker-desktop
Enable Hardware Virtualization in BIOS 
Install Docker Desktop for Windows which Installs WSL2 (Windows Sub System for Linux)



Steps:
========
01) Create Executable jar
    java -jar docker-spring-boot.jar
    http://localhost:8080/demoapp/api/home/hello
    Running with port 8090
    java -jar docker-spring-boot.jar --server.port=8090
02) Create Docker File
    Steps to create docker file
    FROM : Base Docker Image in https://hub.docker.com/
    ADD: Executable application to the Base docker image
    ENTRYPOINT: Command to be executed when you run the docker container
    
03) Build Docker Image
- Ensure docker is up
  docker -v / docker --version
- List current images
  docker images
- List running containers
    docker container ls
- Build the image
  docker build -t dockersbootdemo .
  Build image with tag name dockersbootdemo from current folder .
  Note: Image name should be in lower case
- List the images
  docker images

04) Run Docker Container
    docker run -p8081:8090 dockersbootdemo
    System port 8081 is mapped to the port 8090 in docker container (Virtual machine)
    http://localhost:8081/demoapp/api/home/hello

Clean up
========
docker images
docker container ls
docker ps
dcoker stop ContainerID
docker rmi dockersbootdemo


Commands to Demo
================
01) docker --version
    
container
=========
docker container ls

02) docker images
03)
04) docker images
05) docker run -p8081:8080 dockersbootdemo
06) docker ps
07) docker stop 20edc4fdae3c
08) docker rmi -f dockersbootdemo

