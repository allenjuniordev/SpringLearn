package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Output in the console: Hello World");
        return "Hello World Spring Boot is up and running";
    }
}
