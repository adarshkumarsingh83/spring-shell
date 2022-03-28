package com.espark.adarsh.util;

import com.espark.adarsh.service.SecurityService;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Service;

@Service
public class ShellPromptProvider implements PromptProvider {

    private SecurityService service;

    public ShellPromptProvider(SecurityService service) {
        this.service = service;
    }

    @Override
    public AttributedString getPrompt() {
        return this.service.isUserLogin() ?
                new AttributedString(this.service.getLoginUser() + ":-> ", AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN))
                : new AttributedString("Unknown :-> ", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
    }
}
