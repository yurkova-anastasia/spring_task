package com.ya.spring3.bean;

import com.ya.spring3.annotation.MyAnnotation;
import org.springframework.stereotype.Component;

@Component
public class Hamster {
    private String color;

    public Hamster() {

    }

    public String getColor() {
        return color;
    }

    @MyAnnotation
    public void setColor(String color) {
        this.color = color;
    }
}
