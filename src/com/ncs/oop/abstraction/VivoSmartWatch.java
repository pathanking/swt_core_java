package com.ncs.oop.abstraction;

public class VivoSmartWatch extends SmartWatch {
    @Override
    public void showHealthDetails() {
        System.out.println("Showing Health Details From "+getClass().getSimpleName());
    }
}
