package com.step.auto;

public class Auto {
    public int doors;
    public String model;
    public double fuelQuantity;

    //constructor implicit arata asa ca o metoda
    // o metoda cu denumirea clasei fara date returnate

    public Auto(){
        System.out.println("Masina noua creata");
    }

    //[modificator de acces] [tipreturnat] [numemetoda] ([argumente daca sunt necesare])
    //{
    //[corpul metodei]
    //}
    public void start(){
        System.out.println("masina a pornit");
    }

    public void fillTank(double quantity){
        System.out.println(" kislota");
        fuelQuantity = quantity;
    }

    public void fillTank(String type, double quantity){
        System.out.println("filling tank with " + type);
        fuelQuantity += quantity;
    }
}


// youtube 1.47