package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class LocationTest {
    Settlement city = new Settlement();
    Settlement village1 = new Settlement();
    Settlement village2 = new Settlement();
    Settlement village3 = new Settlement();
    Settlement village4 = new Settlement();
    Waypoint warehouse = new Waypoint();

    @Test
    public void testEquals() {
        city.setId(37);

        village1.setId(52);
        village2.setId(38);
        village3.setId(37);
        village4.setId(52);

        warehouse.setId(38);

        city.setType(SettlementType.CITY);

        village1.setType(SettlementType.VILLAGE);
        village2.setType(SettlementType.VILLAGE);
        village3.setType(SettlementType.VILLAGE);

        warehouse.setType(WaypointType.WAREHOUSE);

        assertTrue(village1.equals(village4));
        assertTrue(village4.equals(village1));
        assertTrue(village2.equals(village2));
        assertTrue(city.equals(village3));

        assertFalse(warehouse.equals(village2));
        assertFalse(warehouse.equals(village1));
        assertFalse(village1.equals(village3));
        assertFalse(city.equals(null));

        city.setId(36);
        assertFalse(village3.equals(city));
    }
}

