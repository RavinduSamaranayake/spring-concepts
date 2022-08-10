package com.kushan.concepts.dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ravindu
 * 8/10/2022
 */
@Configuration
@ComponentScan(basePackages = "com.kushan.concepts.dependency_injection")
public class AppConfig {
//    @Bean
//    public HardDrive getHdd(){
//        return new SamsungDrive("Samsung H2");
//    }
}
