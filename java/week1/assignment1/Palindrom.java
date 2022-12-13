package week1.assignment1;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="madam";
		String rev="";
		for (int i = inputString.length()-1; i >=0 ; i--) {
			rev=rev+inputString.charAt(i);
		}

		if (inputString.equals(rev)) {
			System.out.println("Is Palindrom");
		}
		
		
	}
}
