package com.malik.world.delegate;


import com.malik.openapi.api.GreetApiDelegate;
import com.malik.openapi.model.Greeting;
import com.malik.world.service.GreetService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class GreetDelegate implements GreetApiDelegate {
    private GreetService greetService;

    @Autowired
    public GreetDelegate(GreetService greetService) {
        this.greetService = greetService;
    }

    @Override
    public ResponseEntity<Greeting> getGreeting(String inputName) {
        return new ResponseEntity<>(greetService.getGreeting(inputName), HttpStatus.OK);
    }
}
