# springboot-shell 

--- 

## To build the code 
* mvn clean package -DskipTests

## To run the application 
* mvn spring-boot:run

```     
$ mvn spring-boot:run 

[INFO] Scanning for projects...
[INFO] 
[INFO] -----------------< com.espark.adarsh:springboot-shell >-----------------
[INFO] Building springboot-shell 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.6.4:run (default-cli) > test-compile @ springboot-shell >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ springboot-shell ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ springboot-shell ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to /Users/us-guest/Desktop/springboot-shell/target/classes
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
[INFO] <<< spring-boot-maven-plugin:2.6.4:run (default-cli) < test-compile @ springboot-shell <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.6.4:run (default-cli) @ springboot-shell ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.4)

2022-03-22 13:10:58.830  INFO 4850 --- [           main] c.e.adarsh.SpringbootShellApplication    : Starting SpringbootShellApplication using Java 14.0.1 on USMB113823.attlocal.net with PID 4850 (/Users/us-guest/Desktop/springboot-shell/target/classes started by us-guest in /Users/us-guest/Desktop/springboot-shell)
2022-03-22 13:10:58.833  INFO 4850 --- [           main] c.e.adarsh.SpringbootShellApplication    : No active profile set, falling back to 1 default profile: "default"
2022-03-22 13:10:59.567  INFO 4850 --- [           main] c.e.adarsh.SpringbootShellApplication    : Started SpringbootShellApplication in 1.004 seconds (JVM running for 1.211)


shell:>shell-message-display --message "welcome to espark " --name "adarsh kumar"
2022-03-22 13:11:06.433  INFO 4850 --- [           main] com.espark.adarsh.SpringbootShell        : spring boot shell message=welcome to espark  for name=adarsh kumar
spring boot shell message=welcome to espark  for name=adarsh kumar


shell:>exit
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  22.052 s
[INFO] Finished at: 2022-03-22T13:11:18-05:00
[INFO] ------------------------------------------------------------------------
USMB113823:springboot-shell us-guest$ 

```

