package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Device{

    @Override
    public void display() {
        System.out.println("this is laptop class which implements Device interface");
    }
}
