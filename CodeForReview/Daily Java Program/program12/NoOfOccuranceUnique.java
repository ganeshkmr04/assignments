package daily.java.program12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class NoOfOccuranceUnique {

	public void findUniqueOccurance(int[] arr){
		//Initializing a local variables
		int count,prevItem=arr[1];

		//Sorting a array to maintain a order
		Arrays.sort(arr);
		//Instantiate a set
		Set<Integer> arrSet=new HashSet<Integer>();
		
		//Iterating a array
		for (int i = 0; i < arr.length; i++) {
			count=1;
			//Selecting only a unique numbers for count
			if (arr[i] != prevItem || i==0) {
				//Finding a similar values and updating count value and set the value as already counted
				for (int j = i+1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count=count+1;
						prevItem=arr[i];
					}
				}
				//add the count of value in arr[i] to set
				arrSet.add(count);
			}
		}
		//Re initialize a count and adding the values in a set
		count=0;
		for (Integer intSet : arrSet) {
			count=count+intSet;
		}
		//compare the length of an array and sum of values in set
		//if same then no of occurances of each value in an array are unique else not
		if (arr.length == count) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	
	public void findUniqueOccuranceUsingMap(int[] arr){
		//Initializing a local variables
		int count=0;
		
		//Instantiate a set and map
		Map<Integer,Integer> arrMap=new HashMap<Integer,Integer>();
		Set<Integer> arrSet=new HashSet<Integer>();
		
		//adding a each array value to a map key and the count to a value
		for (int i = 0; i < arr.length; i++) {
			if (arrMap.containsKey(arr[i])) {
				arrMap.put(arr[i], arrMap.get(arr[i])+1);
			}else {
				arrMap.put(arr[i], 1);
			}
		}
		
		//adding a map values to set and count only the value which added to set.
		Set<Entry<Integer,Integer>> mapEntrySet=arrMap.entrySet();
		for (Entry<Integer, Integer> entry : mapEntrySet) {
			if(arrSet.add(entry.getValue())) {
				count=count+entry.getValue();
			}
			
		}
		//Compare the array lenght with sum of set values
		//It is same, only no of occurances of each value in an array are unique else not
		if(count == arr.length)
			System.out.println("True");
		else
			System.out.println("False");
	}
	
	public static void main(String[] args) {

		int[] intputArr = {-3,0,1,-3,1,1,1,-3,10,0};
		
		NoOfOccuranceUnique obj=new NoOfOccuranceUnique();
		obj.findUniqueOccurance(intputArr);
		obj.findUniqueOccuranceUsingMap(intputArr);
		
	}
}
