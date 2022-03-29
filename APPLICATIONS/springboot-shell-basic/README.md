# springboot-shell-basic

--- 

## To build the code 
* mvn clean package -DskipTests

## To run the application 
* mvn spring-boot:run

```     
$ mvn spring-boot:run 

[INFO] Scanning for projects...
[INFO] 
[INFO] --------------< com.espark.adarsh:springboot-shell-basic >--------------
[INFO] Building springboot-shell-basic 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] >>> spring-boot-maven-plugin:2.6.4:run (default-cli) > test-compile @ springboot-shell-basic >>>
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:resources (default-resources) @ springboot-shell-basic ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] Copying 1 resource
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ springboot-shell-basic ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:3.2.0:testResources (default-testResources) @ springboot-shell-basic ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Using 'UTF-8' encoding to copy filtered properties files.
[INFO] skip non existing resourceDirectory /Users/us-guest/WORK/GIT/springboot-shell/APPLICATIONS/springboot-shell-basic/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:testCompile (default-testCompile) @ springboot-shell-basic ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] <<< spring-boot-maven-plugin:2.6.4:run (default-cli) < test-compile @ springboot-shell-basic <<<
[INFO] 
[INFO] 
[INFO] --- spring-boot-maven-plugin:2.6.4:run (default-cli) @ springboot-shell-basic ---
[INFO] Attaching agents: []

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.6.4)

2022-03-29 12:26:47.590  INFO 5638 --- [           main] c.e.adarsh.SpringbootShellApplication    : Starting SpringbootShellApplication using Java 14.0.1 on USMB113823.attlocal.net with PID 5638 (/Users/us-guest/WORK/GIT/springboot-shell/APPLICATIONS/springboot-shell-basic/target/classes started by us-guest in /Users/us-guest/WORK/GIT/springboot-shell/APPLICATIONS/springboot-shell-basic)
2022-03-29 12:26:47.592  INFO 5638 --- [           main] c.e.adarsh.SpringbootShellApplication    : No active profile set, falling back to 1 default profile: "default"
2022-03-29 12:26:48.500  INFO 5638 --- [           main] c.e.adarsh.SpringbootShellApplication    : Started SpringbootShellApplication in 1.256 seconds (JVM running for 1.487)


shell:>shell-message-display --message "welcome to espark " --name "adarsh kumar"
2022-03-29 12:27:01.520  INFO 5638 --- [           main] c.e.adarsh.commands.SpringShellCommands  : spring boot shell message=welcome to espark  for name=adarsh kumar

spring boot shell message=welcome to espark  for name=adarsh kumar
shell:>exit

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  17.694 s
[INFO] Finished at: 2022-03-29T12:27:03-05:00
[INFO] ------------------------------------------------------------------------
```

