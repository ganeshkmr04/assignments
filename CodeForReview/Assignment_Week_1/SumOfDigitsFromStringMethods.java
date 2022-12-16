package week1.assignment1;

public class SumOfDigitsFromStringMethods {
	
	public void method1(String input) {
		
		int sum=0;
		String input1=input.replaceAll("[^0-9]", "");
		char splitInput[]=input1.toCharArray();
		
		for (int i = 0; i < splitInput.length; i++) {
			sum = sum + Character.getNumericValue(splitInput[i]);
		}
		System.out.println("Sum of Numeric Values in a String " + input + " is: " + sum);
	}
	
	public void method2(String input) {
		
		int sum=0;
		char stringInput[]=input.toCharArray();
		
		for (int i = 0; i < stringInput.length; i++) {
			if (Character.isDigit(stringInput[i])) {
				sum=sum+Character.getNumericValue(stringInput[i]);
			}
		}
		System.out.println("Sum of Numeric Values in a String " + input + " is: " + sum);
	}
}
