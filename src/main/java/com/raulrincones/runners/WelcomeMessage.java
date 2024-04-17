package com.raulrincones.runners;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {
    public String getWelcomeMessage(){
        return "Welcome to our spring boor application";
    }
}
