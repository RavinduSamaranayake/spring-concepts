package com.kushan.concepts.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ravindu
 * 8/10/2022
 */
@Component
public class Desktop implements Computer{
    @Autowired
    HardDrive hdd;
    @Override
    public void printName() {
        System.out.println("Hi.. This is Desktop");
    }

    @Override
    public void process() {
        System.out.println("Start Process......... : "+hdd);
        hdd.processDrive();
    }
}
