package problem342;

public class Test {
	public static void main(String[] args) {
		for(int num = 0 ; num < 65 ; num++)
			System.out.println(num+":"+new Solution().isPowerOfFour(num));
	}
}
