package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

public class PersonInstance {
        public static void main(String[] args) {
            Person firstPerson = new Person();
            Person secondPerson = new Person();

            firstPerson.setFirstName("Anatoly");
            firstPerson.setLastName("Krasnykh");
            firstPerson.setPassportId(378183);

            secondPerson.setFirstName("Angelina");
            secondPerson.setLastName("Izmailova");
            secondPerson.setPassportId(381873);

            System.out.println(firstPerson.getLastName() + ' ' + firstPerson.getFirstName() + "; passport: " + firstPerson.getPassportId());
            System.out.println(secondPerson.getLastName() + ' ' + secondPerson.getFirstName() + "; passport: " + secondPerson.getPassportId());
        }

}
