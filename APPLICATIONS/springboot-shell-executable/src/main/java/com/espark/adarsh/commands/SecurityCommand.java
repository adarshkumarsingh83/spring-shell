package com.espark.adarsh.commands;

import com.espark.adarsh.service.SecurityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellMethodAvailability;

@Slf4j
@ShellComponent
public class SecurityCommand {

    private SecurityService service;

    public SecurityCommand(SecurityService service) {
        this.service = service;
    }

    @ShellMethod("login")
    public void login(String username, String userpwd) {
        this.service.login(username, userpwd);
        log.info("login {}", username);
    }

    @ShellMethod("logout")
    @ShellMethodAvailability("logoutAvailability")
    public void logout(String username) {
        this.service.logout(username);
        log.info("logout {}", username);
    }

    public Availability logoutAvailability() {
        return this.service.isUserLogin() ? Availability.available() : Availability.unavailable("You Must Log-in");
    }
}
