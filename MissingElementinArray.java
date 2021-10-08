package week.day2;

import java.util.Arrays;

public class MissingElementinArray {

	public static void main(String[] args) {
		
		
	int[] arr = {1,2,3,4,6,7,8};
	
	Arrays.sort(arr);
	System.out.println("The missing number in the Array");
	int i;
	int length = arr.length;
	for(i=0; i <length; i++ )
		{
		if(i+1 != arr[i])
		{System.out.println(i+1);
		break;
		}
		}
	

	}

}
