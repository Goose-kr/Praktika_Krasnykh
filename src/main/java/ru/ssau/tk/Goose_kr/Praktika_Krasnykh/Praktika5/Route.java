package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class Route implements Iterable<Location>{
    private List<Location> locations=new ArrayList<>();

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
}
