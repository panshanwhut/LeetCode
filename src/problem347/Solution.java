package problem347;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {
	public List<Integer> topKFrequent( int[] nums , int k) {
		
		//创建HashMap，存储数组元素；key代表元素，value代表出现次数
		HashMap<Integer, Integer> srcMap = new HashMap<>();
		for(int item:nums)
			if( !srcMap.containsKey(item))
				srcMap.put(item, 1);
			else
				srcMap.put(item, srcMap.get(item)+1);
		
		//创建ArrayList对象，用于存储hashmap对象entry
		ArrayList<Map.Entry<Integer, Integer>> arraylist = new ArrayList<>(srcMap.entrySet());
		ArrayList<Integer> results = new ArrayList<>();
		
		if(arraylist.size() <= k){
			for(Map.Entry<Integer, Integer> item:arraylist)
				results.add(item.getKey());
		}else{
			//对ArrayList按元素的value进行降序排序
			Collections.sort(arraylist, new Comparator<Map.Entry<Integer, Integer>>() {
				
				@Override
				public int compare(Map.Entry<Integer, Integer> o1 , Map.Entry<Integer, Integer> o2) {
					return o1.getValue()-o2.getValue();
				}
			});
			
			//输出ArrayList的前k个元素的value值
			for(int i=0 ; i<k ; i++)
				results.add(arraylist.get(i).getKey());			
		}
		
		return results;
	}
}