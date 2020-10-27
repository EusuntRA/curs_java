package com.step.data;

public class Car extends Vehicle {
    /* Caracteristicile din vehicle*/
    protected boolean isSport;

    public void accelerate(){
        System.out.println("Car accelereaza");
        this.run();
    }
}
