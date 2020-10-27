package com.linella.model;

public class Produs {
    private String name;
    private static Produs produsInstance;

    public static Produs getInstance(String name){ //daca metoda este statica, ea trebuiesa aibaacces doar la atribute statice
        if(produsInstance == null){
            produsInstance = new Produs(name);
        }
        return produsInstance;
    }

    private Produs(String name) {  //Singleton
        this.name = name;
    }

    public void setName  (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
}
