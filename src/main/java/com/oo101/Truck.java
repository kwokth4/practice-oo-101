package com.oo101;

public class Truck {
    private final String name;
    private final Integer speed;

    public Truck(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void speedUp(){
        System.out.println(name+": speed up "+speed+" km/h");
    }

    public static void main(String[] args) {
        Truck bigTruck = new Truck("Big Truck",10);
        bigTruck.speedUp();
    }
}
