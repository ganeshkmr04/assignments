package daily.java.program13;

public class MaxWordsInSentences {

	public static void main(String[] args) {

		String[] inputSentences= {"please wait", "continue to fight", "continue to win"};
		int wordCountCheck=0;
		
		for (int i = 0; i < inputSentences.length; i++) {
			String[] sepSent=inputSentences[i].split(" ");
			if (wordCountCheck < sepSent.length) {
				wordCountCheck=sepSent.length;
			}
		}
		System.out.println(wordCountCheck);
	}
}
