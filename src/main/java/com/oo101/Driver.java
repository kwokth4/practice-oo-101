package com.oo101;

public class Driver {
    private final Vehicles vehicle;
    public Driver(Vehicles vehicle){
        this.vehicle = vehicle;
    }
    public void speedup(){
        vehicle.speedUp();
    }

    public static void main(String[] args) {
        Driver driver1 = new Driver(new Car("Cool Car", 30));
        driver1.speedup();

        Driver driver2 = new Driver(new Car("Big Truck", 10));
        driver2.speedup();
    }
}
