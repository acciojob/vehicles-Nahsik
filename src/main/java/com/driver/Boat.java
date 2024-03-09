package com.driver;

public class Boat extends Vehicle {

    private int capacity;

    public Boat(String name) {
        super(name);
    }

    public int getVehicleCapacity(){
        return this.capacity;
    }
}   
