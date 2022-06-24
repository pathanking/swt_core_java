package com.ncs;
@FunctionalInterface
public interface MyInterface {
    int square(Integer num);

    public default void doSomething(){
        System.out.println("doSomething from : "+getClass().getSimpleName());
    }

    public static void print(){
        System.out.println("print from MyInterface");
    }
}
