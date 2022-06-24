package com.ncs.oop;

public class Developer extends Employee {
    double bonus;

    public Developer() {
        super();
    }

    public Developer(String name, String email, double salary, double bonus) {
        super(name, email, salary);
        this.bonus = bonus;
    }

    public void printDeveloperDetails(){
        System.out.println("Name : "+name);
        System.out.println("Email : "+email);
        System.out.println("Salary: "+ (salary+bonus));
    }
}
