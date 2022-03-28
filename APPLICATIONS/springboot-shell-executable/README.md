# SPRING BOOT SHELL EXECUTABLE 

--- 

### To Build the code 
* mvn clean package -DskipTests

### To Run the Application
* ./target/springboot-shell.jar
```          
$ ./target/springboot-shell.jar

Unknown :-> login --username admin --userpwd admin 

admin:-> message --text 'welcome to the espark '

spring boot shell message=welcome to the espark  for name=admin

admin:-> logout --username admin 

Unknown :-> 
```
