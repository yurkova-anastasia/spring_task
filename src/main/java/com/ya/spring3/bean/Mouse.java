package com.ya.spring3.bean;

import com.ya.spring3.annotation.MyAnnotation;

public class Mouse {
    private String color;

    public Mouse() {
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
