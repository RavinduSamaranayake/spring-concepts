package com.kushan.concepts.dependency_injection;

import org.springframework.stereotype.Component;

/**
 * @author Ravindu
 * 8/11/2022
 */
@Component
public class TestAOP {
    public void testIt(){
        System.out.println("Hello world....");
    }

    public void completeIt(){
        System.out.println("Completed ALL....");
    }
}
