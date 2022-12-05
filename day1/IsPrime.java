package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int input=23, primeCheck=0;
		
		for (int i = 2; i < input-1; i++) {
			if (input%i == 0) {
				primeCheck++;
				break;
			}
		}
		if (primeCheck == 0) {
			System.out.println("Given Number Is Prime");
		}
		else {
			System.out.println("Given Number Is Not Prime");
		}
	}
}
