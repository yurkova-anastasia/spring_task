package com.ya.spring3.bpp;

import com.ya.spring3.annotation.MyAnnotation;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GetListOfAnnotatedMethodsBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Method[] methods = bean.getClass().getDeclaredMethods();
        int count = 0;
        List<String> annotatedMethods = new ArrayList<>();
        for (Method method : methods) {
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            if (annotation != null) {
                count++;
                annotatedMethods.add(method.getName());
            }
        }
        System.out.println(bean.getClass().getSimpleName());
        System.out.println("Кол-во аннотаций: " + count);
        System.out.println(annotatedMethods);

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
