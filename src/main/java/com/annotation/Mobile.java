package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mobile implements Device{


    @Autowired
    private MyBattery myBattery;

    @Override
    public void display() {
        System.out.println("this is Mobile class which implements Device interface");
        myBattery.show();

    }

}
