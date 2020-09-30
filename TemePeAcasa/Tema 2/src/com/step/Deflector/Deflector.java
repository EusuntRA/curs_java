package com.step.Deflector;

public class Deflector {
    public static void main (String[] args) {
    }
}

public class Deflector {
    String name = "Intervetion Protomatter";
	String type = "Elite Fleet";
	int mk = 15;
	String quality="Epic";
	
    public void hullCap(){
		System.out.println("+10.6 Hull Capacity");
    }
    public void shCap(){
		System.out.println("+10.6 Shield Capacity");
    }
    public void impulsExpertise(){
		System.out.println("+21.3 Impuls Expertise");
    }
    public void eps(){
		System.out.println("+10.6 Electro-Plasma System");
    }
    public void DrainX(){
		System.out.println("+21.3 Drain Expertise");
    }
    public void wpS(){
		System.out.println("+21.3 Weapon Specialization");
    }
    public void shPen(){
		System.out.println("+21.3 Shield Penetration");
    }
    public void crtD(){
		System.out.println("+5% Critical Severity (Based on Hull %)");
    }
    public void crtC(){
		System.out.println("+0% Critical Chance (Based on Hull %)");
    }
}