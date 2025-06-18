package com.malik.world.delegate;


import com.malik.openapi.api.GreetApiDelegate;
import com.malik.openapi.model.Greeting;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GreetDelegate implements GreetApiDelegate {
    @Override
    public ResponseEntity<Greeting> getGreeting(String inputName) {
        Greeting greeting = new Greeting("Hello " + "Mons");
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }
}
