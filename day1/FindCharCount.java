package week1.day1;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String company="hexaware";
		char expected='e';
		int count=0;
		char[] compChar=company.toCharArray();
		
		
		for (int i = 0; i < compChar.length; i++) {
			if (compChar[i] == expected) {
				//System.out.println(compChar[i]);
				count=count+1;
			}
		}
		System.out.println("Count of " + expected + " in " + company + ": " + count);
	}

}
