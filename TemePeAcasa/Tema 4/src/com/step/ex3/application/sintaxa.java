package com.step.ex3.application;

public final class Person {   // final langa o clasa. ea nu poate fi mostenita


    public class Person {
        static {
            // Code that initializes static attributes
        }

        // Rest of the class
    }




    final String name; //final pe lânga variabile - acestea devin constante și nu pot fi modificate
    String surname;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, String surname){
        this.surname = surname;
    }

    public void  run (final int x){ //final pe lângă metoda
        int a = x;
        // x = 20;  asa e imposibil din cauza la final
    }
}
    public final void  run (final int x){
        int a = x;
    }


