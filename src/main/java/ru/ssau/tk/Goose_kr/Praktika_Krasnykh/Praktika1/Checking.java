package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class Checking {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Anton");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson (Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}
