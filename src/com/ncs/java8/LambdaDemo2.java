package com.ncs.java8;

import com.ncs.MyInterface;

public class LambdaDemo2{
    public static void main(String[] args) {
        LambdaDemo2 lambdaDemo2 = new LambdaDemo2();
        //System.out.println(lambdaDemo2.square(13));

        MyInterface myInterface = (aNum) ->{
            return  aNum * aNum;
        };
        System.out.println(myInterface.square(14));

        myInterface.doSomething();
        MyInterface.print();
    }
}
