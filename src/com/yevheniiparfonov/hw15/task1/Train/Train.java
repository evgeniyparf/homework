package com.yevheniiparfonov.hw15.task1.Train;

import java.util.ArrayList;

public class Train {
    private BaseCarriage baseCarriage;
    private ArrayList<Carriage> carriages = new ArrayList<>();
    private String locationA;
    private String locationB;

    public Train(String locationA, String locationB, BaseCarriage baseCarriage, ArrayList<Carriage> carriages){
        this.baseCarriage = baseCarriage;
        this.carriages = carriages;
        this.locationA = locationA;
        this.locationB = locationB;
    }

    public ArrayList<Carriage> getCarriages(){
        return carriages;
    }

    public void addCarriage(Carriage carriage){
        carriages.add(carriage);
    }

    public void setCarriages(ArrayList<Carriage> carriages){
        this.carriages = carriages;
    }

    public BaseCarriage getBaseCarriage(){
        return baseCarriage;
    }

    public void setBaseCarriage(BaseCarriage baseCarriage){
        this.baseCarriage = baseCarriage;
    }

    public String getLocationA() {
        return locationA;
    }

    public void setLocationA(String locationA) {
        this.locationA = locationA;
    }

    public String getLocationB() {
        return locationB;
    }

    public void setLocationB(String locationB) {
        this.locationB = locationB;
    }

    @Override
    public String toString() {
        String train = "Train goes from " + locationA + " to " + locationB + "\nTrain scheme\n";
        train += baseCarriage.toString();
        for(Carriage c : carriages){
            train += c.toString();
        }
        return train;
    }
}
