package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Point;

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

    @Test
    public void testEquals() {
        Route route1 = new Route();
        Route route2 = new Route();
        Route route3 = new Route();
        Route route4 = new Route();

        Location city1 = new Settlement();
        Location city2 = new Settlement();
        Location village1 = new Settlement();
        Location village2 = new Settlement();
        Location village3 = new Settlement();

        Location warehouse1 = new Waypoint();
        Location warehouse2 = new Waypoint();
        Location warehouse3 = new Waypoint();
        Location warehouse4 = new Waypoint();

        Point point = new Point(1,2,3);

        city1.setId(1);
        city2.setId(2);
        village1.setId(3);
        village2.setId(1);
        village3.setId(2);
        warehouse1.setId(4);
        warehouse2.setId(2);
        warehouse3.setId(3);
        warehouse4.setId(3);

        route1.addLocation(village2);
        route1.addLocation(city2);
        route1.addLocation(warehouse3);
        route1.addLocation(warehouse1);

        route2.addLocation(city1);
        route2.addLocation(village3);
        route2.addLocation(warehouse4);
        route2.addLocation(warehouse1);

        route3.addLocation(village2);
        route3.addLocation(warehouse1);
        route3.addLocation(warehouse2);
        route3.addLocation(warehouse3);

        route4.addLocation(village2);
        route4.addLocation(warehouse2);
        route4.addLocation(village2);

        assertTrue(route1.equals(route2));
        assertFalse(route1.equals(route3));
        assertFalse(route1.equals(route4));
        assertFalse(route1.equals(point));

        route3.addIndexLocation(1, village3);
        route3.remove(warehouse2);
        route3.remove(warehouse3);
        route3.addIndexLocation(2, warehouse4);
        assertTrue(route1.equals(route3));
    }
    @Test
    public void testToString() {
        Route route = new Route();

        Settlement city = new Settlement();
        Settlement village = new Settlement();
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();

        city.setType(SettlementType.CITY);
        village.setType(SettlementType.VILLAGE);
        depot.setType(WaypointType.DEPOT);
        warehouse.setType(WaypointType.WAREHOUSE);

        city.setName("Samara");
        village.setName("Sykhodol");
        depot.setName("Depo");
        warehouse.setName("Sklad");

        city.setLatitude(40.32);
        village.setLatitude(30.23);
        depot.setLatitude(32.48);
        warehouse.setLatitude(52.41);

        city.setLongitude(70.32);
        village.setLongitude(65.60);
        depot.setLongitude(53.46);
        warehouse.setLongitude(54.84);

        route.addLocation(city);
        route.addLocation(village);
        route.addLocation(depot);
        route.addLocation(warehouse);
        assertEquals(route.toString(), "Settlement: Type: CITY; Name: Samara; Latitude: 40.32; Longitude: 70.32.\n" +
                "Settlement: Type: VILLAGE; Name: Sykhodol; Latitude: 30.23; Longitude: 65.6.\n" +
                "Waypoint: Type: DEPOT; Name: Depo; Latitude: 32.48; Longitude: 53.46.\n" +
                "Waypoint: Type: WAREHOUSE; Name: Sklad; Latitude: 52.41; Longitude: 54.84.\n");
    }
    @Test
    public void testLength() {
        Settlement village = new Settlement();
        Settlement city = new Settlement();
        Waypoint depot = new Waypoint();
        Waypoint warehouse = new Waypoint();
        Route testRoute;
        testRoute = new Route();
        village.setLatitude(55.4);
        city.setLatitude(60.8);
        depot.setLatitude(75.2);
        warehouse.setLatitude(96.4);
        village.setLongitude(10.5);
        city.setLongitude(40.7);
        depot.setLongitude(12.6);
        warehouse.setLongitude(6.9);
        testRoute.addLocation(city);
        testRoute.addLocation(village);
        testRoute.addLocation(depot);
        testRoute.addLocation(warehouse);
        assertEquals(testRoute.length(), 72.5, 0.1);
        testRoute.addLocation(city);
        testRoute.deleteLocation(2);
        assertEquals(testRoute.length(), 120.9, 0.1);
    }
}