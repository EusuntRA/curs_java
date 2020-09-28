/**
* Exercițiu practic #1
* În metoda main de declarat o variabilă de tip char, inițializată cu o literă. 
* De răspuns la întrebarea: vocală sau consoană prin intermediul
* if-else
* switch
*
* O soluție per fișier.
*/


public class Ex1Switch {
	
	public static void main (String[] args) {
		char litera = 'z';
		switch (litera) {
			case 'a':
			  System.out.println("litera " + litera + " e o vocala");
			  break;
			case 'e':
			  System.out.println("Tuesday");
			  break;
			case 'i':
			  System.out.println("Wednesday");
			  break;
			case 'o':
			  System.out.println("Thursday");
			  break;
			case 'u':
			  System.out.println("Friday");
			  break;
			default:
			  System.out.println("litera " + litera + " e o consoana");
			            }
	}
}