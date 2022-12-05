package week1.day1;

public class FindDuplicates {
	public static void main(String[] args) {
		
		int inputNums[] = {2,5,7,7,5,9,2,3};
		System.out.print("Duplicate Numers In an Array: ");
		
		for (int i = 0; i < inputNums.length; i++) {
			for (int j = i+1; j < inputNums.length; j++) {
				if(inputNums[i] == inputNums[j]) {
					System.out.print( " " + inputNums[i]);
					break;
				}
			}
		}
	}
}
