package guru.springframwork.sfgdi.controllers;

import guru.springframwork.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService= new GreetingServiceImpl();
    }

    @Test
    void test(){
        System.out.println(this.propertyInjectedController.getGreeting());
    }
}