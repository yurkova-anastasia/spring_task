package com.ya.spring3;

import com.ya.spring3.bean.Animal;
import com.ya.spring3.bean.impl.Snake;
import com.ya.spring3.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;


public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.ya.spring3");
        context.getBean(Animal.class).printMessage();


    }
}