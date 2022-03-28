package com.espark.adarsh.commands;

import com.espark.adarsh.service.SecurityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@Slf4j
@ShellComponent
public class ShellCommand {

    private SecurityService service;

    public ShellCommand(SecurityService service) {
        this.service = service;
    }

    @ShellMethod("displaying the input to the console")
    public String message(
            @ShellOption(defaultValue = "****") String text) {
        log.info("spring boot shell message={} for name={}", text, service.getLoginUser());
        return "spring boot shell message=" + text + " for name=" + service.getLoginUser();
    }

}
