package guru.springframwork.sfgdi;

import guru.springframwork.sfgdi.controllers.ConstructorBasedController;
import guru.springframwork.sfgdi.controllers.MyController;
import guru.springframwork.sfgdi.controllers.PropertyInjectedController;
import guru.springframwork.sfgdi.controllers.SetterBasedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());


        System.out.println("_________property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("_________Setter");

        SetterBasedController setterBasedController = (SetterBasedController)ctx.getBean("setterBasedController");
        System.out.println(setterBasedController.getGreetings());


        System.out.println("__________constructor");
        ConstructorBasedController constructorBasedController = (ConstructorBasedController) ctx.getBean("constructorBasedController");
        System.out.println(constructorBasedController.getGreeting());
    }

}
