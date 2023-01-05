package daily.java.program15;

public class CompareArray {

	String concatArray(String[] inputArray) {
		String inputArrString="";
		for (int i = 0; i < inputArray.length; i++) {
			inputArrString=inputArrString+inputArray[i];
		}
		return inputArrString;
	}
	
	public static void main(String[] args) {
		String inputArray1[]= {"ab","c"}, inputArray2[]= {"a","bc"};
		//String inputArray1[]= {"a","cb"}, inputArray2[]= {"ab","c"};
		String inputArrString1="",inputArrString2="";

		CompareArray compareObj=new CompareArray();
		inputArrString1=compareObj.concatArray(inputArray1);
		inputArrString2=compareObj.concatArray(inputArray2);

		if (inputArrString1.equals(inputArrString2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}