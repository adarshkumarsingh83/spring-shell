# SPRING BOOT SHELL AUTHENTICATION 

--- 

### To Build the code 
* mvn clean package -DskipTests

### To Run the Application
* mvn spring-boot:run
```          
$ mvn spring-boot:run
[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------< com.espark.adarsh:springboot-shell >-----------------
[INFO] Building springboot-shell 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.6.5:run (default-cli) > test-compile @ springboot-shell >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ springboot-shell ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ springboot-shell ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 4 source files to /Users/us-guest/Desktop/springboot-shell/target/classes
[INFO] /Users/us-guest/Desktop/springboot-shell/src/main/java/com/espark/adarsh/service/SecurityService.java: /Users/us-guest/Desktop/springboot-shell/src/main/java/com/espark/adarsh/service/SecurityService.java uses unchecked or unsafe operations.
[INFO] /Users/us-guest/Desktop/springboot-shell/src/main/java/com/espark/adarsh/service/SecurityService.java: Recompile with -Xlint:unchecked for details.
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ springboot-shell ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /Users/us-guest/Desktop/springboot-shell/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ springboot-shell ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/us-guest/Desktop/springboot-shell/target/test-classes
[INFO] 
[INFO] <<< spring-boot-maven-plugin:2.6.5:run (default-cli) < test-compile @ springboot-shell <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.6.5:run (default-cli) @ springboot-shell ---
[INFO] Attaching agents: []
2022-03-28 14:37:59.802  INFO 8994 --- [           main] o.s.nativex.NativeListener               : AOT mode disabled

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.5)

2022-03-28 14:37:59.865  INFO 8994 --- [           main] c.e.adarsh.SpringbootShellApplication    : Starting SpringbootShellApplication using Java 14.0.1 on USMB113823.attlocal.net with PID 8994 (/Users/us-guest/Desktop/springboot-shell/target/classes started by us-guest in /Users/us-guest/Desktop/springboot-shell)
2022-03-28 14:37:59.865  INFO 8994 --- [           main] c.e.adarsh.SpringbootShellApplication    : No active profile set, falling back to 1 default profile: "default"
2022-03-28 14:38:00.527  INFO 8994 --- [           main] c.e.adarsh.SpringbootShellApplication    : Started SpringbootShellApplication in 0.914 seconds (JVM running for 1.125)

Unknown :-> login --username admin --userpwd admin
2022-03-28 14:38:15.621  INFO 8994 --- [           main] c.espark.adarsh.service.SecurityService  : login successful admin
2022-03-28 14:38:15.623  INFO 8994 --- [           main] c.e.adarsh.commands.SecurityCommand      : login admin

admin:-> logout --username admin
2022-03-28 14:38:30.000  INFO 8994 --- [           main] c.espark.adarsh.service.SecurityService  : logout successful admin
2022-03-28 14:38:30.000  INFO 8994 --- [           main] c.e.adarsh.commands.SecurityCommand      : logout admin

Unknown :-> 

```
