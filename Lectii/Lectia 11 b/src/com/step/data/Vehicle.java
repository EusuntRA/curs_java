package com.step.data;

public class Vehicle {
    protected String model;
    protected String number;
    protected String revisionDate;
    protected byte numberOfDoors;
    protected String color;

    public void run(){
        this.startEngine();
        this.switchGear(1);
        /*...*/
    }
    public void  startEngine(){
        System.out.println("Engine started...");
    }
    public void switchGear(int gear){
        System.out.println("Gear: " + gear);
    }
    public void stop(){
    }
}
