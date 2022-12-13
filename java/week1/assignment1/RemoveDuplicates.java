package week1.assignment1;

public class RemoveDuplicates {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String text="We learn java basics as part of java sessions in java week1";
		
		String[] splittedText=text.split(" ");
		
		for (int i = 0; i < splittedText.length; i++) {
			int count=1;
			for (int j = i+1; j < splittedText.length; j++) {
				if (splittedText[i].equals(splittedText[j])) {
					count++;
				}
			}
			if(count > 1)
			{
				splittedText[i]="";
			}
			System.out.print(" " + splittedText[i]);	
		}
	}
}
