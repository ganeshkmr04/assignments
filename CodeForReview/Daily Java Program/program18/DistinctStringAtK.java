package daily.java.program18;

import java.util.LinkedHashMap;
import java.util.Map;

public class DistinctStringAtK {
	
	public static void main(String[] args) {
		String[] inputArray= {"d","b","c","b","c","a"};
		int k=2;
		//String[] inputArray= {"aaa","aa","a"};
		//int k=1;
		//String[] inputArray= {"a","b","a"};
		//int k=3;
		
		int kcount=0;
		String outputString="";
		Map<String,Integer> map1=new LinkedHashMap<String,Integer>();
		
		for (int i = 0; i < inputArray.length; i++) {
			if(map1.containsKey(inputArray[i]))
				map1.put(inputArray[i], map1.get(inputArray[i])+1);
			else
				map1.put(inputArray[i], 1);
		}
		for (Map.Entry<String, Integer> entry:map1.entrySet()) {
			if(entry.getValue().equals(1)) {
				kcount=kcount+1;
				if(kcount == k ) {
					outputString=entry.getKey();
				}		
			}
		}
		System.out.println("\""+outputString+"\"");
	}
}