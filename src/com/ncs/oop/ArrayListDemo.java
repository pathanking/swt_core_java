package com.ncs.oop;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("hellow");
        arrayList.add("hola");
        arrayList.add("helo");

        //System.out.println(arrayList);
        for (String string : arrayList) {
            System.out.println(string.toUpperCase());
        }
        System.out.println("Size : " + arrayList.size());

        System.out.println("Contains \"hello\" ? "+arrayList.contains("hello"));
        System.out.println("Contains \"hurray\" ? "+arrayList.contains("hurray"));
        System.out.println("Element at first position : "+arrayList.get(0));
        System.out.println("Is this arrayList Empty ? "+arrayList.isEmpty());
        System.out.println(arrayList.removeIf(element -> element.length() >= 5));
        for (String string : arrayList) {
            System.out.println(string.toUpperCase());
        }
    }
}
