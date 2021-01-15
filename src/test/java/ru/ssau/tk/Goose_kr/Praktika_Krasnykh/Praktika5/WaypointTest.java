package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaypointTest {

    @Test
    public void testToString() {
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();

        depot.setType(WaypointType.DEPOT);
        warehouse.setType(WaypointType.WAREHOUSE);
        depot.setName("Depo");
        warehouse.setName("Sklad");
        depot.setLatitude(56.45);
        warehouse.setLatitude(11.11);
        depot.setLongitude(33.44);
        warehouse.setLongitude(22.66);

        assertEquals(depot.toString(), "Waypoint: Type: DEPOT; Name: Depo; Latitude: 56.45; Longitude: 33.44.");
        assertEquals(warehouse.toString(), "Waypoint: Type: WAREHOUSE; Name: Sklad; Latitude: 11.11; Longitude: 22.66.");
    }
}