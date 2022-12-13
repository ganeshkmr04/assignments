package javachallange;

public class TwoSquareRootOfX {
	public static void main(String[] args) {
		
		int inputNum=36;
		
		for (int i = 1; i <=inputNum; i++) {
		
			int findSqrt=i*i;
			
			if(findSqrt == inputNum) {
				System.out.println("Square Root of Given Number " + inputNum + " is: " + i);
				break;
			}else if (findSqrt > inputNum) {
				System.out.println("Square Root of Given Number " + inputNum + " is: " + (i-1));
				break;
			}
			
		}
	}
}
