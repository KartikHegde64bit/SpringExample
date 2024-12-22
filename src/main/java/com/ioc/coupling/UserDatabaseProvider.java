package com.ioc.coupling;

public class UserDatabaseProvider implements UserDataProvider {
    //public String name = "";
    @Override
    public String getUserDetails(){
        // direct access to database will be done from here ! Handle with intellect
        return "User Details From Database";
    }

    public void putUserDetails(){
        // this is where we create and store user details
        //this.name = "Something";
    }
}
