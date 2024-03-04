package javaexamples1;

public class Exc_Handling1 {
	public static void main(String args[]) {
	    try {
	        int a[]= {10,20,30,40,50,60};
	        System.out.println(a[11]);
	    }
	    catch(Exception e) {
	        System.out.println(e);
	    }
	}
}
