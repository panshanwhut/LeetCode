package problem342;

public class Solution {
    public boolean isPowerOfFour(int num) {
    	if(num <= 0)
    		return false;
    	else{
    		while(num != 1){
    			int res = num%4;	//求对4的余数
    			if(res != 0)
    				return false;
    			else
    				num = num >> 2;
    		}
    		//当除到+1时余数依然为0，则返回true
    		return true;
    	}
    }
}
