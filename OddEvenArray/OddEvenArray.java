package homework;

import java.util.Arrays;

public class OddEvenArray {

	public static void main(String[] args) {
		// Find all the even numbers and put it in a new array and also find all odd numbers and put it in another array
		
		
		evenOdd(20);
		
		
	}
	
	
	public static void evenOdd(int numbers ) {
		
		
		int counterEven = 0;
		int counterOdd = 0 ;
		for(int i = 1 ; i < numbers ; i++) {
			if(i % 2 == 0) {
			counterEven = i ;
			System.out.println(counterEven);
			}
	
			}
			for(int y = 1 ; y < numbers ; y++) {
			if(y % 2 == 1) {
				counterOdd = y ;
				System.out.println(counterOdd);
			
				
			}
			
			
		}

	}

}

