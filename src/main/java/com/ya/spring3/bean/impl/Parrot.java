package com.ya.spring3.bean.impl;

import com.ya.spring3.annotation.MyAnnotation;
import com.ya.spring3.bean.Animal;

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

    public void printMessage() {

    }
}
