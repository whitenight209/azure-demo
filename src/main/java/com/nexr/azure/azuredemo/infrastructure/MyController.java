package com.nexr.azure.azuredemo.infrastructure;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World! " + LocalDateTime.now();
    }
}
