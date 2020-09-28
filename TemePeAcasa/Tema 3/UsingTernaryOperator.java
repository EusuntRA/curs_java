/**
* Exercitiu practic #4
* In metoda main de declarat o variabila numerica zecimală (num). De declarat o variabilă message, de tip String. 
* Conținutul message va depinde de valoarea variabilei num:
* Small dacă num <= 0
* Large dacă num >= 1000000
* 
* De utilizat: operatorul ternar.
* Numele fișierului: UsingTernaryOperator.java
*/

public class UsingTernaryOperator {
	public static void main(String args[]) {
		double num=1802.1987;
		String message;
        message=(num>=1000000) ? "Large" : "Small";
		System.out.println(message);
	}
}