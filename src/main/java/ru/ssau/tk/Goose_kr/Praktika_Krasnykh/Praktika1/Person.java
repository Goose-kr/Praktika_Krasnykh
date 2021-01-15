package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import java.io.Serializable;


public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int passportId;
    Gender gender;
    public Person() {

    }

    public Person (Gender gender){
        this.gender = gender;
    }

    public Person(int passportId) {
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int passportId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

    public Person(String firstName, String lastName, int passportId, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.gender = gender;
    }

    void setGender(Gender gender) {
        this.gender = gender;
    }

    Gender getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName = firstName;
    }

    public String getLastName() {
        return lastName = lastName;
    }

    public int getPassportId() {
        return passportId = passportId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    @Override
    public String toString() {
        return firstName + (firstName.isEmpty() || lastName.isEmpty() ? " " : " ") + lastName;
    }

    static class People1 {
        public static void main(String[] args) {
            Person person1 = new Person();
            Person person2 = new Person();

            person1.setFirstName("Anatoly");
            person1.setLastName("Krasnykh");
            person1.setPassportId(4654834);
            person1.setGender(Gender.MALE);

            person2.setFirstName("Angelina");
            person2.setLastName("Izmailova");
            person2.setPassportId(6452315);
            person2.setGender(Gender.FEMALE);

            System.out.println(person1.getFirstName() + " " + person1.getLastName() + " " + "PassportId:" + person1.getPassportId() + " " + "Gender:" + person1.getGender());
            System.out.println(person2.getFirstName() + " " + person2.getLastName() + " " + "PassportId:" + person2.getPassportId() + " " + "Gender:" + person2.getGender());
            Person firstWomen = new Person();
            Person secondWomen = new Person("Josev", "Laur", 89792);
            Person firstMan = new Person("Max", "Ladygin");
            Person secondMan = new Person("Klim", "", 4546548);

            System.out.println("First women: unknown");
            System.out.println("First man:" + firstMan.getFirstName() + " " + firstMan.getLastName() + " " + "PassportId: unknow");
            System.out.println("Second man:" + secondMan.getFirstName() + " " + "Last name: unknow" + " " + "PassportId:" + secondMan.getPassportId());
            System.out.println("Second women:" + secondWomen.getFirstName() + " " + secondWomen.getLastName() + "" + "PassportId:" + secondWomen.getPassportId());

        }
    }

}
