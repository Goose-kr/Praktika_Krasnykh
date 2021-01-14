package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5_3;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5.Practika5_1.Location;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5.Practika5_1.Settlement;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5.Praktika5_3.Route;

import static org.testng.Assert.*;
import static ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5.Practika5_1.SettlementType.CITY;

public class RouteTest {
    @Test
    public void testList() {
        Route route1 = new Route();
        Route route2 = new Route();
        Settlement settlement1 = new Settlement();
        settlement1.setType(CITY);
        settlement1.setSettlement(1000);
        route1.addLocation(settlement1);
        route2.addLocation(settlement1);
        assertEquals(route1, route2);
    }

    @Test
    public void testIterator() {
        Route route1 = new Route();
        Route route2 = new Route();
        Settlement settlement1 = new Settlement();
        settlement1.setType(CITY);
        settlement1.setSettlement(1000);
        route1.addLocation(settlement1);
        Settlement settlement2 = new Settlement();
        settlement1.setType(Location.SettlementType.VILLAGE);
        settlement1.setSettlement(1000);
        route1.addLocation(settlement2);
        Settlement settlement3 = new Settlement();
        settlement1.setType(Location.SettlementType.VILLAGE);
        settlement1.setSettlement(1500);
        route1.addLocation(settlement3);
        int i = 0;
        for (Location l : route1.getLocation()) {
            assertEquals(l, route1.getLocation().get(i++));
        }
        assertEquals(i, route1.getLocation().size());
    }


}