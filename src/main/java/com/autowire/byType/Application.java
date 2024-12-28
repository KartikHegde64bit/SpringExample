package com.autowire.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutowireByTypeContext.xml");
        Car defaultCar = (Car) context.getBean("defaultCar");
        defaultCar.displayCar();
    }
}
