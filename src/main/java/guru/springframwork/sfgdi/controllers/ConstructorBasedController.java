package guru.springframwork.sfgdi.controllers;

import guru.springframwork.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorBasedController {

    private GreetingService greetingService;

    public ConstructorBasedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return this.greetingService.sayGreeting();
    }
}
