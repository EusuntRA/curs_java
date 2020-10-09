/**
 * Exercițiu practic #3
 * De adăugat clasa:
 * com.step.calculator.Calculator
 *
 * În clasa Calculator, adăugați 4 metode, capabile să:
 * adune
 * scadă
 * înmulțească
 * împartă
 * două numere. 
 * În App trebuie introduse Numerele cu care trebuie de operat de la tastatură, apoi de chemat metodele de calcul din clasa Calculator.
 */
package com.step.ex3.application;
import  com.step.ex3.calculator.Calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("introdu primul numar");
        double numb1 = num1.nextDouble();

        Scanner num2 = new Scanner(System.in);
        System.out.println("introdu primul numar");
        double numb2 = num2.nextDouble();

        System.out.println(numb1 + " + "+ numb2 + " = " + Calculator.suma(numb1,numb2));
        System.out.println(numb1 + " - "+ numb2 + " = " + Calculator.scad(numb1,numb2));
        System.out.println(numb1 + " * "+ numb2 + " = " + Calculator.multiple(numb1,numb2));
        System.out.println(numb1 + " / "+ numb2 + " = " + Calculator.divide(numb1,numb2));
    }

}