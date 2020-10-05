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

import com.step.ex4.comparator.NumbersComparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner compar = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        int numb1 = compar.nextInt();
        System.out.println("Introdu al doilea numar: ");
        int numb2 = compar.nextInt();

        System.out.println("Maximul: "+NumbersComparator.maxim(numb1,numb2));
        System.out.println("Minimul: "+NumbersComparator.minim(numb1,numb2));
    }
}