package com.sh.app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/")
    public ResponseEntity home(){
        return ResponseEntity.ok("<h1>Hello world 🥑🥑🥑</h1>");
    }
}

