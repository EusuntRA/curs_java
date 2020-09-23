/*
În metoda main de scris cod care permite calcularea sumei primelor n numere întregi, unde n este o variabilă declarată și inițializată în metoda main.
De utilizat
While
Do while
*/

public class Suma{
    public static void main(String[] args) {
        int num=5,contor=num/num,suma=0;
        while(contor<=num){
            suma+=contor;
            contor++;
        };
        System.out.println("Suma primelor "+num+" numere reale este:"+suma);
    }
}