/**
 * 		arrays
 *
 * 				Methods for dealing with arrays
 *
 * 		Ashwin Vaithianathan
 */





public class arrays {
	


	public static void main(String[] args) {
		int[] nums = {3,6,4,3,2,1,5,6};

		System.out.println(avg(nums));
	}



	/**
	 * avg
	 * 		Finds the mean of an array
	 *
	 * @param nums - the array of numbers
	 * @return the mean
	 */
	public static double avg(int[] nums) {
	
		return ((double) sum(nums)) / nums.length;

	}


	/**
	 * sum
	 * 		finds the sum of all of the numbers in the array
	 *
	 * @param nums - the array of numbers
	 * @return sum of the numbers in the array
	 */
	public static int sum(int [] nums) {

		int sum = 0;
		for (int i = 0;i<nums.length;i++) {
			sum += nums[i];
	}
	return sum;
}
}