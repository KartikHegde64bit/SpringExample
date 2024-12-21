package com.tight.coupling;

public class UserDatabase {
    public String getUserDetails(){
        // direct access to database will be done from here ! Handle with intellect
        return "User Details From Database";
    }
}
