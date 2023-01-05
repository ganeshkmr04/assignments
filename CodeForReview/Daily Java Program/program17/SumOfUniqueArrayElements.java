package daily.java.program17;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueArrayElements {

	public static void main(String[] args) {
		int[] inputArray= {1,2,3,2};
		//int[] inputArray= {1,1,1,1,1};
		//int[] inputArray= {1,2,3,4,5};
		int sumOfUniqueValue=0;

		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			if(map1.containsKey(inputArray[i]))
				map1.put(inputArray[i], map1.get(inputArray[i])+1);
			else
				map1.put(inputArray[i], 1);
		}
				
		for (Map.Entry<Integer, Integer> entry:map1.entrySet()) {
			if(entry.getValue().equals(1)) {
				sumOfUniqueValue=sumOfUniqueValue+entry.getKey();
			}
		}
		System.out.println(sumOfUniqueValue);
	}
}