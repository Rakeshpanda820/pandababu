package javaexamples;
class A {
	int a =30;
	int b = 60;
	Boolean F = false  ;
	Boolean T = true ;
	char  y = 'p';
public void m1() {
	System.out.println("m1 method is executed");
}	
}
class B extends A{
	double  d =  12.3;

	public void m2() {
		System.out.println("m2 method executed");
		System.out.println(a+b);
		System.out.println(d);
		System.out.println(y);
		if (a>b) {
			System.out.println(T);
		} else {
			System.out.println(F);
		}
	}
}
public class C_Inheritance extends B {
	public void m3() {
		System.out.println("m3 method executed");
		System.out.println(b*a);
		System.out.println(b/a +" ROCKY BHAI ");
			
	}
public static void main (String args[]) {
	C_Inheritance obj = new C_Inheritance ();
	obj.m1();
	obj.m2();
	obj.m3();
}	
}