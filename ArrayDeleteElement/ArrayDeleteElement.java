package homework;


public class ArrayDeleteElement {

	public static void main(String[] args) {
		int [] numbers = new int [10];
		numbers[0] = 100;
		numbers[1] = 101;
		numbers[2] = 102;
		numbers[3] = 103;
		numbers[4] = 104;
		numbers[5] = 105;
		
		int n = 6;
		int position = 3;
		
		for (int i = position -1; i < n; i++) {
			numbers[i] = numbers[i+1];
		}
		n--;
		
		System.out.println("\nPrinting array after deleting element at position  " );
		for (int i = 0 ; i < n ; i++) {
			System.out.println(numbers[i]);
		}
	}

}
