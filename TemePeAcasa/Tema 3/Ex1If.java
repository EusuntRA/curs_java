/**
* Exercițiu practic #1
* În metoda main de declarat o variabilă de tip char, inițializată cu o literă. 
* De răspuns la întrebarea: vocală sau consoană prin intermediul
* if-else
* switch
*
* O soluție per fișier.
*/


public class Ex1If {
	
	public static void main (String[] args) {
		char litera = 'z';
		
        if(litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u' )
            System.out.println("litera " + litera + " e o vocala");
        else
            System.out.println("litera " + litera + " e o consoana");
	}
}