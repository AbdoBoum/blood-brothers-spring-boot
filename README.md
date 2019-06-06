## blood-brothers


The are 5 main microservices : 

  - discovery-server
  - accueil-service
  - blog-request-service
  - donor-centre-service
  - ville-sang-service

![microservices](https://user-images.githubusercontent.com/41730760/59034924-ba450e00-885b-11e9-87ef-df7e43770926.png)


# Descrption of microservices: 

- discovery server: The deployment should be automated so that no one cares about server names and physical location. Nonetheless, it is essential to have a tool that helps the services to discover their counterparts. There are many solutions available, and for our project, we used Eureka from Netflix as it has outstanding Spring support. (run on port: 8761)
- accueil-service: it's the microservice that receive client requests and then make a call to all concerned microservices then return the response to the clien. Simply, his job is to make call to other microservices to link them. (run on port: 8087)
- blog-request-service: gives CRUD operations on blog and request. (run on port: 8082)
- donor-centre-service: gives CRUD operations on center, donor and stock. (run on port: 8083)
- ville-sang-service: gives CRUD operations on ville and sang. (run on port: 8081)
- There are two other microservices that are not completed: authentication-service which allows us to secure our app, and config-service which wrapp all the configuration of the project.
<br><br>

# Dockerfile
 We have created a Dockerfile for each microservice which allows us to create an image of that microservice. Exemple of the content of Dockerfile is shown bellow: 
 
**discovery server:**
```
  FROM openjdk:8-jdk-alpine
  EXPOSE 8761
  ADD target/discovery-server.jar discovery-server.jar
  ENTRYPOINT [ "java", "-jar", "discovery-server.jar"]
```
 <br>
To create docker images first generate .jar file then go to the root directory of the microservice and run the command: 

```docker build -f Dockerfile -t image-name .```
(you can replace the image name with any name of your choice or just by the microservice's name).
<br>
After creating all the images go the discovery-server which contains the docker-compose.yml that allows to define and run multi-container Docker applications. Go to root directory and type the command: 
```docker-compose up -d```.
After runing you should be able to browse the application. (don't forget to change the name of images in the file docker-compose.yml with the names of the images that you created)
<br>
The name of images in the docker-compose.yml: 

- discovery-server
- configserver
- blog-request-image
- ville-sang-service
- donor-center-image
- acceuil-service

