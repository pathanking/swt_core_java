package com.ncs.oop.abstraction;

public class OnePlusPhone extends SmartPhone {
    @Override
    public void instantMessaging() {
        System.out.println("instant messaging from "+getClass().getSimpleName());
    }
}
