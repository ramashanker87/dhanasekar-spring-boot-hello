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

## Create A Build Project under AWS CodeBuild

    provide the github repo url
    update the access token and verify its connected
    checkbox for buildspec.yml
    copy the role and update the permission boundaries

## RoleName

    codebuild-dhana-spring-boot-app-service-role

## Attach the Following Permissions to the Role

    AmazonEC2ContainerRegistryFullAccess
    AmazonEC2ContainerRegistryPowerUser

## Create ECS Service and Task infra

    aws cloudformation deploy --template-file ecs-fargate-cluster.yml --stack-name dhana-cluster-hello --capabilities CAPABILITY_NAMED_IAM 

## To Delete Stack

    aws cloudformation delete-stack --stack-name dhana-cluster-hello