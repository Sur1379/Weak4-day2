package com.company.Weak4Day2;

public class Person {
    private String firstName;
    private String lastName;
    private String sex;
    private String nationality;
    private String passportId;
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, String sex, String nationality, String passportId, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.nationality = nationality;
        this.passportId = passportId;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() < 15) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid Firstname");
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 5 && lastName.length() < 20) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid lastname");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex == "Male" || sex == "Female") {
            this.sex = sex;
        } else {
            System.out.println("Invalid sex");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        if ( passportId.charAt(0) == 'A' &&  passportId.charAt(1) == 'N' && passportId.length() == 8) {
            for (int i = 2; i < passportId.length(); i++) {
               if (passportId.charAt(i) <= '9' && passportId.charAt(i) >= '0'){
                   if(i == passportId.length() - 1){
                       this.passportId = passportId;
                   }
               }
               else {
                   System.out.println("Invalid Passport ID");
                   break;
               }
            }

        } else {
            System.out.println("Invalid Passport ID");
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 5 && age < 20) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }

    void display() {
        System.out.println("Firstname - " + getFirstName() + "\nLastname - " + getLastName()
                + "\nSex - " + getSex() + "\nNationality - " + getNationality() +
                "\nPasspot ID - " + getPassportId() + "\nAge - " + getAge());
    }

}
