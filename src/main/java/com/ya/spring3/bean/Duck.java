package com.ya.spring3.bean;

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
}
