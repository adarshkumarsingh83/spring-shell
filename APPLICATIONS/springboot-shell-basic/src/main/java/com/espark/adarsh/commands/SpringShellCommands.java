package com.espark.adarsh.commands;

import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@Slf4j
@ShellComponent
public class SpringShellCommands {

    @ShellMethod("displaying the intput to the console")
    public String shellMessageDisplay(
            @ShellOption(defaultValue = "****") String message,
            @ShellOption(defaultValue = "****") String name) {
        log.info("spring boot shell message={} for name={}", message, name);
        return "spring boot shell message=" + message + " for name=" + name;
    }
}
