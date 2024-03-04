package practiseprogrambyjava;
import java.util.Scanner;

public class Count_No {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	int digitcount =0;
	while(num>0) {
		num=num/10;
		digitcount++;
	}
	System.out.println("the no has " +digitcount+ " digits.");
}
}
