package guru.springframwork.sfgdi.controllers;

import guru.springframwork.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterBasedControllerTest {

    SetterBasedController setterBasedController;

    @BeforeEach
    void setUp() {
        this.setterBasedController = new SetterBasedController();
        this.setterBasedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void setGreetingService() {
        System.out.println(this.setterBasedController.getGreetings());
    }
}