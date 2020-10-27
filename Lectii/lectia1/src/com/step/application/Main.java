package com.step.application;

import com.step.auto.Auto;
//import com.step.application.test.Test;

import java.util.Random; //import pentru a declara un numar random

public class Main {

    public static void main(String[] args) {

        String unString;
        unString = "trali vali";
        unString = "trei sandale";
System.out.println(unString);

        // Test test = new Test();
        Auto aClass = new Auto();
        aClass.doors = 3;
        aClass.model ="A-Class";

        aClass.start();
        aClass.fillTank ( "A-95", 20);

        System.out.println(aClass.toString());

        Auto sClass = new Auto();
        sClass.doors = 4;
        sClass.model ="S-Class";

    }
}
