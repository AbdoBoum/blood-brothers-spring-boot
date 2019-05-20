# blood-brothers

The are 5 main microservices : 
<br>
<ul>
  <li>discovery-server</li>
  <li>accueil-service</li>
  <li>blog-request-service</li>
  <li>donor-centre-service</li>
  <li>ville-sang-service</li>
</ul>

<p>discovery server: The deployment should be automated so that no one cares about server names and physical location. Nonetheless, it is essential to have a tool that helps the services to discover their counterparts. There are many solutions available, and for our project, we used Eureka from Netflix as it has outstanding Spring support. (run on port: 8761)</p>
<br>
<p>accueil-service: it's the microservice that receive client requests and then make a call to all concerned microservices then return the response to the clien. Simply, his job is to make call to other microservices to link them. (run on port: 8087)</p>
<br>
<p>blog-request-service: gives CRUD operations on blog and request. (run on port: 8082)</p>
<br>
<p>donor-centre-service: gives CRUD operations on center, donor and stock. (run on port: 8083)</p>
<br>
<p>ville-sang-service: gives CRUD operations on ville and sang. (run on port: 8081)</p>
<br>
There are two other microservices that are not completed: authentication-service which allows us to secure our app, and config-service which wrapp all the configuration of the project.
<br>
You can run the app using your IDE by running all the microservices or by using Docker. We have created a Dockerfile for each microservice which allows us to create an image of that microservice. To create docker images first generate .jar file then go to the root directory of the project and run the command: "docker build -f Dockerfile -t image-name ." (don't forget the dot, and you can replace the image name with any name of your choice or just by the microservice name).
<br>
After creating all the images go the discovery-server which contains the docker-compose.yml that allows to define and run multi-container Docker applications. Go to root directory and type the command: "docker-compose up -d" and don't forget to change the name of images in the file docker-compose.yml. After runing you should be able to browse the application.
