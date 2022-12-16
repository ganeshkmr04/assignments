package week1.assignment1;

public class Palindrom1 {

	public static void main(String[] args) {
		
		String inputString="Banana";
		inputString=inputString.toLowerCase();
		
		int stringRev=inputString.length()-1;
		char stringArray[]=inputString.toCharArray();
		boolean palindromCheck=true;
		
		for (int i = 0; i <= stringRev; i++) {			
			if(stringArray[i] != stringArray[stringRev]) {
				palindromCheck=false;
				break;
			}
			stringRev--;	
		}
		
		if(palindromCheck) {
			System.out.println("The Given String Is Palindrom");
		}else {
			System.out.println("The Given String is Not a Palindrom");
		}
	}
}
