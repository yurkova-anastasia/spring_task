package com.ya.spring3.bean.impl;

import com.ya.spring3.bean.Animal;
import org.springframework.stereotype.Component;


@Component
public class Duck {
    private String color;

    public Duck() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printMessage() {

    }
}
