/**
 * ArrayMax.java
 * O aplicație care găsește numărul maxim/minim dintr-un array de int-uri. Array-ul trebuie inițializat de la tastatură.
 */

package com.step;

import java.util.Scanner;

public class ArrayMax {

    public static void main(String args[]){
        int unArray[] = new int[5];
        Scanner elemente = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului");
        for(int i=0; i<unArray.length; i++ ) {
            unArray[i] = elemente.nextInt();
        }

}
