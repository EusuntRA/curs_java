/**
 * FindInt.java
 * O aplicație care inițializează de la tastatură un array de char-uri (10). Apoi îl parcurge și pentru fiecare afișează dacă e vocală sau consoană.
 */

package com.step;

import java.util.Scanner;

public class FindInt {
    public static void main(String[] args) {
        char unArray[] = new char[3];
        Scanner elemente = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului");
        for(int i = 0; i < unArray.length; i++) {
           unArray[i] = elemente.nextLine().toCharArray();
        }
        for (int i = 0; i < unArray.length; i++) {
            if(unArray[i] == 'a' || unArray[i] == 'e' || unArray[i] == 'i' || unArray[i] == 'o' || unArray[i] == 'u' )
            {System.out.println("litera " + unArray[i] + " - vocala");}
            else
                {System.out.println("litera " + unArray[i] + " - consoana");}

        }
    }
}

