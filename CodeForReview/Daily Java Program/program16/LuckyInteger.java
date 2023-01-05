package daily.java.program16;

import java.util.HashMap;
import java.util.Map;

public class LuckyInteger {

	public static void main(String[] args) {
		//int[] inputArray= {2,2,3,4};
		int[] inputArray= {1,2,2,3,3,3};
		//int[] inputArray= {2,2,2,3,3};
		int luckyInteger=-1;
		
		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			if(map1.containsKey(inputArray[i]))
				map1.put(inputArray[i], map1.get(inputArray[i])+1);
			else
				map1.put(inputArray[i], 1);
		}

		for (Map.Entry<Integer, Integer> entry:map1.entrySet()) {
			if(entry.getKey().equals(entry.getValue()) && entry.getKey()>luckyInteger) {
				luckyInteger=entry.getKey();
			}
		}
		System.out.println(luckyInteger);
	}
}