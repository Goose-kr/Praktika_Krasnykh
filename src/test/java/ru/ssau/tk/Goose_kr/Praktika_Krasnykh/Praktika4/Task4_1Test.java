package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika4;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task4_1Test {
    @Test
    public void testGetObjectPerson() {
        Person p1 = new Person("Tom", "Soier");
        assertEquals(Task4_1.getObjectPerson(p1), "Tom Soier");
        Person p2 = new Person(null, null);
        // assertNull(Task4_1.getObjectPerson(p2)); выводит: java.lang.NullPointerException
        Assert.assertThrows(NullPointerException.class, () -> Task4_1.getObjectPerson(p2));
    }

}