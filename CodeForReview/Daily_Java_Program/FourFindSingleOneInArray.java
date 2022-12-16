package javachallange;

import java.util.Arrays;

public class FourFindSingleOneInArray {
	public static void main(String[] args) {
		
		int inputArray[]= {1};
		Arrays.sort(inputArray);
		int arrayLength=inputArray.length;
		
		for (int i = 0; i <= arrayLength-1; i=i+2) {
			if( (i+1) < arrayLength && inputArray[i] != inputArray[i+1])
			{
				System.out.println("Single Number is : "+inputArray[i]);
				break;
			}else if((i+1) >= arrayLength) { 
				System.out.println("Single Number is : "+inputArray[i]); 
				break; 
			}	
		}
	}
}