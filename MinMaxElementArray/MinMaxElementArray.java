package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(1,3,4,5,8,9,0,5,23,3,2));
	    double num , max  = Float.MIN_VALUE;
	    for (Object item : list)
	    {
	        if (item instanceof Integer)
	        {
	            num  =(int)item + 0.0;
	        }
	        else
	        {
	            if(item instanceof String)
	            {
	                continue ;
	            }
	            else
	            {
	                num = (double)(item) ;

	            }
	        }
	        if(num >= max)
	        {
	            max = num ;
	        }
	    }
	    System.out.println(max);

	}

}
