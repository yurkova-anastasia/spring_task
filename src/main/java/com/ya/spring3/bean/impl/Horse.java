package com.ya.spring3.bean.impl;

import com.ya.spring3.annotation.MyAnnotation;
import com.ya.spring3.bean.Animal;
import org.springframework.stereotype.Component;

@Component
public class Horse {
    private String color;

    public Horse() {

    }

    @MyAnnotation
    public String getColor() {
        return color;
    }

    @MyAnnotation
    public void setColor(String color) {
        this.color = color;
    }

    public void printMessage() {

    }
}
