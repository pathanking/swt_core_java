package com.ncs.oop;

import java.util.Arrays;

public enum MyEnum {
    MON, TUE, WED, THU, FRI, SAT, SUN
}

class MyEnumTest {
    public static final void main(String[] args) {
        Arrays.stream(MyEnum.values()).forEach(System.out::println);

        MyEnum myEnum = MyEnum.MON;
        switch (myEnum){
            case MON:
                System.out.println("Monday!");
                break;
            case TUE:
                System.out.println("TUESDAY!");
                break;
            case WED:
                System.out.println("WEDNESDAY!");
                break;
            case THU:
                System.out.println("THURSDAY!");
                break;
            case FRI:
                System.out.println("FRIDAY!");
                break;
            case SAT:
                System.out.println("SATURDAY!");
                break;
            case SUN:
                System.out.println("SUNDAY!");
                break;
        }
    }
}
