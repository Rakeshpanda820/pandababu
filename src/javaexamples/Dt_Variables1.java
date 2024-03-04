package javaexamples;

public class Dt_Variables1 {
	int b = 20;
	static int accno=12345;
	
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
	public static void rakesh() {
		System.out.println("static method is executed");
	}

public static void main (String args[]) {
 
	System.out.println("Main method executed");
	Dt_Variables1 N= new Dt_Variables1();
	N.m1();
	N.m3();
	N.m2();
	Dt_Variables1.rakesh();
	

	}
	

}
