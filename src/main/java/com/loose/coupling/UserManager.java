package com.loose.coupling;


public class UserManager {

    private UserDataProvider userDataProvider = null;

//    public UserManager(context.getBean("userDataProvider")){
//        this.userDataProvider = userDataProvider;
//    }
    public UserManager(UserDataProvider userDataProvider){
        this.userDataProvider = userDataProvider;
    }
    public String getUserInfo(){
        return userDataProvider.getUserDetails();
    }

    public void testUserDatabaseInstance(){
        //userDatabaseProvider.name = "Something";
    }
}
