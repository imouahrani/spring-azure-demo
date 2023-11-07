package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") // to allow from all domains
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(){
        return "Hello World !";
    }

}
