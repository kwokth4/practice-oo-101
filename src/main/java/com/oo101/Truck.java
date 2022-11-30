package com.oo101;

public class Truck extends Vehicles{
    public Truck(String name, int speed){
        super(name, speed);
    }

    public static void main(String[] args) {
        Truck bigTruck = new Truck("Big Truck",10);
        bigTruck.speedUp();
    }
}
