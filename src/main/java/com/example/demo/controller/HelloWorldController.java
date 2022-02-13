package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "greetings")
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public ResponseEntity<String> getHelloWorld() {
        return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
    }

    @GetMapping(path = "/{name}")
    public ResponseEntity<String> getGreeting(@PathVariable(name = "name") String name) {
        String greeting = "Hello " + name + "!";
        return new ResponseEntity<String>(greeting, HttpStatus.OK);
    }
}
