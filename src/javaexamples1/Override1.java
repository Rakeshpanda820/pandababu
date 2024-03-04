package javaexamples1;

public class Override1  extends Override {
	public void add(int a , int b) {
		System.out.println(a-b);
		System.out.println("new feature");
	}
	public static void main(String args[]) {
		Override1 obj = new Override1();
		obj.add(30, 20);
	}
}
