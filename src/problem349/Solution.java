package problem349;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
	public int[] intersection(int[] num1, int[] num2) {
		if(num1.length==0 || num2.length==0)
			return new int[0];
		else{
			//��num1����Ԫ�ش����hashset�У����ظ���
			HashSet<Integer> hashset = new HashSet<Integer>();
			for(int item:num1)
				hashset.add(item);
			
			//�½�һ��hashset��Ź���Ԫ��
			HashSet<Integer> set = new HashSet<>();
			
			//���α�������num2���Ѱ�����hashset�е�Ԫ�ش����set��
			for(int item:num2)
				if(hashset.contains(item))
					set.add(item);
			
			//��setԪ�ط���int[]
			int[] results = new int[set.size()];
			Iterator<Integer> iterator = set.iterator();
			int index=0;
			while(iterator.hasNext()){
				results[index] = iterator.next();
				index++;
			}
			return results;			
		}
	}
}
