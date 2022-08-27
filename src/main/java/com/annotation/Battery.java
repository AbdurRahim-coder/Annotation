package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class Battery implements MyBattery{
    public void show(){
        System.out.println("this is battery class");
    }
}
