package com.malik.world.service;

import com.malik.openapi.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetService {
    public Greeting getGreeting(String inputName) {
        return new Greeting("Hello " + inputName);
    }
}
