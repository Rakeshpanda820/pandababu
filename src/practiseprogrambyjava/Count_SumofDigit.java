package practiseprogrambyjava;

public class Count_SumofDigit {
public static void main(String args[]) {
	 int num = 8707656;
     int sum = 0;
     while (num > 0) { 
    	 sum=sum+num%10;
         num =num/10;
         
     }
     System.out.println("The sum of number "+sum);
}
}
