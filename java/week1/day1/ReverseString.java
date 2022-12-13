package week1.day1;

public class ReverseString {
	public static void main(String[] args) {
		
		String name="Ganesh";
		
		System.out.println("Given String :" + name);
		System.out.print("Reverse String : ");
		
		char[] nameRev=name.toCharArray();
		for (int i = nameRev.length-1 ; i >=0; i--) {
			System.out.print(nameRev[i]);
		}
	}
}