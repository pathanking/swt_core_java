package com.ncs.oop.abstraction;

public class SamsungPhone extends SmartPhone {
    @Override
    public void instantMessaging() {
        System.out.println("instant messaging from "+getClass().getSimpleName());
    }
}
