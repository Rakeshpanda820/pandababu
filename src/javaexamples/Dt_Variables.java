package javaexamples;

public class Dt_Variables {
	int b = 30;
	static int accno =1234567890;

	public void m1() {
		int a = 10;
		System.out.println("m1 is executed");
		System.out.println( a + " is local variable");
		System.out.println(accno + "is static variable ");
	}
	public void m2() {
		System.out.println("m2 is executed");
		System.out.println( b + " is instance variable");
		System.out.println(accno + "is static variable ");
	}
	public void m3() {
		System.out.println("m3 is executed");
		System.out.println( b + " is instance variable");
	}

public static void main (String args[]) {
 
	System.out.println("Main method executed");
	Dt_Variables N= new Dt_Variables();
	N.m1();
	N.m3();
	N.m2();
}
}
