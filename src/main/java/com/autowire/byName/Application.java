package com.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutowireContext.xml");
        Car defaultCar = (Car) context.getBean("defaultCar");
        defaultCar.displayCar();
    }
}
