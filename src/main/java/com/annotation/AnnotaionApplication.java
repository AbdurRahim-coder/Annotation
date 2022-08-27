package com.annotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnnotaionApplication {

    public static void main(String[] args) {

       ConfigurableApplicationContext context = SpringApplication.run(AnnotaionApplication.class, args);
       Device device=context.getBean(Device.class);
       device.display();
    }

}
