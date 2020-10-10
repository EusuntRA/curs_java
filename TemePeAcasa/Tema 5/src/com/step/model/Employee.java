/**
 * De creat 2 clase
 * com.step.App.java
 * com.step.model.Employee.java
 * În Employee definiți următoarele câmpuri:
 * name
 * surname
 * birthdate
 * Adăugați în clasa Employee 3 constructori:
 * fără parametri
 * cu 2 parametri: name/surname
 * cu 3 parametri
 */

    package com.step.model;

public class Employee {
    public String name;
    public String surname;
    public String birthdate;

    public void Person() { }
    public String Person(String name, String surname)
    {
        System.out.println("ma numesc " + name + " " + surname);
    }
    public String Person(String name, String surname,String birthdate)
    {
        System.out.println("ma numesc " + name + " " + surname + " si m-am nascut pe " + birthdate);
    }
}
