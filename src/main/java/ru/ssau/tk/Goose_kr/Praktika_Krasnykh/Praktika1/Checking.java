package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class Checking {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Anton");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Vitia");
        System.out.println(person.getFirstName());
    }
}
