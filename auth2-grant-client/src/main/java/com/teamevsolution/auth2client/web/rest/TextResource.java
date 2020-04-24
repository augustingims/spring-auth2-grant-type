package com.teamevsolution.auth2client.web.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TextResource {

    @GetMapping("/test")
    public String test() {
        return "Hello World";
    }
}
