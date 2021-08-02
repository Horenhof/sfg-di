package guru.springframwork.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello World");

        return "Controller ";
    }
}
