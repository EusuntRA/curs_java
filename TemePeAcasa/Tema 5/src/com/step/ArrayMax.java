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
        // Calling getMax() method for getting max value
        int max = getMax(unArray);
        System.out.println("Maximum Value is: "+max);

        // Calling getMin() method for getting min value
        int min = getMin(unArray);
        System.out.println("Minimum Value is: "+min);
    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    // Method for getting the minimum value
    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
