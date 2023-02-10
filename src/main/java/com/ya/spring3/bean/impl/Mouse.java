package com.ya.spring3.bean.impl;

import com.ya.spring3.annotation.MyAnnotation;
import com.ya.spring3.annotation.Replace;
import com.ya.spring3.annotation.Transactional;
import com.ya.spring3.bean.Animal;
import org.springframework.stereotype.Component;

@Component
public class Mouse {
    private String color;

    public Mouse() {
    }

    @MyAnnotation
    public String getColor() {
        return color;
    }

    @MyAnnotation
    @Replace
    public void setColor(String color) {
        this.color = color;
    }

    @Transactional
    @Replace
    public void printMessage() {
        System.out.println("method is processing");
    }
}
