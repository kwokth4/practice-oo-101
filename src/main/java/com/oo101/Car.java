package com.oo101;

import java.util.Vector;

public class Car extends Vehicles {
    public Car(String name, Engine engine){
        super(name, engine.getSpeed());
    }
}
