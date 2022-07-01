package com.mediscreen.userModule.customExceptions;

public class UserNotFoundException extends Exception {

    public UserNotFoundException (String msg){
        super(msg);
    }
}
