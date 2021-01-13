package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5_3;

import ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Practika5_1.Location;

import java.util.ArrayList;
import java.util.Iterator;

public class Route implements Iterable<Location>{
    private ArrayList<Location> locations=new ArrayList<>();

    public ArrayList<Location> getLocation() {
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
        return locations.iterator();
    }
}
