package com.step.data;

public class Bus extends LongTripVehicle {
    public void run(){
        super.run();
        System.out.println("Bus merge");
    }
}
