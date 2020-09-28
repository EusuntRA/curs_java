/**
* Exercițiu practic #6
* În metoda main de declarat o variabilă (num) de tip număr întreg > 1000 și < 2000.
* De parcurs și de afișat numerele de la 0 la num, în afară de:
* numere divizibile la 3
* numere care in suma cu 5 sunt divizibile la 7, ex. 2 => 2 + 5 / 7 
* numere, ce se termină cu 0
* 
* De utilizat: while, continue
* Numele fișierului: SelectiveIteration.java
*/


public class SelectiveIteration {
    public static void main(String[] args) {
        int num=1234;
        int i=0;
        while(i<=num){
            ++i;
            if(i%3==0 || (i+5)%7==0 || i%10==0){
                continue;
            }
            System.out.println(i);
        }
    }
}