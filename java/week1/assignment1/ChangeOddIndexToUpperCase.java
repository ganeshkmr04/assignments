package week1.assignment1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="testleaf";
		
		char[] stringArray=string.toCharArray();
		
		System.out.println("Given String: " + string);
		System.out.print("Converted String: ");
		
		for (int i = 0; i < stringArray.length; i++) {
			if (i%2 == 1) {
				char uc=Character.toUpperCase(stringArray[i]);
				System.out.print(uc);
			}
			else{
				System.out.print(stringArray[i]);
			}
		}
	}
}
