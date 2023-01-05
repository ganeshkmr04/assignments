package daily.java.program5;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputNumber=19;

		HappyNumber obj=new HappyNumber();
		int result=obj.checkHappyNumber(inputNumber);

		while(result !=1 && result !=4)
		{
			result=obj.checkHappyNumber(result);
		}
		if(result == 1)
			System.out.println(inputNumber + " is a Happy Number :)");
		else
			System.out.println(inputNumber + " is not a Happy Number :(");
	}

	public int checkHappyNumber(int inputNumber1) {

		char[] inputArray=Integer.toString(inputNumber1).toCharArray();
		int sum=0;

		for (int i = 0; i < inputArray.length; i++) {
			int digit=Character.getNumericValue(inputArray[i]);
			sum=sum+(digit*digit);
		}
		return sum;
	}
}