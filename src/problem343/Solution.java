package problem343;

/*题目分析
 * (2,1)	(3,2)	(4,4)	(5,3*2)	(6,3*3)	(7,3*4)	(8,3*3*2)	(9,3*3*3)	(10,3*3*4)	(11,3*3*3*2)	(12,3*3*3*3)		(13,3*3*3*4)
 * 
 * 首先判断输入，输入为2,3,4时直接输出结果
 * 然后，输入为其他值input时，input = (3*m)+res,乘积结果可以拆分为3^m*res的形式：
 * 		计算指数值m = (input-2)/3
 * 		res = input-3*m
 * 最后，乘积结果 = 3^m*res
 * */
public class Solution {
    public int integerBreak(int n) {
    	int product = 0;
    	if(n >= 2 && n <= 4){
    		switch (n){
    		case 2: product = 1;break;
    		case 3: product = 2;break;
    		case 4: product = 4;break;
    		}
    	}else{
    		int m = (n-2)/3;
    		int res=(n-3*m);
    		product = (int)Math.pow(3, m)*res;
    	}
    	return product;
    }
}
