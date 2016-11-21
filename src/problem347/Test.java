package problem347;

public class Test {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,1,2,3,4,5,1,2,3,1,2,1};
		System.out.println(new Solution().topKFrequent(nums, 3));
	}
}
