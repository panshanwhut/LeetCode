package problem349;

import java.util.HashSet;
import java.util.Iterator;

public class Solution {
	public int[] intersection(int[] num1, int[] num2) {
		if(num1.length==0 || num2.length==0)
			return new int[0];
		else{
			//将num1数组元素存放在hashset中（不重复）
			HashSet<Integer> hashset = new HashSet<Integer>();
			for(int item:num1)
				hashset.add(item);
			
			//新建一个hashset存放共有元素
			HashSet<Integer> set = new HashSet<>();
			
			//依次遍历数组num2，把包含在hashset中的元素存放在set中
			for(int item:num2)
				if(hashset.contains(item))
					set.add(item);
			
			//将set元素放在int[]
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
