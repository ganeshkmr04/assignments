package daily.java.program19;

import java.util.ArrayList;
import java.util.List;

public class Program19 {

	public static void main(String[] args) {
		String[] input= {"bella","label","roller"};
		//String[] input= {"cool","lock","cook"};
		
		List<Character> allChars=new ArrayList<Character>();
		
		for (char eachchar : input[0].toCharArray()) {
			boolean present=true;
			for (int i = 0; i < input.length; i++) {
				if (input[i].indexOf(eachchar) != -1) {
					input[i]=input[i].replaceFirst(String.valueOf(eachchar), "");
				}else {
					present=false;
				}
			}
			if(present) {
				allChars.add(eachchar);
			}
		}
		System.out.println(allChars);
	}

}
