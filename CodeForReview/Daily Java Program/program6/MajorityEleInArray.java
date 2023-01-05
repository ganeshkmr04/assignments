package daily.java.program6;

import java.util.Arrays;

public class MajorityEleInArray {
	public static void main(String[] args) {

		int[] inputList= {2,2,1,1,1,2,2}, valueCount= {0,0};
		int majorityEle=inputList.length/2 , count;

		System.out.println("Input List: " + Arrays.toString(inputList));
		System.out.println("Majority Limit: " + (majorityEle+1));
		
		Arrays.sort(inputList);
		for (int i = 0; i < inputList.length-1; i++) {
			count=1;
			for (int j = i+1; j < inputList.length; j++) {
				if(inputList[i] == inputList[j])
					count=count+1;
				else
					break;
			}
			if(count > majorityEle){
				valueCount[0]=inputList[i];
				valueCount[1]=count;
			}
		}
		if(valueCount[1] > 0)
			System.out.println("Majority Element Is: " + valueCount[0]);
		else
			System.out.println("No Majority Element Exists");
	}
}