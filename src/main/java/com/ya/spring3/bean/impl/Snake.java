package com.ya.spring3.bean.impl;

import com.ya.spring3.annotation.Transactional;
import com.ya.spring3.bean.Animal;

public class Snake implements Animal{
    private String color;

    public Snake() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Transactional
    public void printMessage() {
        System.out.println("method is processing");
        throw new RuntimeException("sosi");
    }
}
