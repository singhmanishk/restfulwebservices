package com.in28minutes.rest.services.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloWorldController {

    //get
    //uri/hello-world
    //"hello world"

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hello world");
    }

    @GetMapping(path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPath(@PathVariable String name) {
        return new HelloWorldBean("hello world"+ " "+name);
    }
}
