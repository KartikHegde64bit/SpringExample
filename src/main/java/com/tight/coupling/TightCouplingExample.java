package com.tight.coupling;

public class TightCouplingExample {
    // Why below is an example of tight coupling
    // when requirement changes ( for example MySql to MongoDB ) would require changes in UserManager as well as
    // UserDatabase class
    public static void main(String[] args){
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
