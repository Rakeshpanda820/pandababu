package practiseprogrambyjava;

public class String_Palindrome {

	public static void main(String[] args) {
		
    String str ="SaaS";
    boolean ispalindrome = true;
    for(int i =0;i<str.length()/2;i++) {
    	if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
    		ispalindrome=false;
    		break;
    	}
    }
    if(ispalindrome) {
    	System.out.println("the string is palindrome");
    }
    else {
    	System.out.println("the string is not palindrome");
    }
	}

}
