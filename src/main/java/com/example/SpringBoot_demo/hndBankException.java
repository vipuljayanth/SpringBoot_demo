package com.example.SpringBoot_demo;

public class hndBankException extends Exception {
    String message;

    public hndBankException(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
