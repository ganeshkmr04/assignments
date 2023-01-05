package daily.java.program7;

import java.util.Arrays;

public class NumTwiceInArray {

	public static void main(String[] args) {
		
		int inputArray[]= {1,1,1,3,3,4,3,2,4,2};
		boolean output=false;
		
		Arrays.sort(inputArray);
		
		for (int i = 0; i < inputArray.length-1; i++) {
			if (inputArray[i] == inputArray[i+1]) {
				output=true;
				break;
			}
		}
		System.out.println(output);
	}
}
