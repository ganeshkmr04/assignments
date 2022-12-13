package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int numOne=0, numTwo=1, sum=0;
		System.out.print("Fibonacci Series: " + numOne + "," + numTwo);
		
		for(int i=1; i<=11; i++)
		{
			sum = numOne + numTwo;
			numOne=numTwo;
			numTwo=sum;
			System.out.print("," + sum);
		}
	}

}
