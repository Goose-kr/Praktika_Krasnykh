package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5.Practika5_1;


public class Location {
    private int id;
    private String name;
    private double latitude;
    private double longitude;
    public Location(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public static class SettlementType{
        public static final SettlementType VILLAGE = new SettlementType();
    }

}