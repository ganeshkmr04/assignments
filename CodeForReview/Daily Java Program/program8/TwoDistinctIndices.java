package daily.java.program8;

public class TwoDistinctIndices {

	public static void main(String[] args) {
		
		int[] nums= {1,0,1,1};
		int k=1;
		boolean numCheck=false;
		
		for (int i = 0; i < nums.length-1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] == nums[j] && (Math.abs(i-j)) <= k) {
					numCheck=true;
				}
			}
		}
		System.out.println(numCheck);
	}

}
