package com.step;

public class Main {

    public static void main(String[] args) {

        int [] unArray = new int[]{1,2,3,4,5};
        int x = 0;
        try{
            x = unArray[100];

        }
        catch(ArrayIndexOutOfBoundsException ex){
            x = 20;
            System.out.println("nu putem afisa studentul 101 din 5 existenti" + ex.getMessage());
        }
        finally {
             System.out.println("x: " + x);
        }
    }
}
