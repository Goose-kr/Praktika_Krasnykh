package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Gender;

import java.util.*;

import static org.testng.Assert.*;

public class CompanyModelTest {
    CompanyModel companyModelOne = new CompanyModel();

    Settlement village1 = new Settlement();
    Settlement city1 = new Settlement();
    Waypoint village1Warehouse = new Waypoint();
    Waypoint village1Waypoint = new Waypoint();
    Waypoint city1Depot = new Waypoint();
    Waypoint city1Warehouse = new Waypoint();
    Waypoint loneDepot = new Waypoint();
    Driver driver1 = new Driver();
    Driver driver2 = new Driver();
    Driver driver3 = new Driver();
    Route route1 = new Route();
    Route route2 = new Route();
    Route route3 = new Route();

    private void fillModels(){
        village1 = companyModelOne.addSettlement("Sukhodol", 20.36, 45.12, SettlementType.VILLAGE, 1200);

        city1 = companyModelOne.addSettlement("Samara", 20.47, 46.01, SettlementType.CITY, 1250000);
        village1Warehouse = companyModelOne.addWaypoint("Sukhodol.Warehouse", 20.36, 45.12, WaypointType.WAREHOUSE, village1);
        village1Waypoint = companyModelOne.addWaypoint("Sukhodol.Waypoint", 20.36, 45.12, WaypointType.EMPTY, village1 );
        city1Depot = companyModelOne.addWaypoint("Samara.Depot", 20.47, 46.01, WaypointType.DEPOT, city1);
        loneDepot = companyModelOne.addWaypoint("lone Depot", 20.54, 45.85, WaypointType.DEPOT, null);
        city1Warehouse = companyModelOne.addWaypoint("Samara.Warehouse", 21.87, 45.84, WaypointType.WAREHOUSE, city1);
        driver1 = companyModelOne.addDriver("Anatoly", Gender.MALE, new Date(121, Calendar.APRIL, 21));
        driver2 = companyModelOne.addDriver("Alice", Gender.FEMALE, new Date(127, Calendar.DECEMBER, 5));
        driver3 = companyModelOne.addDriver("Angelina", Gender.FEMALE, new Date(135, Calendar.AUGUST, 16));
        route1 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, village1Waypoint, village1Warehouse, city1Warehouse, loneDepot)));
        route2 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(city1Depot, city1, city1Warehouse, loneDepot)));
        route3 = companyModelOne.addRoute(new ArrayList<>(Arrays.asList(loneDepot, village1Waypoint, village1Warehouse, city1, city1Depot)));
        companyModelOne.assignRoute(driver1, route1);
        companyModelOne.assignRoute(driver2, route2);
        companyModelOne.assignRoute(driver3, route3);


    }





        @Test
        public void testGetAllLocations() {
            Collection<Location> allLocations = new LinkedHashSet<>();
            Location location1 = new Location();
            Location location2 = new Location();
            Location location3 = new Location();

            location1.setId(1);
            location2.setId(2);
            location3.setId(1);

            location1.setName("First");
            location2.setName("Second");
            location3.setName("First");

            location1.setLatitude(45.15);
            location2.setLatitude(79.40);
            location3.setLatitude(45.15);

            location1.setLongitude(87.46);
            location2.setLongitude(9.78);
            location3.setLongitude(87.46);

            allLocations.add(location1);
            allLocations.add(location2);
            allLocations.add(location3);

            assertEquals(allLocations.size(), 2);
        }

        @Test
        public void testGetAllRoutes() {
            Collection<Route> allRoutes = new LinkedHashSet<>();
            Route route1 = new Route();
            Route route2 = new Route();
            Route route3 = new Route();
            Route route4 = new Route();
            Location location1 = new Location();
            Location location2 = new Location();
            Location location3 = new Location();

            location1.setId(1);
            location2.setId(2);
            location3.setId(3);

            location1.setName("First");
            location2.setName("Second");
            location3.setName("Third");

            location1.setLatitude(45.15);
            location2.setLatitude(79.40);
            location3.setLatitude(86.41);

            location1.setLongitude(87.46);
            location2.setLongitude(9.78);
            location3.setLongitude(9.41);

            route1.addLocation(location1);
            route1.addLocation(location2);

            route2.addLocation(location1);
            route2.addLocation(location3);

            route3.addLocation(location2);
            route3.addLocation(location3);

            route4.addLocation(location1);
            route4.addLocation(location3);

            allRoutes.add(route1);
            allRoutes.add(route2);
            allRoutes.add(route3);
            allRoutes.add(route4);

            assertEquals(allRoutes.size(), 3);
        }

        @Test
        public void testGetAllDrivers() {
            Collection<Driver> allDrivers = new LinkedHashSet<>();
            Driver driver1 = new Driver();
            Driver driver2 = new Driver();
            Driver driver3 = new Driver();

            driver1.setId(1);
            driver2.setId(2);
            driver3.setId(1);

            driver1.setName("First");
            driver2.setName("Second");
            driver3.setName("First");

            driver1.setGender(Gender.MALE);
            driver2.setGender(Gender.FEMALE);
            driver3.setGender(Gender.MALE);

            driver1.setLicenseExpirationDate(new Date(121, Calendar.JANUARY, 15));
            driver2.setLicenseExpirationDate(new Date(124, Calendar.SEPTEMBER, 16));
            driver3.setLicenseExpirationDate(new Date(121, Calendar.JANUARY, 15));

            allDrivers.add(driver1);
            allDrivers.add(driver2);
            allDrivers.add(driver3);

            assertEquals(allDrivers.size(), 2);
        }

    @Test
    public void testAssignRoute() {
        fillModels();
        Map<Driver, Route> mapOne = companyModelOne.getDriverRouteMap();

        assertEquals(mapOne.size(), 3);

        assertEquals(mapOne.get(driver1), route1);
        assertEquals(mapOne.get(driver2), route2);
        assertEquals(mapOne.get(driver3), route3);
    }
}
