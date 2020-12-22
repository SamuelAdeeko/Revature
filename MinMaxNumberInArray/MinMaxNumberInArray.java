package homework;

import java.util.Arrays;

public class MinMaxNumberInArray {
	
	public static int max;
	public static int min;

	public static void main(String[] args) {
		// 5)Find the minimum and the maximum element in an array
		int[] my_array = {12,23,12,34,56,75,32,12}	;
		max_min(my_array);
		System.out.println(Arrays.toString(my_array));
		System.out.println(max);
		System.out.println(min);
	
}
public static void max_min(int[] my_array) {
    int max = my_array[0];
    int min = my_array[0];
    int len = my_array.length;
    for (int i = 1; i < len - 1; i = i + 2) {
        if (i + 1 > len) {
            if (my_array[i] > max) max = my_array[i];
            if (my_array[i] < min) min = my_array[i];
        }
        if (my_array[i] > my_array[i + 1]) {
            if (my_array[i] > max) max = my_array[i];
            if (my_array[i + 1] < min) min = my_array[i + 1];
        }
        if (my_array[i] < my_array[i + 1]) {
            if (my_array[i] < min) min = my_array[i];
            if (my_array[i + 1] > max) max = my_array[i + 1];
        }
    }
}
}