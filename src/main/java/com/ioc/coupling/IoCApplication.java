package com.ioc.coupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCApplication {
    // Why below is an example of loose coupling
    // when requirement changes ( for example MySql to MongoDB ) would not require changes in UserManager as well as
    // UserDatabase class simply we can create new class which implements the UserDataProvider interfac

    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationIoCCouplingConfig.xml");

        UserManager userDataManager = (UserManager) context.getBean("userManagerWithUDP");
        System.out.println(userDataManager.getUserInfo());

        UserManager webDataManager = (UserManager) context.getBean("userManagerWithWDP");
        System.out.println(webDataManager.getUserInfo());
    }
}
