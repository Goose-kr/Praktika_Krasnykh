package ru.ssau.tk.Goose_kr.Praktika_Krasnykh.Praktika5;

public class Settlement extends Location {
    private int settlement;
    private SettlementType type;

    public int getSettlement() {
        return settlement;
    }

    public SettlementType getType() {
        return type;
    }

    public void setType(SettlementType type) {
        this.type = type;
    }

    public void setSettlement(int settlement) {
        this.settlement = settlement;
    }

    @Override
    public String toString() {
        return "Settlement: Type: " + type  + "; Name: " + getName() + "; Latitude: " + getLatitude() + "; Longitude: " + getLongitude() + ".";
    }
}

