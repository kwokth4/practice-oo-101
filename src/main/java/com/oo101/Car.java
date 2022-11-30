package com.oo101;

public class Car {
    private final String name;
    private final Integer speed;

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void speedUp(){
        System.out.println(name+": speed up "+speed+" km/h");
    }

    public static void main(String[] args) {
        Car coolCar = new Car("Cool Car",30);
        coolCar.speedUp();
    }
}
