package com.ncs.oop;

public class Employee extends Object {
    String name;
    String email;
    double salary;

    public Employee() {
    }

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Salary: "+salary);
    }
}