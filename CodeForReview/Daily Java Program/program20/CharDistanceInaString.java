package daily.java.program20;

public class CharDistanceInaString {

	public static void main(String[] args) {
		String inputString= "aaabaaaab";
		char inputChar='b';
		
		int charIndex=inputString.indexOf(inputChar),nextCharIndex=-1;
		int[] outputArray=new int[inputString.length()];
		
		System.out.println("Input String: "+inputString+" :: First Character Index: "+charIndex);
		System.out.print("Output Array:");
		
		for (int i = 0; i < inputString.length(); i++) {
			outputArray[i]=Math.abs(charIndex-i);
			if(outputArray[i] == 0) {
				nextCharIndex=inputString.indexOf(inputChar, i+1);
			}
			if(outputArray[i] > Math.abs(nextCharIndex-i) && nextCharIndex!=-1) {
				charIndex=nextCharIndex;
				outputArray[i]=Math.abs(nextCharIndex-i);
			}
			System.out.print(" "+outputArray[i]);
		}
	}
}