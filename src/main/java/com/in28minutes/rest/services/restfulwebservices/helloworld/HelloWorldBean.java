package com.in28minutes.rest.services.restfulwebservices.helloworld;

public class HelloWorldBean {

    private  String message;

    public HelloWorldBean(String helloWorld) {
        this.message = helloWorld;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message=msg;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
