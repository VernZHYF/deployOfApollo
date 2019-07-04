package com.example.apollodemo.controller;

import com.example.apollodemo.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <h1> </h1>
 */

@RestController
public class HelloController {

    @Autowired
    private AppConfig appConfig;

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi() {
        int timeout = appConfig.javaConfigBean().getTimeout();
        String batch = appConfig.javaConfigBean().getBatch();
        return "timeout: " + timeout + ", batch: " + batch + ", server.port: " + port;
    }
}
