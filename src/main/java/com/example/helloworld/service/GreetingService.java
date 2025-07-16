package com.example.helloworld.service;

import com.example.helloworld.repository.GreetingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public String getMessageByLang(String langCode) {
        return greetingRepository.findByLangCode(langCode)
                                 .map(greeting -> greeting.getMessage())
                                 .orElse("인삿말 없음");
    }
}
