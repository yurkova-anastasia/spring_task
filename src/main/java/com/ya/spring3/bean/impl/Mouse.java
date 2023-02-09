package com.ya.spring3.bean.impl;

import com.ya.spring3.annotation.MyAnnotation;
import com.ya.spring3.annotation.Transactional;
import com.ya.spring3.bean.Animal;

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

    @Transactional
    public void printMessage() {
        System.out.println("method is processing");
    }
}
