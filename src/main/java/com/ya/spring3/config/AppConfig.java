package com.ya.spring3.config;

import com.ya.spring3.bean.Mouse;
import com.ya.spring3.bean.Parrot;
import com.ya.spring3.bean.Snake;
import com.ya.spring3.bpp.GetListOfAnnotatedMethodsBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:context.xml")
@ComponentScan("com.ya.spring3")
public class AppConfig {

    @Bean
    public Mouse mouse() {
        return new Mouse();
    }

    @Bean
    public Parrot parrot() {
        return new Parrot();
    }

    @Bean
    public Snake snake() {
        return new Snake();
    }

    @Bean
    public GetListOfAnnotatedMethodsBeanPostProcessor getListOfAnnotatedMethodsBeanPostProcessor() {
        return new GetListOfAnnotatedMethodsBeanPostProcessor();
    }

}
