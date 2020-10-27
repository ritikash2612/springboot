package com.springbootapp.webapp.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @GetMapping(path = "HelloWorld")
  public HelloWorldBean helloWorldBean(){
    return new HelloWorldBean("Hello World");
  }

  @GetMapping(path = "HelloWorld/{name}")
  public HelloWorldBean helloWorldBean(@PathVariable String name){
    return new HelloWorldBean(String.format("Hello World, %s",name));
  }
}
