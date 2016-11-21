package problem338;

public class Solution {
    public int[] countBits(int num) {
        int[] results = new int[num+1];
    	
        for(int i = 0 ; i < num+1 ; i++){
        	int count = 0;
        	int task = i;

        	while( task !=0 ){
        		count += task%2;
        		task = task >> 1;
        	}
        	
        	results[i] = count;
        }
        return results;
    }
}
