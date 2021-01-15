package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint unnamedPoint = new NamedPoint(3., 4., 5.);
    NamedPoint namedPoint = new NamedPoint(3., 4., 7., "First");
    NamedPoint origin = new NamedPoint();

    @Test
    public void testGetName() {
        assertNull(unnamedPoint.getName());
        assertEquals(namedPoint.getName(), "First");
        assertEquals(origin.getName(), "Origin");
    }

    @Test
    public void testSetName() {
        unnamedPoint.setName("Second");
        namedPoint.setName("Third");
        origin.setName("First");
        assertEquals(unnamedPoint.getName(), "Second");
        assertEquals(namedPoint.getName(), "Third");
        assertEquals(origin.getName(), "First");
    }

    @Test
    public void testReset() {
        NamedPoint origin = new NamedPoint();
        origin.reset();
        assertEquals(origin.getName(), "Angazil");
    }
    @Test
    public void testToString() {
        assertEquals(new NamedPoint(1, 2, 3, "Point").toString(), "Point [1.0, 2.0, 3.0]");
        assertEquals(new NamedPoint(1, 2, 3).toString(), "[1.0, 2.0, 3.0]");
    }
}