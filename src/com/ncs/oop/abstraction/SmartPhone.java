package com.ncs.oop.abstraction;

public abstract class SmartPhone{

    public void makeACall(){
        System.out.println("dialling a number");
    }

    public void textMessage(){
        System.out.println("texting a message");
    }

    public abstract void instantMessaging();

}
