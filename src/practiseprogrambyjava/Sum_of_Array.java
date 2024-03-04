package practiseprogrambyjava;

public class Sum_of_Array {
	 public static void main(String[] args) {
	        int[] arr = {1934,12678,183,145167,100,1234567087,43535,43534,97861};
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum = sum+ arr[i];
	        }
	        System.out.println("The sum of the elements of the array is: " + sum);
}
}
