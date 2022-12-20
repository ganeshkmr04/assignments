package daily.java.program10;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfJewelsInStone {

	//method to find count without using collections
	public void countOfJewels(String inputJewel,String inputStones) {
		
		//initializing count 
		int count=0;
		
		//Converting a string to character array
		char[] jewelsArray=inputJewel.toCharArray();
		char[] stonesArray=inputStones.toCharArray();
		
		//Iterating a array elements of jewel and compare with array of stones
		//if exists then increment the count else continue.
		//Final count value having the no of times a jewel which exists in stones.
		for (int i = 0; i < jewelsArray.length; i++) {
			for (int j = 0; j < stonesArray.length; j++) {
				if (jewelsArray[i] == stonesArray[j]) {
					count++;
				}
			}
		}
		System.out.println("Count: "+count);
	}

	public void countOfJewelsUsingMap(String inputJewel1, String inputStones1) {

		//initializing count 
		int stonesCount=0;

		//Converting a string to character array
		char[] jewelsArray=inputJewel1.toCharArray();
		char[] stonesArray=inputStones1.toCharArray();

		//Creating Map fo stones
		Map<Character,Integer> stonesMap=new HashMap<Character,Integer>();

		//Iterating a stonesArray and store it in Map with count of each stones
		for (int i = 0; i < stonesArray.length; i++) {
			if(stonesMap.containsKey(stonesArray[i])) {
				stonesCount=stonesMap.get(stonesArray[i]);
				stonesMap.put(stonesArray[i], stonesCount+1);
			}else {
				stonesMap.put(stonesArray[i], 1);
			}
		}

		//Re Initialize a count 
		stonesCount=0;
		
		//Iterate the jewelArray and comparing with stonesMap key value
		//if matches then count the value of map to the stonesCount
		//Finally print the stoncesCount value which contains the no of jewels in stones
		for (int i = 0; i < jewelsArray.length; i++) {
			Set<Entry<Character,Integer>> stonesEntrySet=stonesMap.entrySet();
			for (Entry<Character, Integer> entry : stonesEntrySet) {
				if(entry.getKey().equals(jewelsArray[i])) {
					stonesCount=stonesCount+entry.getValue();
				}
			}	
		}
		System.out.println("Number Of Jewels In Stones is: "+ stonesCount);
	}

	public static void main(String[] args) {

		//Initializing a input string
		String jewels="aA",stones="aAAbbbb";
		
		//Creating object from the class
		NoOfJewelsInStone obj=new NoOfJewelsInStone();
		
		//Calling a method having map implemented using object
		obj.countOfJewelsUsingMap(jewels, stones);
		
		//Calling a method without map
		obj.countOfJewels(jewels, stones);
		
	}
}
