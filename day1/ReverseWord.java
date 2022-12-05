package week1.day1;

public class ReverseWord {
	public static void main(String[] args) {
		
		String sentence="Amazon Development Center, Chennai";
		System.out.println(sentence);
		
		sentence = sentence.toLowerCase();
		String[] sentenceArray=sentence.split(" ");
		
		for (int i = sentenceArray.length-1; i >= 0 ; i--) {
			System.out.print(sentenceArray[i] + " ");
		}
		
	}

}
