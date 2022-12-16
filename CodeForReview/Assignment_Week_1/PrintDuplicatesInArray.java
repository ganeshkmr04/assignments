package week1.assignment1;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] inputArray= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count;
		System.out.print("Duplicate values are:");
		
		for (int i = 0; i < inputArray.length; i++) {
			count=0;
			for (int j = i+1; j < inputArray.length; j++) {
				if (inputArray[i] == inputArray[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(" "+inputArray[i]);
			}
		}
		
	}
}
