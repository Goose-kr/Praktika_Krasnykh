package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTest {
    Person firstObj = new Person();
    Person secondObj = new Person("Tomas", "Ignatenko");
    Person thirdObj = new Person(null, null, 123456);
    Person fourthObj = new Person(123456);

    @Test
    public void testFirstNameMethods() {
        secondObj.setFirstName(null);
        thirdObj.setFirstName("Anna");
        assertNull(secondObj.getFirstName());
        assertEquals(thirdObj.getFirstName(), "Anna");
        assertNull(fourthObj.getFirstName());
    }

    @Test
    public void testLastNameMethods() {
        thirdObj.setLastName("Zubenco");
        fourthObj.setLastName(null);

        assertNull(firstObj.getLastName());
        assertEquals(secondObj.getLastName(), "Ignatenko");
        assertEquals(thirdObj.getLastName(), "Zubenco");
        assertNull(fourthObj.getLastName());
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


}