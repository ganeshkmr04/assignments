package week1.assignment1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		
		String inputString="I am a tester";
		String splitInput[]=inputString.split(" ");

		for (int i = 0; i < splitInput.length; i++) {
			if (i%2 == 0) {
				System.out.print(splitInput[i] + " ");
			}else {
				char revWord[]=splitInput[i].toCharArray();
				for (int j = revWord.length-1; j >=0 ; j--) {
					System.out.print(revWord[j]);
				}
				System.out.print(" ");
			}
		}
	}
}
