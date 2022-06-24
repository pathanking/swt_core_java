package com.ncs.oop.abstraction;

public class IPhone extends SmartPhone implements FiveGEnabler{
    @Override
    public void instantMessaging() {
        System.out.println("instant messaging from "+getClass().getSimpleName());
    }

    @Override
    public void enable5G() {
        System.out.println("Enjoy 5G network services.....");
    }
}
