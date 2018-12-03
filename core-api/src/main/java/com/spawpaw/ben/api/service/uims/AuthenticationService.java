package com.spawpaw.ben.api.service.uims;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class AuthenticationService {
    @RequestMapping("login")
    public void login() {
        // TODO: login
    }

    @RequestMapping("logout")
    public void logout() {
        // TODO: logout
    }
}
