package com.nexr.azure.azuredemo.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/hello")
    public String helloWorld() {
        log.info("request time {}", LocalDateTime.now());
        return "Hello World! " + LocalDateTime.now();
    }
}
