package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import org.testng.annotations.Test;
import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika1.Gender;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashSet;

import static org.testng.Assert.*;

public class CompanyModelTest {


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
}
