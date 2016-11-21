package problem349;

public class Test {
	public static void main(String[] args) {
		int[] num1={12,23,45,68,9,2,4,6,6};
		int[] num2={12,34,56,6,8,9,23,6};
		int[]results = new Solution().intersection(num1, num2);
		for(int item:results)
			System.out.println(item);
	}
}
