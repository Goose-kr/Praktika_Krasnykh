package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import java.util.*;

public final class Route implements Iterable<Location>{
    private final List<Location> locations=new ArrayList<>();

    public List<Location> getLocation() {
        return locations;
    }

    public void addLocation(Location location){
        this.locations.add(location);
    }

    public void addIndexLocation(int index,Location location){
        this.locations.add(index,location);
    }

    public void deleteLocation(int index){
        this.locations.remove(index);
    }

    public Location getFirstLocation(){
        return locations.get(0);
    }

    public Location getLastLocation(){
        return locations.get(locations.size()-1);
    }

    @Override
    public Iterator<Location> iterator() {
        return new Iterator<>() {
            private Location location = getFirstLocation();
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < getLocation().size();
            }

            @Override
            public Location next() {
                if (!(hasNext())){
                    throw new NoSuchElementException();
                } else {
                    location = locations.get(count++);
                    return location;
                }
            }
        };
    }

    public void remove(Location location) {
        int index = 0;

        for (Location currentLocation : this.locations) {
            if (currentLocation.equals(location)) {
                deleteLocation(index);
                return;
            }

            index++;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Route route = (Route) object;
        List<Location> locationsInList = route.getLocation();

        if (locationsInList.size() != this.locations.size()) { return false; }

        for (int i = 0; i < locations.size(); i++) {
            if (!(locationsInList.get(i).equals(locations.get(i)))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(locations);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Location location : locations) {
            if (location.getClass() == Settlement.class) {
                Settlement settlement = (Settlement) location;
                stringBuilder.append(settlement.toString());
            }
            if (location.getClass() == Waypoint.class) {
                Waypoint waypoint = (Waypoint) location;
                stringBuilder.append(waypoint.toString());
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
