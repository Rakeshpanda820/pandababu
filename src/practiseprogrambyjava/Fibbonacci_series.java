package practiseprogrambyjava;

public class Fibbonacci_series {
public static void main(String args[]) {
	int a=10,b=20;
	System.out.println("the fibbonacci series are ");
	System.out.println(a);
	System.out.println(b);
	for(int i =2;i<5;i++) {
		int nextnum=a+b;
		System.out.println( nextnum);
		a=b;
		b=nextnum;
	}
}
}
