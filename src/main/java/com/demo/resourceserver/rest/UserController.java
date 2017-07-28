package com.demo.resourceserver.rest;

import com.demo.resourceserver.model.Message;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.UUID;

/**
 * Created by macintosh on 7/28/17.
 */
@RestController
public class UserController {
    @PreAuthorize("hasAuthority('USER')")
    @RequestMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message getMessage(Principal principal){
        return new Message(principal.getName(), "This is a user resource", UUID.randomUUID().toString());
    }
}
