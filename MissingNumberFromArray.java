package week1.day2.assignments;

import java.util.Arrays;

public class MissingNumberFromArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		
		int length=arr[arr.length-1];
		System.out.println("array size is "+ length);
		
		int index=0;
		for(int i=0;i<length;i++)
		{
			if(i==arr[index]) {
				index++;
			}
			else {
				System.out.println(i+" ");
				
			}
		}
	}

}
