package com.kushan.concepts.dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ravindu
 * 8/10/2022
 */
public class App {
    public static void main(String[] args) {
       // Computer obj = new Desktop(); //At this point if you want to get Laptop obj you have to change this code. it is not a good practice
                                      // so let's consider the dependency Injection theory


        //obj.printName();

        //Dependency Injection without xml configurations.
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Computer obj = factory.getBean(Desktop.class);
        obj.printName();
        obj.process();

        //Aspect Oriented Programming (AOP)....
        TestAOP testAOP = factory.getBean(TestAOP.class);
        testAOP.testIt();
        testAOP.completeIt();

    }
}
