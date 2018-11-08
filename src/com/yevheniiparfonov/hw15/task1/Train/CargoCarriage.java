package com.yevheniiparfonov.hw15.task1.Train;

public class CargoCarriage extends Carriage{
    public static final int MAX_CAPACITY = 100;
    private int capacity;

    public CargoCarriage(int capacity){
        this.capacity = capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity(){
        return capacity;
    }

    @Override
    public String toString() {
        return "=[:cargo:" + capacity + "%:]";
    }
}
