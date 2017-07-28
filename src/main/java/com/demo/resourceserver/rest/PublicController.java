package com.demo.resourceserver.rest;

import com.demo.resourceserver.model.Message;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by macintosh on 7/28/17.
 */
@RestController
public class PublicController {
    @RequestMapping(value = "/public", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message getMessage(){
        return new Message("PUBLIC", "This is a public resource", UUID.randomUUID().toString());
    }
}
