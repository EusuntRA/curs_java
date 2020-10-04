/** Exercițiu practic #2
 * De modificat aplicația din exercițiu practic #1 să accepte date introduse de la tastatură, permițând convertirea oricărei valori din Celsius în Fahrenheit
 */

package com.step.ex2.application;
import com.step.ex1.TempConverter.TempConverter;
import java.util.Scanner;
public class Main {

    public static void main(String[] blabla){


        Scanner convertor = new Scanner(System.in);

        System.out.println("Introduceti grade celsius pentru a converti in fahr");
        double celsius = convertor.nextDouble();

        System.out.println("Introduceti grade fahr pentru a converti in celsius");
        double fahr = convertor.nextDouble();
        double convert = fahr;

        TempConverter convertorul = new TempConverter();
        fahr=convertorul.convertToFahr(celsius);
        celsius=convertorul.convertToCelsius(convert);

        System.out.println(fahr + " deg fahr");
        System.out.println(celsius + " deg celsius");
    }

}