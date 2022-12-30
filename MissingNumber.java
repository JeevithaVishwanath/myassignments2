package week1.day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		
		Arrays.sort(arr);
		
		for(int i=1;i<arr.length;) {
			
			if(i==arr[i-1]) {
				i++;
			}
				
			else {
				if(i!=arr[i-1])
				System.out.println("The missing number is " +i);
			    break;
		}

	}

}}
