package com.oo101;

import java.util.Vector;

public class Car extends Vehicles {

    public Car(String name, int speed){
        super(name, speed);
    }

    public static void main(String[] args) {
        Car coolCar = new Car("Cool Car",30);
        coolCar.speedUp();
    }
}
