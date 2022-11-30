package com.oo101;

public class Vehicles {
    private final String name;
    private final Integer speed;

    public Vehicles(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public void speedUp(){
        System.out.println(name+": speed up "+speed+" km/h");
    }
}
