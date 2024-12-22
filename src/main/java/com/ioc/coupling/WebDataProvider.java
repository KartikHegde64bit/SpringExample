package com.ioc.coupling;

public class WebDataProvider implements UserDataProvider {
    public String getUserDetails(){
        return "Fetching Now From Web";
    }

    public void putUserDetails(){
        // make post call maybe!
    }
}
