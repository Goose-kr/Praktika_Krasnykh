package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

public class Waypoint extends Location {
    private WaypointType type;
    private Settlement settlement;

    public Waypoint() {

    }

    public void setType(WaypointType type) {
        this.type = type;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public WaypointType getType() {
        return type;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    @Override
    public String toString() {
        return "Waypoint: Type: " + type  + "; Name: " + getName() + "; Latitude: " + getLatitude() + "; Longitude: " + getLongitude() + ".";
    }
}