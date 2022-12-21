package daily.java.program11;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstDuplicatesInSting {

	public static void main(String[] args) {
		
		//Initializing input String and Other local variables
		String s= "abccbaacz";
		char findChar=' ';
		boolean firstOccurance=false;
		
		//Converting input string to character array
		char[] charArray=s.toCharArray();
		
		//Crating LinketHashSet to store an array items
		Set<Character> charSet=new LinkedHashSet<Character>();
		
		//Iterating an character array and added to a set
		//Compare the size of a set with charArray's index+1 and also firstOccurance should false 
		//if true when set finds a duplicate. We can store the character and firstOccurance to false
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
			if (charSet.size() != (i+1) && !firstOccurance) {
				findChar=charArray[i];
				firstOccurance=true;
			}
		}
		
		//If firstOccurance true then print a character, else no duplicates
		if (firstOccurance) {
			System.out.println("Output: "+findChar);
		}else {
			System.out.println("Output: NA");
		}
	}
}