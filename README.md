# dhanasekar-spring-boot-hello

## spring-boot-hello-app for AWS codebuild and codepipeline

## Create separate repository in github

## Clone the project

## Create SpringBoot application

## Build Project

    mvn clean install

## Run the project

    mvn spring-boot:run

## Dockerize the application

    docker build -t spring-hello-app .

## List docker image

    docker images

## Run and verify the docker images

    docker run -p 8080:8080 spring-hello-app:latest
    http://localhost:8080/hello
    http://localhost:8080/actuator/health

## Create ECR for Spring app
```Bash
    aws cloudformation deploy --template-file ecr-template.yml --stack-name dhana-spring-ecr-repo 
```