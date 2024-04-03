package com.example.ekenzie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EkenzieApplication {

    @GetMapping("/")
    public String Hello(){
        return "e kenzie page";
    }
    public static void main(String[] args) {
        SpringApplication.run(EkenzieApplication.class, args);
    }

}
