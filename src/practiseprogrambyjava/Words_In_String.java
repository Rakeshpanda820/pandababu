package practiseprogrambyjava;
import java.util.StringTokenizer;

public class Words_In_String {
	    public static void main(String[] args) {
	        String str = "This is a sample string";
	        StringTokenizer st = new StringTokenizer(str);
	        int count = st.countTokens();
	        System.out.println("Number of words in the string is: " + count);
	    
	}

}