package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int passportId;

    public Person() {

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
            Person man = new Person();
            Person women = new Person();

            man.setFirstName("Anatoly");
            man.setLastName("Krasnykh");
            man.setPassportId(4654834);

            women.setFirstName("Angelina");
            women.setLastName("Izmailova");
            women.setPassportId(6452315);

            System.out.println(man.getFirstName() + " " + man.getLastName() + "PassportId" + man.getPassportId());
            System.out.println(women.getFirstName() + " " + women.getLastName() + "PassportId" + women.getPassportId());
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
