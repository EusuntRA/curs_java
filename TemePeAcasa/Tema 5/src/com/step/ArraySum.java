/**
 * ArraySum.java
 * O aplicație care calculează suma elementelor dintr-un array de numere întregi. Array-ul trebuie inițializat de la tastatură.
 */

package com.step;

import java.util.Scanner;
public class ArraySum
{
    public static void main(String[] args)
    {
        int unArray[] = new int[5];
        int sum = 0;
        Scanner elemente = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului");
        for(int i = 0; i < unArray.length; i++) {
            unArray[i] = elemente.nextInt();
            sum = sum + unArray[i];
        }
        System.out.println("Suma elementelor este " + sum);
    }
}