package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person firstObj = new Person();
    Person secondObj = new Person("Tomas", "Ignatenko");
    Person thirdObj = new Person(null, null, 123456);
    Person fourthObj = new Person(123456);
    Person fifthObj = new Person(null, null, 123456, Gender.MALE);
    Person sixthObj = new Person(Gender.FEMALE);

    @Test
    public void testFirstNameMethods() {
        secondObj.setFirstName(null);
        thirdObj.setFirstName("Anna");
        sixthObj.setFirstName("Angelina");

        assertNull(secondObj.getFirstName());
        assertEquals(thirdObj.getFirstName(), "Anna");
        assertNull(fourthObj.getFirstName());
        assertNull(fifthObj.getFirstName());
        assertEquals(sixthObj.getFirstName(), "Angelina");
    }

    @Test
    public void testLastNameMethods() {
        thirdObj.setLastName("Zubenco");
        fourthObj.setLastName(null);
        sixthObj.setLastName("Izmailova");

        assertNull(firstObj.getLastName());
        assertEquals(secondObj.getLastName(), "Ignatenko");
        assertEquals(thirdObj.getLastName(), "Zubenco");
        assertNull(fourthObj.getLastName());
        assertEquals(sixthObj.getLastName(), "Izmailova");
    }

    @Test
    public void testPassportIDMethods() {
        secondObj.setPassportId(742782);
        fourthObj.setPassportId(697583);

        assertEquals(firstObj.getPassportId(), 0);
        assertEquals(secondObj.getPassportId(), 742782);
        assertEquals(thirdObj.getPassportId(), 123456);
        assertEquals(fourthObj.getPassportId(), 697583);
    }

    @Test
    public void testSetGetGender() {
        firstObj.setGender(Gender.MALE);
        secondObj.setGender(Gender.FEMALE);
        thirdObj.setGender(Gender.FEMALE);

        assertEquals(firstObj.getGender(), Gender.MALE);
        assertEquals(secondObj.getGender(), Gender.FEMALE);
        assertEquals(sixthObj.getGender(), Gender.FEMALE);
        assertNull(fourthObj.getGender());
        assertEquals(thirdObj.getGender(), Gender.FEMALE);
    }

}