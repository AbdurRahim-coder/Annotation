package com.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Screen implements MyBattery {

    @Override
    public void show() {
        System.out.println("this is Screen class");
    }
}
