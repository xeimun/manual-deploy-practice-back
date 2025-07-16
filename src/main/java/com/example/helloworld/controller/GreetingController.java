package com.example.helloworld.controller;

import com.example.helloworld.service.GreetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

    @GetMapping
    public ResponseEntity<String> getGreeting(@RequestParam String lang) {
        String message = greetingService.getMessageByLang(lang);
        return ResponseEntity.ok(message);
    }
}
