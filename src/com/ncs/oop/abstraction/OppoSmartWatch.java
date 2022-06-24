package com.ncs.oop.abstraction;

public class OppoSmartWatch extends SmartWatch implements FiveGEnabler{
    @Override
    public void showHealthDetails() {
        System.out.println("Showing Health Details From "+getClass().getSimpleName());
    }

    @Override
    public void enable5G() {
        System.out.println("Enjoy 5G network services.....");
    }
}
