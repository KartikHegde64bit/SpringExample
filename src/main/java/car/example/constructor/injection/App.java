package car.example.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        // example of constructor injection
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationConstructorInjection.xml");
        Car myCar = (Car) context.getBean("myCar");
        myCar.displayDetails();
    }
}
