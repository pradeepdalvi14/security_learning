package com.acciojob.securitylearninng;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIs {

    @GetMapping("hiAll")
    public String hello(){
        return "Hello , Welcome to the springBoot";
    }

    @GetMapping("hiAdmin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")

    public String helloAdmin(){
        return "Hi Admin, Welcome";
    }

    @GetMapping("hiUser")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String helloUser(){
        return "Hi user, Welcome";
    }
}
