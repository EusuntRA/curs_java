/**        Exercițiu practic #4
 *  De adăugat clasa:
 *  com.step.comparator.NumbersComparator
 *
 *  În clasa NumbersComparator, adăugați 2 metode, capabile să determine
 *  maximul
 *   minimul
 *  dintre 2 numere. Numerele cu care trebuie de operat trebuie introduse de la tastatură.
 *  Operațiile de introducere de la tastatură trebuie să fie executate în App.
 */



package com.step.ex4.application;

import java.util.Scanner;
import com.step.ex4.comparator.NumbersComparator;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Introdu a: ");
        int numb1 = sc.nextInt();
        System.out.println("Introdu b: ");
        int numb2 = sc.nextInt();

        NumbersComparator NC = new NumbersComparator();
        System.out.println("MAximul: "+NC.maxim(numb1,numb2));
        System.out.println("Minimul: "+NC.minim(numb1,numb2));
    }
}