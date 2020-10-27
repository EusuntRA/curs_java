package com.step.calculator;

public class App {
    public static void main(String[] args){
        Algebra algebr =  new Algebra();
        double sum = algebr.sum(1.0, 2.5);
        System.out.println(sum);
        Geometria geom = new Geometria();
        double geosum = geom.sum(1.5, 4.5);
        System.out.println(geosum);
    }
}
