package daily.java.program1;

public class FindCountOfLastWord {
	public static void main(String[] args) {
		
		String inputString="luffy is still joyboy";
		String[] inputArray=inputString.split(" ");
		
		String lastWord=inputArray[inputArray.length-1];
		int count=lastWord.length();
		
		System.out.println("Count of "+lastWord+" is : "+count);
		
	}
}
