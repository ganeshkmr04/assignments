package javachallange;

public class ThreePhrasePalindrome {

	public static void main(String[] args) {

		String inputString="A man, a plan, a canal: Panama";
		String finalInput=inputString.toLowerCase().replaceAll("[^0-9a-zA-z]", "");
		char charArr[]=finalInput.toCharArray();
		
		int n=finalInput.length();
		String revString="";
		
		for (int i = n-1; i >=0 ; i--) {
			revString=revString+charArr[i];
		}
		
		if (finalInput.equals(revString)) {
			System.out.println("Given Phrase is a Palindrom");
		}else {
			System.out.println("Given Phrase is Not a Palindrom");
		}
		
	}
}