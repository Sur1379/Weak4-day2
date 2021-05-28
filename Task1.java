package com.company.Weak4Day2;

public class Task1 {

    public static void main(String[] args) {
        Person person1 = new Person("Suren", "Badalyan", "Male", "Armenian", "457687186", 24);
        Person person2 = new Person();
        person2.setFirstName("Suren");
        System.out.println("Firstname - " + person2.getFirstName());
        person2.setPassportId("AN768718");
        System.out.println("Passpor ID - " + person2.getPassportId());
//        person2.display();

    }
}
