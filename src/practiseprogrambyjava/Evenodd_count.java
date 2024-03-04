package practiseprogrambyjava;

public class Evenodd_count {
public static void main(String args[]) {
	int num= 1234578;
	int evencount=0;
	int oddcount=0;
	while(num>0)
	{		
		int rem=num%10;
		num=num/10;
		
		if(rem%2==0) {
			evencount++;
		}
		else {
			oddcount++;		
		}		
	}
	System.out.println(" even numbers :" +evencount);
	System.out.println("  odd numbers :" +oddcount);
}
}
