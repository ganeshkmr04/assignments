package daily.java.program19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UniqueCharInAnStringArray {
	public static void main(String[] args) {
		//String[] inputStrings= {"bella","label","roller"};
		String[] inputStrings= {"cool","lock","cook"};
		
		//Printing Input Array
		List<String> inputList=new ArrayList<String>();
		for (int i = 0; i < inputStrings.length; i++) {
			inputList.add(inputStrings[i]);
		}
		System.out.println(inputList);
		
		//Creating a set of unique characters of a strings from an array
		Set<Character> charSet=new TreeSet<Character>();
		for (String string : inputStrings) {
			char[] charArray=string.toCharArray();
			for (int i = 0; i < charArray.length; i++) {
				charSet.add(charArray[i]);
			}
		}
		//Converting the set to list
		List<Character> charList=new ArrayList<Character>(charSet);

		//Instantiating the nested map, outer map with string as key and inner map as value
		//Inner Map have character of a string as key and count as value
		Map<String,Map<Character,Integer>> outerMap=new LinkedHashMap<String,Map<Character,Integer>>();

		//Adding the elements to a inner and outer map
		for (int i = 0; i < inputStrings.length; i++) {
			Map<Character,Integer> innerMap=new HashMap<Character,Integer>();
			char[] wordArray=inputStrings[i].toCharArray();
			for(int j=0; j < wordArray.length; j++) {
				if(innerMap.containsKey(wordArray[j])){
					innerMap.put(wordArray[j], innerMap.get(wordArray[j])+1);
				}else {
					innerMap.put(wordArray[j], 1);
				}
			}
			outerMap.put(inputStrings[i], innerMap);
		}

		//Preparing the list of characters to be removed from the list of characters
		Set<Character> charRemoveSet=new TreeSet<Character>();
		for (Map.Entry<String, Map<Character,Integer>> entry:outerMap.entrySet()) {
			for (int k=0; k < charList.size(); k++) {
				boolean charCheck=false;
				for (Map.Entry<Character,Integer> entryKey:entry.getValue().entrySet()) {
					if (charList.get(k).equals(entryKey.getKey())) {
						charCheck=true;
						break;
					}
				}
				if (!charCheck) {
					charRemoveSet.add(charList.get(k));
				}
			}
		}

		//Removing the non intersected characters from the list
		List<Character> charRemoveList=new ArrayList<Character>(charRemoveSet);
		for (int i = 0; i < charRemoveList.size(); i++) {
			charList.remove(charList.indexOf(charRemoveList.get(i)));
		}
		
		//Get the lowest frequency of repeating characters from a each string of an array
		for (int i = 0; i < charList.size(); i++) {
			int prevValue=0;
			for (Map.Entry<String, Map<Character,Integer>> entry:outerMap.entrySet()) {
				for (Map.Entry<Character,Integer> entryKey:entry.getValue().entrySet()) {
					if(entryKey.getKey().equals(charList.get(i))) {
						if(prevValue==0 || prevValue > entryKey.getValue() ) {
							prevValue=entryKey.getValue();
						}
					}
				}
			}
			//Printing a final value of character frequency
			for (int j = 0; j < prevValue; j++) {
				System.out.print("\""+charList.get(i)+"\" ");
			}
		}
	}
}

