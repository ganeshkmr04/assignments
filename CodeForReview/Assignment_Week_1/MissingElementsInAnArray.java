package week1.assignment1;

import java.util.Arrays;

public class MissingElementsInAnArray {
	public static void main(String[] args) {
		
		int inputArray[]= {1,2,3,4,7,6,8};
		
		Arrays.sort(inputArray);
		
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != i+1) {
				System.out.println("Missing Element in an array is: "+ (i+1));
				break;
			}
		}

	}
}
