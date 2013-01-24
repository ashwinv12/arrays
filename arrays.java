public class arrays {
	
	public static void main(String[] args) {
		int[] nums = {3,6,4,3,2,1,5,6};

		System.out.println(avg(nums));
	}


	public static double avg(int[] nums) {
		
		int sum = 0;
		for (int i = 0;i<nums.length;i++) {
			sum += nums[i];

		
		}
	
		return ((double) sum) / nums.length;

	}


}