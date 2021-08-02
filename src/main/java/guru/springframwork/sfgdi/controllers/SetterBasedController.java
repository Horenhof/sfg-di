package guru.springframwork.sfgdi.controllers;

import guru.springframwork.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterBasedController {

    public GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreetings(){

        return this.greetingService.sayGreeting();
    }
}
