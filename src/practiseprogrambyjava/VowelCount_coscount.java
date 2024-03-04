package practiseprogrambyjava;
public class VowelCount_coscount {
public static void main(String args[]) {  
  String str = "rakesh kumar panda ";
	int vowelcount = 0;
	int coscount = 0;
	for(int i=0;i<str.length();i++) {
		if (str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||
				str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'	) {
			vowelcount++;
		}
		else if (str.charAt(i)>='a' && str.charAt(i)<='z' ) {
			coscount++;
		}
		}
	System.out.println("The no of vowel is " + vowelcount);
	System.out.println("The no of consonant is " + coscount);
}
}
