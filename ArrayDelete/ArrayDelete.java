package homework;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayDelete {

	public static void main(String[] args) {
	//	2)Delete specific element from an array
		
		int[] numbers = { 4,5,2,5,7,87,98,23,1,3,456} ;
		System.out.println("Unsorted array of numbers: " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Sorted Array numbers: " + Arrays.toString(numbers));
		numbers = removeSpecificElement(numbers, 5);
		System.out.println("Index of element to remove: " + 3);
		System.out.println("Result after removal of element");
		System.out.println(Arrays.toString(numbers));

		
	}
	
	public static int[] removeSpecificElement(int[] arr , int index) {
		
		if (arr == null || index < 0 || index >= arr.length ) {
			return arr ;
		}
		List<Integer> arrList = IntStream.of(arr).boxed().collect(Collectors.toList());
		arrList.remove(index) ;
		
		
		return arrList.stream().mapToInt(Integer::intValue).toArray();
	}

}
	

