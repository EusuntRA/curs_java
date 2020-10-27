/**
 * Parcul de automobile
 * Ce?: Autoturisme, Autobuze, Camioane
 * modelul, nr de inmatriculare, data reviziei tehnice, nr de usi, culoarea....
 * Ce trebuiede făcut?: Gestiunea (add, edit,delete, view)
 */
package com.step;

import  com.step.data.Car;
import  com.step.data.Bus;
import  com.step.data.Truck;

public class Main {

    public static void main(String[] args) {
        Car Dacia = new Car();
        Bus Scolar = new Bus();
        Truck Samocat = new Truck();
        Dacia.run();
        Scolar.run();
        Samocat.run();
    }
}
