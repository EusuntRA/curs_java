package com.step;

import java.io.FileNotFoundException;
public class FileFinder {
    public static void main (String[] args){
        try {
            findeFile("E://Desktop");
        }
        catch (FileNotFoundException ex){

        }

    }
    public static boolean findeFile(String path) throws FileNotFoundException{
        throw new FileNotFoundException("Fisierul nu a  fost gasit");
    }
}
