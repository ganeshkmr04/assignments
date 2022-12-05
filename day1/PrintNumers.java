package week1.day1;


public class PrintNumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="Amazon has 11400 employees in chennai";
		String replace=value.replaceAll("[^0-9]","");
		System.out.println(replace);
	}

}