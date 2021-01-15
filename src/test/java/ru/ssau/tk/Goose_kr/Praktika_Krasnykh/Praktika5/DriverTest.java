package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Gender;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Person;

import java.util.Calendar;
import java.util.Date;

import static org.testng.Assert.*;

public class DriverTest {
    Driver firstDriver = new Driver();
    Driver secondDriver = new Driver();
    Driver thirdDriver = new Driver();

    @Test
    public void testTestEquals() {
        firstDriver.setId(1);
        firstDriver.setName("Anatoly");
        firstDriver.setGender(Gender.MALE);
        firstDriver.setLicenseExpirationDate(new Date(1122, Calendar.MARCH, 10));

        secondDriver.setId(2);
        secondDriver.setName("Alexsei");
        secondDriver.setGender(Gender.MALE);
        secondDriver.setLicenseExpirationDate(new Date(120, Calendar.AUGUST, 20));

        thirdDriver.setId(2);
        thirdDriver.setName("Alexsei");
        thirdDriver.setGender(Gender.MALE);
        thirdDriver.setLicenseExpirationDate(new Date(136, Calendar.MARCH, 9));

        assertFalse(firstDriver.equals(thirdDriver));

        thirdDriver.setId(1);

        assertTrue(firstDriver.equals(thirdDriver));
        assertTrue(thirdDriver.equals(firstDriver));
        assertTrue(secondDriver.equals(secondDriver));
        assertFalse(firstDriver.equals(secondDriver));
        assertFalse(thirdDriver.equals(new Person()));
        assertFalse(secondDriver.equals(null));
    }

    @Test

    public void testTestToString() {
        firstDriver.setId(1);
        firstDriver.setName("Anatoly");
        firstDriver.setGender(Gender.MALE);

        firstDriver.setLicenseExpirationDate(new Date(1122, Calendar.MARCH, 23));

        secondDriver.setId(2);
        secondDriver.setName("Alexsei");
        secondDriver.setGender(Gender.MALE);
        secondDriver.setLicenseExpirationDate(new Date(1212, Calendar.AUGUST, 12));

        assertEquals(firstDriver.toString(), "Driver: ID: 1; Name: Anatoly; Gender: MALE; LicenseExpirationDate: Sat Mar 23 00:00:00 GST 3022.");
        assertEquals(secondDriver.toString(), "Driver: ID: 2; Name: Alexsei; Gender: MALE; LicenseExpirationDate: Mon Aug 12 00:00:00 GST 3112.");
    }
}