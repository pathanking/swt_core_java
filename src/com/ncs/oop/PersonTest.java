package com.ncs.oop;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ronald");
        person.setCity("Manila");

        Person person2 = new Person();
        person2.setName("Carl");
        person2.setCity("Quezon");

        System.out.println(person);
        System.out.println(person2);

        //person.showDetails();
        //person2.showDetails();

        //Person.print();

    }
}
