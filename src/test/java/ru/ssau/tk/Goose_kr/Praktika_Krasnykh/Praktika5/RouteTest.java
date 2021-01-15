package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class RouteTest {
    List<Location> locations = new ArrayList<>();
    Location location1 = new Location();
    Location location2 = new Location();
    Location location3 = new Location();
    Location location4 = new Location();
    Location location5 = new Location();

    @Test
    public void testAddAndGetLocation() {
        List<Location> locations1 = new ArrayList<>();
        Route route = new Route();
        assertEquals(route.getLocation(), Collections.EMPTY_LIST);
        route.addLocation(location1);
        locations1.add(location1);
        assertEquals(route.getLocation(), locations1);
        route.addLocation(location2);
        locations1.add(location2);
        assertEquals(route.getLocation(), locations1);
        route.addLocation(location3);
        locations1.add(location3);
        assertEquals(route.getLocation(), locations1);
    }

    @Test
    public void testAddIndexLocationAndGet() {
        List<Location> locations2 = new ArrayList<>();
        Route route = new Route();
        route.addIndexLocation(0, location3);
        locations2.add(location3);
        assertEquals(route.getLocation(), locations2);
        route.addIndexLocation(1, location2);
        locations2.add(location2);
        assertEquals(route.getLocation(), locations2);
        route.addIndexLocation(2, location1);
        locations2.add(location1);
        assertEquals(route.getLocation(), locations2);
    }

    @Test
    public void testDeleteLocation() {
        List<Location> locations3 = new ArrayList<>();
        Route route = new Route();
        route.addIndexLocation(0, location2);
        route.addIndexLocation(1, location3);
        route.addIndexLocation(2, location1);
        locations3.add(location2);
        locations3.add(location1);
        route.deleteLocation(1);
        assertEquals(route.getLocation(), locations3);
    }

    @Test
    public void testList() {
        Route route1 = new Route();
        Route route2 = new Route();
        Settlement settlement1 = new Settlement();
        settlement1.setType(SettlementType.CITY);
        settlement1.setSettlement(1000);
        route1.addLocation(settlement1);
        route2.addLocation(settlement1);
        assertEquals(route1, route2);
    }

    @Test
    public void testIterator() {
        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();
        Settlement settlement1 = new Settlement();
        settlement1.setType(SettlementType.CITY);
        settlement1.setSettlement(1000);
        route1.addLocation(settlement1);
        Settlement settlement2 = new Settlement();
        settlement2.setType(SettlementType.VILLAGE);
        settlement2.setSettlement(1000);
        route2.addLocation(settlement2);
        Settlement settlement3 = new Settlement();
        settlement3.setType(SettlementType.VILLAGE);
        settlement3.setSettlement(1500);
        route3.addLocation(settlement3);
        int i = 0;
        for (Location l : route1.getLocation()) {
            assertEquals(l, route1.getLocation().get(i++));
        }
        assertEquals(i, route1.getLocation().size());
    }

    @Test
    public void testRemove() {
        List<Location> locations4 = new ArrayList<>();
        Route route1 = new Route();

        route1.addIndexLocation(0, location2);
        route1.addIndexLocation(1, location3);
        route1.addIndexLocation(2, location1);

        locations4.add(location2);
        locations4.add(location1);

        route1.remove(location3);
        assertEquals(route1.getLocation(), locations4);

        List<Location> locations5 = new ArrayList<>();
        Route route2 = new Route();

        route2.addIndexLocation(0, location1);
        route2.addIndexLocation(1, location2);
        route2.addIndexLocation(2, location3);
        route2.addIndexLocation(3, location4);
        route2.addIndexLocation(4, location5);

        location1.setId(1);
        location2.setId(2);
        location3.setId(3);
        location4.setId(2);
        location5.setId(2);

        location2.setName("One");
        location4.setName("Two");
        location5.setName("One");

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location1, location3, location4, location5)));

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location1, location3, location4)));

        route2.remove(location5);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location1, location3)));

        route2.remove(location2);
        assertEquals(route2.getLocation(), new ArrayList<>(Arrays.asList(location1, location3)));
    }
}