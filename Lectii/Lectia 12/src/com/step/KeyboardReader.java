package com.step;

import java.util.Scanner;
import java.util.InputMismatchException;

public class KeyboardReader {
    // introdu un numar, până nu introduce numărul corect.
    Scanner unScaner = new Scanner (System.in);

    public void enterNumberUnitValid(){
        boolean isValid = false;
        do {
            try {
                int x = enterNumber();
                isValid = true;
            }
            catch (NumberNotValidException e){
                System.out.println(e.getMessage());
                System.out.println("Introdu din nou");
            }
        } while(!isValid);
        System.out.println("Malaghet!!!");
    }

    public int enterNumber() throws NumberNotValidException{
        System.out.println("Introdu numarul");
        int unNumar;
        try{
            unNumar = unScaner.nextInt();
            return unNumar;
        }
        catch(InputMismatchException e){
            unScaner.nextLine();
            System.out.println("Ati  introdus o litera, introduceti o cifra sau numar.");
            throw new NumberNotValidException();
        }
    }
}
