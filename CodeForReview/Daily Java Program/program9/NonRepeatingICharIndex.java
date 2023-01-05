package daily.java.program9;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NonRepeatingICharIndex {

	public void findIndex(String inputString) {
		
		char outputChar=' ';
		int indexValue=0;
		boolean checkValue=false;

		//Converting the String to character array
		char[] charArray=inputString.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			checkValue=false;
			for(int j=0; j<charArray.length;j++) {
				if(i != j && charArray[i]==charArray[j]) {
					checkValue=true;
					break;
				}
			}
			if(!checkValue) {
				outputChar=charArray[i];
				indexValue=i;
				break;
			}
		}
		if(!checkValue) {
			System.out.println("Character: " + outputChar +" Index Value: "+indexValue);
		}else {
			System.out.println("-1");
		}
	}
	
	public void findIndexUsingMap(String inputString) {
	
		char[] charArray=inputString.toCharArray();
		boolean isExist=false;
		
		Map<Character,Integer> charMap=new LinkedHashMap<Character,Integer>();
		
		for (int i = 0; i < charArray.length; i++) {
			if(!(charMap.containsKey(charArray[i]))) {
				charMap.put(charArray[i], i);
			}else {
				charMap.put(charArray[i], -1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet=charMap.entrySet();
		for (Entry<Character,Integer> entry : entrySet) {
			if(!(entry.getValue().equals(-1))) {
				System.out.println("Character: "+entry.getKey()+ " Index: "+ entry.getValue());
				isExist=true;
				break;
			}
		}
		
		if(!isExist) {
			System.out.println("-1");
		}
	}
	
	public static void main(String[] args) {
	
		//Initializing the input string
		String input="aab";
		
		NonRepeatingICharIndex obj=new NonRepeatingICharIndex();
		obj.findIndex(input);
		obj.findIndexUsingMap(input);
	}
}
