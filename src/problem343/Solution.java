package problem343;

/*��Ŀ����
 * (2,1)	(3,2)	(4,4)	(5,3*2)	(6,3*3)	(7,3*4)	(8,3*3*2)	(9,3*3*3)	(10,3*3*4)	(11,3*3*3*2)	(12,3*3*3*3)		(13,3*3*3*4)
 * 
 * �����ж����룬����Ϊ2,3,4ʱֱ��������
 * Ȼ������Ϊ����ֵinputʱ��input = (3*m)+res,�˻�������Բ��Ϊ3^m*res����ʽ��
 * 		����ָ��ֵm = (input-2)/3
 * 		res = input-3*m
 * ��󣬳˻���� = 3^m*res
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
