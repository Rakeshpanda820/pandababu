package javaexamples1;

public class Overload {
public void add(int a , int b) {
System.out.println(a+b);	
}
public void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main (String args[]) {
	Overload obj = new Overload();
	obj.add(10,30);
	obj.add(10, 20, 50);
}
}
