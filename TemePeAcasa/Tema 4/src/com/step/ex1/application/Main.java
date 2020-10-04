/** Exercițiu practic #1
 * De creat 2 clase:
 *         com.step.App
 *         com.step.converter.TempConverter
 *
 *         TempConverter trebuie sa aiba 2 metode:
 * public void convertToFahr(double celsius)
 * public void convertToCelsius(double fahr)
 *
 *         In App de adaugat metoda main. In metoda main de creat un obiect de tip TempConverter.
 *         De afisat la ecran: 
 *         100°C → °F
 *         100°F → °C
 */

package com.step.ex1.application;

import com.step.ex1.TempConverter.TempConverter;

public class Main {

    public static void main(String[] blabla){
        double celsius=100, fahr=100;
        double convert = fahr;

        TempConverter convertorul = new TempConverter();
        fahr=convertorul.convertToFahr(celsius);
        celsius=convertorul.convertToCelsius(convert);

        System.out.println("100 deg celsius -> " + fahr);
        System.out.println("100 deg fahr -> " + celsius);
    }

}
