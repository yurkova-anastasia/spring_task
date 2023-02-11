package com.ya.spring3.bpp.bfpp;

import com.ya.spring3.annotation.Replace;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.type.MethodMetadata;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

@Component
public class ReplaceAnnotationBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanDefinitionName);
            String beanClassName = null;

            if (beanDefinition instanceof AnnotatedBeanDefinition) {
                MethodMetadata factoryMethodMetadata = ((AnnotatedBeanDefinition) beanDefinition).getFactoryMethodMetadata();
                if (factoryMethodMetadata != null) {
                    beanClassName = factoryMethodMetadata.getReturnTypeName();
                } else {
                    beanClassName = beanDefinition.getBeanClassName();
                }
            }

            try {
                if (beanClassName != null) {
                    Class<?> beanClass = Class.forName(beanClassName);
                    for (Method method : beanClass.getMethods()) {
                        Replace annotation = method.getAnnotation(Replace.class);
                        if (annotation != null) {
                            System.out.println("Class: " + beanClass.getSimpleName() + " has Replace annotation");
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
