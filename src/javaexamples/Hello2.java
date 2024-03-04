package javaexamples;

public class Hello2 {
	public void m1() {
		System.out.println("m1 method executed");
}
	public void m2() {
		System.out.println("m2 method executed");
		
	}
	public void m3() {
		System.out.println("m3 method executed");
	}
public static void main (String args[]) {
	System.out.println("main method executed");
	Hello2 m = new Hello2();
	m.m1();
	m.m2();
	m.m3();
	
}
}
