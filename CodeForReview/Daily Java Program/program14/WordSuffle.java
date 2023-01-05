package daily.java.program14;

public class WordSuffle {
	public static void main(String[] args) {

		String input="Myself2 Me1 I4 and3" , outputString="";
		String[] inputArray=input.split(" ");
		int charSeq=1;

		for (int i = 0; i < inputArray.length; i++) {
			for (int j = 0; j < inputArray.length; j++) {
				char[] wordSeq=inputArray[j].toCharArray();
				String wordSeqStr=Character.toString(wordSeq[wordSeq.length-1]);
				if(Integer.parseInt(wordSeqStr) == charSeq) {
					for (int k = 0; k < wordSeq.length-1; k++) {
						outputString=outputString+wordSeq[k];
					}
				}
			}
			outputString=outputString+" ";
			charSeq++;
		}
		System.out.println(outputString);
	}
}