package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5_4;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LocationTest {
    @Test
    public void testEquals() {
        Location location1 = new Location();
        Location location2 = new Location();
        location1.setId(1);
        location2.setId(2);
        Location location3 = location1;
        assertNotEquals(location2, location1);
        assertEquals(location1, location3);
    }
}