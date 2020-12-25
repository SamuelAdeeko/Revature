package homework;

public class ArrayInsertElement {

	public static void main(String[] args) {
		
		int [] numbers = new int [10];
		numbers[0] = 100;
		numbers[1] = 101;
		numbers[2] = 102;
		numbers[3] = 103;
		numbers[4] = 104;
		numbers[5] = 105;
		
		int length = numbers.length;
		System.out.println(length);
		int n = 6;						// 6 will be an empty array index from numbers.length
		int position = 1;
		int element = 999;
		
		for(int i = n ; i >= position ; i--) {  // i > position ; i--    i will move down until it gets to the index greater than index 1
			numbers[i] = numbers[i - 1] ;  // pop last number to next array index
		}
		numbers[position-1] = element;
		n++;   // increase the array index
		System.out.println("Print numbers array after we insert element");
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Numbers array: " + numbers[i]+"");
		}

	}

}
