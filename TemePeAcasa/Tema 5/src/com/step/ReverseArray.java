/**
 * ReverseArray.java
 * O aplicație care afișează elementele unui array cu numere întregi în ordine inversă. Array-ul trebuie inițializat de la tastatură.
 */

package com.step;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int unArray[] = new int[5];
        Scanner elemente = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului");
        for(int i = 0; i < unArray.length; i++) {
            unArray[i] = elemente.nextInt();
        }
        System.out.println("Ordine inversa");
        for (int i = unArray.length-1; i >= 0; i--) {
            System.out.print(unArray[i] + " ");
        }
    }
}