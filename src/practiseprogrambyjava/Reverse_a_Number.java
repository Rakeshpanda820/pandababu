package practiseprogrambyjava;

import java.util.Scanner;

public class Reverse_a_Number {
public static void main (String args[]) {
	
	int num = 1234;
	StringBuilder sbl = new StringBuilder();
	sbl.append(num);
	StringBuilder rev = sbl.reverse();
	System.out.println("Reverse number is :"+rev);
}
}
