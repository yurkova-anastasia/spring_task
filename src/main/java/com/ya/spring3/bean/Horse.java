package com.ya.spring3.bean;

import com.ya.spring3.annotation.MyAnnotation;
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
}
