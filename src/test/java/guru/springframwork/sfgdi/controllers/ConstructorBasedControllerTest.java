package guru.springframwork.sfgdi.controllers;

import guru.springframwork.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorBasedControllerTest {


    ConstructorBasedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new ConstructorBasedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}

