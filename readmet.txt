System Requirements
* JCE unlimited strength installed for the JDK
* Servlet container with Servlet version minimum 3.00
* Java version minimum 1.7

Deployment and Accessing instructions
1) Create saveTheRabits.war on the current project structure
2) Copy the war file to the webApps folder of the selected Servelet container
3) the link would be http:yourserver:8080/saveTheRabits

Development notes
* Extensive co
* Have done using annotations so the project can be unit tested
* Mock database is created using a singleton java class to act as the database server
* External security not implemented to control access to the Webservice to get the donators list and there is a security loop hole.



