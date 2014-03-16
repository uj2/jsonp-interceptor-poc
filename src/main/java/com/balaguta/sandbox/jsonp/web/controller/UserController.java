package com.balaguta.sandbox.jsonp.web.controller;

import com.balaguta.sandbox.jsonp.web.exception.ResourceNotFoundException;
import com.balaguta.sandbox.jsonp.web.webobject.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @RequestMapping("/{id}")
    @ResponseBody
    public User getOne(@PathVariable("id") String id, @RequestHeader("Accept") String accept) {
        if ("balaguan".equals(id)) {
            return new User("balaguan", "Andriy", "Balaguta");
        } else {
            throw new ResourceNotFoundException("user with id " + id + " not found");
        }
    }

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    public void handleNotAcceptableException(HttpMediaTypeNotAcceptableException e) {
        e.printStackTrace();
    }
}