package com.ncs.oop.abstraction;

public class TestSmartPhone {
    public static void main(String[] args) {
        IPhone smartPhone = new IPhone();
        smartPhone.instantMessaging();
        smartPhone.enable5G();
    }
}
