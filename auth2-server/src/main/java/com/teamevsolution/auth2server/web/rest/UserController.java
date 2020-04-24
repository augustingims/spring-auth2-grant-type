package com.teamevsolution.auth2server.web.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class UserController {

    @RequestMapping("/authorize")
    public Principal user(Principal user) {
        return user;
    }
}
