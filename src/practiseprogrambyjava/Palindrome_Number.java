package practiseprogrambyjava;
public class Palindrome_Number {

	public static void main(String[] args) {
      
      
      int num = 51115;
      int orgnum = num;
       int rev = 0;
       while(num>0) {
    	   rev = rev*10 + num%10;
    	   num = num/10;
       }     
   if (orgnum ==rev) {
    	System.out.println(orgnum + " is a palindrome no");  
      }
      else {
    	System.out.println(orgnum + " is not a palindrome no");  
      }
	
	}
}
