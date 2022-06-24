package com.ncs.oop;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.setFirstName("James");
        user.setLastName("Bond");
        user.setEmail("james@email.com");
        user.setMobile(89897677);
        System.out.println(user); //guess the output

        User user1 = new User("roy", "fielding", "roy@email.com", 98776655);
        System.out.println(user1);

        User user2 = new User();
        user2.setFirstName("raza");
        user2.setEmail("raza@email.com");
        System.out.println(user2);
    }
}
