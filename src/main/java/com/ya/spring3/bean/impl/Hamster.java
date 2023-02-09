package com.ya.spring3.bean.impl;

import com.ya.spring3.annotation.MyAnnotation;
import com.ya.spring3.annotation.Transactional;
import com.ya.spring3.bean.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Hamster{
    private String color;

    public Hamster() {

    }

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
        throw new RuntimeException("sosi");
    }
}
