package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SettlementTest {

    @Test
    public void testToString() {
        Settlement city = new Settlement();
        Settlement village = new Settlement();

        city.setType(SettlementType.CITY);
        village.setType(SettlementType.VILLAGE);
        city.setName("Samara");
        village.setName("Sykhodol");
        city.setLatitude(43.43);
        village.setLatitude(29.69);
        city.setLongitude(74.09);
        village.setLongitude(49.95);

        assertEquals(city.toString(), "Settlement: Type: CITY; Name: Samara; Latitude: 43.43; Longitude: 74.09.");
        assertEquals(village.toString(), "Settlement: Type: VILLAGE; Name: Sykhodol; Latitude: 29.69; Longitude: 49.95.");
    }
}