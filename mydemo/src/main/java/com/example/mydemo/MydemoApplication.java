package com.example.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MydemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MydemoApplication.class, args);//run method returns the object, so hold it in a variable
        //Alien a=context.getBean(Alien.class);
        //a.show();
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello this is new webpage %s!", name);
    }
    @GetMapping("/helloworldnew")
    public String sayHelloNew(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Helloworldnew this is new webpage %s!", name);
    }
    @GetMapping("/newservice")
    public String newservice(@RequestParam(value = "myName", defaultValue = "World") String name,@RequestParam(value="country") String country) {
        return String.format("Hello your name is %s! and your country is %s!", name, country);
    }
    
    
}