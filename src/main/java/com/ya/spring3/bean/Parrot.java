package com.ya.spring3.bean;

import com.ya.spring3.annotation.MyAnnotation;

public class Parrot {
    private String color;

    public Parrot() {
    }

    @MyAnnotation
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
