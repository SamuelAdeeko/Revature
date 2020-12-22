package homework;

import java.util.Arrays;

public class ArrayReverse {
	
		
	public static void main(String[] args) {
		////	*1)Print the array in reverse order
		
		int[] numbers = {2,4,6,7,8,9,12,67 };
		StringBuffer numberFlip = new StringBuffer(Arrays.toString(numbers)) ;
		System.out.println(numberFlip.reverse());
		
	}

	

}
