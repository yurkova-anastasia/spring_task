package com.ya.spring3.bean;

import com.ya.spring3.annotation.MyAnnotation;

public class Dog {
    private String color;

    public Dog() {
    }

    public String getColor() {
        return color;
    }
    @MyAnnotation
    public void setColor(String color) {
        this.color = color;
    }
}
