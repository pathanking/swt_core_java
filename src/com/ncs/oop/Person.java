package com.ncs.oop;

public class Person {
    private String name;
    private String city;
    private static final String country = "Philippines";

    final double PI = 3.14;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void showDetails(){
        System.out.println("Name : "+ name);
        System.out.println("City : "+ city);
        System.out.println("Country : "+ country);
    }

    public static void print(){
        System.out.println("Country : "+country);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}