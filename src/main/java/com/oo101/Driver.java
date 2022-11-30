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
        Driver driver1 = new Driver(new Car("Gasoline Car", new Gasoline().getSpeed()));
        driver1.speedup();
        Driver driver2 = new Driver(new Car("Electric Car", new Electric().getSpeed()));
        driver2.speedup();

        Driver driver3 = new Driver(new Truck("Big Truck", 10));
        driver3.speedup();
    }
}
