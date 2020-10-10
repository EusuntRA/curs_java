/**
 * ArrayMax.java
 * O aplicație care găsește numărul maxim/minim dintr-un array de int-uri. Array-ul trebuie inițializat de la tastatură.
 */

package com.step;

import java.util.Scanner;

public class ArrayMax {

    public static void main(String args[]) {
        int unArray[] = new int[3];
        Scanner elemente = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului");
        for (int i = 0; i < unArray.length; i++) {
            unArray[i] = elemente.nextInt();
        }

        int maxElement = unArray[0]; int minElement  = unArray[0];
        for(int i = 0; i < unArray.length; i++){
            if(unArray[i] > maxElement){
                maxElement = unArray[i];
            }
            if(unArray[i] < minElement){
                minElement = unArray[i];
            }
        }
        System.out.println("Elementul maxim: " + maxElement);

        System.out.println("Elementul minim: " + minElement);
    }
}
