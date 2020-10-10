/**
 * Calculator.java
 * Definiți în clasa respectivă metode supraîncărcate (int, double) pentru operația de adunare, scădere, înmulțire, împărțire
 */

package com.step;

import java.util.Scanner;
import com.step.AppCalculator;
public class AppCalculator {
    public static void main(String[] args){
        Scanner meniu = new Scanner(System.in);
        System.out.println("Alege operatia");
        System.out.println("1. adunarea");
        System.out.println("2. scaderea");
        System.out.println("3. inmultirea");
        System.out.println("4. impartirea");

        int operatia;
        do{
            operatia = meniu.nextInt();

            Scanner calculul = new Scanner(System.in);
            System.out.println("introduceti doua numere");
            double num1 = calculul.nextDouble();
            double num2 = calculul.nextDouble();
            switch(operatia){

                case 1:
                    Calculator calculeazaSum = new Calculator();
                    System.out.println(num1 + " + "+ num2 + " = " + Calculator.sum (num1,num2));
                    break;
                case 2:
                    Calculator calculeazaScad = new Calculator();
                    System.out.println(num1 + " + "+ num2 + " = " + Calculator.min (num1,num2));
                    break;
                case 3:
                    Calculator calculeazaMultip = new Calculator();
                    System.out.println(num1 + " + "+ num2 + " = " + Calculator.mult (num1,num2));
                    break;
                case 4:;
                    Calculator calculeazaDivid = new Calculator();
                    System.out.println(num1 + " + "+ num2 + " = " + Calculator.divid (num1,num2));
                    break;
                default:
                System.out.println("ati ales operatiune gresita");
            }
        } while(true);

    }
}
