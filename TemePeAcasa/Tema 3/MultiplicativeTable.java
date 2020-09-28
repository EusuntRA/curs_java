/**
* Exercițiu practic #3
* În metoda main de scris cod care afișează tabelul multiplicării unui număr întreg n, unde n este o variabilă declarată și inițializată în metoda main.
* Exemplu: int n = 5
* → 5 x 0 = 0;
* → 5 x 1 = 5;
* → … pană la x 10
* 
* De ales 1 singură soluție: while/do-while/for
* Numele fișierului: MultiplicativeTable
*/

public class MultiplicativeTable {
    public static void main (String[] args) {
        int x=7, n=10, rez;
        for(int i=0;i<=n;i++){
            rez=x*i;
            System.out.println (x + " * " + i +" = " + rez);  
        }
    }
}