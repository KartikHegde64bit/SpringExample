package com.loose.coupling;

public class LooseCouplingExample {
    // Why below is an example of loose coupling
    // when requirement changes ( for example MySql to MongoDB ) would not require changes in UserManager as well as
    // UserDatabase class simply we can create new class which implements the UserDataProvider interfac

    public static void main(String[] args){

        UserDataProvider userDataProvider = new UserDatabaseProvider(); // Before spring bean

        UserManager userManager = new UserManager(userDataProvider);
        System.out.println(userManager.getUserInfo());

        UserDataProvider webDataProvider = new WebDataProvider();
        UserManager webDataManager = new UserManager(webDataProvider);
        System.out.println(webDataManager.getUserInfo());
    }
}
