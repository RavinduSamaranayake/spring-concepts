package com.kushan.concepts.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Ravindu
 * 8/10/2022
 */
@Component
public class Laptop implements Computer{

    @Autowired
    @Qualifier("samsungDrive")
    HardDrive hdd;
    @Override
    public void printName() {
        System.out.println("Hi.. This is Laptop");
    }

    @Override
    public void process() {
       // hdd.setBrand("ABCD");
        System.out.println("Start Process......... : "+hdd);
        hdd.processDrive();
    }
}
