package practiseprogrambyjava;

public class Prime_not {
public static void main(String args[]) {
	int num = 21;
	boolean isprime =true;
	for (int i =2;i<num/2;i++) {
		if (num%i==0) {
			isprime = false;
			break;
		}
	}
	if(isprime) {
		System.out.println(num+" is a prime number");
	}
	else {
		System.out.println(num+" is not a prime number");
	}
}
}
