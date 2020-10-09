/**
 * FindInt.java
 * O aplicație care inițializează de la tastatură un array de char-uri (10). Apoi îl parcurge și pentru fiecare afișează dacă e vocală sau consoană.
 */

package com.step;

import java.util.Scanner;

public class FindInt {
    public static void main(String[] args) {
        String unArray[] = new String[3];
        Scanner elemente = new Scanner(System.in);
        System.out.println("Introdu elementele array-ului");
        for(int i = 0; i < unArray.length; i++) {
           unArray[i] = elemente.nextLine();
        }
        for (int i = 0; i < unArray.length; i++) {
            if(unArray[i].equals("a") || unArray[i].equals("e") || unArray[i].equals("i") || unArray[i].equals("o") || unArray[i].equals("u"))
            {System.out.println("litera " + unArray[i] + " - vocala");}
            else
                {System.out.println("litera " + unArray[i] + " - consoana");}

        }
    }
}

