package javaexamples;
import java.util.Scanner;
public class Switch {
	
public static void main (String args[]) {	
	Scanner bulu = new Scanner (System.in);
	System.out.println("1.add");
	System.out.println("2.sub");
	System.out.println("3.mul");
	System.out.println("4.div");
	System.out.println("Enter 1st no");
	int a= bulu.nextInt();
	System.out.println("Enter 2nd no");
	int b = bulu.nextInt();
	System.out.println("Enter your choice");
	int c = bulu.nextInt();
	switch(c) {
	case 1 : System.out.println(a+b); break;
	case 2: System.out.println(a-b);break;
	case 3 : System.out.println(a*b);break;
	case 4: System.out.println(a/b);break;
	default : System.out.println("fucking invalid choice");
	}

}
}
