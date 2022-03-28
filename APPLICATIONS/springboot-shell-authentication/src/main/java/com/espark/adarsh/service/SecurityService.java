package com.espark.adarsh.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

@Slf4j
@Service
public class SecurityService {

    private final AtomicReference<String> user = new AtomicReference<>();
    private final Predicate<String> userLogoutPredicate = (userName) -> user.get() != null;
    private final Predicate<String> userNamePredicate = (userName) -> userCredentials.containsKey(userName);
    private final Predicate<String> userPwdPredicate = (userPwd) -> userCredentials.get(userPwd).equals(userPwd);

    private static final Map<String, String> userCredentials = new HashMap() {
        {
            put("admin", "admin");
            put("user", "user");
        }
    };

    public boolean login(String userName, String userPwd) {
        if (userNamePredicate.test(userName) && userPwdPredicate.test(userPwd)) {
            user.set(userName);
            log.info("login successful {}", userName);
            return true;
        }
        log.info("login failure {}", userName);
        return false;
    }

    public boolean logout(String userName) {
        if (userNamePredicate.test(userName) && userLogoutPredicate.test(userName)) {
            user.set(null);
            log.info("logout successful {}", userName);
            return true;
        }
        log.info("logout failure {}", userName);
        return false;
    }

    public boolean isUserLogin() {
        return user.get() != null;
    }

    public String getLoginUser(){
        return user.get();
    }
}
