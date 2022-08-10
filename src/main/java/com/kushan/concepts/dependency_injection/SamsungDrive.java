package com.kushan.concepts.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Ravindu
 * 8/10/2022
 */
@Component
public class SamsungDrive implements HardDrive{

    private String brand;

    public SamsungDrive(@Value("#{'kushan'}")String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void processDrive() {
        System.out.println("Process Samsung Hard Drive............. : "+brand);
    }

    @Override
    public String toString() {
        return "Process with Samsung Dive";
    }
}
