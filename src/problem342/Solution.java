package problem342;

public class Solution {
    public boolean isPowerOfFour(int num) {
    	if(num <= 0)
    		return false;
    	else{
    		while(num != 1){
    			int res = num%4;	//���4������
    			if(res != 0)
    				return false;
    			else
    				num = num >> 2;
    		}
    		//������+1ʱ������ȻΪ0���򷵻�true
    		return true;
    	}
    }
}
