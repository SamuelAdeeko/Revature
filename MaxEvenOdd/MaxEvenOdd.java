package homework;

public class MaxEvenOdd {

	public static void main(String[] args) {
		
	evenMaxOddMax(280);

	}
	// *4)Find the sum of all even and odd numbers seperately and print the max out of it.(max of sum of even vs odd)
	
	public static void evenMaxOddMax(int number) {
		int sumEven = 0 ;
		for(int i = 1 ; i <= number ; i++) {
			if(i % 2 == 0) {
			sumEven= sumEven + i;
		}
	}
		System.out.println("Sum of Even Numbers: " + sumEven);
		int sumOdd = 0 ;
		for(int x = 1 ; x <= number ; x++) {
			if(x % 2 == 1) {
			sumOdd= sumOdd + x;
		}
	}
		System.out.println("Sum of Odd Numbers: " + sumOdd);
		if(sumEven > sumOdd) {
			System.out.println("Maximum number between Sum of Even and Odd is: " + sumEven ) ;
		} else {
			System.out.println("Maximum number between Sum of Even and Odd is: " + sumOdd ) ;
		}
	}

}
